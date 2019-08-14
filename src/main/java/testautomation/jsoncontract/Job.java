package testautomation.jsoncontract;

public class Job {
	
	private String Id;
	private String JobNumber;
	private String JobDate;
	private String CurrentStatusId;
	private String CurrentStatus;	
	private String operation;
	private String UserId;
	private String IsUrgent;    
	private String ExternalJobId;
	private String ExternalAction;
	private String RegionId;
	private String WorkFlowTypeId;
	    
	public String getId ()
    {
        return Id;
    }
    public void setId (String Id)
    {
        this.Id = Id;
    }

    public String getJobNumber ()
    {
        return JobNumber;
    }
    public void setJobNumber (String JobNumber)
    {
        this.JobNumber = JobNumber;
    }
	
    public String getJobDate ()
    {
        return JobDate;
    }
    public void setJobDate (String JobDate)
    {
        this.JobDate = JobDate;
    }
    
    public String getCurrentStatusId ()
    {
        return CurrentStatusId;
    }
    public void setCurrentStatusId (String CurrentStatusId)
    {
        this.CurrentStatusId = CurrentStatusId;
    }
    
    public String getCurrentStatus ()
    {
        return CurrentStatus;
    }
    public void setCurrentStatus (String CurrentStatus)
    {
        this.CurrentStatus = CurrentStatus;
    }
    
    public String getOperation ()
    {
        return operation;
    }
    public void setOperation (String operation)
    {
        this.operation = operation;
    }
    
    public String getUserId ()
    {
        return UserId;
    }
    public void setUserId (String UserId)
    {
        this.UserId = UserId;
    }

    public String getIsUrgent ()
    {
        return IsUrgent;
    }
    public void setIsUrgent (String IsUrgent)
    {
        this.IsUrgent = IsUrgent;
    }
    
    public String getExternalJobId ()
    {
        return ExternalJobId;
    }
    public void setExternalJobId (String ExternalJobId)
    {
        this.ExternalJobId = ExternalJobId;
    }
	
    public String getExternalAction ()
    {
        return ExternalAction;
    }
    public void setExternalAction (String ExternalAction)
    {
        this.ExternalAction = ExternalAction;
    }

    public String getRegionId ()
    {
        return RegionId;
    }
    public void setRegionId (String RegionId)
    {
        this.RegionId = RegionId;
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
        return "Job [Id = "+Id+", JobNumber = "+JobNumber+", JobDate = "+JobDate+", CurrentStatusId = "+CurrentStatusId+", CurrentStatus = "+CurrentStatus+", operation = "+operation+", UserId = "+UserId+", IsUrgent = "+IsUrgent+", ExternalJobId = "+ExternalJobId+", ExternalAction = "+ExternalAction+", RegionId = "+RegionId+", WorkFlowTypeId = "+WorkFlowTypeId+"]";
    }
}