package testautomation.jsoncontract;

import java.util.ArrayList;
import java.util.List;

public class Proceduredetails {

	private String Id;
	private String ProceduresId;
	private String JobId;
	private String CPT;
	private String ICD9;
	private String Procedures;
	private String Diagnosis;
	private List<Diagnosisdetails> diagnosisdetails = new ArrayList<Diagnosisdetails>();
	private String Sequence;
	private String IsActive;
	private String IsLocked;
	private String IsAuthorized;
	private String ExternalAccessionNumber;
	private String AuthorizationNumber;
	private String ApprovedBy;
	private String EffectiveDate;
	private String ExpirationDate;
	private String Modifier;
	private String BodyPart;
	private String WorkFlowTypeId;
    
	public String getId ()
    {
        return Id;
    }
    public void setId (String Id)
    {
        this.Id = Id;
    }
	
    public String getProceduresId ()
    {
        return ProceduresId;
    }
    public void setProceduresId (String ProceduresId)
    {
        this.ProceduresId = ProceduresId;
    }
    
    public String getJobId ()
    {
        return JobId;
    }
    public void setJobId (String JobId)
    {
        this.JobId = JobId;
    }
    
    public String getCPT ()
    {
        return CPT;
    }
    public void setCPT (String CPT)
    {
        this.CPT = CPT;
    }
    
    public String getICD9 ()
    {
        return ICD9;
    }
    public void setICD9 (String ICD9)
    {
        this.ICD9 = ICD9;
    }
    
    public String getProcedures ()
    {
        return Procedures;
    }
    public void setProcedures (String Procedures)
    {
        this.Procedures = Procedures;
    }
    
    public String getDiagnosis ()
    {
        return Diagnosis;
    }
    public void setDiagnosis (String Diagnosis)
    {
        this.Diagnosis = Diagnosis;
    }
    
    public List<Diagnosisdetails> getDiagnosisdetails ()
    {
        return diagnosisdetails;
    }
    public void setDiagnosisdetails (List<Diagnosisdetails> diagnosisdetails)
    {
        this.diagnosisdetails = diagnosisdetails;
    }
	
    public String getSequence ()
    {
        return Sequence;
    }
    public void setSequence (String Sequence)
    {
        this.Sequence = Sequence;
    }
    
    public String getIsActive ()
    {
        return IsActive;
    }
    public void setIsActive (String IsActive)
    {
        this.IsActive = IsActive;
    }
    
    public String getIsLocked ()
    {
        return IsLocked;
    }
    public void setIsLocked (String IsLocked)
    {
        this.IsLocked = IsLocked;
    }
    
    public String getIsAuthorized ()
    {
        return IsAuthorized;
    }
    public void setIsAuthorized (String IsAuthorized)
    {
        this.IsAuthorized = IsAuthorized;
    }
    
    public String getExternalAccessionNumber ()
    {
        return ExternalAccessionNumber;
    }
    public void setExternalAccessionNumber (String ExternalAccessionNumber)
    {
        this.ExternalAccessionNumber = ExternalAccessionNumber;
    }
    
    public String getAuthorizationNumber ()
    {
        return AuthorizationNumber;
    }
    public void setAuthorizationNumber (String AuthorizationNumber)
    {
        this.AuthorizationNumber = AuthorizationNumber;
    }
    
    public String getApprovedBy ()
    {
        return ApprovedBy;
    }
    public void setApprovedBy (String ApprovedBy)
    {
        this.ApprovedBy = ApprovedBy;
    }
    
    public String getEffectiveDate ()
    {
        return EffectiveDate;
    }
    public void setEffectiveDate (String EffectiveDate)
    {
        this.EffectiveDate = EffectiveDate;
    }
    
    public String getExpirationDate ()
    {
        return ExpirationDate;
    }
    public void setExpirationDate (String ExpirationDate)
    {
        this.ExpirationDate = ExpirationDate;
    }
	
    public String getModifier ()
    {
        return Modifier;
    }
    public void setModifier (String Modifier)
    {
        this.Modifier = Modifier;
    }
    
    public String getBodyPart ()
    {
        return BodyPart;
    }
    public void setBodyPart (String BodyPart)
    {
        this.BodyPart = BodyPart;
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
    	return "Proceduredetails [Id = "+Id+", ProceduresId = "+ProceduresId+", JobId = "+JobId+", CPT = "+CPT+", ICD9 = "+ICD9+", Procedures = "+Procedures+", Diagnosis = "+Diagnosis+", diagnosisdetails = "+diagnosisdetails+", Sequence = "+Sequence+", IsActive = "+IsActive+", IsLocked = "+IsLocked+", IsAuthorized = "+IsAuthorized+", ExternalAccessionNumber = "+ExternalAccessionNumber+", AuthorizationNumber = "+AuthorizationNumber+", ApprovedBy = "+ApprovedBy+", EffectiveDate = "+EffectiveDate+", ExpirationDate = "+ExpirationDate+", Modifier = "+Modifier+", BodyPart = "+BodyPart+", WorkFlowTypeId = "+WorkFlowTypeId+"]";	

    }

}
