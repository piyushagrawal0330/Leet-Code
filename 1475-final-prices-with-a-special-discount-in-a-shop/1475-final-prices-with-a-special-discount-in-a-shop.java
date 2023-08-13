class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        Stack<Integer> stack = new Stack();
        stack.push(prices[prices.length - 1]);
        arr[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                arr[i] = prices[i];
            } else { 
                arr[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return arr;
    }
}