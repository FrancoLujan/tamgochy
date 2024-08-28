/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lujan.tamagochy;

/**
 *
 * @author alumno
 */
public class Mascota {
    byte energia = 100;
    byte humor = 5;
    boolean vida = false;
    String nombre;
    boolean dormir = false ; 
     
    
    public void Mascota(String nombre){
        
        this.nombre = nombre;
        
}

    public byte getEnergia() {
        return energia;
    }

    public void setEnergia(byte energia) {
        this.energia = energia;
    }

    public String getHumor() {
        switch(this.humor){
            case 1:
                return "MUY ENOJADO"; 
            case 2:
                return "ENOJADO";
            case 3:
                return "NEUTRAL";
            case 4:
                return "CONTENTO";
            case 5:
                return "CHOSO"; 
            default:
                return "INDIFERENTE";
        }
    }

    public void setHumor(byte humor) {
        this.humor = humor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public boolean isDormir() {
        return dormir;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }
     
      public void ingesta(String comportamiento){
      String accion = comportamiento.toLowerCase();
      if("comer".equals(accion)){
            this.energia += this.energia * 0.10;
            this.humor ++;
      
        }else if("beber".equals(accion)){
                this.energia += this.energia * 0.05;
                this.humor ++;
            }
      }
      public void actividad(String actividad){
          String act = actividad.toLowerCase();
          if("correr".equals(act)){
              this.energia -= this.energia * 0.35;
                this.humor -= 2;
                
          }else if("saltar".equals(act)){
                    this.energia -= this.energia * 0.15;
                    this.humor -= 2;
          }
      
      }
}

