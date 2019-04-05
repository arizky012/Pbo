class Identity {
    
    public static void main(String[] args) {

        Person per1 = new Person();
        String name = "jhj";
        
        per1.setName("arizki");
        per1.isMale = false;
        per1.setAge(20);
        System.out.println("nama saya : "+name);

        System.out.println("nama saya : "+per1.getName());
        System.out.println("umur saya : "+per1.getAge());
        System.out.println("saya adalah : "+per1.getGender());
    }
}
