import java.util.Scanner;

/**
 * Created by m.baykova on 06.12.2017.
 */
public class ExampleString {

        public static void main(String args[]) {
            //Способоы создания строк

            String str1 = "qwerty"; //используя строковые литералы

            String str2 = "qwerty";
            char[] strAsArrayOfChars = {'w', 'w', 'q', 'q', 't', 'h', 'n', 'd', 'z'};

            // c помощью конструкторов
//            String first = new String("qwerty");
//            String second = new String(str2);
//            String third = new String(strAsArrayOfChars);

            //Класс String предоставляет возможность создания форматированных строк
            String formatString = "We are printing double variable (%.2f), string ('%s') and integer variable (%d).";
            System.out.println(String.format(formatString, 2.3, str1, 10));
        }


}


