package wrapper;

class Employee implements Cloneable{
    private String name;
    private int id;
    private int sal;
    public Employee(String name, int id,int sal) {
        this.name = name;
        this.id = id;
        this.sal=sal;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id= id;
    }

    public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
            return this;
        }
    }
}

public class Clone {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul",9832,65000);
        Employee eClone = e.clone();

        eClone.setName("Ananya");
        eClone.setId(1572);
        eClone.setSal(75000);
        System.out.println("Employee : "+e.getName()+" "+e.getId()+" "+e.getSal());
        System.out.println("Employee Clone : "+eClone.getName()+" "+eClone.getId()+" "+eClone.getSal());
    }
}