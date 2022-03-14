package hostel;
import java.util.*;
public class HostelAllotment{
	/*Each student has these three attributes in hostel*/
	public static List<Integer> a_nv = new ArrayList<Integer>();
	public static List<Integer> a_v = new ArrayList<Integer>();
	public static List<Integer> b_v = new ArrayList<Integer>();
	public static List<Integer> b_nv = new ArrayList<Integer>();
	public static List<Integer> nulll = new ArrayList<Integer>();
	public static List get_av(){
		return a_v;
	}
	public static List get_bv(){
		return b_v;
	}
	public static List get_anv(){
		return a_nv;
	}
	public static List get_bnv(){
		return b_nv;
	}
	public static List get_null(){
		return nulll;
	}


}