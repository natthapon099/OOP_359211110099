package ooplab7;
//talking about Student?
//1.student ID
//2.Name
//3.Address
//4.Gender




public class Student {
    //properties of Student
    private string id;
    private string name;
    private string address;
    private string gender;

    //Constructor
    //Default Constructor
    public Student() {
    }

    //Constructor by own
    public Student(String id, String n, String a, String g,) {
    }
    //assign data to properties
    this.id =id;
    this.name =n,
            this.addres =a;
    this.gender =g;
}//Student
//getter and setter methods
public  String getID() {
    return this.id;
}
public void setId(String id) {
    this.id = id;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                ", gender=" + gender +
                '}';
    }
}//class
