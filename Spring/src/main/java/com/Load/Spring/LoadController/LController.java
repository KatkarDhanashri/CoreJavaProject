package com.Load.Spring.LoadController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Load.Spring.LoadBean.Load;
import com.Load.Spring.LoadService.LService;
@RestController
public class LController {
		@Autowired
		private LService loadservice;
		
		@RequestMapping(value="")
		public List<Load>getAllLoad(){
			return loadservice.getAllLoad();
		}
		
		@RequestMapping(produces = "application/json",method=RequestMethod.POST,value="/loads")
		public void addLoad(@RequestBody Load load) {
		 loadservice.addLoad(load);
		}
		
		@RequestMapping(produces = "application/json",method=RequestMethod.PUT,value="/loads/{loadId}")
		public void updateLoad(@PathVariable String loadId,@RequestBody Load load) {
			loadservice.updateLoad(loadId,load);
		}
		
		@RequestMapping(produces = "application/json",method=RequestMethod.DELETE,value="/loads/{loadId}")
		public void DeleteLoad(@PathVariable String loadId) {
		 loadservice.DeleteLoad(loadId);
		}
		
}
