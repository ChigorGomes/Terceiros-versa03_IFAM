package Classes_Terceiros;
// Generated 12/11/2015 19:54:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Servicos generated by hbm2java
 */
public class Servicos  implements java.io.Serializable {


     private Integer codservico;
     private String nomeServico;
     private Set clientePrestadors = new HashSet(0);
     private Agendamento agendamento;

    public Servicos() {
    }

    @Override
    public String toString() {
        return this.nomeServico; //To change body of generated methods, choose Tools | Templates.
    }
    
	
    public Servicos(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public Servicos(String nomeServico, Set clientePrestadors, Agendamento agendamento) {
       this.nomeServico = nomeServico;
       this.clientePrestadors = clientePrestadors;
       this.agendamento = agendamento;
    }
   
    public Integer getCodservico() {
        return this.codservico;
    }
    
    public void setCodservico(Integer codservico) {
        this.codservico = codservico;
    }
    public String getNomeServico() {
        return this.nomeServico;
    }
    
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public Set getClientePrestadors() {
        return this.clientePrestadors;
    }
    
    public void setClientePrestadors(Set clientePrestadors) {
        this.clientePrestadors = clientePrestadors;
    }
    public Agendamento getAgendamento() {
        return this.agendamento;
    }
    
    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }




}


