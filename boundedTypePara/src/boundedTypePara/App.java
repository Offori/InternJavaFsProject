package boundedTypePara;

class Data<K extends Integer,V extends App>{
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public <E extends Character,N extends Number> void displayEl(E elt,N n0) {
		System.out.println("Element:"+elt+"Number"+n0);
	}
}

public class App {
	public static void main(String[] args) {
		Data<Integer,App> data=new Data<Integer,App>(1, new App());
		data.displayEl('$', 1);
		data.getValue().test();
		System.out.println(data.getKey());
	}
	public void test() {
		System.out.println("Testing ..........");
	}
}
