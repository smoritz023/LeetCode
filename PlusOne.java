// import java.util.Arrays;

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int outputNum = 0;
        
//         //break array and store num
//         for(int i = 0; i < digits.length; i++){
//             long holder = digits[i];
//             System.out.println(holder);
//             for(int j = i+1; j < digits.length; j++){
//                 holder = holder * 10;
//                 // if(i == 0){
//                 //     System.out.println(holder);
//                 // }
//                 // System.out.println(digits[0] * 100000000);
//             }
//             System.out.println(holder);
//             outputNum += holder;
//         }
        
//         //add one to num acquired from array
//         outputNum++;
//         System.out.println(outputNum);

//         //count size of number
//         int counter = outputNum;
//         int len = 0;
//         while (counter != 0) {
//             counter /= 10;
//             len++;
//         }
        
//         //time to break number apart and store in array
//         int[] outputArray = new int[len];
//         int holder = outputNum;
        
//         int count = len-1;    

//         while (holder != 0){
//             outputArray[count] = holder % 10;
//             holder /= 10;
//             count--;
//         }
        
//         return outputArray;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
        
        for (int i=digits.length-1; i>=0; i--)
        {
            if (i==digits.length-1)
            {
                digits[i] = digits[i] + 1 + carry;
            }
            else
            {
                digits[i] = digits[i] + carry;
            }
            
            if (digits[i] >= 10)
            {
                digits[i] = digits[i] % 10;
                carry = 1;
            }
            else
            {                
                carry = 0;
            }
        }
        
        if (carry == 0)
        {        
            return digits;
        }
        else
        {
            int[] temp = new int[digits.length+1];
            temp[0] = 1;
            System.arraycopy( digits, 0, temp, 1, digits.length );
            return temp;
        }
    }
}