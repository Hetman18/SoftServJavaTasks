import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class chessBoard {
    Scanner sc = new Scanner(System.in);
    protected String chessBoardHeight = sc.nextLine();
    protected String chessBoardWidth = sc.nextLine();

    public boolean inputValidationHeight() {
        boolean inputHeight = chessBoardHeight.matches("\\d{2}");
        while (inputHeight = false) {
            System.out.println("Incorrect input value!");
            continue;
        }
        return inputHeight;
    }

    public boolean inputValidationWidth() {
        boolean inputWidth = chessBoardWidth.matches("\\d{2}");
        while (inputWidth = false){
            System.out.println("Incorrect input value, try againe!");
            continue;
        }
        return inputWidth;
    }
    public String createChessBoard () {
        inputValidationHeight();
        inputValidationWidth();
        int height = Integer.parseInt(chessBoardHeight);
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                System.out.println(" ");
            } else {
                System.out.println("*");
            }
            int width = Integer.parseInt(chessBoardWidth);
            for (int j = 0; j < width; j++) {
                if (j % 2 == 0) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
        }
        return createChessBoard();
    }
}
