package com.sushant.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\bookmarks.html");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		Pattern patt = Pattern.compile("<DT><A HREF=\"(.*?)\"");
		Matcher tagmatch = null;
		while ((line = br.readLine()) != null) {
			tagmatch = patt.matcher(line);
			while (tagmatch.find()) {
				for (int i = 1; i <= tagmatch.groupCount(); i++) {
					System.out.println(tagmatch.group(i));
				}
			}
		}
	}
}
