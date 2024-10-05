package com.JPAMapping;

import com.JPAMapping.ManyToMany.dao.CategoryRepo;
import com.JPAMapping.ManyToMany.dao.ProductRepo;
import com.JPAMapping.ManyToMany.entity.Category;
import com.JPAMapping.ManyToMany.entity.Product;
import com.JPAMapping.OneToMany.dao.EmployeeRepo;
import com.JPAMapping.OneToMany.entity.Address;
import com.JPAMapping.OneToMany.entity.Employee;
import com.JPAMapping.OneToOne.dao.StrudentRepo;
import com.JPAMapping.OneToOne.entity.Laptop;
import com.JPAMapping.OneToOne.entity.Student;
import com.JPAMapping.OneToOne.service.JPAService;
import org.apache.el.parser.JJTELParserState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner {
	/*@Autowired
	private StrudentRepo strudentRepo;*/

/*	@Autowired
	private EmployeeRepo employeeRepo;*/

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}
    @Override
	public void run(String... args) throws Exception{

/*
//ONE TO ONE

Student student=new Student();
	student.setStudentID(1312L);
	student.setStudentName("Vinay12");
	student.setAbout("I am a Businessman12");


	Laptop laptop=new Laptop();
	laptop.setLaptopID(12345L);
	laptop.setModelNumber("45678");
	laptop.setBrand("Dell12");
	//laptop.setStudent(student);
	student.setLaptop(laptop);
		strudentRepo.save(student);*/
		//Student student1=strudentRepo.findById(13L).get();
		//System.out.println(student1.toString());

		//One To Many
		/*Employee emp=new Employee();
		emp.setEmpName("Vishal");
		emp.setEmpID(1L);

		Address add=new Address();
		add.setAddressID(123L);
		add.setCity("Jogbani");
		add.setState("Bihar");
		add.setEmployee(emp);

		Address add1=new Address();
		add1.setAddressID(3123L);
		add1.setCity("Bangalore");
		add1.setState("Karnataka");
		add1.setEmployee(emp);

		List<Address> li=new ArrayList<>();
		li.add(add);
		li.add(add1);

		emp.setAddresses(li);
		employeeRepo.save(emp);

		 */

		//Many To Many
		/*
		Category c1=new Category();
		c1.setCID("c1");
		c1.setCName("Electronics");

		Category c2=new Category();
		c2.setCID("c2");
		c2.setCName("Mobile");

		Product p1=new Product();
		p1.setPID("p1");
		p1.setPName("Apple");

		Product p2=new Product();
		p2.setPID("p2");
		p2.setPName("Android");

		Product p3=new Product();
		p3.setPID("p3");
		p3.setPName("Windows");

		List<Product> cat1Prod=c1.getProducts();
		cat1Prod.add(p1);
		cat1Prod.add(p2);
		cat1Prod.add(p3);

		List<Product> cat2Prod=c2.getProducts();
		cat2Prod.add(p1);
		cat2Prod.add(p2);

		c1.setProducts(cat1Prod);
		c2.setProducts(cat2Prod);

		categoryRepo.save(c1);
		categoryRepo.save(c2);
		*/

		List<Category> c=categoryRepo.getAllCategory();
		c.stream().forEach(a-> System.out.println(a.toString()));


}
}
