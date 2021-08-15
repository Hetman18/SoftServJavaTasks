class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public static void changeName(Person p){
        p.setName("Alice");
    }
    }

