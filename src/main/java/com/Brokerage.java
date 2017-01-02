package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 02/01/17.
 */
public class Brokerage {

    private String name;

    public Brokerage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    List<Client> clientList = new ArrayList<Client>();
    public void addClient(Client c1){
        clientList.add(c1);

    }
    public List<Client> getClientList(){
        return clientList;
    }

}
