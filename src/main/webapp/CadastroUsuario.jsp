

<%@page import="br.seuevento.dao.EntidadeDao"%>
<%@page import="br.seuevento.cdi.CdiUtil"%>
<%@page import="javax.inject.Inject"%>
<%@page import="br.seuevento.dao.UsuarioDao"%>
<%@page import="br.seuevento.entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="lib/semantic/semantic.min.css"/>
        <script src="lib/jquery-3.2.1.min.js"></script>
        <script src="lib/semantic/semantic.min.js"></script>
        <title>Evento - Cadastro de Usuário</title>
    </head>
    <body>
        <div class="ui main container">
            <div class="ui segment">
                <form action="CadastroUsuario.jsp" method="POST" class="ui form">
                    <h3 class="ui dividing header">Cadastro de Usuário</h3>
                    <div class="ui required field">
                        <label>Nome Completo:</label>
                        <input type="text" maxlength="80" name="nome" id="nome"/> 
                    </div>
                    <div class="ui two fields">
                        <div class="ui required field">
                            <label>Email:</label>
                           <input type="text" maxlength="80" name="login" id="nome"/> 
                        </div>
                         <div class="ui required field">
                            <label>Senha</label>
                            <input type="password" maxlength="30" name="senha" id="nome"/> 
                        </div>
                        
                    </div>
                    <button type="submit" class="ui primary button" id="salvar">SALVAR</button>
                    <button type="reset" class="ui negative button" id="cancelar">CANCELAR</button>
                </form>
            
        </div>
            <%!
               
               private Usuario usuario; 
               
               UsuarioDao dao = CdiUtil.getUsuarioDaoInstance();
                public boolean validaDados(HttpServletRequest request){
                    
                   String nome  = request.getParameter("nome");
                   String email = request.getParameter("login");
                   String senha = request.getParameter("senha");
                   
                   return  nome!=null && !nome.trim().isEmpty() && email!=null && !email.trim().isEmpty() && senha!=null && !senha.trim().isEmpty();

                }

                public long salvar(HttpServletRequest request){

                    if(validaDados(request)){
                  
                      usuario = new Usuario();
                      usuario.setEmail(request.getParameter("login"));
                      usuario.setNome(request.getParameter("nome"));
                      usuario.setPassword(request.getParameter("senha"));
                     
                      
                      dao.salvar(usuario);
                      return  usuario.getId();
                      

                  }
return -1;
                }
            %>
            <%
               
                 salvar(request);
                  for (Usuario elem : dao.listar()) {
                            out.print(elem.getNome());
                            out.print(elem.getId());
                      }
                  
                  
            %>
        
    </body>
</html>
