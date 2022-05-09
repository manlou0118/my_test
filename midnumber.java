import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import javax.swing.*;

class midnumber {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int odd = (m + n + 1) / 2;
        int even = (m + n + 2) / 2;
        return (getk(nums1,0,n-1,nums2,0,m-1,odd)+
                getk(nums1,0,n-1,nums2,0,m-1,even))*0.5;
    }
    private int getk(int[] num1,int start1,int end1,int[] num2, int start2, int end2,int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1>len2){
            return getk(num2,start2,end2,num1,start1,end1,k);
        }
        if (len1 == 0){
            return num2[start2+k-1];
        }
        if (k == 1){
            return Math.min(num1[start1],num2[start2]);
        }
        int i = start1 + Math.min(len1,k/2) -1;
        int j = start2 + k / 2 -1;
        if (num1[i]>num2[j]){
            return getk(num1,start1,end1,num2,j+1,end2,k-(j-start2+1));
        }
        else {
            return getk(num1,i+1,end1,num2,start2,end2,k-(i-start1+1));
        }
    }
}