/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author VRPatrick
 */
public class Formulario extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //componentes de la ecena
        Label labell = new Label("Nombre :");
        TextField texField = new TextField();
        Label labell2 = new Label("Correo :");
        TextField texField2 = new TextField();
        Label labell3 = new Label("Comentarios :");
        TextField texField3 = new TextField();
        
        //contenedor de la ecena
        GridPane grid = new GridPane();
        
        //declaracion de un boton de enviar
        Button btn = new Button();
        
        //declaracion de boton de limpiar
        Button btnClean = new Button();
        
        //texto del boton de enviar
        btn.setText("Eviar Comentario");
        
        //texto de boton Limpiar
        btnClean.setText("Limpiar");
        
        //accion de boton de enviar
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                //mensaje para mostrar que se envio el mensaje
                Label mensaje = new Label("Mensaje enviado!");
                grid.add(mensaje, 17, 27);
                
                //imprimir mensaje en consola
                System.out.println("Hello World!");
            }
        });
        
        //Accion de boton de limpiar textfield
        btnClean.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            
           //Limpiar los text Field
                texField.clear();
                texField2.clear();
                texField3.clear();
                
        });;
        
        //validar si los textfield contienen textos
        if(texField.getText().isEmpty())
        {
            System.out.println("No hay texto");
            btn.setDisable(false);
        }
        else
        {
            System.out.println("Si hay texto");
            btn.setDisable(true);
        }
        
        //root.getChildren().add(btn);
        
        //asignacion de posicion de los compnentes 
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(2);
        grid.setVgap(2);
        grid.add(labell, 15,8);
        grid.add(texField, 17, 8);
        grid.add(labell2, 15,16 );
        grid.add(texField2, 17, 16);
        grid.add(labell3, 15,25 );
        grid.add(texField3, 17, 25);
        grid.add(btn, 17, 40);
        grid.add(btnClean,18, 40);
        
        
       //creacion de la ecena y agregacion de los componentes a ecena
        Scene scene = new Scene(grid, 400, 350);
        //titulo del cuandro de la ecena
        primaryStage.setTitle("Esto es un cuadro!");
        //mandando la ecena
        primaryStage.setScene(scene);
        
        //mostrar la ecena en pantalla
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
