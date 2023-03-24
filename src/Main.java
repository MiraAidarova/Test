import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Subject: 1) Varargs; 2) Foreach; 3) String methods; 4) Git


//        System.out.println(methodMir(3, 5, 7, 6, 2, 4, 8));
//    }
//    static int methodMir( int... varargs) {
//        int summa = 0;
//        for (int i = 0; i < varargs.length; i++) {
//        System.out.println("Массивдин элементтери: " + varargs[i] + " ");
//        System.out.println("Массивдин узундугу: " + varargs.length);
//            summa =  summa + varargs[i];
//
//        }
//        return summa;

//          piter("ponedelnic","vtornic","sreda","chetverg","pyatnitsa");
//    }
//    static void piter(String ... varargs){
//        for (int i = 0; i < varargs.length; i++) {
//            System.out.println(varargs[i]);
//        }
//        System.out.println(varargs.length);


//      String[] arrays = {"Камила","Айпери","Гуля","Азамат","Акылай","Айдар"};
//        file(arrays );
//    }
//       static void file(String[] array) {
//           for (String a : array) {
//               System.out.println("Мен сени жакшы кором : " + a);
//           }
//       }


        method(1,2,3,4,5,67);
    }
    static void method(int...a){
        for (int i = 0; i < a.length; i++) {

                System.out.println("eki san"  + i + " ");
            }
        System.out.println("----------------------");
            for (int i: a) {
                System.out.println(i + " ");
            }
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Soz jaziniz: ");
//        String sozdor = scanner.nextLine();
//        smethod(sozdor);
//    }
//    static void smethod(String sozdor ){
//        System.out.println(sozdor.toUpperCase(Locale.ROOT));
//        System.out.println(sozdor.trim());
//        System.out.println(sozdor.contains("A"));
//
//        System.out.printf(sozdor.contains("a")+","+ "jok");
//        System.out.println();
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
//



//        String name = "My name is Mira";
//        System.out.println(name.charAt(name.length() / 2));
//        System.out.println(name.substring(3,7));
//        System.out.println(name.contains("name"));
//        System.out.println(name.toUpperCase(Locale.ROOT));
////        String text = " world,mir";
////        String text = text.substring();
////
//        System.out.println(name.equals("My name is Mira"));
//        System.out.println(name.replace("Mira","Aidarova"));
//        System.out.println(name.length());
//
//        String newName = name.concat("Aidarova");
//        System.out.println(name + "Aidarova");
//
    }
}






