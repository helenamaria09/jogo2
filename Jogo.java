public class Jogo {
    
    private String nomePersonagem;
    private int nivel;
    private int vida;
    
    public Jogo() {
        this.nomePersonagem = "Herói";
        this.nivel = 1;
        this.vida = 100;
    }
    
    public Jogo(String nomePersonagem, int nivel, int vida) {
        this.nomePersonagem = nomePersonagem;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    public void status() {
        System.out.println("⚔️ " + nomePersonagem + " | Nível: " + nivel + " | Vida: " + vida);
    }
    
    public String getNomePersonagem() { return nomePersonagem; }
    public void setNomePersonagem(String nomePersonagem) { this.nomePersonagem = nomePersonagem; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    
    @Override
    public String toString() {
        return "Jogo [nomePersonagem=" + nomePersonagem + ", nivel=" + nivel + ", vida=" + vida + "]";
    }
}