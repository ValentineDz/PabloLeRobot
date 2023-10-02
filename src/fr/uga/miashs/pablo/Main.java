package src.fr.uga.miashs.pablo;

import lejos.hardware.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;



public class Main {

	public static void main(String[] args) {
	/*	MoteurRoues M = new MoteurRoues("rapide");
		M.avancer(200);
		System.out.println("fin");
		Delay.nsDelay(5000); */
		
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S4);
		color.setFloodlight(true);
		// cc
		
	}
}
