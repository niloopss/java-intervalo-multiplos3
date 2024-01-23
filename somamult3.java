import java.util.Scanner;


public class somamult3 {
    public static void main(String[] args) {

        Scanner leia =  new Scanner(System.in);
        int n1,n2, contmult3 = 0 , somamult3 = 0;
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextInt();

        for (int i = n1;i<=n2;i++){
            if(i % 3 == 0) {
                contmult3++;
                somamult3 += i;
            }
        }
        System.out.println("A quantidade de múltiplos de 3 entre "+n1+" e "+n2+" é: "+contmult3);
        System.out.println("A soma dos múltiplos de 3 entre "+n1+" e "+n2+ " é: "+somamult3);
    }
}
