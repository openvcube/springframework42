/**
 * Copyright(c) http://www.open-v.com
 */
package test;


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
public class MainTest {
	
	//private static final Log log = LogFactory.getLog(MainTest.class);
	
	public static void main(String[] args) {
		//log.info("MainTest main().........");
		System.out.println("MainTest main().........");
		
		DisPersonInfo.compute("李三");
		DisPersonInfo.compute("王二", 30);
	}
	
}