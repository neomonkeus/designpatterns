package decorator.iostream;

import java.io.*;

public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		int c;
		
		try {
			InputStream in =
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));
			
			while((c = in.read()) >= 0 ){
				System.out.println((char)c);
			}
			
			in.close();
		}
		
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
