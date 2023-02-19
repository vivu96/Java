class if_else {
    public static void main(String[] args) {
    int age = 21;
    if (age >=18 && age < 60) {
        if (age >20 && age <=30) {
            System.out.println("your are in 20s");
            }
            else if (age >30 && age <=40) //nesting
             {
                System.out.println("you are in 30s");
    }
    else if (age > 40 && age <=50) {
    System.out.println("you are in 50s");        
    }
}
    else if (age >= 60) {
        System.out.println("you are old");
    }
    else {
        System.out.println("you are a kid for now");
    }
}
}
