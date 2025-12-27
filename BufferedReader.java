package tnsif.userinputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Location Name: ");
		String location = br.readLine();
		
		System.out.println("Enter Location Code: ");
		int code = Integer.parseInt(br.readLine());
		
		System.out.println("The location name is: "+ location + " and the location code is: "+code);

	}

}
