module com.example.hotelhavana {
	requires javafx.controls;
	requires javafx.fxml;
	
	requires org.controlsfx.controls;
	requires MaterialFX;
	requires java.sql;
	
	opens com.example.hotelhavana to javafx.fxml;
	exports com.example.hotelhavana;
	exports com.example.hotelhavana.controller;
	opens com.example.hotelhavana.controller to javafx.fxml;
}