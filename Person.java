class Person{
    private String name;    
    private String type;
    private int num_vdo_rent;

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
    public void setNumVdoRent(int num_vdo_rent){
        this.num_vdo_rent += num_vdo_rent;
    }
    public int getNumVdoRent(){
        return this.num_vdo_rent;
    }

}