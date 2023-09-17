import java.util.Scanner;

public class NotasIfElse {
        public static void main(String[] args){
            int nota1 = 0;
            int nota2 = 0;
            int nota3 = 0;
            int nota4 = 0;
            float media = 0;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite a primeira nota: ");
            nota1 = entrada.nextInt();

            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = entrada.nextInt();

            System.out.println("Digite a terceira nota do aluno: ");
            nota3 = entrada.nextInt();

            System.out.println("Digite a quarta nota do aluno : ");
            nota4 = entrada.nextInt();


            if(nota1 <=10 && nota1 >=0 && nota2 <=10 && nota2 >=0 && nota3 <=10 && nota3 >=0 && nota4 <=10 && nota4 >=0){
                System.out.println("Nota válida!");
                media = (nota1 + nota2 + nota3 + nota4) / 4;
                if(media <=4){
                    System.out.println("O aluno infelizmente foi reprovado!");
                }else if(media >= 5 && media <=6){
                    System.out.println("O aluno tem o direito de fazer prova de recuperação");

                }
                else{
                    System.out.println("O aluno foi aprovado!!!");
                }
            }else{
                System.out.println("Nota inválida");

            }

        }
    }

