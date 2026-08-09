class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        List<List<Integer>> children=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            children.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            children.get(parent[i]).add(i);
        }
        int[] depths = new int[n];
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(0);
        depths[0]=1;
        int maxHeight=1;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            maxHeight=Math.max(maxHeight,depths[curr]);

             for(int child:children.get(curr))
             {
            depths[child]=depths[curr]+1;
            queue.offer(child);
               }
        }
        long totalsum=0;
        for(int i=0;i<n;i++){
            long weight=(long)nums[i]*(maxHeight-depths[i]+1);
            totalsum +=weight;
        }
       return totalsum;
    }
}