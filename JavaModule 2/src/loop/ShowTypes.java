package loop;


import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:

                    String choice2 = "f";
                    while (choice2 != "x") {
                        System.out.println("a.The corner is square: bottom-left");
                        System.out.println("b.The corner is square: top-left");
                        System.out.println("c.The corner is square: top-right");
                        System.out.println("d.The corner is square: bottom-right");
                        System.out.println("x. Exit");
                        System.out.println("Enter your choice");
                        choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "a":
                                System.out.println("The corner is square: bottom-left)");
                                bottomLeft(5);
                                break;
                            case "b":
                                System.out.println("The corner is square: top-left)");
                                topLeft(5);
                                break;
                            case "c":
                                System.out.println("The corner is square: top-right");
                                topRight(5);
                                break;
                            case "d":
                                System.out.println("The corner is square: bottom-right");
                                bottomRight(5);
                                break;
                            case "x":
                                System.exit(0);
                            default:
                                System.out.println("No choice");
                        }
                    }
                case 3:
                    System.out.println("3.Print isosceles triangle");
                    isoscelesTriangle(5);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }

        }
    }

    public static void bottomLeft(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void topLeft(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void topRight(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void bottomRight(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j < row - 1 - i ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void isoscelesTriangle(int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if(j>=row-i-1){
                    System.out.printf("* ");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }
        }
    }



