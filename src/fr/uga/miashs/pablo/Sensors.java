package src.fr.uga.miashs.pablo;

import java.util.HashMap;


import lejos.robotics.SampleProvider;
import lejos.robotics.filter.MeanFilter;
import lejos.hardware.port.SensorPort;
import lejos.robotics.Color;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.Button;
import lejos.hardware.port.Port;

public class Sensors extends EV3TouchSensor{


	//attributs UltrasonicSensor
	EV3UltrasonicSensor vue;
	private static SampleProvider sample, sampleEcoute;
	private static float[] tabSp, tabEcoute;
	private float [] derniereDonnees;
	private static final  String[] tabStringCouleur = {"rouge", "vert", "bleu", "jaune", "noir", "blanc", "gris"};



	private EV3TouchSensor touche;

	public Sensors() {
		this.couleur = new EV3ColorSensor(SensorPort.S4);

		average = new MeanFilter(couleur.getRGBMode(), 1);
		couleur.setFloodlight(true);

		hmap = new HashMap<String, float[]>();

		hmap.put("rouge", new float[]{1,1,1});
		hmap.put("bleu", new float[]{});
		hmap.put("vert", new float[]{});
		hmap.put("noir", new float[]{});
		hmap.put("jaune", new float[]{});
		hmap.put("blanc", new float[]{});
		hmap.put("gris", new float[]{});



		this.touche = new EV3TouchSensor(SensorPort.S3);

		this.vue = new EV3UltrasonicSensor(SensorPort.S2);
		sample = vue.getDistanceMode();
		vue.enable();



	}


	//Sensor couleur

	private static float[] path_color;
    private static EV3ColorSensor colorSensor;
    private final static double ERROR = 0.01;

    public void ColorSensor()
    {
    	average = new MeanFilter(colorSensor.getRGBMode(), 1);
		colorSensor.setFloodlight(Color.WHITE);
		System.out.println("Press enter to calibrate path color...");
		Button.ENTER.waitForPressAndRelease();
		path_color = new float[average.sampleSize()];
		average.fetchSample(path_color, 0);
    }

    public boolean onPath()
    {
    	float[] sample = new float[average.sampleSize()];
		average.fetchSample(sample, 0);
		
		double scalaire = scalaire(sample, path_color);
		System.out.println(scalaire < ERROR);
		//Button.ENTER.waitForPressAndRelease();
		
		return scalaire(sample, path_color) < ERROR;
    	
    }
    
    public static double scalaire(float[] v1, float[] v2) {
		return Math.sqrt (Math.pow(v1[0] - v2[0], 2.0) +
				Math.pow(v1[1] - v2[1], 2.0) +
				Math.pow(v1[2] - v2[2], 2.0));
	}


	//Sensor touche

	/**
	 * module qui revoie un boolean pour savoir si touche est pressé ou non
	 * @param sp ([] float), tableau d'un échantillon
	 * @param touche
	 * module l'utilisant : estPresseContinu()
	 * @return boolean true : false
	 */
    public boolean isPressed()
    {
        float[] sample = new float[1];
        fetchSample(sample, 0);

        return sample[0] != 0;
    }



	/**
	 * return true quand le capteur touche est pressé
	 * module utilisé : estPresse()
	 * module l'utilisant : ...
	 * @return boolean true : false
	 */

	public boolean isPressedContinue() {
		while(this.isPressed() != true) {
			if (this.isPressed()) {
				return true;
			}
		}
		return false;
	}


	//Sensor vue

	public float distance() {
		sample = vue.getDistanceMode();
		tabSp = new float[sample.sampleSize()];
		sample.fetchSample(tabSp, 0);
		return tabSp[0]*100;
	}




}
