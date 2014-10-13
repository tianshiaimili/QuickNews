package com.tiger.quicknews.utils;

import android.util.Log;


public class LogUtils2 {
	private static final boolean DEBUG = true;
	private static final String TAG = "LogUtils";

	public static void e(String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 4) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.e(className + "." + methodName + "():" + lineNumber,
//						message);
				
				Log.e(TAG,className + "：" + lineNumber+"行:"+
						message);
			}
		}
	}
	
	public static void e(String tag,String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 4) {
				Log.e(tag, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.e(className + "." + methodName + "():" + lineNumber,
//						message);
				
				Log.e(tag,className + "：" + lineNumber+"行:"+
						message);
			}
		}
	}

	public static void d(String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.d("TAG",className + "." + methodName + "():" + lineNumber+"行"+
//						message);
				
				Log.d(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}
	
	
	public static void d(String TAG,String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.d("TAG",className + "." + methodName + "():" + lineNumber+"行"+
//						message);
				
				Log.d(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}

	public static void i(String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.i(className + "." + methodName + "():" + lineNumber,
//						message);
				Log.i(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}
	
	///
	public static void i(String TAG,String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.i(className + "." + methodName + "():" + lineNumber,
//						message);
				Log.i(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}
	

	public static void w(String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.w(className + "." + methodName + "():" + lineNumber,
//						message);
				
				Log.w(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}
	
	////
	public static void w(String TAG,String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.w(className + "." + methodName + "():" + lineNumber,
//						message);
				
				Log.w(TAG,className + " ： " + lineNumber+"行："+
						message);
			}
		}
	}
	

	public static void v(String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.v(className + "." + methodName + "():" + lineNumber,
//						message);
				Log.v(TAG,className + " ： " + lineNumber+"行："+
						message);
				
			}
		}
	}

	///
	public static void v(String TAG,String message) {
		if (DEBUG) {
			StackTraceElement[] elements = Thread.currentThread()
					.getStackTrace();
			if (elements.length < 3) {
				Log.e(TAG, "Stack to shallow");
			} else {
				String fullClassName = elements[3].getClassName();
				String className = fullClassName.substring(fullClassName
						.lastIndexOf(".") + 1);
				String methodName = elements[3].getMethodName();
				int lineNumber = elements[3].getLineNumber();
//				Log.v(className + "." + methodName + "():" + lineNumber,
//						message);
				Log.v(TAG,className + " ： " + lineNumber+"行："+
						message);
				
			}
		}
	}
	
}
