

public class App {
    public static void main(String[] args) throws Exception {
        
        // tipe data di java
        // integer, byte, short, long, double, float, char, boolean

        // interger (satuan)
        int i = 10;
        System.out.println("======= INTEGER =======");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai MAX : " + Integer.MAX_VALUE);
        System.out.println("Nilai MIN : " + Integer.MIN_VALUE);
        System.out.println("Besar Integer : " + Integer.SIZE + "bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("======= BYTE =======");
        System.out.println("Nilai Byte b = " + b);
        System.err.println("Nilai MAX : " + Byte.MAX_VALUE);
        System.out.println("Nilai MIN : " + Byte.MIN_VALUE);
        System.out.println("Besar Byte : " + Byte.SIZE + "bit");

        // short (satuan)
        short s = 10;
        System.out.println("======= SHORT =======");
        System.out.println("Nilai Short s = " + s);
        System.err.println("Nilai MAX : " + Short.MAX_VALUE);
        System.out.println("Nilai MIN : " + Short.MIN_VALUE);
        System.out.println("Besar Short : " + Short.SIZE + "bit");

        // long (satuan)
        long l = 10;
        System.out.println("======= LONG =======");
        System.out.println("Nilai Long l = " + l);
        System.err.println("Nilai MAX : " + Long.MAX_VALUE);
        System.out.println("Nilai MIN : " + Long.MIN_VALUE);
        System.out.println("Besar Long : " + Long.SIZE + "bit");

        // double (koma, bilangan real)
        double d = 10;
        System.out.println("======= DOUBLE =======");
        System.out.println("Nilai Double d = " + d);
        System.err.println("Nilai MAX : " + Double.MAX_VALUE);
        System.out.println("Nilai MIN : " + Double.MIN_VALUE);
        System.out.println("Besar Double : " + Double.SIZE + "bit");

        // float (koma, bilangan real)
        float f = 10;
        System.out.println("======= FLOAT =======");
        System.out.println("Nilai Float = " + f);
        System.err.println("Nilai MAX : " + Float.MAX_VALUE);
        System.out.println("Nilai MIN : " + Float.MIN_VALUE);
        System.out.println("Besar Float : " + Float.SIZE + "bit");

        // char (karakter) berdasarkan ASCII
        char c = 100;
        System.out.println("======= CHAR =======");
        System.out.println("Nilai Char c = " + c);
        System.out.println("Besar Char : " + Character.SIZE + "bit");

        // boolean (nilai true atau false)
        boolean val = false;
        System.out.println("======= BOOLEAN =======");
        System.out.println("nilai boolean val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);

    }
}
