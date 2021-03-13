package Controller;

public class ProfileController {
    private static Boolean shadyPicture = true;

    public static CharSequence getName() {
        return "Alpha Kilimanjaro";
    }
    public static CharSequence getDescription() {
        return "Alpha is interested in getting to know people. If people are nice, he knows them more. That is good for him and for the other people that he knows as well.";
    }
    public void getImage() {
        //void
    }
    public static Boolean getAccessPrivilege() {
        if (shadyPicture) return false;
        return true;
    }
    public static void setAccessPrivilege(Boolean value) {
        shadyPicture = (value ? false : true);
    }
}
