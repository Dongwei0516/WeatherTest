package com.example.dongwei.weathertest.util;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
