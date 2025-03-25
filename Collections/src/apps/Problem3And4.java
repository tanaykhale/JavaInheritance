package apps;

import customer.Customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import customer.RegisteredCustomer;

public class Problem3And4  {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int registered=0;
//		Customer []c=new Customer[3];
//		FileOutputStream fos=new FileOutputStream("D:\\Study material\\Java\\Collections\\input.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		for(int i=0;i<3;i++) {
//			System.out.println("Enter 1 if customer is registered and any other number if not registered");
//			registered=sc.nextInt();
//			if(registered==1) {
//				String name,email;
//				int num,reg;
//				System.out.println("Enter the name");
//				name=sc.next();
//				System.out.println("Enter the email");
//				email=sc.next()	;
//				System.out.println("Enter the number");
//				num=sc.nextInt();
//				System.out.println("Enter the registered number");
//				reg=sc.nextInt();
//				c[i]=new RegisteredCustomer(name, email, num, reg);
//				oos.writeObject(c[i]);
//			}
//			else {
//				String name,email;
//				int num;
//				System.out.println("Enter the name");
//				name=sc.next();
//				System.out.println("Enter the email");
//				email=sc.next()	;
//				System.out.println("Enter the number");
//				num=sc.nextInt();
//				c[i]=new Customer(name, email, num);
//				oos.writeObject(c[i]);
//			}
//		}
//		System.out.println("File write completed");
		
		List<Customer> lcus=new ArrayList<>();
		List<RegisteredCustomer> lreg=new ArrayList<>();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Study material\\Java\\Collections\\input.txt"));
//		Customer [] data=new Customer[5];
//		for(int i=0;i<3;i++) {
//			data[i]= (Customer) ois.readObject();
//			if( data[i] instanceof RegisteredCustomer) {
//				lreg.add((RegisteredCustomer) data[i]);
//			}
//			else {
//				lcus.add(data[i]);
//			}
//		}
		List<Customer> data=new ArrayList<>();
		
		while(true) {
			try {
//				data=(List<Customer>) ois.readObject();
//				if(data instanceof RegisteredCustomer) {
//					lreg.add((RegisteredCustomer) data);
//				}
//				else
//					lcus.add((Customer)data);
				 Object obj = ois.readObject();
			        if (obj instanceof RegisteredCustomer) {
			            lreg.add((RegisteredCustomer) obj);
			        } else if (obj instanceof Customer) {
			            lcus.add((Customer) obj);
			        }
			}
			catch(Exception e) {
				break;
			}
		}
		for(Customer cs:lcus) {
			System.out.println(cs);
		}
		for(RegisteredCustomer r:lreg) {
			System.out.println(r);
		}
	}

}
