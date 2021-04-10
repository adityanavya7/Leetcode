class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int sum = 0, rem, temp = x;
        while(x > 0) {
            rem = x%10;
            sum=(sum*10)+rem;
            x = x/10;
        }
        if(temp == sum)
            flag = true;
        return flag;
    }
}