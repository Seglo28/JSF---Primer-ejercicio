/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author gloria.sevillausam
 */
@ManagedBean
@RequestScoped
public class BeanMascara {

    private String fechaNacimiento;
    private String telefonoDomicilio;
    private String noNit;
    
    public BeanMascara() {
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the telefonoDomicilio
     */
    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    /**
     * @param telefonoDomicilio the telefonoDomicilio to set
     */
    public void setTelefonoDomicilio(String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    /**
     * @return the noNit
     */
    public String getNoNit() {
        return noNit;
    }

    /**
     * @param noNit the noNit to set
     */
    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }
    
    public void limpiarDatos(){
       this.fechaNacimiento="";
       this.telefonoDomicilio="";
       this.noNit="";
    }
    
    public void guardarDatos(){
        FacesMessage msg=new FacesMessage("Guardando datos...");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
