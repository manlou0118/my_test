//class Solution {
//    public String longestPalindrome(String s) {
//        int len = s.length()-1;
//        String str = "";
//        if (s == null){
//            return "";
//        }
//        if (len == 0){
//            return s;
//        }
//        for (int i=0;i<=len;i++){
//                int left = i-1,right = i+1;
//                while (left >= -1 && right <= len+1){
//                    if (s.charAt(left+1)!=s.charAt(right-1)|left<0|right>len){
//                        String newstr = s.substring(left+1,right);
//                        if (newstr.length()>str.length()){
//                            str = newstr;
//                        }
//                        break;
//                    }else {
//                        --left;
//                        ++right;
//                    }
//                }
//        }
//        return str;
//    }
//    public static void main(String[] args) {
//        Solution str = new Solution();
//        System.out.println(str.longestPalindrome("baac"));
//    }
//}
//


import javax.print.DocFlavor;

//class Solution {
//    public boolean isPalindromic(String s) {
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (s.charAt(i) != s.charAt(len - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // 暴力解法
//    public String longestPalindrome(String s) {
//        String ans = "";
//        int len = s.length();
//        for(int i=len;i>1;i--){
//            //检索的串的长度为i
//            for(int j=0;j+i-1<len;j++){
//                //检索串的起始位置
//                String s1=s.substring(j,j+i);
//                if(isPalindromic(s1)){
//                    return s1;
//                }
//            }
//        }
//        return s.substring(0,1);
//    }
//}

class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<1 || s == null){
            return "";
        }
        String ans = "";
        int start = 0,end = 0;
        for (int i =0; i<s.length();i++){
            int len1 = palindromeLenth(s,i,i);   //判断单个字符左右对称时的场景
            int len2 = palindromeLenth(s,i,i+1);   //判断两个字符对称时的场景
            int len = Math.max(len1,len2);
            if (len > end - start){
                start = i - (len-1)/2;
                end = i + len/2;
                ans = s.substring(start,end+1);
            }
        }return ans;
    }
    private int palindromeLenth(String s,int left,int rigth){
        while (left >= 0 && rigth <s.length() && s.charAt(left) == s.charAt(rigth)){
            left --;
            rigth++;
        }
        return rigth-left-1;
    }
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(ss.longestPalindrome("annna"));;
    }
}