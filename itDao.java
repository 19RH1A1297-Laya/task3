package com.motivity.dao;
import java.util.List;

//import com.pt.entities.Employee;
import org.springframework.stereotype.Repository;

import com.motivity.entities.ITcompany;

@Repository
public interface ItDao {
	  abstract void add(ITcompany itcompany);
	  abstract void delete(ITcompany itcompany);
	  abstract void update(ITcompany itcompany);
	  List<ITcompany> selection();
}
