public class terneryOprator {
     public static void main(String[] args) {
      int a = 30;
      int b = 20;
      int c = 40;
      String name = (a>b)? "a is big" : "b is big";
      System.out.println(name);  
      int num = (a<b)?(a<c ? a : b) :(b<c ? b : c) ;
      System.out.println(num);
    }
    
}
