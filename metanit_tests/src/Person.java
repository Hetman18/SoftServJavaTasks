class Person {

    private String name;
    private int age;
    boolean schooler;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isSchooler() {
        return schooler;
    }

    public void setSchooler(boolean schooler) {
        this.schooler = schooler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

