package com.codility.lession1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.Iterator;

class SolutionIter implements Iterable<Integer> {
	private long linenumber = 0; 
	LineNumberReader lnr;

	public SolutionIter(Reader inp) throws IOException {
		lnr = new LineNumberReader(inp);	 
		linenumber = lnr.lines().count(); 
		

	}

	public Iterator<Integer> iterator() {
		Iterator<Integer> it = new Iterator<Integer>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				System.out.println(linenumber + " ------------ ");
				lnr.lines().forEach(x->{System.out.println(x +"Str");});
				String currentIndex_1 = lnr.lines().skip(1).findFirst().get();
				System.out.println("currentIndex  " + currentIndex_1);
				return currentIndex < linenumber;
			}

			@Override
			public Integer next() {
//				try {
//					System.out.println(lnr.readLine() + " Next ");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				return 1;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;
	}

}

public class SolutionIter123 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\ReadFile\\read.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		// create your list and hold the values.
		SolutionIter stackOverflowList = new SolutionIter(br);

		// Since our class SOList is an instance of Iterable, then we can use it on a
		// foreach loop
		for (Integer num : stackOverflowList) {
			System.out.print(num);
		}
		
	}
}
