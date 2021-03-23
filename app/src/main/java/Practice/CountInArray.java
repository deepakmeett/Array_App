package Practice;
import java.util.ArrayList;
public class CountInArray {

//    int[] list = {2, 1, 4, 2, 1, 1, 4, 5};
    ArrayList<Integer> arrayList = new ArrayList<>();
    private DispensedProductModel dispensedProductModel;

    public static void main(String[] args) {
     CountInArray countInArray = new CountInArray();
        countInArray.CountIn();
    }

    public void CountIn () {
        arrayList.add( 1 );
        arrayList.add( 2 );
        arrayList.add( 2 );
        arrayList.add( 3 );
//        int count = 0;
//        int ard_id = 0;
//        int ard_id_two = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
////            if (list[i] == 1) {
////                count++;
////            }
//            ard_id = arrayList.get( i );
//            ard_id_two = arrayList.get( i )+1;
//
//            if (i <= arrayList.size()-1){
////                ard_id = arrayList.get( i ).getArduinoID();
////                arduino_id_two = arrayList.get( i + 1 ).getArduinoID();
////                int ard_id = Integer.parseInt( ard_id );
////                int ard_id_two = Integer.parseInt( arduino_id_two );
//                int add_ard = 0;
//                dispensedProductModel = new DispensedProductModel( ard_id);
//                if (ard_id == ard_id_two){
//                    add_ard++;
//                    dispensedProductModel.setQty(  add_ard );
//                }else {
//                    dispensedProductModel.setQty( 1 );
//                }
//            }
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(dispensedProductModel.getQty());
//        }
        
//        System.out.println( count );

        int[] A = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }

        int[] B = new int[max + 1];
        for (int i = 0; i < A.length; i++) {
            // increment in array B for every integer
            // in A.
            B[A[i]]++;
        }
        for (int i = 0; i <= max; i++) {
            // output only if element is more than
            // 1 time in array A.
            if (B[i] > 1){
                System.out.println(i + "-" + B[i]);
            }
        }
        
        
        
    }

}
