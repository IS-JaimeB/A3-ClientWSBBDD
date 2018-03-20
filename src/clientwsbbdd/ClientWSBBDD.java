/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsbbdd;

/**
 *
 * @author entrar
 */
public class ClientWSBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient customer = new NewJerseyClient();
        System.out.println(customer.findAll_XML(String.class));
        System.out.println(customer.find_XML(String.class, "2"));
    }
    
}
