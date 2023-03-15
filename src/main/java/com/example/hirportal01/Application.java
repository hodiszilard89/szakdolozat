package com.example.hirportal01;


//import com.example.hirportal01.database.DB;
//import com.example.hirportal01.database.DB;
import com.example.hirportal01.entity.Law;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		new Law();
 		//DB database = new DB();
		System.out.println();
	}

}
