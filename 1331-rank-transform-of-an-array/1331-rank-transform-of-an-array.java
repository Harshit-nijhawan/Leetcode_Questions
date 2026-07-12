class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[] = Arrays.copyOf(arr,arr.length);
        int n = arr.length;
        Arrays.sort(temp);
        int a = 1;
        for(int i = 0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],a);
                a++;
            }
        }
        for(int i = 0;i<n;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}