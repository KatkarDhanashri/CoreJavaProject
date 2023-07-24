package com.Load.Spring.LoadService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Load.Spring.LoadBean.Load;
import com.Load.Spring.LoadRepository.LRepository;

@Service
public class LService {
	
@Autowired
private LRepository loadrepo;

public List<Load> getAllLoad() {
	List<Load>loads=new ArrayList<>();
	loadrepo.findAll().forEach(loads::add);
	return loads;
}

public void addLoad(Load load) {
	loadrepo.save(load);
}

public void updateLoad(String loadId, Load load) {
	loadrepo.save(load);
	
}

public void DeleteLoad(String loadId) {
	loadrepo.deleteById(loadId);
	
}
}
