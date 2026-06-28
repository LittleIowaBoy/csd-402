// cschumacher_06282026_mod3_3_csd402
// https://github.com/LittleIowaBoy/csd-402/tree/main

public class PowersOfTwo {

    public static void main(String[] args) {
        int totalRows = 7;

        for (int row = 1; row <= totalRows; row++) {

            // Leading spaces: 2*(totalRows-row)+1 for all rows except the last
            int leading = (row < totalRows) ? (2 * (totalRows - row) + 1) : 0;
            for (int s = 0; s < leading; s++) {
                System.out.print(" ");
            }

            // Build content: ascending powers of 2 then descending
            StringBuilder content = new StringBuilder();

            // First half: 1, 2, 4, ..., 2^(row-1)
            int val = 1;
            for (int j = 0; j < row; j++) {
                if (j > 0) content.append(" ");
                content.append(val);
                val *= 2;
            }

            // Second half: 2^(row-2), ..., 2, 1
            val /= 4;
            for (int j = row - 2; j >= 0; j--) {
                content.append(" ");
                content.append(val);
                val /= 2;
            }

            System.out.print(content.toString());

            // Trailing spaces so that @ lands at column 32
            int trailing = 31 - leading - content.length();
            for (int s = 0; s < trailing; s++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}
