
package entities;


public class Pensao {
    
    private String name;
    private String email;
    private int room;
    
    public Pensao(String aName, String aEmail, int aRoom){
        this.name = aName;
        this.email = aEmail;
        this.room = aRoom;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String aName){
        this.name = aName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int aRoom) {
        this.room = aRoom;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"+
               "Email: " + email +"\n" +
               "Room: " + room;
    }
    
}
