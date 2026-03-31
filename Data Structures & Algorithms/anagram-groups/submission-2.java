class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>words = new HashMap<>();
        for(String s: strs){
            char[] S = s.toCharArray();
            Arrays.sort(S);
            String line = new String (S);
            words.putIfAbsent(line, new ArrayList<>());
            words.get(line).add(s);
        }
        return new ArrayList<>(words.values());
    }
}
