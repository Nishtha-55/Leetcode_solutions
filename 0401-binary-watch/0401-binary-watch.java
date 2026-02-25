class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
         List<String> result = new ArrayList<>();
        for(int hour =0; hour<=11; hour++)
        {
            for(int minute =0; minute <=59 ;minute++)
            {
                if((Integer.bitCount(hour)+Integer.bitCount(minute)==turnedOn))
                {
                   String h = String.valueOf(hour);
                    String m = (minute < 10 ? "0" : "") + minute;
                    result.add(h + ":" + m);
                }
            }
        }
         return result;
    }
}
//approch find set bits in hours and minurtes 
//total number of set bits must be equal to turned on LED lights 