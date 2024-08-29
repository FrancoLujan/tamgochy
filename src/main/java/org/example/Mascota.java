/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 * @author alumno
 */
public class Mascota {
    byte energia = 100;
    byte humor = 5;
    byte gloton = 0;
    byte esfuerzo = 0;
    boolean vida = true;
    String nombre;
    boolean dormir = false;


    public Mascota(String nombre) {

        this.nombre = nombre;

    }

    public byte getEnergia() {
        return energia;
    }

    public void setEnergia(byte energia) {
        this.energia = energia;
    }

    public String getHumor() {
        String humor;
        switch (this.humor) {
            case 1:
                humor = "MUY ENOJADO";
                break;
            case 2:
                humor = "ENOJADO";
                break;
            case 3:
                humor = "NEUTRAL";
                break;
            case 4:
                humor = "CONTENTO";
                break;
            case 5:
                humor = "CHOSO";
                break;
            case 0:
                this.dormir = true;
                humor = "DESANIMADO ME FUI A DORMIR";
                break;
            default:
                return "ERROR";
        }
        return humor;
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

    public void ingesta(String comportamiento) {
        if (this.vida) {
            if (!this.dormir) {
                String accion = comportamiento.toLowerCase();
                if ("comer".equals(accion)) {
                    this.energia += (byte) (this.energia * 0.10);

                    this.gloton++;
                    this.monitoreoGlotoneria();

                } else if ("beber".equals(accion)) {
                    this.energia += (byte) (this.energia * 0.05);

                    this.gloton++;
                    this.monitoreoGlotoneria();

                } else {
                    System.out.println(this.nombre + "no sabe lo que le dices");
                }
            } else {
                System.out.println(this.nombre + " estas durmiendo no puedo " + comportamiento);
            }
        } else {
            System.out.println(this.nombre + " ESTA MUERTO");
        }

        this.monitoreoVIda();
    }

    public void actividad(String actividad) {
        if (this.vida) {
            String act = actividad.toLowerCase();
            this.gloton = 0;
            if (!this.dormir) {
                if ("correr".equals(act)) {
                    this.esfuerzo ++;
                    this.energia -= (byte) (this.energia * 0.35);
                    this.humor -= 2;
                    this.monitoreoActividad();

                } else if ("saltar".equals(act)) {
                    this.esfuerzo ++;
                    this.energia -= (byte) (this.energia * 0.15);
                    this.humor -= 2;
                    this.monitoreoActividad();
                } else {
                    System.out.println(this.nombre + "no sabe lo que le dices");
                }

            } else {
                System.out.println(this.nombre + " estas durmiendo no puedo " + act);
            }
        } else {
            System.out.println(this.nombre + " ESTA MUERTO");
        }


        this.monitoreoAnimo();
        this.monitoreoVIda();

    }

    public void descanso(String desc) {
        if (this.vida) {
            String desc2 = desc.toLowerCase();
            this.gloton = 0;
            if ("dormir".equals(desc2)) {
                this.dormir = true;
                this.energia += 25;
                this.humor += 2;
            } else if ("despertar".equals(desc2)) {
                this.dormir = false;
                this.humor -= 2;

            } else {
                System.out.println(this.nombre + "no sabe lo que le dices");

            }
        } else {
            System.out.println(this.nombre + " ESTA MUERTO");
        }

        this.monitoreoVIda();
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\n"
                + "Energia: " + this.energia + "\n"
                + "Humor: " + this.getHumor() + "\n";
    }

    private void monitoreoVIda() {
        if (this.energia <= 0) {
            this.vida = false;
            this.gloton = 0;
            System.out.println(this.nombre + " A MUERTO DE CANSANCIO");
        } else if (this.energia > 100) {
            this.energia = 100;
        }if(this.humor > 5){this.humor = 5;}else if(this.humor < 0){this.humor = 0;}
    }

    private void monitoreoAnimo() {
        this.dormir = this.humor == 0;

    }

    private void monitoreoGlotoneria() {
        if (this.gloton > 3) {
            this.humor--;
        } else {
            this.humor++;
        }
        if (this.gloton == 5) {
            this.vida = false;
            this.gloton = 0;
            System.out.println(this.nombre + " A MUERTO DE EMPACHO");
        }
    }

    private void monitoreoActividad(){
        if(this.esfuerzo == 3){
            this.dormir = true;
            System.out.println(this.nombre + " A EPACADO Y SE FUE A DORMIR...");

        }




    }



}

