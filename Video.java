class Video{
    private String name;
    private String category;
    private int price;
    private int rest_day;
    private boolean status;


    public Video(String name, String category, int price, int rest_day,boolean status){
        this.name = name;
        this.category = category;
        this.price = price;
        this.rest_day = -1;
        this.status = status;
    }
    public String getName(){
        return name;
    }
    public String getCat(){
        return category;
    }
    public int getPrice(){
        return price;
    }
    public int getRestDay(){
        return rest_day;
    }
    public void setRestDay(int rest_day){
        this.rest_day = rest_day;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public String getInfo(){
        return "Name: "+name+", Category: "+category+", Price: "+price;
    }
}