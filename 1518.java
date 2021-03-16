class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int globalEmpty = 0;
        do {
            int fullBottle = numBottles/numExchange; 
            globalEmpty += numBottles%numExchange;
            if(globalEmpty>=numExchange) {
                int filled = globalEmpty/numExchange;
                fullBottle += filled;
                globalEmpty -= (filled*numExchange);
            }
            ans += fullBottle;
            numBottles = fullBottle;
        } while(numBottles>0);
        return ans;
    }
}