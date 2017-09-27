/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.marshalling.model.esb;

import lombok.Data;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Data
public class FcubsEsbHeader {

    private String source;

    private String ubsComp;

    private String msgId;

    private String correlId;

    private String branch;

    private String service;

    private String source_operation;

    private String source_userId;

    private String destination;
}
