import java.beans.VetoableChangeListenerProxy;

public class App {
    public static void main(String[] args) throws Exception {
        Video[] vetorVideos = new Video[5];
        vetorVideos[0] = new Video("Aula 1 de Java");
        vetorVideos[1] = new Video("Aula 2 de Java");
        vetorVideos[2] = new Video("Aula 3 de Java");
        vetorVideos[3] = new Video("Aula 4 de Java");
        vetorVideos[4] = new Video("Aula 5 de Java");
        Gafanhoto[] g= new Gafanhoto[2];
        g[0]= new Gafanhoto("Joao", 23, 'H', "jjoao");
        g[1]= new Gafanhoto("Maria",25, 'F',"mmaria");
        System.out.println(g[0].toString());
        System.out.println(vetorVideos[0].toString());
    }
}
