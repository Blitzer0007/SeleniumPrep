package Java_Basics.Questions;

public class CountCharOccurence {

    public static void main(String[] args) {

        String str = "Java is a programming language";
        int CountWithA = str.length();
        int CountWithoutA = str.replace("a","").length();
        System.out.println(CountWithA);
        System.out.println(CountWithoutA);

        int Count = str.length()-str.replaceAll("a","").length();

        System.out.println(Count);
    }


}
