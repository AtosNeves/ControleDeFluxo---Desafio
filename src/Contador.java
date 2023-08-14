import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        try{

            verificador(numero1,numero2);



        }
        catch (Exception e){

            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }





    static void verificador(int n1, int n2) throws ParametrosInvalidosException{




        if (n2 < n1){
            throw new ParametrosInvalidosException();
        }
        else {

            int quantidade = n2 - n1;

            for (int i = 1; i <= quantidade ; i++) {
                System.out.println("Numero sendo imprimido = " + i);

            }






        }


    }




}
