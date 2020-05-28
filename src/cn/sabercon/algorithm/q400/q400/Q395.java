package cn.sabercon.algorithm.q400.q400;

/**
 * 395. Longest Substring with At Least K Repeating Characters
 *
 * Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.
 *
 * Example 1:
 *
 * Input:
 * s = "aaabb", k = 3
 *
 * Output:
 * 3
 *
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 * Example 2:
 *
 * Input:
 * s = "ababbc", k = 2
 *
 * Output:
 * 5
 *
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 *
 * @author SaberCon
 * @date 2020-05-28
 */
public class Q395 {

    public int longestSubstring(String s, int k) {
        if (k == 0) {
            return s.length();
        }
        return 0;
    }
}
