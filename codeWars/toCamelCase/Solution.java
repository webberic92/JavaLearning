import java.lang.StringBuilder;

class Solution {
  public static void main(String[] args) {

    // the-stealth-warrior" gets converted to "theStealthWarrior"
    toCamelCase("the-stealth-warrior");

  }

  static String toCamelCase(String s) {
    String ret = "";
    for (int i = 0; i <= s.length() - 1; i++) {

      if (s.charAt(i) == '-' || s.charAt(i) == '_') {

        char toUpper = s.charAt(i + 1);

        ret += String.valueOf(toUpper).toUpperCase();
        ;
        i++;
      } else {
        ret += s.charAt(i);
      }

    }

    return ret;

  }

}


// class Solution{

//   static String toCamelCase(String s){
//     Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
//     StringBuffer sb = new StringBuffer();
//     while (m.find()) {
//         m.appendReplacement(sb, m.group(1).toUpperCase());
//     }
//     return m.appendTail(sb).toString();
//   }
// }