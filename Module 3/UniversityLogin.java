public class UniversityLogin {
    static void login(String username) {
        System.out.println(username.length());
    }

    public static void main(String[] args) {
        try {
            login(null);
        } catch (NullPointerException e) {
            System.out.println("Exception: Username cannot be null");
        }
    }
}