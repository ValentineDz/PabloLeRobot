package src.fr.uga.miashs.pablo;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class MoteurPinces {
	private EV3MediumRegulatedMotor pinces;
	private boolean estOuvert;

	public MoteurPinces() {
		pinces = new EV3MediumRegulatedMotor(MotorPort.A);
		pinces.setSpeed(pinces.getMaxSpeed());
		estOuvert = true;
	}

	/**
	 * Ouvre ou ferme la pince pour un cas extrême
	 * @param i, si i<0 rapproche les pinces, si i>0 éloigne les pinces
	 */
	public void initialisation (int i) { 
		pinces.rotate (i, false);
	}
	/**
	 * Ferme la pince
	 * @param t si false, il fait seulement l'action, sinon il fait autre chose en parallèle
	 * Change estOuvert
	 * méthodes l'utilisant :
	 */


	public void fermeture(boolean t) { 
		pinces.rotate(-700, false);
		estOuvert = false;

	}
	/**
	 * Ouvre la pince
	 * @param t si false, il fait seulement l'action, sinon il fait autre chose en parallèle
	 * Change estOuvert
	 * méthodes l'utilisant :
	 */

	public void ouverture (boolean t) {
		pinces.rotate(700, false);
		estOuvert = true;
	}
}