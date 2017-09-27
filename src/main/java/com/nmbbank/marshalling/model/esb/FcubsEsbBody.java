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
public class FcubsEsbBody {

//    <FCUBS_BODY>
//        <Transaction-Details>
//            <XREF>EC100115315176</XREF>
//            <PRD>MNPN</PRD>
//            <BRN>101</BRN>
//            <MODULE>RT</MODULE>
//            <TXNBRN>307</TXNBRN>
//            <TXNACC>30708000867</TXNACC>
//            <TXNCCY>TZS</TXNCCY>
//            <TXNAMT>38000</TXNAMT>
//            <TXNTRN>111</TXNTRN>
//            <OFFSETBRN>201</OFFSETBRN>
//            <OFFSETACC>20110013817</OFFSETACC>
//            <OFFSETCCY>TZS</OFFSETCCY>
//            <OFFSETAMT>38000</OFFSETAMT>
//            <OFFSETTRN>111</OFFSETTRN>
//            <NARRATIVE>1708 05:50:47  AloyceMwitwa_Test NetworkID=ZANTELB2C: SenderID=0713438203: ReceiverID=0713438203</NARRATIVE>
//            <MAKERID>ESBUSER</MAKERID>
//            <CHECKERID>ESBUSER</CHECKERID>
//            <MODNO>1</MODNO>
//            <RECSTAT>0</RECSTAT>
//            <AUTHSTAT>A</AUTHSTAT>
//            <DRACC>TXN</DRACC>
//        </Transaction-Details>
//    </FCUBS_BODY>
    private String xref;

    private String prd;

    private String module;

    private String txnbrn;

    private String txnacc;

    private String txnccy;

    private String txnamnt;

    private String txntrn;

    private String offsetbrn;

    private String offsetacc;

    private String offsetccy;

    private String offsetamnt;

    private String offsettrn;

    private String narrative;

    private String makerid;

    private String modno;

    private String recstat;

    private String authstat;

    private String dracc;

}
