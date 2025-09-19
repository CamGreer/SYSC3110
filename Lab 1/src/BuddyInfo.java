public class BuddyInfo {
    private String name;
    private int phoneNumber;
    private String address;

    public BuddyInfo(){
        this("Homer", "Fifth ave", 1234567890);
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
