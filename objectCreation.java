public class objectCreation {
    int a;
    String name;
    public static void main(String[] args) {
        objectCreation obj = new objectCreation();
        objectCreation obj1 = new objectCreation();
        obj1.name = "Vivek";
        obj1.a=20;
        System.out.println(obj.name);
        System.out.println(obj1.name);
        System.out.println(obj1.a);
        System.out.println(obj.a);
    }
    
}
