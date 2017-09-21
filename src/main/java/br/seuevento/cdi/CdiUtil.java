/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.seuevento.cdi;


import br.seuevento.dao.UsuarioDao;
import javax.enterprise.inject.spi.CDI;


public class CdiUtil {
    
    public static UsuarioDao getUsuarioDaoInstance(){
    
            return CDI.current().select(UsuarioDao.class).get();
    }
}
