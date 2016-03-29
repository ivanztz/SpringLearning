package component;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * Class for replacing implementation of methods in MessageProvider
 * 
 * @author Ivan Zayats
 *
 */
public class GetMessageReplacer implements MethodReplacer {

	private static final String METHOD_NAME = "getMessage";

	@Override
	public Object reimplement(Object arg0, Method method, Object[] arg2) throws Throwable {
		if (method.getName().equals(METHOD_NAME)) {
			return "Hello world from method replacer!!!1";
		} else
			throw new IllegalArgumentException("Unable to reinplement method. Wrong method name");
	}

}
