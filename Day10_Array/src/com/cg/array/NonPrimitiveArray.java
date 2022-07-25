package com.cg.array;

class Employee
{
	public int EmpId;
	public String EmpName;
	//constructor to initialize the value
	Employee(int id, String Name)
	{
		EmpId = id;
		EmpName = Name;
	}
}
	public class NonPrimitiveArray {

	public static void main(String[] args) {
		
		//declare an array of class type
				Employee arr[] = new Employee[3];
				arr[0] = new Employee(101,"Shivani");
				arr[1] = new Employee(102,"Krishna");
				arr[2] = new Employee(103,"Waiting");
				for(int i=0;i<arr.length;i++)
				{
					System.out.println("Element at "+i+ "th "+ " index is "+arr[i].EmpId + "  "+arr[i].EmpName);
				}
			}
	}
