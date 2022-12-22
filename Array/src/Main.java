public class Main {
    public static void main(String[] args) {
        int[][][] array = {
                { {4, 10, 6}, {17, 0, 12}, {5, 56, 13} },
                { {10, 23, 15}, {2, 23, 15}, {1, 23, 15} },
                { {5, 16, 0}, {4, 16, 0}, {8, 16, 0} }
        };

        System.out.println(array[1][0][2]);

        System.out.println("Array:");
        for (int[][] item2D :array) {
            for (int[] item1D: item2D) {
                for (int item: item1D) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}