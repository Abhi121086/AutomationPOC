package testautomation.jsoncontract;

public class Diagnosisdetails{
    
	private String Id;
	private String JobId;
	private String ProceduresId;
	private String ProceduresDetailId;
	private String ICD9;
	private String IsActive;
    private String Diagnosis;
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

    public String getProceduresId ()    
    {        
    	return ProceduresId;    
    	}
    public void setProceduresId (String ProceduresId)    
    {        
    	this.ProceduresId = ProceduresId;    
    	}
    
    public String getProceduresDetailId ()    
    {        
    	return ProceduresDetailId;    
    	}
    public void setProceduresDetailId (String ProceduresDetailId)    
    {        
    	this.ProceduresDetailId = ProceduresDetailId;    
    	}

    public String getICD9 ()    
    {        
    	return ICD9;    
    	}
    public void setICD9 (String ICD9)    
    {        
    	this.ICD9 = ICD9;    
    	}
    
    public String getIsActive ()    
    {        
    	return IsActive;    
    	}
    public void setIsActive (String IsActive)    
    {        
    	this.IsActive = IsActive;    
    	}
    
    public String getDiagnosis ()
    { 
    	return Diagnosis;    
    	}
    public void setDiagnosis (String Diagnosis)    
    {        
    	this.Diagnosis = Diagnosis;    
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
    	return "Diagnosisdetails [Id = "+Id+", JobId = "+JobId+", ProceduresId = "+ProceduresId+", ProceduresDetailId = "+ProceduresDetailId+", ICD9 = "+ICD9+", IsActive = "+IsActive+", Diagnosis = "+Diagnosis+", WorkFlowTypeId = "+WorkFlowTypeId+"]";
    }
}