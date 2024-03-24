package hackerrank;

import java.io.*;
import java.util.*;

//Z z Y y X x W w V v U u T t S s R r Q q P p O o N n M m L l K k J j I i H h G g F f E e D d C c B b A a
public class Solution {

	public static void main(String[] args) {
		char ch = 'Z';
		while (ch >= 'A') {
			System.out.print(ch + " " + Character.toLowerCase(ch) + " ");
			ch--;
		}
	}
}