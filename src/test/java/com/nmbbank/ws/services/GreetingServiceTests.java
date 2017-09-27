/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.ws.services;

import com.nmbbank.ws.services.GreetingService;
import com.nmbbank.AbstractTest;
import com.nmbbank.billing.models.Greeting;
import java.util.Collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@Transactional
public class GreetingServiceTests extends AbstractTest {

    @Autowired
    private GreetingService greetingService;

    @Before
    public void setUp() {
        //prepare test methods 
        greetingService.evictCache();

    }

    @After
    public void tearDown() {
        //cleanup after test method
    }

    @Test
    public void testFindAll() {

        Collection<Greeting> list = greetingService.findAll();
        Assert.assertNotNull("failure -expected non null", list);
        Assert.assertEquals("failure -expected size  2", 2, list.size());

    }

}
