public class Test {
    public static void main(String[] args){
        System.out.println("test");
        System.out.println("2nd commit update.");

        add(10,20);
        sub(20,10);
        multiplication(2,3);
        Test.div(10,2);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void sub(int x, int y){
        System.out.println(x-y);
    }
    public static void multiplication(int m,int n){
        System.out.println(m*n);
    }

    public static void div(int d, int e){
        int g = d/e;
        System.out.println("Answer is " +g);
    }
}
