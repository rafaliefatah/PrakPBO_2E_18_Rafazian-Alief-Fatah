public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name=newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge>30) {
            System.out.println("Nilai maksimal age adalah 30!");
            age=30;
        } if (newAge<18) {
            System.out.println("Nilai minimal age adalah 18!");
            age=18;
        } if (newAge>30 && newAge<18) {
            age=newAge;   
        }
    }
}
