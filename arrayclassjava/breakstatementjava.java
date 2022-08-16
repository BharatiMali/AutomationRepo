package arrayclassjava;

public class breakstatementjava {
    /* for (int i=0; i<=3; i ++){
    if (i==2){
    break;
    }
    System.out.println(i);
    }
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 1 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);

            }
        }
    }

}
