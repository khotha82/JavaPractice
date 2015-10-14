package com.example.freemarker;

import java.io.*;
import java.util.*;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * Created by krishna_hotha on 5/19/15 2015.
 */
public class FreeMarkerTest {

	public static void main(String[] args) throws IOException, TemplateException {

		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(FreeMarkerTest.class, "/");
		configuration.setDefaultEncoding("UTF-8");
		configuration.setLocale(Locale.US);
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		Map<String, Object> input = new HashMap<String, Object>();

		input.put("title", "Vogella example");

		input.put("exampleObject", new ValueExampleObject("Java object", "me"));

		List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
		systems.add(new ValueExampleObject("Android", "Google"));
		systems.add(new ValueExampleObject("iOS States", "Apple"));
		systems.add(new ValueExampleObject("Ubuntu", "Canonical"));
		systems.add(new ValueExampleObject("Windows7", "Microsoft"));
		input.put("systems", systems);

		// 2.2. Get the template

		Template template = configuration.getTemplate("helloworld.ftl");

		// 2.3. Generate the output

		// Write output to the console
		Writer consoleWriter = new OutputStreamWriter(System.out);
		template.process(input, consoleWriter);

		// For the sake of example, also write output into a file:
		Writer fileWriter = new FileWriter(new File("output.html"));
		try {
			template.process(input, fileWriter);
		} finally {
			fileWriter.close();
		}

	}
}
