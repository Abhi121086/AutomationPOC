package testautomation.jsoncontract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {	
        private String Id;
        private String JobId;
        private String UserId;
        private String HomeNo;
        private String FullName;
        private String FirstName;
        private String MiddleName;
        private String LastName;
        private String DOB;
        private String Address;
        private String CellNo;
        private String SSN;
        private String WorkAddress;
        private String Notes;
        private String Street;
        private String City;		
        private String State;
        private String StateCode;
        private String Country;	    
        private String ZipCode;	    
        private String Gender;	    
        private String ExternalPatientId;	    
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
        
        public String getHomeNo ()
        {
            return HomeNo;
        }
        public void setHomeNo (String HomeNo)
        {
            this.HomeNo = HomeNo;
        }
        
        public String getFullName ()
        {
            return FullName;
        }
        @JsonProperty("FullName")
        public void setFullName (String FullName)
        {
            this.FullName = FullName;
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
        
        public String getDOB ()
        {
            return DOB;
        }
        public void setDOB (String DOB)
        {
            this.DOB = DOB;
        }
        
        public String getAddress ()
        {
            return Address;
        }
        public void setAddress (String Address)
        {
            this.Address = Address;
        }
        
        public String getCellNo ()
        {
            return CellNo;
        }
        public void setCellNo (String CellNo)
        {
            this.CellNo = CellNo;
        }
        
        public String getSSN ()
        {
            return SSN;
        }
        public void setSSN (String SSN)
        {
            this.SSN = SSN;
        }
        
        public String getWorkAddress ()
        {
            return WorkAddress;
        }
        public void setWorkAddress (String WorkAddress)
        {
            this.WorkAddress = WorkAddress;
        }
        
        public String getNotes ()
        {
            return Notes;
        }
        public void setNotes (String Notes)
        {
            this.Notes = Notes;
        }
        
        public String getStreet ()
        {
            return Street;
        }
        public void setStreet (String Street)
        {
            this.Street = Street;
        }
        
        public String getCity ()
        {
            return City;
        }
        public void setCity (String City)
        {
            this.City = City;
        }
        
        public String getState ()
        {
            return State;
        }
        public void setState (String State)
        {
            this.State = State;
        }
        
        public String getStateCode ()
        {
            return StateCode;
        }
        public void setStateCode (String StateCode)
        {
            this.StateCode = StateCode;
        }
        
        public String getCountry ()
        {
            return Country;
        }
        public void setCountry (String Country)
        {
            this.Country = Country;
        }
        
        public String getZipCode ()
        {
            return ZipCode;
        }
        public void setZipCode (String ZipCode)
        {
            this.ZipCode = ZipCode;
        }
        
        public String getGender ()
        {
            return Gender;
        }
        public void setGender (String Gender)
        {
            this.Gender = Gender;
        }
        
        public String getExternalPatientId ()
        {
            return ExternalPatientId;
        }
        public void setExternalPatientId (String ExternalPatientId)
        {
            this.ExternalPatientId = ExternalPatientId;
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
            return "Patient [Id = "+Id+", JobId = "+JobId+", UserId = "+UserId+", HomeNo = "+HomeNo+", FullName = "+FullName+", FirstName = "+FirstName+", MiddleName = "+MiddleName+", LastName = "+LastName+", DOB = "+DOB+", Address = "+Address+", CellNo = "+CellNo+", SSN = "+SSN+", WorkAddress = "+WorkAddress+", Notes = "+Notes+", Street = "+Street+", City = "+City+", State = "+State+", StateCode = "+StateCode+", Country = "+Country+", ZipCode = "+ZipCode+", Gender = "+Gender+", ExternalPatientId = "+ExternalPatientId+", WorkFlowTypeId = "+WorkFlowTypeId+"]";
        }   
}