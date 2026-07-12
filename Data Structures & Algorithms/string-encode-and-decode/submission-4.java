class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) {
            return "";
        }
        String res = "";
        for(String s : strs) {
            res += s.length()+ "#" + s; //5#Hello5#World
        }
        // System.out.println(res);
        return res.length()>0 ? res : "0#";
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        if(str.length() == 0) return List.of();
        while(i < str.length()) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return list;
    }
}
