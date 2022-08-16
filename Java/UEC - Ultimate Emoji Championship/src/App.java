public class App {
    public static void main(String[] args) throws Exception {
        Lutador[] vetor=new Lutador[6];
        vetor[0]= new Lutador("Putscript", "Brasil", 29, 168, 57.8f, 14, 2, 3);
        vetor[1]= new Lutador("Pretty Boy", "França", 31, 175, 68.9f, 11, 2, 1);
        vetor[2] = new Lutador("Snapshadow", "EUA", 35,165, 80.9f, 12,2,1);
        vetor[3] = new Lutador("Dead Code", "Austrália",28, 193, 81.6f, 13,0,2);
        vetor[4] = new Lutador("Ufocobol", "Brasil", 37, 170, 119.3f,  5,4,3);
        vetor[5] = new Lutador ("Nerdaard", "EUA", 30, 181, 105.7f,  12,2,4);
        Luta UEC01 = new Luta(vetor[0], vetor[0]);
        UEC01.marcarLuta(vetor[0], vetor[0]);
        UEC01.lutar();
        //vetor[0].status();
        //vetor[1].status();
    }
}
