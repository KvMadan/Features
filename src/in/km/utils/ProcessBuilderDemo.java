/**
 * 
 */
package in.km.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Madan Kavarthapu
 *
 */
public class ProcessBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		
		// Creating List of commands
		List<String> list = new ArrayList<String>();
		list.add("C:\\Program Files (x86)\\Micro Focus\\LoadRunner\\bin\\CLIControllerApp.exe");
		list.add("-InputFile");
		list.add("C:\\Users\\madanka\\Desktop\\KM\\CLI\\LR_CLI_Web_1.xml");
		list.add("-CollateAndAnalyze");
		list.add("-ResultName");
		list.add("C:\\Temp\\CLI_Results");
		
		// Create the Process
		ProcessBuilder build = new ProcessBuilder(list);
		
		// Setting the Directory 
		//build.directory(new File("C:\\Program Files (x86)\\Micro Focus\\LoadRunner\\bin\\"));
		
		// Checking the command list 
		System.out.println("Command: " + build.command());
		
		// Checking the directory, on which currenty working on 
		System.out.println("Directory: " + build.directory());
		
		// Map view of this process builder's enviornment
		Map<String, String> envMap = build.environment();
		
		// Checking map view of environment 
		for (Map.Entry<String, String> entry: envMap.entrySet()) {
			
			// Checking Key & Value Separately
			System.out.println(entry.getKey() + " |--> " + entry.getValue());
		}
		
		// Redirecting the Error Stream 
		build.redirectErrorStream(true);
		
		// Checking if error stream is redirected
		System.out.println("Is Error Stream Redirected? : " + build.redirectErrorStream());
		
		// Starting the process
		System.out.println(build.command());
		Process process = build.start();
		
		// Reading the output from the stream 
		BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s = null;
		while ((s = input.readLine()) != null) {
			System.out.println(s);
		}
	}
}
