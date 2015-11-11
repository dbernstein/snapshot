/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 *     http://duracloud.org/license/
 */
package org.duracloud.snapshot.common;

/**
 * @author Erik Paulsson
 *         Date: 2/14/14
 */
public class SnapshotServiceConstants {
    public static final String SPRING_BATCH_UNIQUE_ID = "spring-batch-unique-id";
    public static final String SNAPSHOT_JOB_NAME = "snapshot";
    public static final String RESTORE_JOB_NAME = "restore";
    public static final String DURASTORE_CONTEXT = "durastore";
    public static final String CONTENT_PROPERTIES_JSON_FILENAME =
        "content-properties.json";
    public static final String MANIFEST_SHA256_TXT_FILE_NAME = 
        "manifest-sha256.txt";
    public static final String MANIFEST_MD5_TXT_FILE_NAME = 
        "manifest-md5.txt";

    // Restore history values
    public static final String RESTORE_ACTION_TITLE = "restore-action";
    public static final String RESTORE_ACTION_REQUESTED = "RESTORE_REQUESTED";
    public static final String RESTORE_ACTION_INITIATED = "RESTORE_INITIATED";
    public static final String RESTORE_ACTION_COMPLETED = "RESTORE_COMPLETED";
    public static final String RESTORE_ACTION_EXPIRED = "RESTORE_EXPIRED";
    public static final String RESTORE_USER_TITLE = "initiating-user";
    public static final String RESTORE_ID_TITLE = "restore-id";
    public static final String RESTORE_EXPIRES_TITLE = "expiration-date";
}
