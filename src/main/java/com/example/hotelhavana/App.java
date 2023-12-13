package com.example.hotelhavana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {
	@Override
	public void start (Stage stage)  {
		
		try {
			FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource ("view/Dashboard_View.fxml"));
			stage.initStyle (StageStyle.UNDECORATED);
			Scene scene = new Scene (fxmlLoader.load ());
			stage.setScene (scene);
			stage.show ();
		}catch (IOException e) {
			System.out.println ("Error en la ventana");
		}
		
	}
	
	public static void main (String[] args) {
		launch ();
	}
}