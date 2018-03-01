class Store{
    Video[] vdo;
    int[] list_vdo = new int[20];

    public Store(){
        vdo = new Video[20];
        vdo[0] = new Video("Black Panther", "New Release", 5);
        vdo[1] = new Video("The Shape of Water", "New Release", 5);
        vdo[2] = new Video("Monster Hunt 2", "New Release", 5);
        vdo[3] = new Video("Maze Runner 3", "New Release", 5);
        vdo[4] = new Video("Citizen Kane", "Drama", 4);
        vdo[5] = new Video("All about Eve", "Drama", 4);
        vdo[6] = new Video("Metropolis", "Drama", 4);
        vdo[7] = new Video("Moonlight", "Drama", 4);
        vdo[8] = new Video("Step Brothers", "Comedy", 3);
        vdo[9] = new Video("White Chicks", "Comedy", 3);
        vdo[10] = new Video("The Hot Chick", "Comedy", 3);
        vdo[11] = new Video("The Hangover", "Comedy", 3);
        vdo[12] = new Video("The Greatest Showman", "Romance", 2);
        vdo[13] = new Video("When We First Met", "Romance", 2);
        vdo[14] = new Video("Phantom Thread", "Romance", 2);
        vdo[15] = new Video("Call Me by Your Name", "Romance", 2);
        vdo[16] = new Video("Get Out", "Horror", 1);
        vdo[17] = new Video("Psycho", "Horror", 1);
        vdo[18] = new Video("Repulsion", "Horror", 1);
        vdo[19] = new Video("It Follows", "Horror", 1);
        
    }

    public Video[] get_all_vdo(){
        return vdo;
    }

    // get vdo ที่ยังไม่ถูกยืม
    public Video[] get_list_vdo(){
        return vdo;
    }

    public void rent(Person person, Video vdo){

    }

}