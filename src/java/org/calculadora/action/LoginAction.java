
package org.calculadora.action;

import org.mentawai.action.BaseLoginAction;

/**
 *
 * @author stryker
 */
public class LoginAction extends BaseLoginAction{
    
    @Override
    public String execute() throws Exception{
        
        String user = input.getString("user");
        String pass = input.getString("pass");
        
        if(user == null || user.trim().equals("")){
            return ERROR;
        }
        
        if(pass == null || pass.trim().equals("")){
            return ERROR;
        }
        
        if(!user.equals("user001") || !pass.equals("atnem")){
          return ERROR;  
        }
        
        setSessionObj(user);
        
        return SUCCESS;
    }
}
