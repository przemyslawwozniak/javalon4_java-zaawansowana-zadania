package pl.sda.javalon4.oop;

public class VarargsDemo {

    public static void main(String[] args) {
      /*demo(1, 2, 3);  //{1, 2, 3}
      demo(1, 2, 3, 4, 5, 6);   //{}
      demo(200, 300, 500);*/

      int tab1[] = {1, 2, 3};
      //demo(tab1);

      demo2("Przemek", 1000, 2018, 2012, 1992);
    }

    //... buduja dynamicznie tablice z przekazanych elementow, ktorych moze byc dowolna liczba
    /*public static void demo(int... args) {
        for(int i = 0; i < args.length; i++)
            System.out.println("Argument nr " + i + " = " + args[i]);
    }*/

    public static void demo(int[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.println("Argument nr " + i + " = " + args[i]);
    }

    public static void demo2(String name, double salary, int... importantYears) {
        System.out.println("Czesc nazywam sie " + name + ", zarabiam " + salary + ".\nWazne daty w moim zyciu to: \n");
        for(int d : importantYears)
            System.out.println(d);
    }

}
