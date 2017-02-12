public class TwoRockets { 
    public static void main(String[] args) {
        TwoRockets tr = new TwoRockets ();
        tr.tip();
        tr.box();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        tr.box();
        tr.tip();
    }
      void box() {
        System.out.println("+------+ +------+ \n|      | |      | \n|      | |      | \n+------+ +------+");
    }
      void tip() {
        System.out.println("   /\\       /\\\n  /  \\     /  \\\n /    \\   /    \\");
    }
}