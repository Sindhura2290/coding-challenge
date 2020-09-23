package com.sindhura.codingchallenge;

import com.sindhura.codingchallenge.challenge.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.sindhura.codingchallenge.challenge.Hierarchy.display;
import static com.sindhura.codingchallenge.challenge.Hierarchy.hierarchy;

@SpringBootApplication
public class CodingChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.sindhura.codingchallenge.CodingChallengeApplication.class, args);
		String input = "null, 0, garndpa|0,1,son|0,2,daughter|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid";

		Node node = hierarchy(input);
		System.out.println(display(node));

	}

}
