//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class insertionSort {
    public static void main(String[] params) {
        int[] array = new int[] {9, 4, 6, 2, 7, 8, 3, 1, 5}; // исходный массив
        insertionSort(array);
        //System.out.println(Arrays.ToString(array));
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // сортировка четных элементов по возрастанию
            if (key % 2 == 0) {
                while (j >= 0 && array[j] % 2 == 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
        }

        // вывод отсортированного массива
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
