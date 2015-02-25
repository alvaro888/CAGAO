
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
public class Paloma {
    
     Image imagenP1 = null;
     
    
    private int x = 0;
    private int y = 0;
    int ancho = 0;
    
    
     public Paloma(){
        
        try {
            imagenP1 = ImageIO.read((getClass().getResource("/Imagenes/PajaroDerechaR.gif")));
            
            ancho= imagenP1.getWidth(null);
        } catch (IOException ex) {
           
        }
       
        
}

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        this.x = x ;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        
        this.y = y ;
    }
    
    
}
