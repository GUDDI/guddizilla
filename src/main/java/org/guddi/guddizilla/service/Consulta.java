/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guddi.guddizilla.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author PauloGladson
 */
@WebService(serviceName = "Consulta")
public class Consulta {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "versao")
    public String versao() {
        return "1.0.0";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Valida")
    public String valida(@WebParam(name = "servico") String servico) {
        //TODO write your implementation code here:
        return "OK";
    }

}
