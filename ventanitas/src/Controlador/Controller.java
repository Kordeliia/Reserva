package Controlador;



import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    @FXML
    private Label l1;
    @FXML
    private Button btnR;
    @FXML
    private Button btnE;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    
    String nombre = "Francisco";
    boolean emailverfificado=false;
    

    public void initialize() {
		 btnR.setOnAction(e ->{
			 validarEmail();
			if(tf1.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Nombre está vacío");
				a.show();
			}
			else if(tf2.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Apellido 1 está vacío");
				a.show();
			}
			else if(tf3.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Apellido 2 está vacío");
				a.show();
			}
			else if(tf4.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Empresa está vacío");
				a.show();
			}
			else if(tf5.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Correo electrónico está vacío");
				a.show();
			}
			else if(tf6.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de Num acompañantes está vacío");
				a.show();
			}
			else if(tf7.getText()=="")
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de observaciones está vacío");
				a.show();
			} if(emailverfificado==false)
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("Ha ocurrido un error. El campo de correo no tiene estructura nombre@example.es");
				a.show();
			}
			
			
			else
			{
				Alert a = new Alert(Alert.AlertType.INFORMATION); a.setContentText("Los campos han sido todos rellenados. Éxito al enviar la reserva");
				a.show();
				clearFields();
			}});
		 
		 
		 btnE.setOnAction(e ->{
			 clearFields();});
		 
}

	private void clearFields() {
		tf1.clear();
		tf2.clear();
		tf3.clear();
		tf4.clear();
		tf5.clear();
		tf6.clear();
		tf7.clear();

	}
	private boolean validarEmail() {
		 Pattern pattern = Pattern
				 .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*.es");
		 String email = tf5.getText();
		 Matcher mather = pattern.matcher(email);
		 if (mather.find() == true) {
			 emailverfificado=true;
	        } else {
	        	emailverfificado=false;
	        }
		 
		return emailverfificado;
		 
		 

	}
}