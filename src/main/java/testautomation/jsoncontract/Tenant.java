package testautomation.jsoncontract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tenant {

	private String Name;
    private String Instance;
    private String RequestId;
    
    public String getName ()
    {
    	return Name;
    }
    @JsonProperty("Name")
    public void setName (String Name)
    {
    	this.Name = Name;
    }

    public String getInstance ()
    {
        return Instance;
    }
    public void setInstance (String Instance)
    {
        this.Instance = Instance;
    }

    public String getRequestId ()
    {
        return RequestId;
    }
    public void setRequestId (String RequestId)
    {
        this.RequestId = RequestId;
    }

    @Override
    public String toString()
    {
    	 return "tenant [Name = "+Name+", Instance = "+Instance+", RequestId = "+RequestId+"]";
    }
}
