package collections;

import java.util.Iterator;
import java.util.Stack;

class Test{
	
	public static  void push(Stack<Integer> stack) {
		for(int i=1;i<5;i++) {
			stack.push(i);
		}
	}
static	public void removeElement(Stack<Integer> stack) {
		for(int i=1;i<5;i++) {
			Integer y=(Integer)stack.pop();
			System.out.println(y);
		}
	}
	static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
	static void search(Stack<Integer> stack, int element) {
		Integer pos=(Integer)stack.search(element);
		if(pos== -1) {
			System.out.println("element not found");
		}else {
			System.out.println("element is :"+pos);
		}
	}
}
public class StackMain {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	Test.push(stack);
	Test.removeElement(stack);
	Test.push(stack);
	Test.stack_peek(stack);
	Test.search(stack, 2);
	
}
 
}
