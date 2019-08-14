package testautomation.jsoncontract;

import java.util.ArrayList;
import java.util.List;

public class HL_Message {

	private Tenant tenant = new Tenant();
	private Job job = new Job();
	private Physician physician = new Physician();
	private Appointment appointment = new Appointment();
	private List<NewInsurance> newInsurance = new ArrayList<NewInsurance>();
	private Patient patient = new Patient();
    private List<Proceduredetails> proceduredetails = new ArrayList<Proceduredetails>();
    
    public Tenant getTenant ()
    {
        return tenant;
    }
    public void setTenant (Tenant tenant)
    {
        this.tenant = tenant;
    }

    public Job getJob ()
    {
        return job;
    }
    public void setJob (Job job)
    {
        this.job = job;
    }
    
    public Patient getPatient ()
    {
        return patient;
    }
    public void setPatient (Patient patient)
    {
        this.patient = patient;
    }
    
    public List<NewInsurance> getNewInsurance ()
    {
        return newInsurance;
    }
    public void setNewInsurance (List<NewInsurance> newInsurance)
    {
        this.newInsurance = newInsurance;
    }
    
    public List<Proceduredetails> getProceduredetails ()
    {
        return proceduredetails;
    }
    public void setProceduredetails (List<Proceduredetails> proceduredetails)
    {
        this.proceduredetails = proceduredetails;
    }

    public Physician getPhysician ()
    {
        return physician;
    }
    public void setPhysician (Physician physician)
    {
        this.physician = physician;
    }

    public Appointment getAppointment ()
    {
        return appointment;
    }
    public void setAppointment (Appointment appointment)
    {
        this.appointment = appointment;
    }

    @Override
    public String toString()
    {
       return "HL_Message [patient = "+patient+", tenant = "+tenant+", newInsurance = "+newInsurance+", job = "+job+", proceduredetails = "+proceduredetails+", physician = "+physician+", appointment = "+appointment+"]";
    }
}
