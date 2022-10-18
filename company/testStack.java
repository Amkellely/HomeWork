package com.company;

public class testStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 1; i < 6; i++){
            st.push(i);
        }
        System.out.println(st);

        for(int i = 1; i < 6; i++) {
            st.pop();
        }

        try {
            st.pop();
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
