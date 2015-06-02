package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleProgram {

	public static void main(String[] args) throws IOException {
		System.out.println("HELLO WORLD");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(br.readLine().toString());

	}

}
