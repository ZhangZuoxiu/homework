package com.jing.sszyt2.Json;

import java.util.List;
import com.google.gson.Gson;

public class WriteJson {
	public String getJsonData(List<?> list)
	{
		Gson gson=new Gson();
		String jsonstring=gson.toJson(list);
		return jsonstring;
	}
}