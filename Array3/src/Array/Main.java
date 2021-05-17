package Array;

public class Main {

    public static void main(String[] args) {

        int [] vetor = {9, 8, 5, 6};
        for (int i=0; i<3; i++){


            double media;

            media = (vetor[0] + vetor[1] + vetor[2] + vetor[3]) / 4;

            System.out.println("Nota 1 = " + vetor[0]);
            System.out.println("Nota 2 = " + vetor[1]);
            System.out.println("Nota 3 = " + vetor[2]);
            System.out.println("Nota 4 = " + vetor[3]);

            System.out.println("Valor da média: " + media);


        }
    }
}
