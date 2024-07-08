class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                count++;
            }
        }

        // Check for palindromes of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }
}

// class Solution {
//     public String rev(String str) {
//         int n = str.length();
//         StringBuilder revStr = new StringBuilder();
//         for (int i = n - 1; i >= 0; i--) {
//             revStr.append(str.charAt(i));
//         }
//         return revStr.toString();
//     }

//     public int countSubstrings(String s) {
//         int n = s.length();
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) { // Change j=n to j=n-1 to get correct substrings
//                 String s1 = s.substring(i, j + 1); // Use substring method to generate substrings
//                 if (s1.equals(rev(s1))) { // Use .equals() to compare strings
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// // class Solution {
// //     public String rev(String str)
// //     {
// //         int n=str.length();
// //         String revStr="";
// //         while(n>0)
// //         {
// //             revStr+=str.charAt(n-1);
// //             n--;
// //         }
// //         return revStr;
// //     }
// //     public int countSubstrings(String s) {
// //         int n=s.length();
// //         int count=0;
// //         for(int i=0; i<n; i++)
// //         {
// //             for(int j=0; j<n; j++)
// //             {
// //                 String s1= "";
// //                 for(int k=i; k<=j; k++)  //substring
// //                 {
// //                     s1+=s.charAt(k);
// //                 }
// //                 if(s1.equals(rev(s1))
// //                     count++;
// //             }
// //         }
// //         return count;
// //     }
// // }