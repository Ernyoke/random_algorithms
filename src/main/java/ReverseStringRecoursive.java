public class ReverseStringRecoursive {
    public String reverse(String str) {
        if(str != null && str.length() > 0) {
            return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        }
        return "";
    }

    public String reverse2(String str) {
        if (str != null && str.length() > 0) {
            StringBuilder res = new StringBuilder();
            helper(str, str.length() - 1, res);
            return res.toString();
        }
        return "";
    }

    private void helper(String str, int index, StringBuilder res) {
        if (index >= 0) {
            helper(str, index - 1, res.append(str.charAt(index)));
        }
    }
}
