public class lesson1 {
    public static void main(String[] args) {
        int i = 'f'; //int 32 , long 64, byte 8 , short 16
        char ch = 'd'; // 16 бит беззнаковая
        float fl = 4.323f; //32 бита
        double d = 44.34; // 64 бита
        boolean b = true;
        boolean[] bArray = new boolean[6];
        i = (int) 7.5;

        for (int j = 0; j < 10; j++) {
            i++;
        }
        while(i <=46){
            i = 47;
        } //пока

        if(bArray[2]){
            bArray[2] = false;
        } //если

        String str = "sdg";
        System.out.println(i);
    }
}
