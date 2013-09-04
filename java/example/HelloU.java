/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;


import com.opensymphony.xwork2.ActionSupport;


/**
 *
 * @author XM26150
 */
public class HelloU extends ActionSupport {
    
@Override
public String execute() throws Exception {
        setMessage(getText(MES));
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MES = "HelloU.mes";

    /**
     * Field for Message property.
     */
    private String mes;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return mes;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.mes = message;
    }
}