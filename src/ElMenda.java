
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvaro
 */
public class ElMenda {
    
     //variable de tipo imagen
    Image imagenMenda = null;
    // posiciones x , y de la imagen
    private int x = 0;
    private int y = 0;
   private int anchoMaximo;
   private int anchoMenda;
   
   
    public ElMenda(int ancho){
        anchoMaximo = ancho;
        try {
            imagenMenda = ImageIO.read((getClass().getResource("/Imagenes/ElMendaM.png")));
        } catch (IOException ex) {
           
        }
        anchoMenda = imagenMenda.getWidth(null);
        
}
    
      public int getAnchoNave() {
        return anchoMenda;
    }

    public int getX() {
        return x;
        
    }

    public void setX(int x) {
        if(x<0){
        x=0;
        }
        else if(x > anchoMaximo - anchoMenda){
        x= anchoMaximo - anchoMenda ;
        }
        this.x = x;
       
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        
        y=300;
        
        
        this.y = y;
    }
    
}
