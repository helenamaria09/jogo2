import java.util.Scanner;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo(); 
        int opcao;

        do {
            imprimirMenu();
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(jogo.toString());
                    break;
                case 2:
                    alterarNomePersonagem(jogo, scanner);
                    break;
                case 3:
                    alterarNivel(jogo, scanner);
                    break;
                case 4:
                    jogo.status();
                    break;
                case 5:
                    alterarVida(jogo, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu do Jogo ===");
        System.out.println("1. Mostrar dados (toString)");
        System.out.println("2. Alterar nome do personagem");
        System.out.println("3. Alterar nível");
        System.out.println("4. Ver status rápido");
        System.out.println("5. Alterar vida");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número válido!");
            return -1;
        }
    }

    public static void alterarNomePersonagem(Jogo jogo, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.isNomePersonagemValido(novoNome)) {
            jogo.setNomePersonagem(novoNome);
            System.out.println("Nome alterado!");
        } else {
            System.out.println("Erro: Nome inválido.");
        }
    }

    public static void alterarNivel(Jogo jogo, Scanner scanner) {
        System.out.print("Digite o nível (1-100): ");
        try {
            int novoNivel = Integer.parseInt(scanner.nextLine());
            if (Validacoes.isNivelValido(novoNivel) && Validacoes.isNivelMaximoValido(novoNivel)) {
                jogo.setNivel(novoNivel);
                System.out.println("Nível atualizado!");
            } else {
                System.out.println("Erro: Nível inválido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número inteiro.");
        }
    }

    public static void alterarVida(Jogo jogo, Scanner scanner) {
        System.out.print("Digite a vida (0-100): ");
        try {
            int novaVida = Integer.parseInt(scanner.nextLine());
            if (Validacoes.isVidaMaximaValida(novaVida)) {
                jogo.setVida(novaVida);
                System.out.println("Vida atualizada!");
            } else {
                System.out.println("Erro: Vida inválida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número inteiro.");
        }
    }
}