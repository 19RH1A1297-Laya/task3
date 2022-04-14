package com.motivity;

import com.motivity.configs.AppConfig;
import com.motivity.entities.ITcompany;
import com.motivity.services.ItService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class MainMethod {

    public static void main(String[] args) throws InterruptedException, SQLException {
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ItService itService = context.getBean(ItService.class);

        // Add Employee
        //itService.add(new ITcompany(100,"MMV", "Ram", "ramnagar","springboot"));

        //context.close();
        int a,b,c,d,e,f,k;
        char r;
        String s,v,w,x,y;
        Scanner i =new Scanner(System.in);
        System.out.println("Enter the options");
        System.out.println("1.Insert 2.Delete 3.Upadate 4.select 5.exit");
        int p=i.nextInt();
        switch(p) {
        case 1:System.out.println("Enter employeeid");
        a=i.nextInt();
        System.out.println("Enter companyname");
        s=i.next();
        System.out.println("Enter ceo");
        v=i.next();
        System.out.println("Enter branches");
        w=i.next();
        System.out.println("Enter project");
        x=i.next();
        ITcompany ob=new ITcompany(a,s,v,w,x);
        itService.add(ob);
        break;
        
        case 2:
        	System.out.println("enter the id which you want to delete");
        	a=i.nextInt();
        	 ITcompany ob2=new ITcompany(a);
        	 ob2.setEmployeeid(a);
        	 itService.delete(ob2);
        break;
        case 3:
        	System.out.println("enter the id which you want to update");
        	b=i.nextInt();
        	System.out.println("Enter the companyname to be updated");
        	v=i.next();
        	System.out.println("Enter the ceo to be updated");
        	s=i.next();
        	System.out.println("Enter the branches to be updated");
        	x=i.next();
        	System.out.println("Enter the project to be updated");
        	y=i.next();
        	ITcompany ob4=new ITcompany(b,v,s,x,y);
        	itService.update(ob4);
        	break;
        	/*a=i.nextInt();
        	System.out.println("enter the value which you want to update 1.companyname 2.ceo 3.branches 4.project");
        	f=i.nextInt();
        	switch(f) {
        	
        	case 1:
        	ITcompany ob3=new ITcompany(a);
       	    ob3.setEmployeeid(f);
       	    itService.update(ob3);
       	    }*/
        case 4:System.out.println("Retriving mobile details");
		List<ITcompany> it=itService.selection();
		for(ITcompany k1:it) {
			System.out.println(k1.getEmployeeid()+"    "+k1.getCompanyname()+"     "+k1.getCeo()+"     "+k1.getBranches()+"      "+k1.getProject());
		}
		break;
        case 5:java.lang.System.exit(0);	
        	
        	
        	
        
        }
        while(true);
        //i.close();
        //context.close();
        
    }
}

