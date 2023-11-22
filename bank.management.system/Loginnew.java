public class Loginnew {

    public static void main(String[] args) {
        int a1[] = { 5, 6, 1, 2, 7, 3 };
        for (int i = 0; i < a1.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[small] > a1[j]) {
                    small = j;
                }
            }
            int temp = a1[small];
            a1[small] = a1[i];
            a1[i] = temp;

        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

    }
}