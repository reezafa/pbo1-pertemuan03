package String;

public class OperasiString {
    public static void main(String[] args) {
        String anime = "JoJo's Bizarre Adventure";

        System.out.println(anime);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(anime.toUpperCase());
        System.out.println(anime.toLowerCase());
        System.out.println(anime.substring(9));
        System.out.println(anime.substring(0,8));
    }
}
