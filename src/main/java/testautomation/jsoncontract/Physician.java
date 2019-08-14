package testautomation.jsoncontract;

public class Physician {

	private String Id;
	private String JobId;
	private String npi;
	private String UserId;
	private String AttachmentId;
	private String ReferringPhysician;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String PhysicianExternalId;
	private String physicianAddress;
    private String WorkFlowTypeId;
    
    public String getId ()
    {
        return Id;
    }
    public void setId (String Id)
    {
        this.Id = Id;
    }    
    
    public String getJobId ()
    {
        return JobId;
    }
    public void setJobId (String JobId)
    {
        this.JobId = JobId;
    }

    public String getNpi ()
    {
        return npi;
    }
    public void setNpi (String npi)
    {
        this.npi = npi;
    }
    
    public String getUserId ()
    {
        return UserId;
    }
    public void setUserId (String UserId)
    {
        this.UserId = UserId;
    }
    
    public String getAttachmentId ()
    {
        return AttachmentId;
    }
    public void setAttachmentId (String AttachmentId)
    {
        this.AttachmentId = AttachmentId;
    }
    
    public String getReferringPhysician ()
    {
        return ReferringPhysician;
    }
    public void setReferringPhysician (String ReferringPhysician)
    {
        this.ReferringPhysician = ReferringPhysician;
    }
    
    public String getFirstName ()
    {
        return FirstName;
    }
    public void setFirstName (String FirstName)
    {
        this.FirstName = FirstName;
    }
    
    public String getMiddleName ()
    {
        return MiddleName;
    }
    public void setMiddleName (String MiddleName)
    {
        this.MiddleName = MiddleName;
    }
    
    public String getLastName ()
    {
        return LastName;
    }
    public void setLastName (String LastName)
    {
        this.LastName = LastName;
    }
   
    public String getPhysicianExternalId ()
    {
        return PhysicianExternalId;
    }
    public void setPhysicianExternalId (String PhysicianExternalId)
    {
        this.PhysicianExternalId = PhysicianExternalId;
    }
    
    public String getPhysicianAddress ()
    {
        return physicianAddress;
    }
    public void setPhysicianAddress (String physicianAddress)
    {
        this.physicianAddress = physicianAddress;
    }

    public String getWorkFlowTypeId ()
    {
        return WorkFlowTypeId;
    }
    public void setWorkFlowTypeId (String WorkFlowTypeId)
    {
        this.WorkFlowTypeId = WorkFlowTypeId;
    }

    @Override
    public String toString()
    {
        return "Physician [Id = "+Id+", JobId = "+JobId+", npi = "+npi+", UserId = "+UserId+", AttachmentId = "+AttachmentId+", ReferringPhysician = "+ReferringPhysician+", FirstName = "+FirstName+", MiddleName = "+MiddleName+", LastName = "+LastName+", PhysicianExternalId = "+PhysicianExternalId+", physicianAddress = "+physicianAddress+", WorkFlowTypeId = "+WorkFlowTypeId+"]";
    }
}