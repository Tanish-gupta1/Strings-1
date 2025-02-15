public class Problem1 {
    class Solution {
        //t.c->O(m+n)
        //s.c ->O(1)
        public String customSortString(String order, String s) {
            if(order == null || order.length() ==0){
                return s;
            }
            HashMap<Character,Integer> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i< s.length();i++){
                char c = s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(int i =0;i< order.length();i++){
                char c = order.charAt(i);
                if(map.containsKey(c)){
                    int times  = map.get(c);
                    for(int j = 0;j<times;j++){
                        sb.append(c);
                    }
                    map.remove(c);
                }
            }
            for(char key : map.keySet()){
                int times  = map.get(key);
                for(int i = 0;i<times;i++){
                    sb.append(key);
                }
            }
            return sb.toString();
        }
    }
}
