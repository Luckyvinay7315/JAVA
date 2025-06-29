class Student1 {
    // Data members
    private int roll;
    private String name;
    private String address;

    // Constructor
    public Student1(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    // Main method to test
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Vinay", "Delhi");
        Student1 s2 = new Student1(102, "Vivek", "Lucknow");
        Student1 s3 = new Student1(103,"OM", "Raebareli");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}