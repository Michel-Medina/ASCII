import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Insira um caractere do teclado: ");

            char letra = leitor.next() . charAt(0);

        System.out.println("Valor ASCII: "+(int)letra);

        System.out.print("Valor binario: ");

            for(int cont=128;cont>0;cont/=2); {
                if(cont==8) System.out.println(" ");
                if((((int)letra) &cont)!=0) System.out.print(1);
                    else System.out.print(0);
            }  
    }
}
