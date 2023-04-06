public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1
        LibraryUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        LibraryUser kidUser2 = new KidUser();
        kidUser2.registerAccount(18);
        kidUser2.requestBook("Fiction");

        // Test case #2
        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        LibraryUser adultUser2 = new AdultUser();
        adultUser2.registerAccount(2);
        adultUser2.requestBook("Fiction");
    }
}


