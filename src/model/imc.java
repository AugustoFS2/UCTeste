package model;
import java.util.Scanner;

/**
 *
 * @author aug
 */
public class imc {
    /* Como é calculado?
    O IMC é a relação entre peso e altura e o cálculo é feito de acordo 
    com a fórmula: IMC = peso/ (altura x altura), devendo o peso estar 
    em kg e a altura em metro, e o resultado é dado em kg/m2. 
    Depois de obter o resultado, é possível verificar em que faixa o IMC 
    se encontra, podendo indicar:
    Magreza, quando o resultado é menor que 18,5 kg/m2;
    Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
    Sobrepeso, quando o resultado está entre 25 e 29,9 kg/m2;
    Obesidade, quando o resultado é maior ou igual a 30 kg/m2.
*/
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double peso, altura, imc;
        String nome, saida = "s";
        boolean s = true;

        while (saida.equalsIgnoreCase("s")) { //Início While
            System.out.println("-Calculadora de IMC-");
            System.out.println("");
            System.out.println("");
            System.out.print("De quem calcularemos o IMC? ");
            nome = ler.nextLine();
            nome = nome.toUpperCase();
            System.out.print("Informe a massa, em quilogramas (kg), de " + nome + ": ");
            peso = ler.nextDouble();
            System.out.print("Informe a altura, em metros (m), de " + nome + ": ");
            altura = ler.nextDouble();
            imc = peso / (altura * altura);

            System.out.println("Resultado preciso (apenas 2 algarismos após a vírgula)");
            if (imc < 18.5) {
                System.out.printf("O IMC de " + nome + " é: %.2f, ", imc, ", classficado como magreza.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.printf("O IMC de " + nome + " é: %.2f, ", imc, ", classficado como normal.");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.printf("O IMC de " + nome + " é: %.2f, ", imc, ", classficado como sobrepeso.");
            } else {
                System.out.printf("O IMC de " + nome + " é: %2.f, ", imc, ", classficado como obesidade.");
            }
            
            System.out.println("");
            System.out.println("\n\nResultado ainda mais preciso");
            if (imc < 18.5) {
                System.out.println("O IMC de " + nome + " é: " + imc + ", classficado como magreza.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("O IMC de " + nome + " é: " + imc + ", classficado como normal.");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("O IMC de " + nome + " é: " + imc + ", classficado como sobrepeso.");
            } else {
                System.out.println("O IMC de " + nome + " é: " + imc + ", classficado como obesidade.");
            }

            System.out.println("");
            System.out.println("Deseja calcular outro IMC? \n [ Digite (S) para continuar ] \n [ Ou qualquer outra tecla para sair da aplicação ]");
            saida = ler.next();
            s = saida.equalsIgnoreCase("s");
            ler.nextLine();
        }// fim do while
        System.out.println("Aplicação encerrada pelo usuário!");
    }

}
