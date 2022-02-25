    package com.directmedia.onlinestore.core;
     
    import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
     
    public class Startup {
     
    	public static void main(String[] args) {
     
    		Artist artist1 = new Artist("Brad Pitt");
    		Artist artist2 = new Artist("Tom Hanks");
    		Artist artist3 = new Artist("Georges Clooney");
    		
    		Work film1 = new Work("Fight Club");
    		film1.setMainArtist(artist1);
    		film1.setRelease(1999);
    		
    		Work film2 = new Work("La ligne verte");
    		film2.setMainArtist(artist2);
    		film2.setRelease(1999);
    		
    		Work film3 = new Work("Ocean's Eleven");
    		film3.setMainArtist(artist3);
    		film3.setRelease(2001);
    		
    		Catalogue catalogue = new Catalogue();
    		
    		catalogue.listOfWorks.add(film1);		
    		catalogue.listOfWorks.add(film2);
    		catalogue.listOfWorks.add(film3);
    		
    		for (Work film : catalogue.listOfWorks) {
    			
    			System.out.println(film.toString());
    			
    		}
    	}
    }