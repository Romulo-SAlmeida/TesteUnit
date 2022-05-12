import java.util.Scanner;
public class CalculadoraComum {
Scanner scan = new Scanner(System.in);


public void CalcComum(){

            System.out.println("Bem vindo");
            System.out.println("  ");
    System.out.println("escolha qual operação será feita:\n"
            + "1 para +\n"
            + "2 para -\n"
            + "3 para *\n"
            + "4 para /");
            int operador = scan.nextInt();

            if(operador == 1 ) {
                System.out.println("Digite o primeiro valor");
                int a = scan.nextInt();
                System.out.println("   ");
                System.out.println("Digite o segundo valor");
                int b = scan.nextInt();
                System.out.println("   ");
                int c = a+b;
                System.out.println("O valor é: " + c);


            } else if(operador == 2 ) {
                System.out.println("Digite o primeiro valor");
                int a = scan.nextInt();
                System.out.println("   ");
                System.out.println("Digite o segundo valor");
                int b = scan.nextInt();
                System.out.println("   ");
                int c = a-b;
                System.out.println("O valor é: " + c);


            }else if(operador == 3 ) {
                System.out.println("Digite o primeiro valor");
                int a = scan.nextInt();
                System.out.println("   ");
                System.out.println("Digite o segundo valor");
                int b = scan.nextInt();
                System.out.println("   ");
                int c = a*b;
                System.out.println("O valor é: " + c);


            }else if(operador == 4 ) {
                System.out.println("Digite o primeiro valor");
                int a = scan.nextInt();
                System.out.println("   ");
                System.out.println("Digite o segundo valor");
                int b = scan.nextInt();
                System.out.println("   ");
                int c = a/b;
                System.out.println("O valor é: " + c);

                if( b == 0) {
                    System.out.println("O valor é: " + a);
                 }
                }
               }
             }















