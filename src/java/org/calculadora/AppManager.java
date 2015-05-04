package org.calculadora;
 
import org.calculadora.action.LoginAction;
import org.calculadora.action.LogoutAction;
import org.calculadora.action.Operacao;
import org.mentawai.core.ApplicationManager;
import org.mentawai.filter.AuthenticationFilter;
 
public class AppManager extends ApplicationManager {
    
    @Override
    public void loadFilters() {
        filter(new AuthenticationFilter());
        on(LOGIN, redir("index.jsp"));
    }
 
    @Override
    public void loadActions() {
        // Action da autenticação 
        action("/LoginAction", LoginAction.class)
            .on(SUCCESS, fwd("/jsp/inicio.jsp"))
            .on(ERROR, fwd("/jsp/erro_autenticacao.jsp"));
        
        action("/LogoutAction", LogoutAction.class)
            .on(SUCCESS, redir("index.jsp"));
            
        
        //----------------------------------------------
        action("/Operacao", Operacao.class, "inicio")
            .on(SUCCESS, fwd("/jsp/inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "efetuar")
            .on("soma", fwd("/jsp/efetuar.jsp"))
            .on("sub", fwd("/jsp/efetuar.jsp"))
            .on("mult", fwd("/jsp/efetuar.jsp"))
            .on("div", fwd("/jsp/efetuar.jsp"));
            
        //----------------------------------------------
        action("/Operacao", Operacao.class, "resolver")
            .on(SUCCESS, fwd("/jsp/resultado.jsp"));
            
        //----------------------------------------------
        /*action("/Operacao", Operacao.class, "paginaSub")
            .on(SUCCESS, fwd("/jsp/paginaSub.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "paginaMult")
            .on(SUCCESS, fwd("/jsp/paginaMult.jsp"));
            //.on(ERROR, fwd("index.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "paginaDiv")
            .on(SUCCESS, fwd("/jsp/paginaDiv.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "somar")
            .on(SUCCESS, fwd("/jsp/resultado.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "subtrair")
            .on(SUCCESS, fwd("/jsp/resultado.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "multiplicar")
            .on(SUCCESS, fwd("/jsp/resultado.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------
        action("/Operacao", Operacao.class, "dividir")
            .on(SUCCESS, fwd("/jsp/resultado.jsp"));
            //.on(ERROR, fwd("inicio.jsp"));
        //----------------------------------------------*/
    }
}