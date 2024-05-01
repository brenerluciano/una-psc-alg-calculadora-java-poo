import java.util.Scanner;

public class Calcular {

  private String nome;
  private int idade;
  private String cpf;

  
public Calcular(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
Scanner scanner = new Scanner(System.in);
public void adição(){
    System.out.println("Informe os dois números: ");
    int numeroUm = scanner.nextInt();
    int numeroDois = scanner.nextInt();
    int total = numeroUm + numeroDois;
    System.out.println("\nSoma total dos números:\n" + total);
}
public void subitração(){
    System.out.println("Informe os dois números: ");
    int numeroUm = scanner.nextInt();
    int numeroDois = scanner.nextInt();
    int total = numeroUm - numeroDois;
    System.out.println("\nSubitração dos números:\n" + total);
}
public void multiplicação(){
    System.out.println("Informe os dois números: ");
    int numeroUm = scanner.nextInt();
    int numeroDois = scanner.nextInt();
    int total = numeroUm * numeroDois;
    System.out.println("\nMultiplicação dos números:\n" + total);
}
public void divisão(){
    System.out.println("Informe os dois números: ");
    int numeroUm = scanner.nextInt();
    int numeroDois = scanner.nextInt();
    if(numeroDois == 0){
        System.out.println("\nImpossível realizar uma divisão por zero.");
    }else{
    int total = numeroUm / numeroDois;
    System.out.println("\nDivisão dos números:\n" + total);
    }
    
}
public void potência(){
    System.out.println("Informe os dois números: ");
    int numeroUm = scanner.nextInt();
    int numeroDois = scanner.nextInt();
    int total = (int)  Math.pow(numeroUm, numeroDois);
    System.out.println("\nPotência dos números:\n" + total);
}
public void raizQuadrada(){
    System.out.println("Informe o número: ");
    int numeroUm = scanner.nextInt();
    if(numeroUm < 0){
        System.out.println("\nNão existe raiz de número negativo.");
    }else{
    int total = (int) Math.sqrt(numeroUm);
    System.out.println("\nRaiz quadrada do número "+numeroUm+" é:"+"\n" + total);
    }
}
}
