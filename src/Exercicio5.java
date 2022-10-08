//Faça um Programa que converta metros para centímetros.
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio5 { 

    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        
        System.out.println("Digite a medida em metros: "); // Imprime na tela a mensagem
        double x = enterScanner.nextInt(); //Grava o valor digitado na variável x

        double y = x * 100; //Converte metros em centímetros

        System.out.println("A medida em cantímetros é: " + y); // Imprime na tela a mensagem
        enterScanner.close(); //Encerra as entradas do teclado
    }
}