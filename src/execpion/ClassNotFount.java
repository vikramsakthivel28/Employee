package execpion;

public class ClassNotFount {

    public static void main(String[] args) {
        try {
           
            Class<?> clazz = Class.forName("com.example.NonExistentClass");
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
