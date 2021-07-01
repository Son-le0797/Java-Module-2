package JavaCollectionFramework.Stack.ReverseStack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseElement {
    public static int[] ReverseNumberByStack(int[] ar) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            stack.push(ar[i]);
        }
        for (int j = 0; j < ar.length; j++) {
            ar[j] = stack.pop();
        }
        return ar;
    }

    public static String ReverseStringByStack(String str) {
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        char[] chars = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            chars[j] = wStack.pop();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int k = 0; k < chars.length; k++) {
            stringBuffer.append(chars[k]);
        }
        String result = stringBuffer.toString();
        return result;
    }







}
