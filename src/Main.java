import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double dinheiro = 0;
        boolean estaExecutando = true;
        int opcao;

        while(estaExecutando){
            System.out.println("=================");
            System.out.println("PROGRAMA BANCÁRIO");
            System.out.println("=================");
            System.out.println("1. Extrato");
            System.out.println("2. Depósito");
            System.out.println("3. Saque");
            System.out.println("4. Saída");
            System.out.println("=================");

            System.out.print("Escolha uma opção (1-4): ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> extrato(dinheiro);
                case 2 -> dinheiro += deposito();
                case 3 -> dinheiro -= saque(dinheiro);
                case 4 -> estaExecutando = saida();
                default -> System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }

    static void extrato(double dinheiro){
        System.out.println("=================");
        System.out.printf("$%.2f \n", dinheiro);
    }

    static double deposito(){
        double quantidade;

        System.out.print("Entre a quantidade que será depositada: ");
        quantidade = scanner.nextDouble();

        if(quantidade < 0){
            System.out.println("A quantidade não pode ser negativa");
            return 0;
        } else {
            return quantidade;
        }
    }

    static double saque(double dinheiro){
        double quantidade;

        System.out.print("Entre a quantidade que será retirada: ");
        quantidade = scanner.nextDouble();

        if(quantidade > dinheiro){
            System.out.println("Você está sem dinheiro para realizar essa operação");
            return 0;
        } else if(quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa");
            return 0;
        } else {
            return quantidade;
        }
    }

    static boolean saida(){
        System.out.println("====================");
        System.out.println("Transação completada");
        return false;
    }
}
