package sistemaacademico.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sistemaacademico.Main;
import sistemaacademico.model.Coordenador;
import javafx.scene.control.Alert;
/**
 *
 * @author luca
 */
public class FXMLTelaLoginController implements Initializable {
    
    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXPasswordField txtSenha;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private ImageView imgvLogo;

    @FXML
    private ImageView imgVpattern;
    
    Coordenador coordenador = Main.getInstance().coordenador();
    Alert alert = new Alert(Alert.AlertType.ERROR);
    
   
    public void erroLogin(){
       alert.setTitle("Erro no Login");
       alert.setHeaderText("Acesso Negado!");
       alert.setContentText("Tente Novamente");
       alert.show();
    }
    
    public void limparCampos(){
        txtUsuario.setText("");
        txtSenha.setText("");
    }
    
    
    @FXML
    public void verificarLogin(){
        String matricula = txtUsuario.getText();
        String senha = txtSenha.getText();
        int tamUltimo = matricula.length()-1;
        boolean naoEncontrou = false;

        switch (matricula.charAt(tamUltimo)) {        
            case '1'://ALUNO
                if(coordenador.getAlunos().size() != 0){
                    for(int i = 0; i < coordenador.getAlunos().size(); i++){
                        if(matricula.equals(coordenador.getAlunos().get(i).getMatricula()) && senha.equals(coordenador.getAlunos().get(i).getSenha()) ){                       
                            naoEncontrou = false;
                            System.out.println("BEM VINDO ALUNO "+coordenador.getAlunos().get(i).getNome());
                            System.out.println("index = "+i);
                            coordenador.setIndexUsuarioTela(i);
                            limparCampos();
                            
                            coordenador.setIndexUsuarioTela(i);
                            Main.trocarTela("aluno");
                            break;
                        }else{
                            naoEncontrou = true;
                        }
                    } 
                }if(naoEncontrou == true){
                    erroLogin();
                }
                break;
            
            case '2'://PROFESSOR
                if(coordenador.getProfessores().size() != 0){
                    for(int i = 0; i < coordenador.getProfessores().size(); i++){
                        if(matricula.equals(coordenador.getProfessores().get(i).getMatricula()) && senha.equals(coordenador.getProfessores().get(i).getSenha())){
                            System.out.println("BEM VINDO PROFESSOR");
                            System.out.println(coordenador.getProfessores().get(i).getNome());
                            coordenador.setIndexUsuarioTela(i);
                            System.out.println("index = "+i);
                            coordenador.setIndexUsuarioTela(i);
                            limparCampos();

                            coordenador.setIndexUsuarioTela(i);
                            Main.trocarTela("professor");
                            break;
                        }else{
                            naoEncontrou = true;
                        }
                    } 
                }if(naoEncontrou == true){
                    erroLogin();
                }
                break;
            case '0'://COORDENADOR
                if(matricula.equals(coordenador.getMatricula()) && senha.equals(coordenador.getSenha())){
                    System.out.println("BEM VINDO COORDENADOR"); 
                    
                    limparCampos();
                    
                    Main.trocarTela("coordenador");
                }else{
                    erroLogin();
                }
                break;
            default:
                erroLogin();
                break;
        }
            
     }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //CAREGANDO A IMAGEM DO LOGO
        Image image = new Image("/sistemaacademico/images/logo.png");
        imgvLogo.setImage(image);
        Image image2 = new Image("/sistemaacademico/images/pattern.png");
        imgVpattern.setImage(image2);
        
        txtUsuario.setText("180000");
        txtSenha.setText("0000");

    }
    
    
    
}
