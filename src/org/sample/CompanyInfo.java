package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyInfo {

	public static void main(String[] args) {
		
	EmployeeInfo e = new EmployeeInfo();
	     e.setEmpId(876543);
	     e.setName("Naresh");
	     e.setPhone(9710287492l);
	     
	EmployeeInfo e1 = new EmployeeInfo();     
		e1.setEmpId(123456);
		e1.setName("harish");
		e1.setPhone(875468210l);
		
	EmployeeInfo e2 = new EmployeeInfo();	
		e2.setEmpId(456789);
		e2.setName("sukumar");
		e2.setPhone(9840830094l);
		
		List<EmployeeInfo> li = new ArrayList<>();
		
		//add the values
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		//iterate the List
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println("Employee Id is : " + li.get(i).getEmpId());
			System.out.println("Employee Name is : " + li.get(i).getName());
			System.out.println("Employee Phone is : " + li.get(i).getPhone());
			
		}
		
		System.out.println("**************************************************");
		
		System.out.println("Enhanced for Loop");
		
		
		for (EmployeeInfo x : li) {
			
			System.out.println("Employee Id is : " + x.getEmpId());
			System.out.println("Employee Name is : " + x.getName());
			System.out.println("Employee Phone is : " + x.getPhone());
			
		}
		
		System.out.println("**************************************************");
		
		Set<EmployeeInfo> s = new LinkedHashSet<>();
		
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		for (EmployeeInfo y : s) {
			
			System.out.println("Employee Id is : " + y.getEmpId());
			System.out.println("Employee Name is : " + y.getName());
			System.out.println("Employee Phone is : " + y.getPhone());
				
		}
		
		System.out.println("*****************************************************");
		
		Map<Integer,EmployeeInfo> m = new LinkedHashMap<>();
		
		m.put(1, e);
		m.put(2, e1);
		m.put(3, e2);
		
		Set<Entry<Integer, EmployeeInfo>> z = m.entrySet();
		
		for (Entry<Integer, EmployeeInfo> a : z) {
			
			System.out.println(a.getKey());
			System.out.println("Employee Id is : " + a.getValue().getEmpId());
			System.out.println("Employee Name is : " + a.getValue().getName());
			System.out.println("Employee Phone is " + a.getValue().getPhone());
			
		}
			
	}
}
