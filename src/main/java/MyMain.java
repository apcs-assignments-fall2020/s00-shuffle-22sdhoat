public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int even_c = 0;
        int odd_c = arr.length/2;
        int[] real = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                real[i] += arr[even_c];
                even_c++;
            }
            else {
                real[i] += arr[odd_c];
                odd_c++;
            }
        }
        return real;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int placement = 0;
        for (int i = 0; i < arr.length; i++) {
            int selection = (int)(Math.random() * arr.length);
            placement = arr[i];
            arr[i] = arr[selection];
            arr[selection] = placement;
        }
        return arr;
    }


    public static void main(String[] args) {
    }
}
