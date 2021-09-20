package Exercicios.For;

public class ImprimirNumParPrimos {

        public static void main(String[] args) {

            System.out.println("---------------------------------------Numeros pares até 100-----------------------");
            for (int i = 1; i <=100; i++) {
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }


            System.out.println("----------------------------------Numeros Primos até 150----------------------------");
            for (int j = 2; j <= 150; j++) {
                boolean primo = true;
                for (int k = 2; k < j ; k++) {

                    if (j % k == 0) {
                        primo = false;
                    }
                }
                    if(primo == true){
                        System.out.println(j);

                    }



            }
        }
}


