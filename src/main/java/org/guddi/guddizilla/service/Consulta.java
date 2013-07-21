/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guddi.guddizilla.service;

import javax.jws.WebMethod;
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
    
}
