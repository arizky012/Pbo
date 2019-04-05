class Person {
    String name;
    int age;
    boolean isMale;
    
    public void setName(String name) {
        name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getGender(){
        if(isMale){
            return "laki - laki";
        }
        return "perempuan";
    }
}
