package kz.fariza;

public class Hello {
    public static void main (String[] args){
        System.out.println("Hello, Fariza!");
        System.out.println("Бұл зертханалық жұмыстың мақсаты:");
        System.out.println("GitHub-пен жұмыс жасап үйрену:");
        int a=MyMath.kvadrat(5);
        int b=MyMath.kub(5);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(MyMath.max(8,9));

    }
}
