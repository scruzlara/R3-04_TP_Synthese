
package com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese;

import com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol.MyImage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * A modifier
 *
 */
public class PanneauImages extends GridPane {

	public PanneauImages(){
		super();
		this.setPadding(new Insets(15));
		this.setHgap(25);
		this.setAlignment(Pos.CENTER);
		Image mim= new Image("/fond_creme.png",true);
		Image ing= new Image("/ing_fromage.png",true);
		for(int i=0 ; i<4 ; i++){//Affiche 4 fois la meme pizza de base dans le JPanel courant
			com.example.qualite_devpt_javafx.tp7_synthese_pizzas.tp7_synthese_sol.MyImage myIm= new MyImage("/fond_creme.png", null);
			//myIm.superposer("/ing_fromage.png"); //Permet de superposer un ingrédient
			this.add(myIm.getSp(),i,1);
			Rectangle rect= new Rectangle(200,200, Color.rgb(255,255,255,0.2)); // création d'un rectangle entourant l'image
			rect.setStroke(Color.BLACK);
			myIm.getSp().getChildren().add(rect);
		}
	}
}
