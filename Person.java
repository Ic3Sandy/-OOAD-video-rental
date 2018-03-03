class Person{
    private String name;    
    private String type;
    private int num_vdo_rent;
    private int rent_day;

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
    public int getRentDay(){
        return rent_day;
    }
    public void setRentDay(int rent_day){
        this.rent_day = rent_day;
    }
    public int getNumVdoRent(){
        return this.num_vdo_rent;
    }
    public void setNumVdoRent(int num_vdo_rent){
        this.num_vdo_rent = num_vdo_rent;
    }
    public String getInfo(){
        return "Name: "+name+", Type: "+type+", num_vdo_rent: "+ num_vdo_rent;
    }
}