/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.daos;

import java.io.File;
import org.springframework.stereotype.Component;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Component
public class BillOperationBusinessLogic {

    private boolean flag;

    public boolean generateBillRefferenceNumber() {
        flag = false;

        return flag;

    }

    public boolean importExcelSheetFile(File inputFile) {
        flag = false;

        return flag;
    }

    public boolean changeBillStatusAfterPayment(String refferenceNumber) {
        flag = false;

        return flag;
    }

    public boolean generateBillingInvoice(String refferenceNumber) {
        flag = false;

        return flag;
    }

}
