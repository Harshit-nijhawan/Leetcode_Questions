class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            for(int i = 0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}