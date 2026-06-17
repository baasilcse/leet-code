class Solution {
    public String longestCommonPrefix(String[] strs) {
       String fir=strs[0];
        String c="";
        if (strs.length==1){
            return fir;
        }
        try {
       for (int i=0;i<fir.length();i++){
        for (int j=1;j<strs.length;j++){
           if(fir.charAt(i)!= strs[j].charAt(i)){
                return c;
            }
        }
          c+=fir.charAt(i);
       } }
       catch(Exception e){
        return c;
       }
        return c;
    }
}