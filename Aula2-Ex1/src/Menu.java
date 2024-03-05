import java.util.Scanner;

public class Menu {
    Retangulo retangulo;
    Scanner scanner = new Scanner(System.in);
    public void opcoes(){
        int op = 1;
        while(op != 5){
            do{
                System.out.println("Opcoes:\n1- Criar Retangulo com lados\n2- Criar retangulo de lados = 1\n3- Ver Area\n4- Ver Perimetro\n5- Sair");
                op = this.lerInt();
            }while(op < 0 || op > 6);

            switch (op){
                case 1:
                    this.criarRetangulo();
                    break;
                case 2:
                    this.retangulo = new Retangulo();
                    break;
                case 3:
                    if(this.retangulo == null)
                        throw new IllegalArgumentException("Triangulo nao criado");
                    System.out.println(this.retangulo.getArea());
                    break;
                case 4:
                    this.retangulo.getPerimetro();
                    if(this.retangulo == null)
                        throw new IllegalArgumentException("Triangulo nao criado");
                    System.out.println(this.retangulo.getPerimetro());
                    break;
                case 5:
                    break;
                default:
                    throw new IllegalArgumentException("Opcao invalida");
            }
        }


    }

    private void criarRetangulo() {
        System.out.println("Lado 1:");
        int l1 = lerInt();
        System.out.println("Lado 2:");
        int l2 = lerInt();
        this.retangulo = new Retangulo(l1, l2);
    }

    private int lerInt(){
        return Integer.parseInt(scanner.nextLine());
    }
}
