class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            String ch = s[i];
            if (ch.equals("C"))
                st.pop();
            else if (ch.equals("D"))
                st.push(2 * st.peek());
            else if (ch.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                int sum = first + second;
                st.push(first);
                st.push(sum);
            } else
                st.push(Integer.parseInt(ch));
        }
        int sum = 0;
        while (st.size() > 0) {
            sum += st.pop();
        }
        return sum;
    }
}