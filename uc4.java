public class Hello {

    public static void main(String[] args) {

        // If no names are given
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        
        // If names are provided
        else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }

    }
}