package com.tsr.pack;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.WebResourceSet;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class EmbeddedServer {

	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9009);

		StandardContext context = (StandardContext) tomcat.addWebapp("/embiddedtomcat",
				new File("src/main/webapp").getAbsolutePath());

		WebResourceRoot resourceRoot = new StandardRoot(context);

		WebResourceSet classesSet = new DirResourceSet(resourceRoot, "/WEB-INF/classes",
				new File("target/classes").getAbsolutePath(), "/");

		resourceRoot.addPreResources(classesSet);

		context.setResources(resourceRoot);

		tomcat.start();

		tomcat.getServer().await();
	}
}
