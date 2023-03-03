package org.example;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Bruno", "Roberta","Luiz"};
        for (int nom=0; nom<nomes.length;nom++){
            System.out.println(nomes[nom]);
        }
        System.out.println("|----------------------|");
        for (String nom:nomes){
            System.out.println(nom);
        }
    }
}