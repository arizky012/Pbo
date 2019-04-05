class Author{
    private String name, email;
    private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
        
    }
    private String getEmail() {
        return email;
    }
    private char getGender() {
        return gender;
    }
    private String getName() {
        return name;
    }
    @Override
    public String toString(){
        String a = getName() + " email : " + getEmail() + " gender : "+ getGender();
    return a;
}
