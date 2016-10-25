package baalze.pagecollector;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BaalzePageCollector {
	public static void main(String[] args){
		Document doc = null;
		try {
			//doc = Jsoup.connect("https://leetcode.com/problemset/algorithms/").get();
			doc = Jsoup.connect("https://leetcode.com/problems/two-sum/").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Elements links = doc.select("#mp-itn b a");
		Elements links = doc.select("a");
		for (Element e:links){
			System.out.println(e.attr("abs:href"));
		}
		System.out.println("---------------end---------------");
	}
}
