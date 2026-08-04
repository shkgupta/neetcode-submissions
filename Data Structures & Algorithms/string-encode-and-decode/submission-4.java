class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.size() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append("salt").append(str).append("-9x");
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<String>();
        }

        List<String> list =  Arrays.asList(str.substring(0, str.lastIndexOf("-9x")).split("-9x"));
        return list.stream().map(a -> a.replaceFirst("salt","")).toList();
    }
}
