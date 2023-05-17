package module1;

public class Task19 {
    public static void main(String[] args) {
        int[] test = {1, 5, 2, 17, 5};
        getArrayMiddle(test);
    }
    public static int[] getArrayMiddle(int[] numbers){
        int size = 0;
        int centre = numbers.length/2-1;
        for (int i = 0; i < numbers.length; i++){
            if (numbers.length % 2 == 0){
                size = 2;
            } else size = 1;
        }

        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            if (size == 2) arr[i] = numbers[centre++]; //для четного
            else if (size == 1) arr[i] = numbers[centre+1]; // для нечетного
        }

        System.out.print("[");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if (i<arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
        return arr;
    }
}
