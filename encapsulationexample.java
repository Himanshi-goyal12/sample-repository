public class encapsulationexample {
    //private fields
    private String name;
    private int age;
    //constructor
    public encapsulationexample(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    //getter method for'name'
    public String getName(){
        return name;
    }
    //setter method for 'name'
    public void setName(){
        this.name = name;
    }
    //getter method for 'age'
    public int getAge(){
        return age;
    }
    //setter method for 'name'
    public void setAge(int age){
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        //creating an assistance of the class
        encapsulationexample obj= new encapsulationexample("John Doe", 25);
        // accessing the field through getter method
        System.out.println("Name:"+obj.getName());
        System.out.println("Age:"+obj.getAge());
        //modifying fields through the setter method
        obj.setName("jane Doe");
        obj.setAge(30);
        // displaying updated details
        obj.displayDetails();
    }
}
