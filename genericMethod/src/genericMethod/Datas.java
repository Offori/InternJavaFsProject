package genericMethod;

import java.util.List;

public class Datas{
	public <E> void prinListData(List <E> list) {
		for(E elt: list) {
			System.out.println(elt);
		}
	}
	public <E> void printArrayData(E[] ArrayData) {
		for(E elt: ArrayData) {
			System.out.println(elt);
		}
	}
}
