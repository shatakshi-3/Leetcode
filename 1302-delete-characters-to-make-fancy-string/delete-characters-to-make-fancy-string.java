class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                ans.append(s.charAt(i));
            }
           
        }
        return ans.toString();
        
    }
}