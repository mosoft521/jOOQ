/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2;


import javax.annotation.processing.Generated;

import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in FLYWAY_TEST
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.13.0-SNAPSHOT"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>FLYWAY_TEST.S_AUTHOR_ID</code>
     */
    public static final Sequence<Long> S_AUTHOR_ID = Internal.<Long> createSequence("S_AUTHOR_ID", FlywayTest.FLYWAY_TEST, org.jooq.impl.SQLDataType.BIGINT, null, null, null, null, false, null);
}
