public class Main {
    static void start(int snip) {
        System.out.println("---------");
        System.out.println("Snippet " + snip);
    }
    public static void main(String[] args) {

        int snip = 1;

        switch (snip) {
            case 1:
                start(snip);
                S1 s1 = new S1();
                s1.m1();
                break;
            case 2:
                start(snip);
                S2 s2 = new S2();
                s2.m1();
                break;
            default:
                System.out.println("Completed.");
        }

    }
}
