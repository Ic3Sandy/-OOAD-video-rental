class Logfile{
    private Video vdo;
    private Person person;
    private int rent_day;
    private int day;

    public Logfile(int rent_day, Person person, Video vdo, int day){
        this.rent_day = rent_day;
        this.person = person;
        this.vdo = vdo;
        this.day = day;
    }

    public int getDay(){
        return day; 
    }

    public int getRentDay(){
        return rent_day;
    }

    public Person getCustomer(){
        return person;
    }

    public Video getVdo(){
        return vdo;
    }

    public void getInfo(){
        System.out.println("[Logfile] Rent Day: "+rent_day+", Name: "+person.getName()+", Video: "+vdo.getName()+", Day Left: "+day);
    }

}