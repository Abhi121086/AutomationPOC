package testautomation.jsoncontract;

public class Appointment {
	
	private String Id;
	private String JobId;
	private String UserId;
	private String InsuranceId;
	private String Startdatetime;
	private String Enddatetime;
	private String Facility;
	private String PointofContact;    
	private String WeekDaysId;
	private String FacilityId;	
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

    public String getUserId ()
    {
        return UserId;
    }
    public void setUserId (String UserId)
    {
        this.UserId = UserId;
    }
	
    public String getInsuranceId ()
    {
        return InsuranceId;
    }
    public void setInsuranceId (String InsuranceId)
    {
        this.InsuranceId = InsuranceId;
    }    
    
    public String getStartdatetime ()
    {
        return Startdatetime;
    }
    public void setStartdatetime (String Startdatetime)
    {
        this.Startdatetime = Startdatetime;
    }
    
    public String getEnddatetime ()
    {
        return Enddatetime;
    }
    public void setEnddatetime (String Enddatetime)
    {
        this.Enddatetime = Enddatetime;
    }

    public String getFacility ()
    {
        return Facility;
    }
    public void setFacility (String Facility)
    {
        this.Facility = Facility;
    }
    
    public String getPointofContact ()
    {
        return PointofContact;
    }
    public void setPointofContact (String PointofContact)
    {
        this.PointofContact = PointofContact;
    }
    
    public String getWeekDaysId ()
    {
        return WeekDaysId;
    }
    public void setWeekDaysId (String WeekDaysId)
    {
        this.WeekDaysId = WeekDaysId;
    }
    
    public String getFacilityId ()
    {
        return FacilityId;
    }
    public void setFacilityId (String FacilityId)
    {
        this.FacilityId = FacilityId;
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
    	return "Appointment [Id = "+Id+", JobId = "+JobId+", UserId = "+UserId+", InsuranceId = "+InsuranceId+", Startdatetime = "+Startdatetime+", Enddatetime = "+Enddatetime+", Facility = "+Facility+", PointofContact = "+PointofContact+", WeekDaysId = "+WeekDaysId+", FacilityId = "+FacilityId+", WorkFlowTypeId = "+WorkFlowTypeId+"]";
    }
}
