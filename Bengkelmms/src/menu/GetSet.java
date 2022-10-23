/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Nitro 5
 */
public class GetSet {
    private static String users;
    
    public static void setUser(String users){
        GetSet.users = users;
    }
    public static String getUser(){
        return users;
    }

}
