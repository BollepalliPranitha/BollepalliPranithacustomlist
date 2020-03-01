package com.epam.customlist;
import java.util.Arrays;

	public class DList<E> {
		    private int size = 0;
		     
		    //Default capacity of list is 10
		    private static final int DEFAULT_CAPACITY = 10;
		     
		    //This array will store all elements added to list
		    private Object elements[];
		 
		    //Default constructor
		    public DList() {
		        elements = new Object[DEFAULT_CAPACITY];
		    }
		 
		    //Add method
		    public void add(E e) {
		        if (size == elements.length) {
		            Capacity();
		        }
		        elements[size++] = e;
		    }
		     
		    //Get method
		  
		    public E get(int i) {
		        if (i >= size || i < 0) {
		            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		        }
		        return (E) elements[i];
		    }
		     
		    //Remove method
		 
		    public E remove(int i) {
		        if (i >= size || i < 0) {
		            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		        }
		        Object item = elements[i];
		        int numelts = elements.length - ( i + 1 ) ;
		        System.arraycopy( elements, i + 1, elements, i, numelts ) ;
		        size--;
		        return (E) item;
		    }
		     
		    //Get Size of list
		    public int size() {
		        return size;
		    }
		     
		    //Print method
		    @Override
		    public String toString() 
		    {
		         StringBuilder s = new StringBuilder();
		         s.append('[');
		         for(int i = 0; i < size ;i++) {
		             s.append(elements[i].toString());
		             if(i<size-1){
		                 s.append(",");
		             }
		         }
		         s.append(']');
		         return s.toString();
		    }
		     
		    private void Capacity() {
		        int newSize = elements.length * 2;
		        elements = Arrays.copyOf(elements, newSize);
		    }
		}



