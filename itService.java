package com.motivity.services;
import java.util.List;

import com.motivity.entities.ITcompany;

public interface ItService {
	  abstract void add(ITcompany itcompany);
	  abstract void delete(ITcompany itcompany);
	  abstract void update(ITcompany itcompany);
	  List<ITcompany> selection();


}
