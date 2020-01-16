/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.chart.db.Indexes;
import org.jooq.example.chart.db.Keys;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.AddressRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = -523875203;

    /**
     * The reference instance of <code>public.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>public.address.address_id</code>.
     */
    public final TableField<AddressRecord, Integer> ADDRESS_ID = createField(DSL.name("address_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('address_address_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.address.address</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS_ = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.address.address2</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS2 = createField(DSL.name("address2"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.address.district</code>.
     */
    public final TableField<AddressRecord, String> DISTRICT = createField(DSL.name("district"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.city_id</code>.
     */
    public final TableField<AddressRecord, Integer> CITY_ID = createField(DSL.name("city_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.address.postal_code</code>.
     */
    public final TableField<AddressRecord, String> POSTAL_CODE = createField(DSL.name("postal_code"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.address.phone</code>.
     */
    public final TableField<AddressRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.last_update</code>.
     */
    public final TableField<AddressRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>public.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, AddressRecord> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_FK_CITY_ID);
    }

    @Override
    public Identity<AddressRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ADDRESS;
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.ADDRESS_PKEY;
    }

    @Override
    public List<UniqueKey<AddressRecord>> getKeys() {
        return Arrays.<UniqueKey<AddressRecord>>asList(Keys.ADDRESS_PKEY);
    }

    @Override
    public List<ForeignKey<AddressRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AddressRecord, ?>>asList(Keys.ADDRESS__ADDRESS_CITY_ID_FKEY);
    }

    public City city() {
        return new City(this, Keys.ADDRESS__ADDRESS_CITY_ID_FKEY);
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
