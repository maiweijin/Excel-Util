package com.bonade.util.excel;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ModelHandler implements MethodInterceptor {
	Method method;
	Object[] args;

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		this.method = method;
		this.args = args;
		return null;
	}

	public Method getMethod() {
		Method method = this.method;
		this.method = null;
		return method;
	}

	public Object[] getArgs() {
		Object[] args = this.args;
		this.args = null;
		return args;
	}
}
