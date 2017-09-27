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
public class Invoice {

    private String id;

    private String account;

    private Date invoiceDate;

    private Date dueDate;

    private String status;

    private String type;

    private String manage;

    private Date updatedAt;
}
