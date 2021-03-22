package Practice;
public class CountInArray {

    int[] list = {2, 1, 4, 2, 1, 1, 4, 5};
    
    public static void main(String[] args) {
     CountInArray countInArray = new CountInArray();
        countInArray.CountIn();
    }

    public void CountIn () {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 1) {
                count++;
            }
        }
        System.out.println( count );
    }

}
