package abc;

class VThread extends Thread {
    String str;

    VThread(String str) {
        this.str = str;
    }

    public void run() {
        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));

                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    System.out.println(ch);
                    Thread.sleep(3000); // 3 seconds
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class VowelThread {
    public static void main(String[] args) {
        VThread t = new VThread("Education");
        t.start();
    }
}
