import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("1- Cadastrar professor");
                System.out.println("2- Listar professores");
                System.out.println("3- Listar professores com categoria");
                System.out.println("4- Sair");
                opcao = s.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome do professor:");
                        String nome = s.next();
                        System.out.println("Digite os anos de experiência:");
                        int anos = s.nextInt();
                        new Professor(nome, anos);
                        break;
                    case 2:
                        Professor.printProfessores(false);
                        break;
                    case 3:
                        Professor.printProfessores(true);
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
        }
    }
}