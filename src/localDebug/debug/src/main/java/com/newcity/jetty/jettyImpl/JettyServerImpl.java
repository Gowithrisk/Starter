package com.newcity.jetty.jettyImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.xml.XmlConfiguration;

import com.mysql.fabric.Server;
import com.newcity.jetty.IJettyServer;

public class JettyServerImpl implements IJettyServer
{

	private static final Logger logger = Logger.getLogger(JettyServerImpl.class);

	protected static final String debugPath = System.getProperty("user.dir"); // 程序的当前执行路径

	protected static final String debugResourcePath = debugPath + File.separator + "src" + File.separator;

	protected int serverPort = 0;

	protected int[] rpcPort = new int[1];

	protected Server jetty;

	protected XmlConfiguration jettyEnvConfig;

	protected List<Handler> HandlerList = new ArrayList<Handler>();

	/**
	 * 自动install
	 */
	// private Map<String, MavenModuleBean> jar2FolderName = new
	// HashMap<String,>();

	@Override
	public void addApp(String webAppFolder, String context) throws Exception
	{

	}

	@Override
	public void run()
	{

	}

}
