import java.util.Scanner;

public class readNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextShort();
        String word1 = "", word4 = "";
        if (num < 0) {
            System.out.println("The number you enter must be greater than 0!");
        } else if (num < 20) {
            word1 = switch (num) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                case 11 -> "Eleven";
                case 12 -> "Twelve";
                case 13 -> "Thirteen";
                case 14 -> "Fourteen";
                case 15 -> "Fifteen";
                case 16 -> "Sixteen";
                case 17 -> "Seventeen";
                case 18 -> "Eighteen";
                case 19 -> "Nineteen";
                default -> "";
            };
        } else if (num < 1000) {

            word4 = switch ((num - num % 100) / 100) {
                case 1 -> "one hundred ";
                case 2 -> "two hundred ";
                case 3 -> "three hundred ";
                case 4 -> "four hundred ";
                case 5 -> "five hundred ";
                case 6 -> "six hundred ";
                case 7 -> "seven hundred ";
                case 8 -> "eight hundred ";
                case 9 -> "nine hundred ";
                    default -> "";
            };
        }
        if (num < 20) {
            System.out.println(num + ": " + word1);
        } else if (num < 100) {
            System.out.println(num + ": " + readToNumber(num));
        } else if (num < 1000) {
            System.out.println(num + ": " + word4 + " and" + readToNumber(num % 100));
        }
    }
//*-------------------------    Used method    -----------------------------*/
    public static String readToNumber(int num) {
        String word2, word3;
        word2 = switch ((num - num % 10) / 10) {
            case 2 -> "Twenty";
            case 3 -> "Thirty";
            case 4 -> "Forty";
            case 5 -> "Fifty";
            case 6 -> "Sixty";
            case 7 -> "Seventy";
            case 8 -> "Eighty";
            case 9 -> "Ninety";
            default -> "";
        };
        word3 = switch (num % 10) {
            case 1 -> " one";
            case 2 -> " two";
            case 3 -> " three";
            case 4 -> " four";
            case 5 -> " five";
            case 6 -> " six";
            case 7 -> " seven";
            case 8 -> " eight";
            case 9 -> " nine";
            default -> "";
        };
        return word2 + word3;
    }
}