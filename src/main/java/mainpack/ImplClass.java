package mainpack;

public class ImplClass implements TestInterface {

    @Override
    public void run(Integer i, Integer j) {
        System.out.println(i*j);
    }
}
