package employeemanagement;

public class Worker extends Employee{
    //Lớp Worker: factory
    private String factory ;

    public Worker(){

    }

    public Worker(String factory,String name,String gender,String birthday,String address) {
        super(name, gender, birthday, address);
        this.factory = factory;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}

