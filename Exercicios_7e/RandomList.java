
import java.util.Arrays;
import java.util.Random;



public class RandomList {

    public static void main(String[] args) {
        int[] lst = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            lst[i] = rand.nextInt(100);
        }
        System.out.println("Os elementos da arry são");
        for(int i = 0; i<15; i++){
            System.out.println("posição " + i + " corresponde ao valor " + lst[i]);
        }
        System.out.println("O array ordenado é");
        Arrays.sort(lst);
        for(int i = 0; i < 15; i++){
        System.out.println("posição "+ i + " valor " + lst[i]);
        }
    }

}
