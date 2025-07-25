
public class App {

    public static void main(String[] args) throws Exception {

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Phidan");
        Friend friend4 = new Friend("Alex");
        Friend friend5 = new Friend("Gyulmia");

        // System.out.println("Number of friends: " + friend1.numOfFriends);
        // System.out.println("Number of friends: " + friend2.numOfFriends);
        // System.out.println("Number of friends: " + friend3.numOfFriends);
        Friend.showFriends();

    }

}
