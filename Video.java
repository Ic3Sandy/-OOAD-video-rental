class Video{
    private String name;
    private String category;
    private int price;
    private boolean status;

    public Video(String name, String category, int price, boolean status){
        this.name = name;
        this.category = category;
        this.price = price;
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