public class MyArrayDataException extends IllegalArgumentException{
    int j, k;
    String s;

    public MyArrayDataException(String s, int j, int k) {
        this.j = j;
        this.k = k;
        this.s = s;
    }

    @Override
    public String toString() {
        return  s +
                " в строке " + j +
                " в столбце " + k;
    }
}
