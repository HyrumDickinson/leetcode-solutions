public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int right = n;
        int left = 1;
        int focus;
        
        while (right > left) {
            focus = (right - left) / 2 + left;
            if (isBadVersion(focus)) {
                right = focus;
            } else {
                left = focus + 1;
            }
        }
        
        return left;
    }
}
