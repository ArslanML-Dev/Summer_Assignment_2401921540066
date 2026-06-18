class Solution {
    public int largestRectangleArea(int[] A) 
    {
        Stack<Integer> s= new Stack<Integer>();
        if(A==null || A.length==0)
         return 0;
         //initialize max area
         int maxArea=0;
         int i=0;
         //run through all bars of given histogram
         while(i<A.length)
         {
            //if current bar is higher than the bar of the stack peek, push it to stack
            if(s.empty() || A[s.peek()]<=A[i])
            s.push(i++);
            else
            {
                //current bar is lower than stack peek
                //calculate area of rectangle with stack top as smallest bar
                //i is right index for the top and element before top in stack is left index
                int top=s.pop();
                //calculate the area with A[top] stack as smallest bar and update maxarea if needed 
                maxArea=Math.max(maxArea,A[top]*(s.empty() ? i:i-s.peek() -1));
            }
         }
         //now pop the remaining bars from stack and calculate area with every popped bar as the smallest bar.
         while(!s.isEmpty())
         {
            int top=s.pop();
            maxArea=Math.max(maxArea,A[top]*(s.empty() ? i : i - s.peek()-1));
         }
         return maxArea;
            
                     
    }
}
