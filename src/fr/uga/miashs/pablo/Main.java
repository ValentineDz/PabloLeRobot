package src.fr.uga.miashs.pablo;

import lejos.hardware.*;
import lejos.utility.Delay;
import lejos.hardware.port.SensorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;



public class Main {

	public static void main(String[] args) {
		UltraSonicSensor s = new UltraSonicSensor(SensorPort.S3);
		float caca = s.distance();
		System.out.println(caca);
	}
}
