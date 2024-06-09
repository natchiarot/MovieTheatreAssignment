package Arrays;

public class MovieTheatre {
    private static String[][] seatingPlan = new String[15][20];

    public static void main(String[]args){
        initializeSeatingPlan();
        System.out.println("Initial seating plan.");
        printSeatingPlan();
        System.out.println();
        reserveSeating(0, 2);
        reserveSeating(0, 3);
        reserveSeating(50, 3);
        reserveSeating(10, 15);
        System.out.println();
        System.out.println("Seating plan after reserve seating method.");
        printSeatingPlan();
    }

    public static void reserveSeating(int i, int j) {
        if (i >= 0 && i < seatingPlan.length && j >= 0 && j < seatingPlan[i].length) {
                if (seatingPlan[i][j].equals("0")) {
                    seatingPlan[i][j] = "X";
                    System.out.println("Seat at row: " + i + ", column: " + j + " has been reserved!");
                } else {
                    System.out.println("Seat at row: " + i + ", column:" + j + " is already reserved.");
                }
            } else {
                System.out.println("Invalid seating selection at row: " + i + ", column: " + j);
        }
    }

        public static void initializeSeatingPlan() {
            seatingPlan[0][3] = "X";
            seatingPlan[1][9] = "X";
            seatingPlan[1][8] = "X";
            seatingPlan[7][7] = "X";
            seatingPlan[7][8] = "X";
            seatingPlan[7][6] = "X";
            seatingPlan[9][9] = "X";

            for (int i = 0; i < seatingPlan.length; i++) {
                for (int j = 0; j < seatingPlan[i].length; j++) {
                    if (seatingPlan[i][j] == null) {
                        seatingPlan[i][j] = "0";
                    }
                }
            }
        }

            public static void printSeatingPlan() {
                System.out.println("            MOVIE SCREEN");
                System.out.println("              [_______]");
                for (int i = 0; i < seatingPlan.length; i++) {
                    for (int j = 0; j < seatingPlan[i].length; j++) {
                        System.out.print(seatingPlan[i][j] + " ");
                    }
                    System.out.println();
                }
            }
}
