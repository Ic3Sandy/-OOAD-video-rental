class Video{
    private String name;
    private String category;
    private int price;

    public Video(String name, String category, int price){
        this.name = name;
        this.category = category;
        this.price = price;
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
    public String getInfo(){
        return "Name: "+name+", Category: "+category+", Price: "+price;
    }
}