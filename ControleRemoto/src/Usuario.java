public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("");

        smartTv.ligar ();
        smartTv.desligar();
        System.out.println("");

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.mudarCanal (13);
        System.out.println("");
    }
}
