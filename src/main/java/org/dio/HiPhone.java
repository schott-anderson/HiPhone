package org.dio;

public class HiPhone extends Phone implements MusicPlayer, Browser, Camera{

    //Music Player
    @Override
    public void musicStart() {
        System.out.println("Play na musica....");
    }

    @Override
    public void musicStop() {
        System.out.println("Pausa na musica....");
    }

    @Override
    public void selectMusic(String name) {
        System.out.println("Play na musica...." + name);
    }

    //Browser
    @Override
    public void showPage(String webAddress) {
        System.out.println("Abrindo a página ..." + webAddress);
    }

    @Override
    public void newTab() {
        System.out.println("Abrindo nova aba!");
    }

    @Override
    public void reloadPage() {
        System.out.println("Recarregando a página");
    }


    //Camera
    @Override
    public void takePhoto() {
        System.out.println("Sorriso para a foto ;D");
    }

    @Override
    public void savePhoto() {
        System.out.println("Ficou boa, estou salvando...");
    }

    @Override
    public void deletePhoto() {
        System.out.println("Esta foto não foi das melhoras, estou excluindo");
    }
}
