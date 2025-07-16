import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() !=s.length()){
            return false;
        }
        Map <Character,Integer> a = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            a.put(ch1, a.getOrDefault(ch1,0)+1);
            a.put(ch2, a.getOrDefault(ch2,0)-1);
        }
        for (int count : a.values()){
            if (count!=0){
                return false;
            }
        }
        return true;
        
    }
}

// another method
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;

//         int[] count = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }

//         for (int val : count) {
//             if (val != 0) return false;
//         }

//         return true;
//     }
// }
