package testautomation.maincore;

import java.io.File;
import java.io.IOException;
import testautomation.jsoncontract.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;

public class JsonObjectMapper {
	HL_Message HLM = new HL_Message();
	
	public String Mapper(String Json_source,String Json_object_name, String KeyName) throws NoSuchMethodException, SecurityException{
		//String Keyvalue = null;
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		try {	
				HLM = objMapper.readValue(new File(Json_source) , HL_Message.class);
				
				//Keyvalue = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(HLM);
				//System.out.println(Keyvalue);
				//System.out.println(HLM.getNewInsurance().get(0).getInsuranceCompany());
				//Method a = HLM.getClass().getMethod(Json_object_name);
				Object obj = HLM.getClass();
				System.out.println(HLM.getClass().getMethod(Json_object_name));
				//Method a = obj.getClass().getMethod(KeyName);
				System.out.println(obj.getClass().getMethod(KeyName));
				System.out.println(HLM.getPatient().getFirstName());
				
			}

		catch (JsonMappingException e) {e.printStackTrace();}
		catch (JsonParseException  e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		
		return null;
	}	
	
/*	
	public String Getvalue () throws NoSuchMethodException, SecurityException {
		
		Mapper();
		HLM.getClass().getMethod(Json_object_name);
		
		
		
		return Keyvalue;
	}*/
}