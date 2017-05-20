package com.jack.imooc.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException,JSONException{
		File file = new File
				(ReadJSONSample.class.getResource("/wangxiaoer.json")
						.getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jbj = new JSONObject(content);
		
		String address = jbj.getString("address");
		/*String[] arr = jbj.getNames("hobbies");
		System.out.println(address.toString());
		System.out.println(arr[0]);
//		System.out.println(arr.toString());
//		List<String> list = Arrays.asList(arr);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}*/
//		arr.forEach((aa) -> System.out.println(aa));
		/*list.forEach((String st) -> System.out.println(st));*/
//		list.forEach(System.out::println); 
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println(address);
		
		JSONArray jarray = jbj.getJSONArray("hobbies");
		for (int i = 0; i < jarray.length(); i++) {
			System.out.println(jarray.get(i));
		}
		
		
		System.out.println(jbj.isNull("car"));
		
	}

}
