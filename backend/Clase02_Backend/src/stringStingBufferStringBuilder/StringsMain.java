package stringStingBufferStringBuilder;

public class StringsMain {

    public static void main(String args[]) {

        // Caso con String
        String str1 = new String("Buenas");
        // La variable debe reasignarse
        str1.concat(" Tardes");
        System.out.println(str1);

        // Caso con StringBuilder
        StringBuilder stringBuilder1 = new StringBuilder("Buenas");
        stringBuilder1.append(" Tardes");
        System.out.println(stringBuilder1);

    }

}
