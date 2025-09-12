import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public static void main(String[] args){
        System.out.println("Address Book");
    }


    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBuddy){
        buddyList.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo removeBuddy){
        for (BuddyInfo buddy : buddyList){
            if (buddy == removeBuddy){
                buddyList.remove(buddy);
            }
        }
    }
}
