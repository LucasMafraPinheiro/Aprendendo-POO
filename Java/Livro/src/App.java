public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] P = new Pessoa[2];
        Livro[] L= new Livro[3];
        P[0] = new Pessoa("Pedro", 22, "M");
        P[1] = new Pessoa("Joana", 25, "F");
        L[0] = new Livro("Aprendendo Java", "José da silva",300,P[0]);
        L[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, P[1]);
        L[2] =new Livro ("Java Avançado","Maria Candido", 800, P[0]);
        L[0].abrir();
        L[0].folhear(1000);
        System.out.print(L[0].detalhes());
    }
}
