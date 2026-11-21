
public class StrongPasswordGenerator {
    static int noOfTimes;
    static String Password = ""; //this will store all the Char, Symbol, number etc. together as a string.

    public static void main(String[] args) {


//        int intNumber = intNumber();
//        char specialChar = strSpecialChar();
//        char lowerCaseAlphabet = lowerCaseAlphabet();

        noOfTimes = numberOfTimes();
        callingMethods();
        System.out.println("Your Password is " + Password);
    }

    public static int numberOfTimes(){
//        int[] array3 = {8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
//        int num3 = (int)(Math.round((Math.random() * array3.length)));
//        return array3[num3];

        return (int)(Math.random() * 43) + 8; //This generates a number between 8 and 50 (inclusive).
    }

    public static int intNumber(){
        return (int)(Math.random() * 20);
    }

    public static char strSpecialChar(){
        char[] array1 = {'!', '@', '#', '$', '%', '^', '*', '(', ')', '_', '-', '+', '=', '{', '}', '[', ']', ':', '<', '>', '?', '/', '~'};
        int num1 = (int)(Math.random() * array1.length);
        return array1[num1];
    }

    public static char upperCaseAlphabet(){
        char[] array1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int num1 = (int)(Math.random() * array1.length);
        return array1[num1];
    }

    public static char lowerCaseAlphabet(){
        char[] array2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int num2 = (int)(Math.random() * 26);
        return array2[num2];
    }



    public static void typeOne(){
        int intNumber = intNumber();
        Password += intNumber;

    }

    public static void typeTwo(){
        char specialChar = strSpecialChar();
        Password += specialChar;

    }

    public static void typeThree(){
        char lowerCaseAlphabet = lowerCaseAlphabet();
        Password += lowerCaseAlphabet;
    }

    public static void typeFour(){
        char upperCaseAlphabet = upperCaseAlphabet();
        Password += upperCaseAlphabet;
    }



    public static void callingMethods(){
        int num4;
        for (int i = 1; i <= noOfTimes ; i++) {
            num4 = (int)((Math.random() * 4) + 1);
            if(num4 == 1){
                typeOne();
            } else if (num4 == 2) {
                typeTwo();
            } else if (num4 == 3) {
                typeThree();
            } else {
                typeFour();
            }
        }
    }

}


