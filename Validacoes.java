public class Validacoes {
    
    private Validacoes() {}
    
    public static boolean isNomePersonagemValido(String nomePersonagem) {
        return nomePersonagem != null && !nomePersonagem.trim().isEmpty();
    }
    
    public static boolean isNivelValido(int nivel) {
        return nivel >= 1;
    }
    
    public static boolean isVidaValida(int vida) {
        return vida >= 0;
    }
    
    public static boolean isNivelMaximoValido(int nivel) {
        return nivel <= 100;
    }
    
    public static boolean isVidaMaximaValida(int vida) {
        return vida >= 0 && vida <= 100;
    }
    
    public static boolean isObjetoValido(Object obj) {
        return obj != null;
    }
}