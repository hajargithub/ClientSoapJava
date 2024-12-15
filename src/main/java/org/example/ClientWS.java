package org.example;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueServiceService().getBanqueServicePort();
        System.out.println(proxy.convertoDH(100));
        List<Compte> comptes=proxy.listComptes();
        System.out.println("Lists des comptes:");
        for(Compte c: comptes){
            System.out.println("code:"+c.getCode());
            System.out.println("Solde:"+c.getSolde());
            System.out.println("Date Création:"+ c.getDateCreation());

        }
    }
}
