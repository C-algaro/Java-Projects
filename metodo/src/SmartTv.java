public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar () {
        ligada = true;
        System.out.println("Novo Status: Ligado");
    }

    public void desligar () {
        ligada = false;
        System.out.println("Novo Status: Desligado");
    }

    public void aumentarVolume () {
        volume ++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void diminuirVolume () {
        volume --;
        System.out.println("Diminuindo volume: " + volume);
    }

    public void subirCanal () {
        canal ++;
        System.out.println("Subindo de canal: " + canal);
    }

    public void descerCanal () {
        canal --;
        System.out.println("Descendo de canal: " + canal);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal Atual: " + canal);
    }
}
