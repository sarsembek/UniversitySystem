package Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import model.User;

import java.io.IOException;

public abstract class UserDeserializer extends StdDeserializer<User> {

	protected UserDeserializer(Class<?> vc) {
		super(vc);
	}
	
	public User Deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException{
		User u = new User();
		while(!parser.isClosed()) {
			JsonToken jsonToken = parser.nextToken();
			if(JsonToken.FIELD_NAME.equals(jsonToken)) {
				String fieldName = parser.getCurrentName();
				
			}
		}
	}
}
