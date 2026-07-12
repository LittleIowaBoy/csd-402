// cschumacher_07122026_mod5_2_csd402
// https://github.com/LittleIowaBoy/csd-402/tree/main



public class ElementFinder {

    // Returns the row and column index of the largest element in a 2D double array.
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0]; // seed with the first element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j]; // update the running maximum
                    location[0] = i;            // record its row
                    location[1] = j;            // record its column
                }
            }
        }
        return location; // {row, col} of the largest element
    }

    // Returns the row and column index of the largest element in a 2D int array.
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0]; // seed with the first element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j]; // update the running maximum
                    location[0] = i;            // record its row
                    location[1] = j;            // record its column
                }
            }
        }
        return location; // {row, col} of the largest element
    }

    // Returns the row and column index of the smallest element in a 2D double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0]; // seed with the first element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j]; // update the running minimum
                    location[0] = i;             // record its row
                    location[1] = j;             // record its column
                }
            }
        }
        return location; // {row, col} of the smallest element
    }

    // Returns the row and column index of the smallest element in a 2D int array.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0]; // seed with the first element
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j]; // update the running minimum
                    location[0] = i;             // record its row
                    location[1] = j;             // record its column
                }
            }
        }
        return location; // {row, col} of the smallest element
    }

    public static void main(String[] args) {
        // Sample 2D double array for testing the double overloads
        double[][] doubleArray = {
            {1.5, 9.2, 3.7},
            {4.1, 0.8, 7.6},
            {2.3, 5.5, 6.0}
        };

        // Sample 2D int array for testing the int overloads
        int[][] intArray = {
            {3, 7, 1},
            {9, 2, 8},
            {4, 6, 5}
        };

        // Locate and print the largest/smallest positions in the double array
        int[] largestDouble = locateLargest(doubleArray);
        System.out.println("Largest double at [" + largestDouble[0] + "][" + largestDouble[1] + "] = " + doubleArray[largestDouble[0]][largestDouble[1]]);

        int[] smallestDouble = locateSmallest(doubleArray);
        System.out.println("Smallest double at [" + smallestDouble[0] + "][" + smallestDouble[1] + "] = " + doubleArray[smallestDouble[0]][smallestDouble[1]]);

        // Locate and print the largest/smallest positions in the int array
        int[] largestInt = locateLargest(intArray);
        System.out.println("Largest int at [" + largestInt[0] + "][" + largestInt[1] + "] = " + intArray[largestInt[0]][largestInt[1]]);

        int[] smallestInt = locateSmallest(intArray);
        System.out.println("Smallest int at [" + smallestInt[0] + "][" + smallestInt[1] + "] = " + intArray[smallestInt[0]][smallestInt[1]]);
    }
}
