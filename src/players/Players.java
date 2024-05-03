package players;

public class Players {
    String name;
    int age;
    String email;

    public void set_player_details(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void get_player_details(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email ID: " + this.email);
    }

    public String get_player_name(){
        return this.name;
    }
}
