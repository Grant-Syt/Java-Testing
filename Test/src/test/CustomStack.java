
// stack that implements an increment function in O(1) time
// with a lazy algorithm

package test;

import java.util.ArrayList;
import java.util.Stack;

public class CustomStack {
	private ArrayList<Integer> incArr;
    private Stack<Integer> st;

    CustomStack() {
    	incArr = new ArrayList<Integer>();
    	st = new Stack<Integer>();
    }

    public void push(int x) {
            st.push(x);
            incArr.add(0);
    }

    public int pop() {
        if(st.size() == 0) {
        	return -1;
        }
        int poppedInt = st.peek();
        st.pop();
        int incIndex = incArr.size()-1;
        // increment values as they are popped and move the increment info down
        if(incArr.get(incIndex) != 0){
        	poppedInt += incArr.get(incIndex);
        	if (incIndex != 0) {
        		incArr.set(incIndex-1, incArr.get(incIndex) 
                		+ incArr.get(incIndex-1));
        	}
        }
        incArr.remove(incIndex);
        return poppedInt;
    }

    // increment last k elements
    public void increment(int k, int val) {
    	int incIndex = incArr.size()-1;
        incArr.set(Math.min(k-1, incIndex), val
        		+ incArr.get(incIndex));
    }
    
}
