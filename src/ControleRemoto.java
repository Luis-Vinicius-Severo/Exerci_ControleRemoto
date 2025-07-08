public class ControleRemoto extends Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar(){
        setLigado(true);
    }
    @Override

    public void desligar(){
        setLigado(false);
    }
    @Override
    public void abrirMenu(){
        if(ligado) {
            System.out.println("-----------Menu------------");
            System.out.println("Está ligado ? " + this.getLigado());
            System.out.println("Está tocando ? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.println("|");
            }
        }else {
            System.out.println("Você precisa ligar o controle");
        }
    }
    @Override
    public void fecharMenu(){
        System.out.println("Fechando o menu...");
    }
    @Override
    public void maisVolume(){
        if(this.getLigado()){
            setVolume(this.getVolume() + 1);
        }else{
            System.out.println("Você precisa ligar o controle para aumentar o volume");
        }
    }
    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }else{
            System.out.println("Você precisa ligar o controle para baixar o volune");
        }
    }
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0 ){
               this.setVolume(0);
            }
        }
    @Override
    public void desligarMudo(){
        if(getLigado() && getVolume() == 0 ){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
    if(getLigado() && !getTocando()){
        setTocando(true);
    }else {
        System.out.println("Não foi possivel reproduzir");
    }
    }
    @Override
    public void pause(){
        if(getLigado() && !getTocando()){
            setTocando(false);
        }else {
            System.out.println("não foi possivel pausar");
        }

    }


    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}

