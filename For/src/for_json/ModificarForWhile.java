package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
		Matcher matcher = pattern.matcher(example);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		Pattern p = pattern.compile("\\d+");
		Matcher m = p.matcher("\nhello1234goodboy789very2345");
		while (m.find()) {
			System.out.println(m.group());
		}
		
		
		String text = "John speak  and John writes about that,\"\r\n"
				+ "				+ \" and John think 2021.10.10 about everything. ";
		String nome = "(John)";
		Pattern patternNome = Pattern.compile(nome);
		Matcher matcherNome = patternNome.matcher(text);
		//StringBuffer stringBuffer = new StringBuffer();
		
		while (matcherNome.find()) {
			System.out.println("found: " + matcherNome.group());
		}
	}
}
