class Solution {
    public int findRadius(int[] H, int[] h) {
        Arrays.sort(h);

        int inf = 1000000007;

        int [] mn = new int[H.length];

        for(int i = 0; i < H.length; ++i) 
            mn[i] = inf;

        for(int i = 0; i < H.length; ++i) {
            // Closest heater in the right

            int n = h.length;

            if(H[i] <= h[n - 1]) {
                int lo = 0 , hi = h.length - 1;
                int inx = h.length;

                while(lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if(h[mid] == H[i]) {
                        inx = mid;
                        break;
                    } 

                    if(h[mid] > H[i]) { 
                        inx = mid;
                        hi = mid - 1;
                    } else 
                        lo = mid + 1;  
                }

                mn[i] = h[inx] - H[i];
            }

            if(H[i] >= h[0]) {
                int lo = 0 , hi = h.length - 1;
                int inx = h.length;

                while(lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if(h[mid] == H[i]) {
                        inx = mid;
                        break;
                    } 

                    if(h[mid] < H[i]) { 
                        inx = mid;
                        lo = mid + 1;
                    } else 
                        hi = mid - 1;  
                }

                mn[i] = Math.min(mn[i] , H[i] - h[inx]);
            }
        }

        int ans = 0;

        for(int i = 0; i < H.length; ++i) 
            ans = Math.max(ans , mn[i]);

        return ans;    
    }
}