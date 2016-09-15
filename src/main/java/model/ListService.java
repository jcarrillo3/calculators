/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcarl
 */
public class ListService {
    private String userName = "jcarrillo3";
    private List<String> shoppingList;
    
    public ListService(){
        shoppingList = new ArrayList<>();
        shoppingList.add("Beer");
        shoppingList.add("Steak");
        shoppingList.add("Corn");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }
    
}
