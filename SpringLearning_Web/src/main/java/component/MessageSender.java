package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service name for annotation configuration
@Service("sender")
public class MessageSender {

	MessageProvider provider;

	public void send() {
		System.out.println(provider.getMessage());
	}

	public MessageProvider getProvider() {
		return provider;
	}
	
	@Autowired
	public MessageSender(MessageProvider provider) {
		super();
		this.provider = provider;
	}

	
	public void setProvider(MessageProvider provider) {
		this.provider = provider;
	}

}
