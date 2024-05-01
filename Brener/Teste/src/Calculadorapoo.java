import java.util.Scanner;


public class Calculadorapoo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calcular calcular = new Calcular("", 0, "");
        String input = "";

        while (!input.equalsIgnoreCase("Q")) {
            
        
        System.out.println(" Escolha 1 operação: \n [+]  [-]  [*]  [/]  [^]  [v]");
        String operação = scanner.nextLine();
        switch (operação) {
            case "+":
            calcular.adição();
                break;
                case "-":
            calcular.subitração();
                break;
                case "*":
            calcular.multiplicação();
                break;
                case "/":
            calcular.divisão();
                break;
                case "^":
            calcular.potência();
                break;
                case "v":
            calcular.raizQuadrada();
                break;
        
            default:
            System.out.println("Operação informada é inexistente.");
                break;
            }
            System.out.println("Digite 'Q' para sair. ");
            input = scanner.nextLine();
        }
        scanner.close();
    }
}

