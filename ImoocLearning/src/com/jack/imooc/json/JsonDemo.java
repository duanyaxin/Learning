package com.jack.imooc.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
		
		/*JSONObject jbj = getMyJSONObject();
		System.out.println(jbj);*/
		/*createJsonByMap();*/
		createJsonByBean();
		System.out.println("fffffffff");
		
	}

	private static JSONObject getMyJSONObject() {
		JSONObject jbj = null;
		try {
			 jbj = new JSONObject();
			Object obj = null;
			jbj.put("name", "段亚新");
			jbj.put("age", 27);
			jbj.put("address", "Wall Street");
			jbj.put("hasCar", obj);
			jbj.put("isMarried", true);
			jbj.put("hobbies",new String[]{"basketball","swimming","reading"});
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jbj;
	}
	
	private static void createJsonByMap(){
		Map<String,Object> mp = new HashMap<String,Object>();
		Object obj = null;
		mp.put("name", "段亚新");
		mp.put("age", 27);
		mp.put("address", "Wall Street");
		mp.put("hasCar", obj);
		mp.put("isMarried", true);
		mp.put("hobbies",new String[]{"basketball","swimming","reading"});
		JSONObject jbj = new JSONObject(mp);
		System.out.println(jbj.toString());
	}
	
	private static void createJsonByBean(){
		User user = new User();
		user.setAddress("Wall Street");
		user.setAge(27);
		user.setCar(null);
		user.setMarried(true);
		user.setName("jack");
		user.setHobbies(new String[]{"ball","music","reading"});
		JSONObject jbj = new JSONObject(user);
		System.out.println(jbj.toString());
	}

	
}
