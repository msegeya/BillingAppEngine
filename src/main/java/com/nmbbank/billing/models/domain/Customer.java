/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.billing.models.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

    private String id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String fullName = firstName + " " + middleName + " " + lastName;

    private Address address;

    private Date updatedAt;

}
