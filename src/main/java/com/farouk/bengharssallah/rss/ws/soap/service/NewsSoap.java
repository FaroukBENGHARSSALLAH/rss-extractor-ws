package com.farouk.bengharssallah.rss.ws.soap.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.ABCRSSSessionBean;
import com.farouk.bengharssallah.rss.parser.abc.ABCNews;

@Stateless
@WebService
public class NewsSoap {
	
	      @EJB
	    private ABCRSSSessionBean abc; 
	      
	      
	          @WebMethod(operationName = "top")
	      public List<ABCNews> getTopStrories(){
	    	                           try {
										            return abc.getABCTopStories();
									            } 
	    	                           catch (Exception e) {
										             e.printStackTrace();
									     }
	    	                           return null;
	    	           
	               }
	             
	             
	          @WebMethod(operationName = "sport")
	   	 public List<ABCNews> getSportNews(){
	   	    	                           try {
	   										            return abc.getABCSportNews();
	   									            } 
	   	    	                           catch (Exception e) {
	   										             e.printStackTrace();
	   									     }
	   	    	                           return null;
	   	    	           
	   	            }

}