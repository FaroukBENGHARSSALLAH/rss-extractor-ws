package com.farouk.bengharssallah.rss.ws.rest.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.ABCRSSSessionBean;
import com.farouk.bengharssallah.rss.parser.abc.ABCNews;

@Stateless
@Path("/news")
public class NewsRest {
	
    @EJB
  private ABCRSSSessionBean abc; 
    
    
    @GET
	@Path("/top")
	@Produces(MediaType.APPLICATION_JSON)
    public List<ABCNews> getTopStrories(){
  	                           try {
									            return abc.getABCTopStories();
								            } 
  	                           catch (Exception e) {
									             e.printStackTrace();
								     }
  	                           return null;
  	           
             }
           
           
    @GET
	@Path("/sport")
	@Produces(MediaType.APPLICATION_JSON)
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
