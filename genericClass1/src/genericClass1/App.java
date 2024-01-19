package genericClass1;

class Data{
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}

class GenericClass<T>{
	private T Data;

	public GenericClass(T data) {
		Data = data;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}
	
	@Override
	public String toString() {
		return "GenericClass [Data=" + Data + "]";
	}
}

public class App {
	public static void main(String[] args) {
		/*Data data=new Data("Some String");
		String variable=(String)data.getObj();	
		System.out.println(variable);*/
		
		GenericClass<String> genericData=new GenericClass<String>("Some DAta");
		String variable=genericData.getData();
		System.out.println(variable);
	}
}
