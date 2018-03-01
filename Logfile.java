class Logfile{
    private String name_customer;
    private String name_vdo;
    private int rent_day;
    private int amount;
    private int day;

    public Logfile(int rent_day, String name_customer, String name_vdo, int day, int amount){
        this.rent_day = rent_day;
        this.name_cutomer = name_customer;
        this.name_vdo = name_vdo;
        this.day = day;
        this.amount = amount;
    }

    public String getInfo(){
        return "Rent Day: "+this.rent_day+", Name: "+this.name_customer+", Video: "+this.name_vdo+", Day: "+this.day+", Amount: "+this.amount;
    }

    public int getDay(){
        return this.day; 
    }

    public int getRentDay(){
        return this.rent_day;
    }

    public String getNameCustomer(){
        return this.name_customer;
    }

    public String getNameVdo(){
        return this.name_vdo;
    }

    public int getAmount(){
        return this.amount;
    }
}