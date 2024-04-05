public class Main {
    private static User user;
    public static User getUser(){
        if(user == null){
            user = new User();
        }
        return user;
    }

    public static void main(String[] args) {
        User user1 = getUser();
        System.out.print("User 1: ");
        user1.stampaInfo();

        User user2 = getUser();
        user2.setNome("Marco");
        user2.setEta(28);
        System.out.print("User 2: ");
        user2.stampaInfo();
    }
}