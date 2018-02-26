class Person{
    private String name;    
    private String type;

	public Person(String name, String type){
        this.name = name;
        this.type = type;
    }
	public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getInfo(){
        return "Name: "+name+", Type: "+type;
    }
}