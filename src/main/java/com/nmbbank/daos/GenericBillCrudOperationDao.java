/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.daos;

import com.nmbbank.marshalling.model.GenericBill;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Component
public class GenericBillCrudOperationDao {

    private boolean flag;

    public boolean createBill() {
        return flag;

    }

    public boolean updateBill(String refferenceNumber) {
        return flag;

    }

    public List<GenericBill> getAllBills() {
        return null;

    }

    public boolean deleteBill(String refferenceNumber) {

        return flag;
    }

}
