package test;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

/**
 * 
 * <pre>
 * 程序的中文名称。
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
public class LoggingAfterReturningAdvice implements AfterReturningAdvice {

	private static final Log log = 
		LogFactory.getLog(LoggingAfterReturningAdvice.class);
	
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		log.info(returnValue);
		log.info(method + "," + args[0] + "," + target);
		log.info("after: The Invocation of getContent()");
	}

}
