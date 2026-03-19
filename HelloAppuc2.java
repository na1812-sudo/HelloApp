public class HelloUser {

    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String userName = args[0];
            System.out.println("Hello " + userName);
        } else {
            System.out.println("Hello User");
        }
    }
}