import funcoes.PlayMusic;
import funcoes.SmartPhone;
import funcoes.WebNavigator;

public class Iphone implements PlayMusic, SmartPhone, WebNavigator {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.play();
        iphone.pause();
        iphone.addMusic();
        System.out.println("################");

        iphone.call();
        iphone.answer();
        iphone.voiceMail();
        System.out.println("################");

        iphone.viewPage();
        iphone.addNewTab();
        iphone.refreshPage();
        System.out.println("################");

        PlayMusic iphoneMusic = new Iphone();
        iphoneMusic.play();
        iphoneMusic.pause();
        iphoneMusic.addMusic();
        System.out.println("################");

        SmartPhone iphonePhone = new Iphone();
        iphonePhone.call();
        iphonePhone.answer();
        iphonePhone.voiceMail();
        System.out.println("################");

        WebNavigator iphoneSmart = new Iphone();
        iphoneSmart.viewPage();
        iphoneSmart.addNewTab();
        iphoneSmart.refreshPage();
    }

    @Override
    public void play() {
        System.out.println("Music playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused Music");
    }

    @Override
    public void addMusic() {
        System.out.println("Added music selection");
    }

    @Override
    public void call() {
        System.out.println("Making call");
    }

    @Override
    public void answer() {
        System.out.println("I do answer");
    }

    @Override
    public void voiceMail() {
        System.out.println("Start voice mail");
    }

    @Override
    public void viewPage() {
        System.out.println("View page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Added new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Update the page");
    }
}
