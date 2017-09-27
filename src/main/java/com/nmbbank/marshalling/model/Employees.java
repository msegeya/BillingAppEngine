/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.marshalling.model;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Arrays;

@JacksonXmlRootElement(localName = "employees")
public final class Employees {

    @JacksonXmlElementWrapper(localName = "employee", useWrapping = false)
    private Employee[] employee;

    public Employees() {
    }

    public Employees(Employee[] employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employees{"
                + "employees=" + Arrays.toString(employee)
                + '}';
    }
}
