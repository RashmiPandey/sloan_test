package geppetto.Sloan_test_1_10000.hnb.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;



import geppetto.Sloan_test_1_10000.hnb.domain.core.People_test;

import geppetto.Sloan_test_1_10000.hnb.dao.mysql.First_time_setupDao;

import geppetto.Sloan_test_1_10000.hnb.domain.core.GpUser;



/**
 * 
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p> 
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
@Service("First_time_setupService")
public class First_time_setupService extends GpBaseService  {


	First_time_setupDao First_time_setup_dao;


	public First_time_setupDao get_First_time_setup_dao() {
		return First_time_setup_dao;
	}


	@Resource(name="First_time_setupDao")
	public void set_First_time_setup_dao(First_time_setupDao First_time_setup_dao) {
		this.First_time_setup_dao = First_time_setup_dao;
	}





}