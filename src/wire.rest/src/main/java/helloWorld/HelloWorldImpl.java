package helloWorld;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import helloWorld.Interface.IHelloWorldRest;
import service.ISayHiApi;

public class HelloWorldImpl implements IHelloWorldRest
{
	Logger log = Logger.getLogger(HelloWorldImpl.class);

	@Inject
	private ISayHiApi wireapi;

	@Override
	public String sayHello()
	{
		String something = null;
		try
		{
			something = wireapi.sayHello();
		}
		catch (Exception e)
		{
			log.error("say hi Error:" + e.getMessage());
		}
		return something;
	}

}
