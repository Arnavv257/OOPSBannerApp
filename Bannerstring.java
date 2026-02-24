public class Bannerstring {
    public static void main(String[] args) {

        String row1 = String.join("  ",
                "  OOO  ",
                "  OOO  ",
                " PPPP  ",
                "  SSS  "
        );

        String row2 = String.join("  ",
                " O   O ",
                " O   O ",
                " P   P ",
                " S     "
        );

        String row3 = String.join("  ",
                " O   O ",
                " O   O ",
                " PPPP  ",
                "  SSS  "
        );

        String row4 = String.join("  ",
                " O   O ",
                " O   O ",
                " P     ",
                "     S "
        );

        String row5 = String.join("  ",
                "  OOO  ",
                "  OOO  ",
                " P     ",
                "  SSS  "
        );

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}