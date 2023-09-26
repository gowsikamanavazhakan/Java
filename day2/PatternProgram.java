public class PatternProgram {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print(calculateNumber(i, j) + "   ");
            }


            System.out.println();
        }
    }

    public static int calculateNumber(int row, int position) {
        if (position == 0 || position == row) {
            return 1;
        } else {
            return calculateNumber(row - 1, position - 1) + calculateNumber(row - 1, position);
        }
    }
}
