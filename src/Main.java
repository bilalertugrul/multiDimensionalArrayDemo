public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Kayseri";
        sehirler[1][2] = "Konya";
        sehirler[2][0] = "Şanlıurfa";
        sehirler[2][1] = "Mardin";
        sehirler[2][2] = "Malatya";

        for(int i=0 ; i<=2 ; i++) {
            System.out.println("----------------------");

            for(int j=0 ; j<=2 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
}
}