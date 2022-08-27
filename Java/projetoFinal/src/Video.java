public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int view;
    private int likes;
    private boolean reproduzindo;
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.view = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getView() {
        return view;
    }
    public void setView(int view) {
        this.view = view;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    @Override
    public void play() {
        if(!this.reproduzindo) this.reproduzindo=true;
        
    }
    @Override
    public void pause() {
        if(this.reproduzindo) this.reproduzindo=false;
        
    }
    @Override
    public void like() {
        this.likes++;
        
    }
    @Override
    public String toString() {
        return "Video [\navaliacao=" + avaliacao + "\n, likes=" + likes + "\n, reproduzindo=" + reproduzindo + "\n, titulo="
                + titulo + "\n, view=" + view + "]";
    }
    
}