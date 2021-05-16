import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  
public class App extends Application { 
@Override 
public void start(Stage stage) {      
   //creating label email 
   Text text1 = new Text("Number");       
   Text text2 = new Text("Answer");
    //Creating Text Filed for email        
   TextField textFieldQues = new TextField();       
   TextField textFieldAns = new TextField(); 
   textFieldAns.setEditable((false));
   
    
   //Creating Buttons 
   Button btnCalculate = new Button("Calculate"); 
   Button btnClear = new Button("Clear"); 
   
   //Creating a Grid Pane 
   GridPane gridPane = new GridPane();    
   
   //Setting size for the pane 
   gridPane.setMinSize(400, 200); 
   
   //Setting the padding  
   gridPane.setPadding(new Insets(10, 10, 10, 10)); 
   
   //Setting the vertical and horizontal gaps between the columns 
   gridPane.setVgap(5); 
   gridPane.setHgap(5);       
   
   //Setting the Grid alignment 
   gridPane.setAlignment(Pos.CENTER); 
    
   //Arranging all the nodes in the grid 
   gridPane.add(text1, 0, 0); 
   gridPane.add(text2, 0, 1); 
   gridPane.add(textFieldQues, 1, 0); 
   gridPane.add(textFieldAns, 1, 1); 
   gridPane.add(btnCalculate, 1, 3); 
   gridPane.add(btnClear, 2, 3); 
    
   //Styling nodes  
   btnCalculate.setStyle("-fx-background-color: darkcyan ; -fx-text-fill: white;"); 
   btnClear.setStyle("-fx-background-color: darkcyan; -fx-text-fill: white;"); 
    
   text1.setStyle("-fx-font: normal bold 20px 'Courier New';"); 
   text1.setFill(Color.DARKCYAN);
   text2.setFill(Color.DARKCYAN);
   text2.setStyle("-fx-font: normal bold 20px 'Courier New'; "); 
   gridPane.setStyle("-fx-background-color: Lightblue;"); 

 
   // set the event handler when the button is clicked
   btnCalculate.setOnAction(new EventHandler<ActionEvent>() 
   {
      @Override
      public void handle(ActionEvent e)
      {
           Integer number = Integer.valueOf(textFieldQues.getText());
           textFieldAns.setText(String.valueOf(number));
      }
   }
   
   
   );

   //Creating a scene object 
   Scene scene = new Scene(gridPane); 
    
   //Setting title to the Stage 
   stage.setTitle("FIBONACII"); 
      
   //Adding scene to the stage 
   stage.setScene(scene);
   
   //Displaying the contents of the stage 
   stage.show(); 
}      
public static void main(String args[]){ 
   launch(args); 
} 
}
