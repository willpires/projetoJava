/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.controller;
package br.com.infox.dao;

import br.com.infox.dao.ClienteDao;
import com.sun.org.apache.bcel.internal.generic.AALOAD;



/**
 *
 * @author williamjosepires
 */
public class ClienteController {
   
    
  public boolean pesquisarCliente(String pesquisar){
        
        
         ClienteDao c = new ClienteDao();
         c.pesquisar(pesquisar);
 
             
        
    }

    
   
    
  
    
    
    
    
}
