class Solution {
    public boolean isValid(String word) {
        boolean vowel=false;
        boolean cons=false;
        if(word.length()<3)
        return false;
        for(char c:word.toCharArray()){
            c=Character.toLowerCase(c);
           if(Character.isLetter(c))
           {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            vowel=true;
            else
            cons=true;
           }
           else if(!Character.isDigit(c))
           return false;
        }
        return vowel && cons;
    }
}