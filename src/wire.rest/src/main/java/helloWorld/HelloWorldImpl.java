package helloWorld;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

import helloWorld.Interface.IHelloWorldRest;
import helloworld.hello.serviceImpl.SayHiServiceImpl;

@Path("hii")
public class HelloWorldImpl implements IHelloWorldRest
{
	Logger log = Logger.getLogger(HelloWorldImpl.class);

	@Inject
	private SayHiServiceImpl sayHiServiceImpl;

	public HelloWorldImpl()
	{

	}

	@Override
	@Path("say")
	@GET
	public String sayHello()
	{
		log.info("sayHello, check!");
		String something = null;
		try
		{
			something = sayHiServiceImpl.sayHello();
		}
		catch (Exception e)
		{
			log.error("say hi Error:" + e.getMessage());
		}
		return something;
	}

}
