package work.christianbueno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("hello my friend");
//		System.out.printf("the sum is %d%nMy name is %s%n", 350, "chris");
		
		String[] fruits = {"kiwi","apple","grape","cherry","raspberry","strawberry","blueberry","blackberry"};
		
		//Stream
//		System.out.printf("fruits -> %s%n", Arrays.asList(fruits));
		
//		System.out.printf("fruits in uppercase %s%n",
//				Arrays.stream(fruits)
//				.map(String::toUpperCase)
//				.collect(Collectors.toList()));
		
//		Arrays.stream(fruits)
//		.forEach(fruit -> System.out.printf("fruit is %s%n", fruit));
		
		//Stream count sum min max average
		int[] numbers = {1,2,3,4,5};
		
//		IntStream.of(numbers)
//		.forEach(number -> System.out.printf("number is %d%n", number));
		
//		System.out.printf("the count is %d%n", IntStream.of(numbers).count());
//		System.out.printf("the count is %d%n", IntStream.of(numbers).sum());
//		System.out.printf("the count is %d%n", IntStream.of(numbers).max().getAsInt());
//		System.out.printf("the count is %d%n", IntStream.of(numbers).min().getAsInt());
//		System.out.printf("the count is %.2f%n", IntStream.of(numbers).average().getAsDouble());
		
		//sum with reduce method
//		int thesum = IntStream.of(numbers).reduce(0, (n1, n2) -> {
//			int sum = n1 + n2;
//			return sum;
//		});
//		System.out.printf("the sum is %d%n", thesum);
		
//		Comparator<Computer> c = (c1, c2) -> c1.getAge().compareTo(c2.getAge());
//		Comparator<Computer> c = Comparator.comparing(Computer::getAge);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "chris"));
		employees.add(new Employee(15, "pam"));
		employees.add(new Employee(17, "pam"));
		employees.add(new Employee(25, "tim"));
		employees.add(new Employee(24, "tim"));
		employees.add(new Employee(17, "bob"));
		
//		System.out.println("Employee:" + employees);
		
//		Collections.sort(employees, new EmployeeComparator());
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
//		Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName)
//				.thenComparing(Employee::getAge); 
//		Collections.sort(employees, employeeComparator);
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
//		Collections.sort(employees, Comparator.comparing(Employee::getName)
//				.thenComparingInt(Employee::getAge));		
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
//		employees.stream().sorted(Comparator.comparing(Employee::getName)
//				.thenComparingInt(Employee::getAge))
//		.forEach(System.out::println);
		
		//Iterator, ArrayList List
		Iterator<Employee> itEmployee = employees.iterator();
		System.out.println(itEmployee.next());
		System.out.println(itEmployee.next());
		System.out.println(itEmployee.next());
		
		
	}

}

