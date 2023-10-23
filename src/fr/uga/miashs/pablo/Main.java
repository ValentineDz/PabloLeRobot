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
				
				 //rapide pdt 55cm
                // palet vers 60cm 
                //avance lent de 5cm
                // avancer jusqu'à que sensortouch(true) 
                //stop
                // fermer pinces 
                //tourner 90degres
                // avancer de moitié d'une case(30cm)
                // tourner 90 degres 
                // avancer jusqu'à ligne blanche
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
			
	
		}
	}
	
	
	public void getPremierPalet() {
		
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


	}
