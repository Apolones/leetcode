public class print {
    public static void main(String[] args) {
        String s="";
        for(int i=3; i<1170;i+=4)
        s=s + "," + i +"," +(i+1);
        System.out.println(s);
    }
}
