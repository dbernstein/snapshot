/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 *     http://duracloud.org/license/
 */
package org.duracloud.snapshot.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Bernstein Date: Jul 30, 2015
 */
public class ManifestTestHelper {

    private ManifestTestHelper() {
        // Ensures no instances are made of this class, as there are only static members.
    }

    /**
     * @param manifestFile
     * @return
     */
    public static List<ManifestEntry> setupManifestFile(File manifestFile,
                                                        int manifestSize,
                                                        String checksum,
                                                        String contentIdPrefix) throws IOException {
        Writer writer = new BufferedWriter(new FileWriter(manifestFile));
        int count = manifestSize;
        List<ManifestEntry> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            ManifestEntry entry = new ManifestEntry(checksum, contentIdPrefix + i);
            list.add(entry);
            ManifestFileHelper.writeManifestEntry(writer, entry.getContentId(), entry.getChecksum());
        }

        writer.close();
        return list;
    }

}
