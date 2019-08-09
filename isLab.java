import java.io.*;
import java.lang.Math;
import java.util.*;
class Moni{
	public int isLab(int k){
		int g;
	    k=Math.abs(k);
		g=k%10;
		return g;
		
	}
	public static void main(String args[]){
		Moni obj=new Moni();
		int k=14856,h;
		h=obj.isLab(k);
		System.out.println(h);
	}
}
