package mihaela.ia;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.TransformerException;

import rocket.math.RocketMathTemp;

public class LocalityManagement {

	public static void main(String[] args) throws TransformerException  {
		 
		RocketMathTemp temp= new RocketMathTemp();
	
		Localities l = Localities.getInstance();
		l.initializeLocalitiesAndRegisterObservers();
	    l.showTheLocalities();
        EventAlert eventAlert=new EventAlert();
        eventAlert.AlertEveryone(l);
       
	/*	Session st1 = new Session();
		System.out.println("Distance between two localities: " + st1.computeDistanceOfTwoLocalities(l.getLocalities().get(1), l.getLocalities().get(2)));// acordat cu google e 685 vs rezultat 688//greseli
		System.out.println("Angle " + st1.computeAngleBetweenTwoLocalities(l.getLocalities().get(1), l.getLocalities().get(2)));//118 google
		 ReactorFactory reactorFactory= new ReactorFactory();
		Reactor thisReactor= reactorFactory.getReactor("Nuclear");
        RocketBody rb = new RocketBody(2, 5);

        Rocket rocket= new Builder()
        		  .setName("racheta1")
        		  .setReactor( thisReactor)
        		  .setRocketBody(rb)
        		  .build();
      */
       
	}
	
	}

