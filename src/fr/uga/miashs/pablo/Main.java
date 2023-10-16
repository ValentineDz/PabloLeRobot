package src.fr.uga.miashs.pablo;

import lejos.hardware.*;
import lejos.utility.Delay;
import lejos.hardware.port.SensorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;



public class Main {
	
	public enum Etat {
		Debut,
		RecherchePalet,
		RamenerPalet,
		PrendrePalet,
		Fin,
		Pause
	}
	
	public static void main(String[] args) {
		UltraSonicSensor ultrasonic = new UltraSonicSensor(SensorPort.S3);
		ColorSensor color = new ColorSensor(SensorPort.S1);
		TouchSensor touch = new TouchSensor(SensorPort.S2);
		MoteurPinces pinces = new MoteurPinces();
		MoteurRoues roues = new MoteurRoues("rapide");
		Etat etat = Etat.Debut;

		while(true) {
			Button.ENTER.waitForPressAndRelease();
			switch(etat) {
			case Debut:
				
			case RecherchePalet:
				
			case RamenerPalet:
				
			case PrendrePalet:
				
			case Pause:
				
			case Fin:
			}
			
	
		}
	}
	
	
	public void getPremierPalet() {
		
	}

}
