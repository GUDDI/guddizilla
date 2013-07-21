/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guddi.guddizilla.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author PauloGladson
 */
@WebService(serviceName = "Servico")
@Stateless()
public class Servico {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "versao")
    public String versao() {
        return "Versão 1.0";
    }
    
    @WebMethod(operationName = "listaPedidos")
    public List<String> listaPedidos(@WebParam(name = "qual") String txt) {
        List<String> lista = new ArrayList<String>();
        lista.add("afd21as3d21as3d21as32d1as2da3sa32d");
        lista.add("a8s97das987d9as87dwa654ew8dasr49f7");
        lista.add(txt);
        return lista;
    }
    
    @WebMethod(operationName = "consulta")
    public int consulta(@WebParam(name = "entradas") List<String> entradas, @WebParam(name = "pedidos") List<String> pedidos ) {
        pedidos.addAll(entradas);
        return 0;
    }
}
