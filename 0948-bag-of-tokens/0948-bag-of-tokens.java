class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
Arrays.sort(tokens);
int max=0;
int score=0;
int i=0,j=tokens.length-1;
while(i<=j){
    if(power>=tokens[i])
    {
        power -=tokens[i];
        score++;
        i++;
    
    max=Math.max(score,max);}
    else if(score>=1)
    {
        power +=tokens[j];
        j--;
        score--;
    }
    else
    return max;
}
return max;
    }
} 