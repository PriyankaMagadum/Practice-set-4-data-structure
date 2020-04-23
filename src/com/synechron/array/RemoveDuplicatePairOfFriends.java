package com.synechron.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatePairOfFriends {

	public void removeDuplicatePairOfFriends() throws IOException {

		File file = new File("pair.txt");
		FileReader reader;
		try {
			reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
			StringBuffer sb = new StringBuffer();
			String line;

			List<String> list = new LinkedList<>();
			List<Integer> linenumber = new LinkedList<>();

			int count = 0;
			list.add(buffReader.readLine().trim());

			while ((line = buffReader.readLine()) != null) {
				sb.append(line);
				Iterator<String> itr = list.iterator();
				for (int i = 0; i < list.size(); i++) {

					String s = list.get(i);
					String str1[] = s.split(",");
					String str2[] = line.split(",");

					if (str1[0].trim().equals(str2[0].trim())) {
						break;
					} else if (str1[1].trim().equals(str2[0].trim())) {
						break;
					} else if (str1[0].trim().equals(str2[1].trim())) {
						break;
					} else if (str1[1].trim().equals(str2[1].trim())) {
						break;
					} else {
						list.add(line.trim());
						break;
					}
				}

			}

			Path path = Paths.get("pair.txt");
			try (BufferedWriter writer = Files.newBufferedWriter(path)) {
				for (String s : list) {

					writer.write(s);
					writer.newLine();
				}
				System.out.println("Removed Duplicate Pair of Friends.....................Please check in pair.txt");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		RemoveDuplicatePairOfFriends removeDuplicatePairOfFriends = new RemoveDuplicatePairOfFriends();
		removeDuplicatePairOfFriends.removeDuplicatePairOfFriends();
	}

}
