import java.util.Scanner;

public class Pedra_Papel_Tesoura_Lagarto_Spock {
    public static void main(String[] args) {
        String Jogador1;
        String Jogador2;

        Scanner in = new Scanner(System.in);

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nPedra, Papel, Tesoura, Lagarto, Spock\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.print("Jogador 1 - Insira sua Jogada: ");
        Jogador1 = in.nextLine().toUpperCase();

        System.out.print("Jogador 2 - Insira sua Jogada: ");
        Jogador2 = in.nextLine().toUpperCase();

        switch (Jogador1) {
            case "PEDRA":
                switch (Jogador2) {
                    case "PEDRA":
                        System.out.println("EMPATE");
                        break;
                    case "PAPEL":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    case "TESOURA":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    case "LAGARTO":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    case "SPOCK":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;
            case "PAPEL":
                switch (Jogador2) {
                    case "PEDRA":
                        System.out.println("O JOGADOR 1 GANHOU!");
                        break;
                    case "PAPEL":
                        System.out.println("EMPATE");
                        break;
                    case "TESOURA":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    case "LAGARTO":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    case "SPOCK":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;
            case "TESOURA":
                switch (Jogador2) {
                    case "PEDRA":
                        System.out.println("O JOGADOR 2 GANHOU!");
                        break;
                    case "PAPEL":
                        System.out.println("O JOGADOR 1 GANHOU!");
                        break;
                    case "TESOURA":
                        System.out.println("EMPATE");
                        break;
                    case "LAGARTO":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    case "SPOCK":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;
            case "LAGARTO":
                switch (Jogador2) {
                    case "PEDRA":
                        System.out.println("O JOGADOR 2 GANHOU!");
                        break;
                    case "PAPEL":
                        System.out.println("O JOGADOR 1 GANHOU!");
                        break;
                    case "TESOURA":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    case "LAGARTO":
                        System.out.println("EMPATE");
                        break;
                    case "SPOCK":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;
            case "SPOCK":
                switch (Jogador2) {
                    case "PEDRA":
                        System.out.println("O JOGADOR 1 GANHOU!");
                        break;
                    case "PAPEL":
                        System.out.println("O JOGADOR 2 GANHOU!");
                        break;
                    case "TESOURA":
                        System.out.println("O JOGADOR 1 GANOHU!");
                        break;
                    case "LAGARTO":
                        System.out.println("O JOGADOR 2 GANOHU!");
                        break;
                    case "SPOCK":
                        System.out.println("EMPATE");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;
            default:
                System.out.println("ERRO");
        }
    }
}