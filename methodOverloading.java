class calc {
    public int add(int n1 ,int n2)
    {
    int result = n1 +n2;
    
    return result;
}
public int add(int n1 ,int n2,int n3)
    {
    int result = n1 +n2+n3;
    
    return result;
}
}
public class methodOverloading {
    public static void main(String[] args){
        calc obj=new calc();
        int result=obj.add(4,2);
        int res=obj.add(4,2,5);

        System.out.println(result);
        System.out.println(res);
            
        }

    }
    

