public class Remove{
    public String removeConsecutiveCharacter(String S){
        if(S == null || S.length()<=1){
            return S;
        }
        
        String s2="";
        s2+=S.charAt(0);
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i) != S.charAt(i-1)){
                s2+= S.charAt(i);
            }
        }
        
        return s2;
    }
}
