
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i=0;i<number;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=0;i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int sizeCount=size;
        for (int i=1;i<=size;i++){
            sizeCount--;
            printSpaces(sizeCount);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars=1;
        int sizeCount=height;
        for (int i=0;i<height;i++){
            sizeCount--;
            printSpaces(sizeCount);
            printStars(stars);
            stars+=2;
        }
        for (int i = 0;i<2;i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(2);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
