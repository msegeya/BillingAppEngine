/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmbbank.ws.services;

import com.nmbbank.billing.models.Greeting;
import java.util.concurrent.Future;

/**
 *
 * @author Paul George Msegeya <paul.msegeya@nmbtz.com> <msegeya@gmail.com>
 * <paul.msegeya@gmail.com>
 */
/**
 * The EmailService interface defines all public business behaviors for
 * composing and transmitting email messages.
 *
 * This interface should be injected into EmailService clients, not the
 * implementation bean.
 *
 * @author Matt Warman
 */
public interface EmailService {

    /**
     * Send a Greeting via email synchronously.
     *
     * @param greeting A Greeting to send.
     * @return A Boolean whose value is TRUE if sent successfully; otherwise
     * FALSE.
     */
    Boolean send(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously.
     *
     * @param greeting A Greeting to send.
     */
    void sendAsync(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously. Returns a Future&lt;Boolean&gt;
     * response allowing the client to obtain the status of the operation once
     * it is completed.
     *
     * @param greeting A Greeting to send.
     * @return A Future&lt;Boolean&gt; whose value is TRUE if sent successfully;
     * otherwise, FALSE.
     */
    Future<Boolean> sendAsyncWithResult(Greeting greeting);

}
