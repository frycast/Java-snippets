// Your First Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        Friend myfriend = new Friend();
        System.out.println(myfriend.number);
    }
}

class Friend {
    public static int number = 1; 
}