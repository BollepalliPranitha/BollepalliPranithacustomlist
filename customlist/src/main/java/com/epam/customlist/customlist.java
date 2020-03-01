package com.epam.customlist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class customlist {
	 private static final Logger LOGGER=LogManager.getLogger(customlist.class);
	public static void main(String args[]){
	DList<Integer>  list = new DList<>();
	 
    //Add elements
   list.add(10);
   list.add(25);
   list.add(50);
    
    LOGGER.info(list);
     
    //Remove elements from index
    list.remove(2);
    LOGGER.info(list);
    list.add(60);
    //list after adding an element
    LOGGER.info(list);
    //Get element with index
    LOGGER.info( list.get(0) );
    LOGGER.info( list.get(2) );

    //List Size
    LOGGER.info(list.size());
}}
