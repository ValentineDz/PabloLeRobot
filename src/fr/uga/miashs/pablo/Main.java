package src.fr.uga.miashs.pablo;

import lejos.hardware.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;



public class Main {

	public static void main(String[] args) {
		MoteurPinces p = new MoteurPinces();
		p.ouverture(false);
		//p.fermeture(false);
		System.out.println("hello");
	}
}
