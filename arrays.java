// > > > > >  A  R  R  A  Y  S  < < < < <

import java.util.Arrays; // package of java for using  array functions

// public class arrays {
//     public static void main(String[] args) {

//         int[] age = new int[3];// Declaration of an Array in java

//         age[0] = 18; // by default it shows '0' value without initialisation in arrays
//         age[1] = 21;
//         age[2] = 15;

//         System.out.println(age[2]);
//         System.out.println(age.length);

//     }

// }

//:::::: A R R A Y  S O R T I N G ::::::
public class arrays {
    public static void main(String[] args) {

        int[] age = new int[4];// Declaration of an Array in java

        age[0] = 18;
        age[1] = 21;
        age[2] = 15;
        age[3] = 55;

        System.out.println("Age[1] before sorting is " + age[1]);

        Arrays.sort(age); // asc.order => 15,18,21
        // For using array sort fun(); import java.util.Arrays pacakage

        System.out.println("Age[1] after sorting is " + age[1]);

    }

}
