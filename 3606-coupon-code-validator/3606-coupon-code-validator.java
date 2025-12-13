class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> electronics = new ArrayList<>();
        ArrayList<String> grocery = new ArrayList<>();
        ArrayList<String> pharmacy = new ArrayList<>();
        ArrayList<String> restaurant = new ArrayList<>();
        for(int i = 0;i<code.length;i++){
            String a = code[i];
            String b = businessLine[i];
            boolean c = isActive[i];
            boolean check= true;
            if(a.equals("")) {
                check = false;
            }else{
            for(int j = 0;j<a.length();j++){
                char ch = a.charAt(j);
                if(!(Character.isLetterOrDigit(ch) || ch == '_')){
                    check = false;
                    break;
                }
            }
            }
            if(b == null || !(b.equals("electronics") || b.equals("grocery") || b.equals("pharmacy") || b.equals("restaurant"))){
                check = false;
            }
            if(c == false){
                check = false;
            }
            if(check){
                if(b.equals("electronics")) electronics.add(a);
                else if(b.equals("grocery")) grocery.add(a);
                else if(b.equals("pharmacy")) pharmacy.add(a);
                else restaurant.add(a);
            }
        }
        Collections.sort(electronics);
        Collections.sort(grocery);
        Collections.sort(pharmacy);
        Collections.sort(restaurant);

        ans.addAll(electronics);
        ans.addAll(grocery);
        ans.addAll(pharmacy);
        ans.addAll(restaurant);
        return ans;
    }
}