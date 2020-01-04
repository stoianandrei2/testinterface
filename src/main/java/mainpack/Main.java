package mainpack;

public class Main {

    public static void test(TestInterface i) {
        int x = 2, y = 4;
        i.run(x, y);
    }

    public static void testMultiple(TestInterfaceMultipleParams j) {
        j.run(666, 12, 2, 100);
    }

    public static void main(String[] args) {
        test((i, j) -> {
            System.out.println(i+" "+j);
        });

       ImplClass i = new ImplClass();
       test(i);
       testMultiple((Integer[] a) -> {Integer sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum+=a[j];
            }
           System.out.println(sum);
       });

       TestInterfaceMultipleParams andrei = (Integer[] a) -> {
           Integer sum = 0;
           for (int j = 0; j < a.length; j++) {
               sum+=j*a[j];
           }
           System.out.println(sum);
       };

       testMultiple(andrei);
       andrei.run(12,23);

    }

}
