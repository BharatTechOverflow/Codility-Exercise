/**
 * 
 */
package com.codility.lesson99;

/**
 * @author s727953
 *
 */
public class TreeHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxHeight(Tree T) {
	    int t1l = 0;
	    int t2l = 0;
	    
	    if(T.l != null){
	        t1l = 1 + maxHeight(T.l);
	    }
	    if(T.r != null){
	        t2l = 1 + maxHeight(T.r);
	    }
	    
	    return Math.max(t1l,t2l);
	}

}
