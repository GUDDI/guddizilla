/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guddi.guddizilla.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PauloGladson
 */
@WebService(serviceName = "Pesquisa")
public class Pesquisa {
    
    private int num = 0;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        num++;
        return "Hello " + num + " !";
    }
}
