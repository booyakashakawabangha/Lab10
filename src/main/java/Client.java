public class Client {
    static int ID = 0;
    String name;
    int age;
    String sex;

    public Client(int ID, String name, int age, String sex){
        this.ID = ID;
        Client.ID++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
