import java.util.HashSet;
import java.util.Set;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        //hashset做不重复判断
        Set<Character> hashSet = new HashSet<Character>();
        //定义长度变量和移动角标,角标初始从-1开始
        int longest = 0, index = 0;
        int len = s.length();
        for (int i=0;i<=len-1;i++){
            while (index < len && !hashSet.contains(s.charAt(index))){
                hashSet.add(s.charAt(index));
                index++;
                System.out.println("循环结束的index:"+index);
            }
            //遇到重复元素循环结束，保存当前字符串长度
            longest = Math.max(longest,(index-i+1-1)); //两者均为角标且index多算一位，所以-1
            System.out.println(i);
            System.out.println(index);
            //每次遇到重复元素时，左侧删除一个元素i
            hashSet.remove(s.charAt(i));
        }return longest;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.lengthOfLongestSubstring("abcab"));;
    }
}
