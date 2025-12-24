class Solution {
    List<String> res = new ArrayList<>();
        List<String> el = new ArrayList<>();
        List<String> gr = new ArrayList<>();
        List<String> ph = new ArrayList<>();
        List<String> re = new ArrayList<>();
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        for(int i=0; i<code.length; i++){
            if(!isActive[i]) continue;
            if(code[i].equals("")) continue;
            boolean valid = true;
            for(char c : code[i].toCharArray()){
                if(!(Character.isLetterOrDigit(c) || c=='_')){
                    valid=false;
                    break;
                }
            }
            if(valid){
                  if(businessLine[i].equals("electronics")) {
                        el.add(code[i]);
                    }
                    else if(businessLine[i].equals("grocery")) {
                        gr.add(code[i]);
                    }
                    else if(businessLine[i].equals("pharmacy")) {
                        ph.add(code[i]);
                    }
                    else if(businessLine[i].equals("restaurant")) {
                        re.add(code[i]);
                    }

            }
        }
        
        Collections.sort(el);
        Collections.sort(gr);
        Collections.sort(ph);
        Collections.sort(re);

        res.addAll(el);
        res.addAll(gr);
        res.addAll(ph);
        res.addAll(re);

        return res;
    }
}