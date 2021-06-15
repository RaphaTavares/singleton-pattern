package com.company;

public class Main {

    public static void main(String[] args) {
        connect();
        getConection();
    }

    public static void connect(){

        Parametros.getInstance().setServerName("localhost");
        Parametros.getInstance().setMydatabase("mysql");
        Parametros.getInstance().setUsername("raphael_tavares");
        Parametros.getInstance().setPassword("Senha123");
        Parametros.getInstance().setPort(8080);
    }

    public static void getConection(){
        System.out.println("user " + Parametros.getInstance().getUsername() + " connected on " + Parametros.getInstance().getServerName() + ":" + Parametros.getInstance().getPort());

    }

}