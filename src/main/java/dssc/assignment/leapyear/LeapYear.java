package dssc.assignment.leapyear;

public class LeapYear {

    /**
     *
     * @param a The year to test
     * @return flag True if it is a leap year, false otherwise
     *
     * This function prints true or false depending on whether a given integer
     * is a leap year or not.
     */
    boolean leapYear(int a){

        boolean flag = false;
        // A leap year is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400.
        if (a % 4 == 0){
            flag = true;
        }
        if (a % 100 == 0) {
            //if (a % 400 == 0){
            //    flag = true;
            //} else {
            //    flag = false;
            //}
            flag = a % 400 == 0;
        }
        return flag;
    }

}
