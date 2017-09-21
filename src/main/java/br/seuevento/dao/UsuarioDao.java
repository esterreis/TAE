
package br.seuevento.dao;


import br.seuevento.entidade.Usuario;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;



@RequestScoped
public class UsuarioDao {
    
    @PersistenceContext(unitName = "eventoPU")
    private EntityManager manager;
    
    
    
    @Transactional
    public void salvar(Usuario entidade){
        manager.merge(entidade);
    }
   @Transactional
    public void deletar(Usuario entidade){
         
        manager.merge(entidade);
    }
    @Transactional
    public List<Usuario> listar(){
                
        return manager.createQuery("from Usuario u").getResultList();
    }

   
}
