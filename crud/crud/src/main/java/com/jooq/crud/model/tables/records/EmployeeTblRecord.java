/*
 * This file is generated by jOOQ.
 */
package com.jooq.crud.model.tables.records;


import com.jooq.crud.model.tables.EmployeeTbl;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeTblRecord extends UpdatableRecordImpl<EmployeeTblRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mydb.employee_tbl.id</code>.
     */
    public EmployeeTblRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mydb.employee_tbl.email</code>.
     */
    public EmployeeTblRecord setEmail(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mydb.employee_tbl.fist_name</code>.
     */
    public EmployeeTblRecord setFistName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.fist_name</code>.
     */
    public String getFistName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mydb.employee_tbl.last_name</code>.
     */
    public EmployeeTblRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return EmployeeTbl.EMPLOYEE_TBL.ID;
    }

    @Override
    public Field<String> field2() {
        return EmployeeTbl.EMPLOYEE_TBL.EMAIL;
    }

    @Override
    public Field<String> field3() {
        return EmployeeTbl.EMPLOYEE_TBL.FIST_NAME;
    }

    @Override
    public Field<String> field4() {
        return EmployeeTbl.EMPLOYEE_TBL.LAST_NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public String component3() {
        return getFistName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public String value3() {
        return getFistName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public EmployeeTblRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public EmployeeTblRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public EmployeeTblRecord value3(String value) {
        setFistName(value);
        return this;
    }

    @Override
    public EmployeeTblRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public EmployeeTblRecord values(Long value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeTblRecord
     */
    public EmployeeTblRecord() {
        super(EmployeeTbl.EMPLOYEE_TBL);
    }

    /**
     * Create a detached, initialised EmployeeTblRecord
     */
    public EmployeeTblRecord(Long id, String email, String fistName, String lastName) {
        super(EmployeeTbl.EMPLOYEE_TBL);

        setId(id);
        setEmail(email);
        setFistName(fistName);
        setLastName(lastName);
    }
}
