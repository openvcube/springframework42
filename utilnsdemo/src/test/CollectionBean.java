package test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
public class CollectionBean {

	private List list;
	
	private Set set;
	
	private Map map;
	
	private Map<String, Double> mapTyped;
	
	private Properties properties;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}
	
	public Map<String, Double> getMapTyped() {
		return mapTyped;
	}
	
	public void setMapTyped(Map<String, Double> mapTyped) {
		this.mapTyped = mapTyped;
	}
	
}
