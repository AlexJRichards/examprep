public class q1a {
    public static void main(String[] args) {
        int inum = -4;
        double dnum = 9.75;
        double res1 = (int) dnum /inum;
        double res2 = inum >0 ? dnum : -dnum;
        String res3 = inum + dnum + "abc";
        StringBuffer buffer = new StringBuffer(res3);
        buffer.replace(1,4,"=");
        String res4 = buffer.toString();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}