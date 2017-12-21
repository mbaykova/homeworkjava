package task2;

import java.util.Scanner;

/**
 * Created by Maria on 08.12.2017.
 */
public class ArrayString {
			static Scanner sc = new Scanner(System.in);

	/**
	 *  Создания массива из строк
	 * @return массив строк
	 */
			public static String[] createStringArray(){
				System.out.println("Введите размерность массива: ");
				int arraySize = sc.nextInt();
				String[] stringArray = new String[arraySize];
				System.out.println("Введите элементы массива: ");
				for(int i = 0; i < arraySize; i++){
					System.out.println(String.format("Введите %s-ый элемент массива: ", i));
					stringArray[i] = sc.next();
				}
				sc.close();
				return stringArray;
			}

	/**
	 *  Получение самой длинной строки
	 * @param array - массив строк
	 * @return строка
	 */
			public static String getMaxWordFromArray(String array[]){
				String maxWord = array[0];
				for(int i = 0; i < array.length-1; i++){
						if (array[i+1].length() > maxWord.length()){
							maxWord = array[i+1];
						}
				}
				return maxWord;
			}


}
