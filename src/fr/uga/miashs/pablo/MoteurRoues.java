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
		this.portRoue1 = new EV3LargeRegulatedMotor(MotorPort.C); //port roue droite
		this.portRoue2 = new EV3LargeRegulatedMotor(MotorPort.D); //port roue gauche
		this.roue1 = WheeledChassis.modelWheel(portRoue1, 56).offset(-70); //obtenir le diametres des roues / la distance au moteur des roues
		this.roue2 = WheeledChassis.modelWheel(portRoue2, 56).offset(70);				
		this.chassis = new WheeledChassis(new Wheel[] {roue1,roue2}, WheeledChassis.TYPE_DIFFERENTIAL); // type différential car elle ont 2 roues
		this.pilot = new MovePilot(chassis);
	//	setVitesse(vitesse);
	}
	
	public void setVitesse(String v) {
		if (v.equals("rapide")) {
			pilot.setLinearAcceleration(300);
			pilot.setAngularAcceleration(2000);
			pilot.setAngularSpeed(1000);
		} else if (v.equals("moyen")) {
			pilot.setLinearAcceleration(150);
			pilot.setAngularAcceleration(1000);
		} else if (v.equals("lent")) {
			pilot.setLinearAcceleration(75);
			pilot.setAngularAcceleration(150);
		} else if (v.equals("best")) {
			pilot.setLinearAcceleration(120);
			pilot.setAngularAcceleration(400);
			pilot.setAngularSpeed(280);
		}
	}
	
	public void avancer(double distance) {
		pilot.travel(distance,false);
	}
	
	public void reculer(double distance) {
		pilot.travel(distance);
	}
	
	
	
}
