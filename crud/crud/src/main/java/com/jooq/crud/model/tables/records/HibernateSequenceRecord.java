/*
 * This file is generated by jOOQ.
 */
package com.jooq.crud.model.tables.records;


import com.jooq.crud.model.tables.HibernateSequence;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HibernateSequenceRecord extends TableRecordImpl<HibernateSequenceRecord> implements Record1<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mydb.hibernate_sequence.next_val</code>.
     */
    public HibernateSequenceRecord setNextVal(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mydb.hibernate_sequence.next_val</code>.
     */
    public Long getNextVal() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return HibernateSequence.HIBERNATE_SEQUENCE.NEXT_VAL;
    }

    @Override
    public Long component1() {
        return getNextVal();
    }

    @Override
    public Long value1() {
        return getNextVal();
    }

    @Override
    public HibernateSequenceRecord value1(Long value) {
        setNextVal(value);
        return this;
    }

    @Override
    public HibernateSequenceRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HibernateSequenceRecord
     */
    public HibernateSequenceRecord() {
        super(HibernateSequence.HIBERNATE_SEQUENCE);
    }

    /**
     * Create a detached, initialised HibernateSequenceRecord
     */
    public HibernateSequenceRecord(Long nextVal) {
        super(HibernateSequence.HIBERNATE_SEQUENCE);

        setNextVal(nextVal);
    }
}
