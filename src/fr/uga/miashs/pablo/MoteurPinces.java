package src.fr.uga.miashs.pablo;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class MoteurPinces extends EV3LargeRegulatedMotor {
	// classe concernant le moteur des pinces
	private EV3LargeRegulateMotor pinces;
	private EV3LargeRegulatedMotor portPinces;
	
	public MoteurPinces () {
	this.portPinces = EV3LargeRegulatedMotor(MotorPort.C); // pas sur du port
	}
	
	public MoteurPinces (Port pincesPort) {
		pinces = new MindsensorsGlideWheelMRegulatedMotor(portPinces);
		pinces.setSpeed((int) pinces.getMaxSpeed());} // pour aller viiiiteee
	
	public void initialisation (int i) { // initialiser l'ouverture des pinces à chaque fois qu'il s'allume
		pinces.rotate (i, false)}
		
	public void fermeture (boolean t) // angle de femrture pour que ça bloque pas sur le pallet
		pinces.rotate (//angle d'ouverture jsp combien c'est, t)
	
	public void oiverture (boolean t) // angle d'oiverture pour pas que ça bloque sur le pallet
		pinces.rotate (//angle de fermeture jsp combien c'est, t)