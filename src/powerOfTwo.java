public class powerOfTwo {
    public boolean powerOfTwo(int n) {
        if (n == 0){
            return false;
        }
        if (n%2 == 0){
            return true;
        }

        if (n == 1){
            return true;
        }

        else {
            return false;
        }
    }
}
