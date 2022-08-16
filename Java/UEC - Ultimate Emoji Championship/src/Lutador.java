public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (getPeso()>52.2f){
            this.categoria="Inválido";

        }else if(getPeso()<=70.3f){
            this.categoria="Leve";
        }else if(getPeso()<=83.9f){
            this.categoria="Médio";
        }else if(getPeso()<=120.2f){

        }else{
            this.categoria="Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println(getIdade()+" anos");
        System.out.println(getAltura()+" cm de altura");
        System.out.println("Pesando: "+getPeso());
        System.out.println("Ganhou: "+getVitorias());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("Empatou: "+getEmpates());
        System.out.println("-----------------------------");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso "+getCategoria());
        System.out.println(getVitorias()+" Vitórias");
        System.out.println(getDerrotas()+" Derrotas");
        System.out.println(+getEmpates()+" Empates");
        System.out.println("-----------------------------");
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    public Lutador(String nome, String nacionalidade, int idade, int altura, float peso,  int vitorias,
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
}
