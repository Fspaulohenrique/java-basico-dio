public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Mudar o canal exato que o usuário quer
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    //Aumentar o valor do canal em um
    public void aumentarCanal(){
        canal++;
    }

    //Diminuir o valor do canal em um 
    public void diminuirCanal(){
        canal--;
    }

    //Aumentar o volume em um 
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    //Diminuir o volume em um 
    public void diminuirVolume(){

        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
