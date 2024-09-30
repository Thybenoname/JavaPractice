class Person {
    private int age;
    private String name;

    public Person(int _age){
        this.age = _age;
    }

    public Person(int _age, String _name){
        this.age = _age;
        this.name = _name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
    public void celebrateBirthday(){
        ++this.age;
    }

    public void changeName(String newName){
        this.name = newName;
    }
}

class PersonTester{
    public static void main(String args[])
    {
        Person grant = new Person(34, "Grant");
        System.out.println("Age before:" + grant.getAge());
        grant.celebrateBirthday();
        System.out.println("Age after:" + grant.getAge());
        System.out.println("Name before:" + grant.getName());
        grant.changeName("Tas");
        System.out.println("Name after:" + grant.getName());
    }
}
