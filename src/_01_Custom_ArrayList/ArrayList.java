package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	T[] arr;
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > arr.length) throw new IndexOutOfBoundsException();
		return arr[loc];
	}
	
	public void add(T val) {
		T[] add1 = (T[])new Object[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			add1[i] = arr[i];
		}
		add1[arr.length] = val;
		arr = add1;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > arr.length) throw new IndexOutOfBoundsException();
		
		T[] ins = (T[])new Object[arr.length+1];
		
		
		
		for(int i = 0; i < ins.length; i++) {
			if(i < loc) {
				ins[i] = arr[i];
			}
			else if(i == loc) {
				ins[i] = val;
			}
			else {
				ins[i] = arr[i-1];
			}
			
		}
		arr = ins;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > arr.length) throw new IndexOutOfBoundsException();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == loc) {
				arr[i] = val;
			}
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc < 0 || loc > arr.length) throw new IndexOutOfBoundsException();
		
		T[] rem = (T[])new Object[arr.length-1];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			if(i < loc) {
				rem[i] = arr[i];
			}
			else if(i == loc) {
				
			}
			else {
				rem[i-1] = arr[i];
			}
			
		}
		arr = rem;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}