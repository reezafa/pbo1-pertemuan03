package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                        // i tadi 0 karna dibari +1 = 0+1=1
        System.out.println(i);      // menampilkan nilainya
        i++;                        // i tadi dah 1 lalu +'kan lagi 1 jadi 1+1=2
        System.out.println(i);      // na nampilakan nilai yg hnyr aja di ubah
        i=i+1;                      // ini sama aja lawan yang tadi i++ = i+1
        System.out.println(i);      // tadi dah =2 kalo,, +1 lagi jadi =3
        i+=5;                       // 3+5=8 >> i+=5 = i=i+5 makanya jadi 8
        System.out.println(i);      // nampilakan hasil lagi
        i*=2;                       // sama kaya i=i*2 .. awalnya tadi 8 lalu di kali 2 = 16
        System.out.println(i);
    }
}
