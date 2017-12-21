package task3;

import java.util.Random;

/**
 * Created by Maria on 09.12.2017.
 */
public class RandomArray{

			public static void main(String args[]){
					int[] randomArray = createRandom(20, 10, -10);
					printArray(randomArray);
					int minPositiveIndex = getMinIndex(randomArray);
					int maxNegativeIndex = getMaxIndex(randomArray);
					int tempMaxNegative = randomArray[maxNegativeIndex];
					randomArray[maxNegativeIndex] = randomArray[minPositiveIndex];;
					randomArray[minPositiveIndex] = tempMaxNegative;
				  printArray(randomArray);
			}


	/**
	 *  Создание массива с рандомными числами
	 * @param size - размер массива
	 * @param max - максимальное рандомное число
	 * @param min - минимальное рандомное число
	 * @return массив случайных целых чисел
	 */
			public static int[] createRandom(int size, int max, int min){
					int randomArray[] = new int[size];
					for (int i=0; i < size; i++){
						randomArray[i] = getRandom(min, max);
					}
					return randomArray;
			}

	/**
	 *  Получение случайного целого числа
	 * @param max - максимальное рандомное число
	 * @param min - минимальное рандомное число
	 * @return случайное целое число
	 */
			private static int getRandom(int min, int max){
					Random rn = new Random();
					int range = max - min + 1;
					return rn.nextInt(range) + min;
			}

			private static void printArray(int[] array){
					for (int i = 0; i < array.length; i++){
							System.out.print(array[i] + " ");
					}
					System.out.println();
			}

			private static int getMinIndex(int[] array){
					int minPositive = array[0];
					int minPositiveCount = 0;
					for (int i = 0; i < array.length-1; i++){
							if (minPositive <= 0){
								minPositive = array[i + 1];
								minPositiveCount = i + 1;
							}else {
								if ((array[i + 1] < minPositive) && array[i + 1] > 0){
									minPositive = array[i + 1];
									minPositiveCount = i + 1;
								}
							}
					}
					return minPositiveCount;
			}

			private static int getMaxIndex(int[] array){
				int maxNegative = array[0];
				int maxNegativeCount = 0;
				for (int i = 0; i < array.length-1; i++){
					if (maxNegative >= 0){
						maxNegative = array[i + 1];
						maxNegativeCount = i + 1;
					}else {
						if ((array[i + 1] > maxNegative) && array[i + 1] < 0){
							maxNegative = array[i + 1];
							maxNegativeCount = i + 1;
						}
					}
				}
				return maxNegativeCount;
			}



}
