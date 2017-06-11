package helloworld.hello.serviceImpl;

import javax.inject.Inject;

import helloworld.hello.SayHelloBusinessImpl;
import service.ISayHiApi;

public class SayHiServiceImpl implements ISayHiApi
{

	@Inject
	private SayHelloBusinessImpl sayHelloImpl;

	@Override
	public String sayHello() throws Exception
	{
		return sayHelloImpl.sayHello();
	}

}
