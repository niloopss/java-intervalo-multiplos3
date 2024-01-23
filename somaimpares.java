import java.util.Scanner;


public class somaimpares {
    public static void main(String[] args) {

        Scanner leia =  new Scanner(System.in);
        int n1,n2, contimpar = 0 , somaimpar = 0;
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextInt();

        for (int i = n1;i<=n2;i++){
            if(i % 2 !=0) {
                contimpar++;
                somaimpar += i;
            }
        }
        System.out.println("A quantidade de números impares entre "+n1+" e "+n2+" é: "+contimpar);
        System.out.println("A soma dos números impares entre "+n1+" e "+n2+ " é: "+somaimpar);
    }
}
