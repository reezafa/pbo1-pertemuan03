package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double  pembayaran= 73500;
        double  adaduit= 100000;

        if (adaduit<pembayaran){
            System.out.println("Duitnya kurang nah, kurangi dulu dikit");
        }else if(adaduit>pembayaran){
            double  kembalian=adaduit-pembayaran;
            System.out.println("kembalian : "+kembalian);
        }
        else{
            System.out.println("Duitnya pas jual lah, Berelaan cil, jangan jera");
        }
    }
}
