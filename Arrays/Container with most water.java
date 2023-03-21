//T.C: O(N)
//S.C: O(1)

/*  First In order to find the area of the container with the most water first observe the array height then it determines the
height of all the indexes so x axis will be the indexes so intially we will take 2 pointers low and high and then find area. To find t
the area length is calculated as min of the 2 pointers height height[high]-height[low] and breadth will be the diff of the pointers high-low. So 
this will be the curr area and we will compare the curr area with another area bcz we want largest one so take garea as 0 before and then
to further decide which side the pointer should move to calculate area is if the height of the low is less then increment that else decrement
the high pointer so it will cover all the elements of array. Finally, return garea*/ 
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0,high=n-1;
        int garea= 0;
        while(low<high)
        {
            int area= (Math.min(height[low],height[high])) * (high-low);
            //System.out.println(area);
            if(area>garea)
            {
                garea=area;
            }
            if(height[low]<height[high])
            {
                low++;
            }
            else
            {
                high--;
            }

        }
        return garea;

    }
}