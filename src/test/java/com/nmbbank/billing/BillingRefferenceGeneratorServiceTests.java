/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.billing;

import java.util.Random;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BillingRefferenceGeneratorServiceTests {

    @Test
    public void contextLoads() {
    }

    private Random institutionalRandomCodeGenerator;
    private String generatedInstitutionCode;
//
//    @Test
//    public void generateInstititutionCode() throws Exception {
//
//        institutionalRandomCodeGenerator = new Random(3);
//        System.out.println(" generatedInstitutionCode =" + institutionalRandomCodeGenerator);
//    }

}
