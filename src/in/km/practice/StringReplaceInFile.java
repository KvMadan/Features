/**
 * 
 */
package in.km.practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Madan Kavarthapu
 *
 */
public class StringReplaceInFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\apache-jmeter-4.0\\backups\\MTV3-ItalyOC-000001.jmx");
		Charset charset = StandardCharsets.UTF_8;

		String content = new String(Files.readAllBytes(path), charset);
		content = content.replaceAll("${Token}", "ASDFGHJKLPOIQWERTY=");
		Files.write(path, content.getBytes(charset));

	}

}
