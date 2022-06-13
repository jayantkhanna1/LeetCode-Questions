class Solution {
public String multiply(String num1, String num2) {
if (num1.equals("0") || num2.equals("0")) return "0";

    if (num1.equals("1")) return num2;
    
    if (num1.equals("1")) return num1;
    
    int length1 = num1.length();
    int length2 = num2.length();
    int[] product = new int[length1 + length2];
    
    for (int i = length1 - 1; i >= 0; i--) {
        int digit1 = num1.charAt(i) - '0';
        int carry = 0;
        for (int j = length2 - 1; j >= 0; j--) {
            
            int digit2 = num2.charAt(j) - '0';
            int mult = digit1 * digit2;
            
            int sum = mult + product[i + j + 1] + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            product[i + j + 1] = sum;
        }
        
        if(carry > 0) 
            product[i] += carry;
    }
    
    
    // create answer string
    StringBuilder result = new StringBuilder();
    int index = 0;
    while (product.length > 1 && product[index] == 0) index++; 
    
    while (index < product.length) {
        int digit = product[index];
        result.append(digit + "");
        index++;
    }
    
    return result.toString();
}
}