public class Main {
    // Choose snippet here
    static final int snip = 7;

    // static: 
    //   means the method belongs to the Main class 
    //   and is not an object of the Main class.
    static void start(int snip) {
        System.out.println(" *** Snippet " + snip + " *** ");
    }
    static void end() {
        System.out.println(" ***************** ");
    }
    public static void main(String[] args) throws Exception {

        Class c = Class.forName("S"+snip);
        S s = (S) c.getDeclaredConstructor().newInstance();
        start(snip); s.m1(); end();
    }
}
