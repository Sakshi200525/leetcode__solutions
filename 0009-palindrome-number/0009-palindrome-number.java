class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
    return false;
   }

int n = x;
int revNum =0;

while(n>0){
    int d = n%10;
    revNum = revNum * 10 +d;
    n = n/10;
}
if(revNum == x){
    return true;
    }else{
    return false;
    }


        // if (x < 0) return false;

        // int original = x;
        // int remainder;
        // int reverse = 0;

        // while (x != 0) {
        //     remainder = x % 10;
        //     reverse = reverse * 10 + remainder;
        //     x /= 10;
        // }

        // return reverse == original;
    }
}

