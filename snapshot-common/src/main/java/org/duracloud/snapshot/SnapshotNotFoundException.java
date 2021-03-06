/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 *     http://duracloud.org/license/
 */
package org.duracloud.snapshot;

/**
 * @author Daniel Bernstein
 * Date: Feb 12, 2014
 */
public class SnapshotNotFoundException extends SnapshotException {
    public SnapshotNotFoundException(String snapshotId) {
        super("A snapshot with id=" + snapshotId + " does not exist.", null);
    }
}
