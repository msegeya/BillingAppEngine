/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.controllers;

import com.nmbbank.billing.models.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
@RestController
public class EchoITController {

    @RequestMapping(path = "/echo/{message}", method = RequestMethod.GET)
    public Message echo(@PathVariable("message") String message) {
        return new Message(message);
    }
    
    


}
