package component;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//Service name for annotation configuration
@Service("csProvider")
public class CustomMessageProvider implements MessageProvider {

	//Autowired injection
	@Autowired
	public CustomMessageProvider(@Value("Hellow from custom provider") String message) {
		super();
		this.message = message;
	}

	private String message;
	private Date time;

	@Override
	public String getMessage() {
		return (time == null) ? message : String.format("%s; Time: %s", message, time);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTime() {
		return time;
	}
	
	//SpEL injection
	@Value("#{new java.util.Date()}")
	public void setTime(Date time) {
		this.time = time;
	}
}
