public class Mystery {
    public static void main(String[] args) {
        int someNum = mystery(10, 2);
        System.out.println(someNum);
    }

    public static int mystery(int m, int n) {
        if (m <= 0) {
            return n;
        }
        return m + n + mystery(m - 2, n + 1);
    }
}
