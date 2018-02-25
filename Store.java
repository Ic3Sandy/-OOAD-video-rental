class Store{
    public static void main(String[] args){
        for(int day = 1; day <= 35; day++){
            System.out.printf("[Store main] Day %d\n" , (day));

        }
    }
    public Store(){
        Video[] vdo = new Video[20];
        vdo[0] = new Video("BNK48", "New Release", 5);
        vdo[1] = new Video("BNK48", "New Release", 5);
        vdo[2] = new Video("BNK48", "New Release", 5);
        vdo[3] = new Video("BNK48", "New Release", 5);
        vdo[4] = new Video("BNK48", "Drama", 2);
        vdo[5] = new Video("BNK48", "Drama", 2);
        vdo[6] = new Video("BNK48", "Drama", 2);
        vdo[7] = new Video("BNK48", "Drama", 2);
        vdo[8] = new Video("BNK48", "Comedy", 4);
        vdo[9] = new Video("BNK48", "Comedy", 4);
        vdo[10] = new Video("BNK48", "Comedy", 4);
        vdo[11] = new Video("BNK48", "Comedy", 4);
        vdo[12] = new Video("BNK48", "Romance", 3);
        vdo[13] = new Video("BNK48", "Romance", 3);
        vdo[14] = new Video("BNK48", "Romance", 3);
        vdo[15] = new Video("BNK48", "Romance", 3);
        vdo[16] = new Video("BNK48", "Horror", 1);
        vdo[17] = new Video("BNK48", "Horror", 1);
        vdo[18] = new Video("BNK48", "Horror", 1);
        vdo[19] = new Video("BNK48", "Horror", 1);
    }
}