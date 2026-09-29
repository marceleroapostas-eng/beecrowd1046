
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner leitor = new
            Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        int duracao;
        
        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
       }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
        leitor.close();
    }
}
