class Solution {

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);

    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {

//         for (int i = 0; i <= haystack.length() - needle.length(); i++) {

//             int j = 0;

//             while (j < needle.length() &&
//                    haystack.charAt(i + j) == needle.charAt(j)) {
//                 j++;
//             }

//             if (j == needle.length()) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }

// class Solution {

//     int j = 0;
//     boolean flag = false;
//     public int strStr(String haystack, String needle) {

//         for(int i = 0; i<= haystack.length; i++)
//         {
//                 if(haystack.charAt(i) == needle.charAt(j))
//                 {
//                     flag = true;
//                     j++; 
//                 }
//         }
//         return flag;
//     }
// }