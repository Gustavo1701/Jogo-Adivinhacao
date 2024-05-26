import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) throws Exception {

        Random gerador = new Random();
        int nivel1 = gerador.nextInt(10);
        int nivel2 = gerador.nextInt(50);
        int nivel3 = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o nível de dificuldade: ");
        System.out.println("");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");

        int nivel = entrada.nextInt();
        entrada.nextLine();

        if (nivel == 1) {
            System.out.println("Você escolheu o nível fácil!");
            System.out.println("");
            if (confirmarContinuar(entrada)) {
                System.out.println("Adivinhe o número que estou pensando entre 0 e 10");
                int numero = entrada.nextInt();

                if (numero > 10) {
                    System.out.println("O número que você digitou é maior que 10!");
                    System.out.println("Tentar novamente?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int opcao = entrada.nextInt();
                    if (opcao == 1) {
                        System.out.println("Adivinhe o número que estou pensando entre 0 e 10");
                        numero = entrada.nextInt();
                        if (numero == nivel1) {
                            System.out.println("Parabéns, você acertou, eu pensei no " + nivel1);
                        } else {
                            System.out.println("Você errou, eu pensei no " + nivel1);
                        }
                    } else {
                        System.out.println("Até a proxima!");
                    }
                } else if (numero == nivel1) {
                    System.out.println("");
                    System.out.println("Parabéns, você acertou, eu pensei no " + nivel1);
                } else {
                    System.out.println("");
                    System.out.println("Você errou, eu pensei no " + nivel1);
                }
            }
        }

        else if (nivel == 2) {
            System.out.println("Você escolheu o nível médio!");
            System.out.println("");
            if (confirmarContinuar(entrada)) {
                System.out.println("Adivinhe o número que estou pensando entre 0 e 50");
                int numero = entrada.nextInt();

                if (numero > 50) {
                    System.out.println("O número que você digitou é maior que 50!");
                    System.out.println("Tentar novamente?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int opcao = entrada.nextInt();
                    if (opcao == 1) {
                        System.out.println("Adivinhe o número que estou pensando entre 0 e 50");
                        numero = entrada.nextInt();
                        if (numero == nivel2) {
                            System.out.println("Parabéns, você acertou, eu pensei no " + nivel2);
                        } else {
                            System.out.println("Você errou, eu pensei no " + nivel2);
                        }
                    } else {
                        System.out.println("Até a proxima!");
                    }
                } else if (numero == nivel2) {
                    System.out.println("");
                    System.out.println("Parabéns, você acertou, eu pensei no " + nivel2);
                } else {
                    System.out.println("");
                    System.out.println("Você errou, eu pensei no " + nivel2);
                }
            }
        }

        else if (nivel == 3) {
            System.out.println("Você escolheu o nível difícil!");
            System.out.println("");
            if (confirmarContinuar(entrada)) {
                System.out.println("Adivinhe o número que estou pensando entre 0 e 100");
                int numero = entrada.nextInt();

                if (numero > 100) {
                    System.out.println("O número que você digitou é maior que 100!");
                    System.out.println("Tentar novamente?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int opcao = entrada.nextInt();
                    if (opcao == 1) {
                        System.out.println("Adivinhe o número que estou pensando entre 0 e 100");
                        numero = entrada.nextInt();
                        if (numero == nivel3) {
                            System.out.println("Parabéns, você acertou, eu pensei no " + nivel3);
                        } else {
                            System.out.println("Você errou, eu pensei no " + nivel3);
                        }
                    } else {
                        System.out.println("Até a proxima!");
                    }
                } else if (numero == nivel3) {
                    System.out.println("");
                    System.out.println("Parabéns, você acertou, eu pensei no " + nivel3);
                } else {
                    System.out.println("");
                    System.out.println("Você errou, eu pensei no " + nivel2);
                }
            }
        }

        else if (nivel == 3) {
            System.out.println("Você escolheu o nível difícil!");
            System.out.println("");
            if (confirmarContinuar(entrada)) {
                System.out.println("Adivinhe o número que estou pensando entre 0 e 100");
                int numero = entrada.nextInt();

                if (numero == nivel3) {
                    System.out.println("Parabéns, você acertou, eu pensei no " + nivel3);
                } else {
                    System.out.println("Você errou, eu pensei no " + nivel3);
                }
            } else {
                System.out.println("Ok, até a próxima!");
            }
        } else {
            System.out.println("Opção inválida");
        }

        entrada.close(); // Fechando o scanner
    }

    public static boolean confirmarContinuar(Scanner scanner) {
        System.out.println("Tem certeza que deseja continuar?");
        System.out.println("Sim?");
        System.out.println("Não?");
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("Sim");
    }
}
