package work.christianbueno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
		
//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee(10, "chris"));
//		employees.add(new Employee(15, "pam"));
//		employees.add(new Employee(17, "pam"));
//		employees.add(new Employee(25, "tim"));
//		employees.add(new Employee(24, "tim"));
//		employees.add(new Employee(17, "bob"));
		
		
		
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
//		Iterator<Employee> itEmployee = employees.iterator();
//		System.out.println(itEmployee.next());
//		System.out.println(itEmployee.next());
//		System.out.println(itEmployee.next());
		
		//HashSet
//		HashSet<Employee> employees = new HashSet<>();
//		employees.add(new Employee(10, "chris"));
//		employees.add(new Employee(15, "pam"));
//		employees.add(new Employee(17, "pam"));
//		employees.add(new Employee(25, "tim"));
//		employees.add(new Employee(24, "tim"));
//		employees.add(new Employee(17, "bob"));
//		
//		Iterator<Employee> it = employees.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
//		numbers1.add(100);
//		numbers1.add(51);
//		numbers1.add(17);
//		numbers1.add(1);
//		numbers1.add(90);
//		
//		Iterator<Integer> it = numbers1.iterator();
//		while(it.hasNext()) {
//			if(it.next() < 50)
//				it.remove();
//		}
//		System.out.println(numbers1);
		
		LinkedList<String> names = new LinkedList<>();
		names.push("tom");
		names.push("bob");
		names.push("pam");
		names.push("tim");
		
//		Iterator<String> it2 = names.iterator();
//		System.out.println(it2.next());
//		System.out.println(it2.next());
//		System.out.println(it2.hasNext());
		
//		names.add(2, "bar");
//		
//		for(String name : names)
//			System.out.printf("%s ",name);
//		System.out.println();
//		
//		System.out.println(names);
//		System.out.println(names.pop());
//		System.out.println(names.removeFirst());
//		System.out.println(names.remove());
//		System.out.println(names);
		
		
		System.out.println(names);
		ListIterator<String> it = names.listIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		it.add("job");
		System.out.println(names);
		
	}

}

