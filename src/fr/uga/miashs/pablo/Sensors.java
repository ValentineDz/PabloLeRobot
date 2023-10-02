package src.fr.uga.miashs.pablo;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3TouchSensor;


public class Sensors {
	
	EV3ColorSensor capteurCouleur;
	EV3UltrasonicSensor capteurUltraSon;
	EV3TouchSensor capteurTouche;
	
	public Sensors() {
		this.capteurCouleur = new EV3ColorSensor(SensorPort.S4);
		this.capteurTouche = new EV3TouchSensor(SensorPort.S1);
		this.capteurUltraSon = new EV3UltrasonicSensor(SensorPort.S3);
	}
	
	
	
	
}
