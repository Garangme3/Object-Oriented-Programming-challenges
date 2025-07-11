public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"Z183", "C763", "B645", "D150", "C195", "B764", "A456", "B145"};

        for (String item : orderIds) {
            if(item.startsWith("Z")) {
                System.out.println(item);
            }
        }
    }
}