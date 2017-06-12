package com.newcity.jetty;

public interface IJettyServer
{
	void addApp(String webAppFolder, String context) throws Exception;

	void run();

}
