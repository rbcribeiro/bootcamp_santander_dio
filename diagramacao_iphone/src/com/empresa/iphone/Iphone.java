package com.empresa.iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar(); 
        iphone.fazerLigacao("123456789"); 
        iphone.reproduzirMusica();
        iphone.abrirPaginaWeb("https://www.example.com"); 
        iphone.desligar(); 
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para " + numero + ".");
    }

    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de " + numero + ".");
    }

    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página web: " + url);
    }

    public void fecharPaginaWeb() {
        System.out.println("Fechando página web.");
    }
}
