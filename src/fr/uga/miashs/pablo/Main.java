package fr.uga.miashs.pablo;

import java.util.Timer;

import lejos.hardware.*;
import lejos.utility.Delay;
import lejos.hardware.port.SensorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;

public class Main {

	while(true) {
			Button.ENTER.waitForPressAndRelease();
			switch(etat) {
			case Debut :
				MoteurRoues;
				MoteurRoues.avancer(556);
				MoteurRoues.setVitesse("lent");
				MoteurRoues.avancer(51);
				while(TouchSensor.isPressed()) {
					MoteurRoues.avancer(500);
				}
				MoteurPinces.fermeture();
				MoteurRoues.tourner(80.5);
				MoteurRoues.setVitesse(moyen);
				MoteurRoues.avancer(300);
				MoteurRoues.tourner(-80.5);
				MoteurRoues.setVitesse(rapide);
				while () { //tant que il n'a pas dépassé la ligne blanche
					MoteurRoues.avancer();
				}
				MoteurRoues.avancer(150);
				MoteurPinces.ouverture();
				while() { // recule jusqu'a qu'il capte ligne blanche
					MoteursRoues.reculer();
				}
				MoteurRoues.tourner(161);
				
			case RecherchePalet:
				 // tourne sur lui même pour chercher un palet, quand détecte passe à l'état d'après
			case RamenerPalet:
				// trouve quelle bande blanche il veut dépasser (besoin de savoir sa position)
                // lacher le pallet , reculer et se tourner vers le mur le plus loin, avance jusq'uà dépasser la ligne blanche
			case PrendrePalet:
				// tourne de l'angle, avance vers le palet de d, s'arrête quand touch true & ferme pince
			case Pause:
				
			case Fin:
			}
			
			
	
=======
	/*
	 * public enum Etat { Debut, RecherchePalet, RamenerPalet, PrendrePalet, Fin,
	 * Pause }
	 */
	public static void main(String[] args) {
		UltraSonicSensor ultrasonic = new UltraSonicSensor(SensorPort.S2);
		ColorSensor color = new ColorSensor(SensorPort.S4);
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		MoteurPinces pinces = new MoteurPinces();
		MoteurRoues roues = new MoteurRoues("best");
		Timer t = new Timer();
		Button.ENTER.waitForPress();
		roues.tourner(322);
		/*
		 * while(true) { Button.ENTER.waitForPressAndRelease(); switch(etat) { case
		 * Debut:
		 * 
		 * case RecherchePalet:
		 * 
		 * case RamenerPalet:
		 * 
		 * case PrendrePalet:
		 * 
		 * case Pause:
		 * 
		 * case Fin: }
		 * 
		 */
	}


	public float[] tourSurSoitM(MoteurRoues r, UltraSonicSensor s) {
		r.tourner(0); //tour sur soit même 
		float tab [] = new float [50];
		for (int i= 0 ; i < tab.length ; i++) { 
			tab[i] = s.distance(); 
			Delay.msDelay(10);
		}
		return tab;
	}



	public void run(){
		while(true) {
			Button.ENTER.waitForPressAndRelease();
			switch(etat) {
			case Debut :
				MoteurRoues.setVitesse("rapide");
				MoteurRoues.avancer(556);
				MoteurRoues.setVitesse("lent");
				MoteurRoues.avancer(51);
				while(TouchSensor.isPressed()) {
					MoteurRoues.avancer(500);
				}
				MoteurPinces.fermeture();
				MoteurRoues.tourner(80.5);
				MoteurRoues.setVitesse(moyen);
				MoteurRoues.avancer(300);
				MoteurRoues.tourner(-80.5);
				MoteurRoues.setVitesse(rapide);
				while () { //tant que il n'a pas dépassé la ligne blanche
					MoteurRoues.avancer();
				}
				MoteurRoues.avancer(150);
				MoteurPinces.ouverture();
				while() { // recule jusqu'a qu'il capte ligne blanche
					MoteursRoues.reculer();
				}
				MoteurRoues.tourner(161);
		}
	
	

