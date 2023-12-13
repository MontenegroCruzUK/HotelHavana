package com.example.hotelhavana.controller;

import com.example.hotelhavana.ResourcesLoader;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.font.MFXFontIcon;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard_Controller implements Initializable {
	@FXML
	private AnchorPane rootPane;
	@FXML
	private MFXButton btn_Reservar;
	@FXML
	private MFXFontIcon closeIcon;
	@FXML
	private HBox hB_Header;
	@FXML
	private MFXFontIcon minimizeIcon;
	
	@Override
	public void initialize (URL location, ResourceBundle resources) {
		actionButtonHeader ();
	}
	
	private void actionButtonHeader () {
		closeIcon.addEventHandler (javafx.scene.input.MouseEvent.MOUSE_CLICKED, event -> Platform.exit ());
		minimizeIcon.addEventHandler (MouseEvent.MOUSE_CLICKED,
			event -> ((Stage) rootPane.getScene ().getWindow ()).setIconified (true));
	}
	
	@FXML
	private void Ir_Reserva (ActionEvent event) {
		
		/*try {
			Stage stage = new Stage ();
			FXMLLoader loader = new FXMLLoader (ResourcesLoader.loadURL ("view/Dashboard_view.fxml"));
			loader.setControllerFactory (c -> new Dashboard_Controller (stage));
			Parent root = loader.load ();
			Dashboard_Controller controller = loader.getController ();
			Scene scene = new Scene (root);
			scene.setFill (Color.TRANSPARENT);
			stage.initStyle (StageStyle.TRANSPARENT);
			stage.setScene (scene);
			stage.show ();
			
			stage.setOnCloseRequest (e -> controller.closeWindows ());
			Stage myStage = (Stage) this.btn_Login.getScene ().getWindow ();
			myStage.close ();
		} catch (IOException e) {
			System.out.println ("Error en la ventana");
		}*/
		
	}
}