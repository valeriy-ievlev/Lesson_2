public class Lesson2 {

    public static void main(String[] args) {
        String[][] test = {
                {"24", "23", "454", "345"},
                {"11", "123", "13", "8778"},
                {"546", "35", "9980", "2855"},
                {"hhh", "2166", "7", "2342"}
        };

        try {
            System.out.println(testMethod(test));
        } catch (MyArraySizeException s) {
            System.out.println("Задан  неверный размер массива");
        } catch (MyArrayDataException d) {
            System.out.println("Элемент " + d + " массива не может быть переведен в число");
        }
    }

    public static int testMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr.length == 4 && arr[i].length == 4) {
            }
            else throw new MyArraySizeException();
        }

        for (int j = 0; j < arr.length; j++)
            for (int k = 0; k < arr.length; k++) {
                try {
                    Integer.parseInt(arr[j][k]);
                    count += Integer.parseInt(arr[j][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(arr[j][k], j, k);
                }
            }
        return count;
    }
}
