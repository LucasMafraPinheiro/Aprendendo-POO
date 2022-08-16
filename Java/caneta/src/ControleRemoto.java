class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public ControleRemoto(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }
    public int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado?" + this.isLigado());
        System.out.println("Esta tocando?"+ this.isTocando());
        System.out.println("Volume:"+this.getVolume());
        for(int i=0;i<100;i+=10){
            if(i<this.getVolume()){
            System.out.print("o");
            }else System.out.print("-");
        }
        
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        if(isLigado()==true){
            setVolume(getVolume()+5);
        }
    }
    @Override
    public void menosVolume() {
        if(isLigado()==true){
            setVolume(getVolume()-5);
        }
        
    }
    @Override
    public void ligarMudo() {
        if(isLigado()==true && getVolume()>0){
            setVolume(0);
        }
        
    }
    @Override
    public void desligarMudo() {
        if(isLigado()==true && getVolume()==0){
            setVolume(50);
        }
        
    }
    @Override
    public void play() {
        
        
    }
    @Override
    public void pause() {
        
        
    }
}