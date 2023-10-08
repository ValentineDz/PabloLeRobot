package src.fr.uga.miashs.pablo;

import java.util.HashMap;


import lejos.robotics.SampleProvider;
import lejos.robotics.filter.MeanFilter;
import lejos.hardware.port.SensorPort;
import lejos.robotics.Color;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3TouchSensor;


public class Sensors {
	
	private EV3ColorSensor couleur;
	
	
	//attributs UltrasonicSensor
	EV3UltrasonicSensor vue;
	private static SampleProvider sample, sampleEcoute;
	
	
	
	private EV3TouchSensor touche;
	
	public Sensors() {
		this.couleur = new EV3ColorSensor(SensorPort.S2);
		
	
		
		
		
		this.touche = new EV3TouchSensor(SensorPort.S1);
		
		this.vue = new EV3UltrasonicSensor(SensorPort.S4);
	
	}
	
	
	//Sensor couleur
	
	//Sensor touche
	
	/**
	 * module qui revoie un boolean pour savoir si touche est pressé ou non
	 * @param sp ([] float), tableau d'un échantillon
	 * @param touche
	 * module l'utilisant : estPresseContinu()
	 * @return boolean true : false
	 */
	public boolean estPresse() {
		SampleProvider sp_touche = touche.getTouchMode();
		float [] samp = new float[1];
		sp_touche.fetchSample(samp, 0);
		return samp[0] == 1f;
	}
	
	
	/**
	 * return true quand le capteur touche est pressé
	 * module utilisé : estPresse()
	 * module l'utilisant : ...
	 * @return boolean true : false
	 */
	
	public boolean estPresseContinu() {
		while(this.estPresse() != true) {
			if (this.estPresse()) {
				return true;
			}
		}
		return false;
	}
	
	
	//Sensor vue
	
	
	
	
}
