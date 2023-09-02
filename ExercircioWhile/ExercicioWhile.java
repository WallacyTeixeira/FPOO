package ExercircioWhile;

public class ExercicioWhile {
    public static final String Exercicio = null;
    public final String Exercicio1 = null;
    public Object Exercicio2;

    private void Exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("vetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    void Exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("vetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    void Exercicio3() {
        int vetorA[]= new int[]{5,10,15,20,25,30,35,40,45,50,55,60,65,70,75};
        int vetorB[]= new int[vetorA.length];
        int i = 0;
        System.out.println("Exercicio2");
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i]*vetorA[i];
            System.out.println("vetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    void Exercicio4() {
        double vetorA[]= new double[]{5,10,15,20,25,30,35,40,45,50,55,60,65,70,75};
        double vetorB[]= new double[15];
        int i = 0;
        System.out.println("Exercicio2");
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("vetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }
}

