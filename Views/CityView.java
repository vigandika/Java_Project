
import com.sun.javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class CityView extends Application
{
   
  public void start(Stage stage)
    {
	 
        List<String> cities= new ArrayList<>();
        	
        cities.add("Prishtina");      

        ComboBox<String> cboCity = new ComboBox<String>();
        cboCity.setMaxWidth(Double.MAX_VALUE);
       
        HBox hBoxRemoveCity = new HBox();
        
        HBox hBoxAddCity = new HBox();
        
        Button btnRemoveCity = new Button("Fshij qytetin");
        
        VBox MainVBox = new VBox(30);
        
        TextField tfAddCity = new TextField();
        
        
        Button btnAddCity = new Button("Shto qytetin");
       
        
        
        //mock table kur krijohet lidhet me databaze krijohet e verteta 
        TableView table = new TableView();
        table.setEditable(true);
        
        TableColumn firstNameCol = new TableColumn("CityID");
        TableColumn lastNameCol = new TableColumn("City Name");
        
        table.getColumns().addAll(firstNameCol, lastNameCol);
        
        table.setEditable(true);
        firstNameCol.setMinWidth(265);
        lastNameCol.setMinWidth(265);
        
        
        
        hBoxRemoveCity.getChildren().addAll(cboCity,btnRemoveCity);
        
        hBoxAddCity.getChildren().addAll(tfAddCity,btnAddCity);
        
        
        MainVBox.getChildren().addAll(hBoxAddCity,hBoxRemoveCity,table);
        
        
        Scene scene = new Scene(MainVBox,530,500);
        stage.setScene(scene);
        stage.show();

        cboCity.setMinWidth(200);
        cboCity.setPrefWidth(cboCity.getWidth());
        
    }

    public static void main(String[] args)
    {
        launch();
    }
}