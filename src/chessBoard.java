import java.util.Scanner;

public class chessBoard {
    private int chessBoardHeight;
    private int chessBoardWidth;

    public chessBoard(int chessBoardHeight, int chessBoardWidth) {
        System.out.println("Enter integer height and width please.");
        Scanner sc = new Scanner(System.in);
        if (chessBoardHeight < 1 || chessBoardWidth < 1) {
            throw new IllegalArgumentException("height and width must be more than 0!");
        }
        int maxHeightWidthValue = 80;
        if (chessBoardHeight > maxHeightWidthValue || chessBoardWidth > maxHeightWidthValue) {
            throw new IllegalArgumentException("height and width must be less than 80!");
        }
        System.out.println("Enter integer height: ");
        this.chessBoardHeight = sc.nextInt();
        System.out.println("Enter integer width: ");
        this.chessBoardWidth = sc.nextInt();
    }

    chessBoard() {
    }

    private int getChessBoardHeight() {
        return chessBoardHeight;
    }

    private int getChessBoardWidth() {
        return chessBoardWidth;
    }

    String createChessBoard() {
        int height = getChessBoardHeight();
        int width = getChessBoardWidth();
        for (int i = 0; i <= height; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j <= width; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return;
    }

}

//        ArrayList<Integer> heightList = new ArrayList<>(Arrays.asList(getChessBoardHeight()));
//        for (Integer height : heightList) {
//            if (height % 2 == 0){
//                System.out.print(" ");
//            } else {
//                System.out.println("*");
//            }
//        }