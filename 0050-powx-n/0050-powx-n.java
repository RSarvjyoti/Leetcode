class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0; // Base case: x^0 = 1
        
        long N = n; // Convert n to long to handle edge case of Integer.MIN_VALUE
        if (N < 0) { 
            x = 1 / x; // Use the reciprocal of x when n is negative
            N = -N;    // Make N positive
        }
        
        return pow(x, N); // Call the helper method with long N
    }
    
    private double pow(double x, long n) {
        if (n == 0) return 1.0; // Base case: x^0 = 1
        double half = pow(x, n / 2); // Recursively compute x^(n/2)
        
        if (n % 2 == 0) {
            return half * half; // If n is even, result is half * half
        } else {
            return half * half * x; // If n is odd, multiply by x one more time
        }
    }
}
