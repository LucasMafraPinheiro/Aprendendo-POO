public class App {
    public static void main(String[] args) throws Exception {
        Lobo lobo1=new Lobo();
        Mamifero mamifero1 = new Mamifero();
        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();
        lobo1.emitirSom();
        mamifero1.emitirSom();
        cachorro1.reagir("hora de comer");
        cachorro1.reagir("sai daqui");
        cachorro1.reagir(11,45);
        cachorro1.reagir(21,00);
        cachorro1.reagir(true);
        cachorro1.reagir(false);
        cachorro1.reagir(2,12.5f);
        cachorro1.reagir(17,4.5f);
    }
}
