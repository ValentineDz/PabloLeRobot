package src.fr.uga.miashs.pablo;

import lejos.hardware.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;



public class Main {

	public static void main(String[] args) {
		MoteurRoues m = new MoteurRoues("rapide");
		m.avancer(500000);
		System.out.println("hello");
	}
}
