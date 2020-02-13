/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.flyway.ddl.db.h2.tables.Author;
import org.jooq.example.flyway.ddl.db.h2.tables.Book;
import org.jooq.example.flyway.ddl.db.h2.tables.records.AuthorRecord;
import org.jooq.example.flyway.ddl.db.h2.tables.records.BookRecord;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>FLYWAY_TEST</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
    public static final UniqueKey<BookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = Internal.createUniqueKey(Author.AUTHOR, "PK_T_AUTHOR", new TableField[] { Author.AUTHOR.ID }, true);
        public static final UniqueKey<BookRecord> PK_T_BOOK = Internal.createUniqueKey(Book.BOOK, "PK_T_BOOK", new TableField[] { Book.BOOK.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = Internal.createForeignKey(Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_AUTHOR_ID", new TableField[] { Book.BOOK.AUTHOR_ID }, true);
    }
}
