package lab8;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ProblemThree {	
		private static StaticStorage ss = StaticStorage.INSATNCE;//changed from new StaticStroge()
		@SuppressWarnings({ "serial", "unused" })
		public static void main(String[] args) {
			ss.add("test",new String("ambes"));
			System.out.println(ss.get("test"));
			List<Customer> list1 = new ArrayList<Customer>() {
				{
					add(new Customer("Joe", "xyz12"));
					add(new Customer("Dave", "uvw23"));
				}
			};
			List<Customer> list2 = new ArrayList<Customer>() {
				{
					add(new Customer("Sue", "abz12"));
					add(new Customer("Annie", "dew23"));
				}
			};
			login(list1);
			showLoggedIn();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				//do nothing
			}
			showLoggedIn();
			

		}
		
		private static void login(List<Customer> list) {
			List<String> storageList = new ArrayList<>();
			ss.add(StorageKey.LOGGED_IN.toString(), storageList);
			for(Customer c : list) {
				storageList.add(c.getName());
			}
		}
		@SuppressWarnings("unchecked")
		private static void showLoggedIn() {
			List<String> stored = (List<String>)ss.get(StorageKey.LOGGED_IN.toString());
			String output = "Customers who are logged in now:";
			System.out.println(output + "\n" + stored);
		}

		
	}


//this becomes enum and i added one instant of type enum called INSTANTNCE;
enum StaticStorage implements Cache{
	INSATNCE;
	private HashMap<String, List<Pair>> data = new HashMap<>();
	public void add(String key, Object value) {
		List<Pair> list = null;
		if(!data.containsKey(key)) {
			list = new ArrayList<Pair>();
		} else {
			list = data.get(key);
		}
		Pair p = new Pair();
		p.dataVal = value;
		//point in future where this item will no longer be in cache
		p.time = LocalTime.now().plusSeconds(timeout());
		list.add(p);
		
		data.put(key, list);
		  
	}
	public List<Pair> getList(String key) {
		return data.get(key);
	}
	public Object get(String key) {
		List<Pair> list = getList(key);
		if(list == null) {
			return null;
		} else { //obtain those values that have not timed out
			List<Object> retval =  new ArrayList<>();
			Iterator<Pair> it = list.iterator();
			while(it.hasNext()) {
				Pair p = it.next();
				LocalTime time = p.time;
				LocalTime now = LocalTime.now();
				//if time has not expired, return value
				if(!(now.isAfter(time))) {
					retval.add(p.dataVal);
				} else {
					it.remove();
				}
			}
			return retval;
		}
	}
	
	public String toString() {
		return data.toString();
	}
	
	
	private class Pair {
		Object dataVal;
		LocalTime time;
	}
	
}
//this was class before i changed it to interface and the method was static
interface Cache {
	//shouldn't be static
	default long timeout() {
		//seconds
		return 1;
	}
}
class Customer {
	private String name;
	private String password;
	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

enum StorageKey {
	LOGGED_IN;
	
}


