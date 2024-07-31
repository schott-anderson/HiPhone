package org.dio;

public class Phone {

    public void call(String number){
        System.out.println("Ligando para: "+ number);
    }

    public void answer(){
        System.out.println("Atendendo a ligação");
    }

    public void startVoiceMail(){
        System.out.println("Ligando para a caixa de mensagem");
    }

}
