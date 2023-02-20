package jhonMobileShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JhonMobileShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Shop");
		int n=5;
		List<Mobile> list=new ArrayList<Mobile>();
		for(int i=1;i<=n;i++) {
			Mobile mobile=new Mobile();
			System.out.println("Enter the Operating System");
			mobile.setOperatingSystem(sc.next());
			System.out.println("Enter the Ram");
			mobile.setRam(sc.nextInt());
			System.out.println("Enter the Memory Space");
			mobile.setMemorySpace(sc.nextInt());
			System.out.println("Enter the Price");
			mobile.setPrice(sc.nextInt());
			System.out.println("Enter the Rating");
			mobile.setRating(sc.nextInt());
			list.add(mobile);
		}
		System.out.println("customer");
		int q=2;
		List<Mobile> list2=new ArrayList<Mobile>();
		for(int i=1;i<=q;i++) {
			Mobile mobile=new Mobile();
			System.out.println("Enter the Operating System");
			mobile.setOperatingSystem(sc.next());
			System.out.println("Enter the Ram");
			mobile.setRam(sc.nextInt());
			System.out.println("Enter the Memory Space");
			mobile.setMemorySpace(sc.nextInt());
			System.out.println("Enter the Budget");
			mobile.setPrice(sc.nextInt());
			
			list2.add(mobile);
		}	
		List<Integer> ret=shop(list,list2);
		for (Integer integer : ret) {
			System.out.println(integer);
		}
	}
	
	public static List<Integer> shop(List<Mobile> shop,List<Mobile> customer) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (Mobile mobile : customer) {
			int count=0;
			for (Mobile mobile2 : shop) {
				if(mobile.getOperatingSystem().equals(mobile2.getOperatingSystem())&&mobile.getRam()==mobile2.getRam()&&mobile.getMemorySpace()==mobile2.getMemorySpace()&&mobile.getPrice()>=mobile2.getPrice()) {
					list.add(mobile2.getPrice());
					break;
				}else {
					count++;
				}
			}
			if(count==shop.size()) {
				list.add(-1);
			}
		}
		return list;
	}
}
