/*
 * This file is generated by jOOQ.
 */
package com.jooq.crud.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String email;
    private String fistName;
    private String lastName;

    public EmployeeTbl() {}

    public EmployeeTbl(EmployeeTbl value) {
        this.id = value.id;
        this.email = value.email;
        this.fistName = value.fistName;
        this.lastName = value.lastName;
    }

    public EmployeeTbl(
        Long   id,
        String email,
        String fistName,
        String lastName
    ) {
        this.id = id;
        this.email = email;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    /**
     * Getter for <code>mydb.employee_tbl.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>mydb.employee_tbl.id</code>.
     */
    public EmployeeTbl setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>mydb.employee_tbl.email</code>.
     */
    public EmployeeTbl setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.fist_name</code>.
     */
    public String getFistName() {
        return this.fistName;
    }

    /**
     * Setter for <code>mydb.employee_tbl.fist_name</code>.
     */
    public EmployeeTbl setFistName(String fistName) {
        this.fistName = fistName;
        return this;
    }

    /**
     * Getter for <code>mydb.employee_tbl.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>mydb.employee_tbl.last_name</code>.
     */
    public EmployeeTbl setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EmployeeTbl other = (EmployeeTbl) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (fistName == null) {
            if (other.fistName != null)
                return false;
        }
        else if (!fistName.equals(other.fistName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.fistName == null) ? 0 : this.fistName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EmployeeTbl (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(fistName);
        sb.append(", ").append(lastName);

        sb.append(")");
        return sb.toString();
    }
}
