package Brizuela;

public class RemovingWhiteSpaceFromAString {

public static void main(String[] args) {
  String str = " L  eo  ny     B  r  i  zu  e  la ";

    String str1 = str.replaceAll("\\s", "");
    System.out.println(str1);
}
}
