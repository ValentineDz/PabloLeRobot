package src.fr.uga.miashs.pablo;


import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.chassis.*;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class MoteurRoues {
	
	private EV3LargeRegulatedMotor portRoue1;
	private EV3LargeRegulatedMotor portRoue2;
	private Wheel roue1;
	private Wheel roue2;
	private Chassis chassis;
	private MovePilot pilot;
	
	
	public MoteurRoues(String vitesse) {
		this.portRoue1 = new EV3LargeRegulatedMotor(MotorPort.A); //à définir sur notre robot
		this.portRoue2 = new EV3LargeRegulatedMotor(MotorPort.B); //idem
		this.roue1 = WheeledChassis.modelWheel(portRoue1, 0).offset(0); //obtenir le diametres des roues / la distance au moteur des roues
		this.roue2 = WheeledChassis.modelWheel(portRoue2, 0).offset(0);
		this.chassis = new WheeledChassis(new Wheel[] {roue1,roue2}, WheeledChassis.TYPE_DIFFERENTIAL); // type différential car elle ont 2 roues
		this.pilot = new MovePilot(chassis);
		setVitesse(vitesse);
	}
	
	public void setVitesse(String v) {
		// réaliser une fonction qui met une vitesse en fonction du nom qu'on donne : très rapide, rapide, moyen, lent
	}
	
	
	
}
