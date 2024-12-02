public class Cars {

    //default variables 
    public static final String DEFAULT_MAKE = "Honda";
    public static final String DEFAULT_MODEL = "Civic";
    private static final int DEFAULT_AGE = 6;
    private static final String DEFAULT_CONDITION = "Good";

    //varaibles
    private String make;
    private String model;
    private int age;
    private String condition;

    //default constructor 
    public Cars() {
        this.make = DEFAULT_MAKE;
        this.model = DEFAULT_MODEL;
        this.age = DEFAULT_AGE;
        this.condition = DEFAULT_CONDITION;
    }

    //full constructor 
    public Cars(String make, String model, int age, String condition) {
        this.make = make;
        this.model = model;
        this.age = age;
        this.condition = condition;
    }
    
    //GETTERS & SETTERS

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    //equals method
    public boolean equals(Cars otherCar) {
        return make.equals(otherCar.make) && model.equals(otherCar.model) 
            && age == otherCar.age && condition.equals(otherCar.condition);
    }

    //toString
    public String toString() {
        return "Make: " + make
            + "\nModel: " + model
            + "\nAge: " + age
                + "\nCondition: " + condition;
    }




}
