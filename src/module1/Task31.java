package module1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task31 {
	public static void main(String[] args) {
		String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
		String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
		System.out.println(printTextPerRole(roles, textLines));
	}

	public static String printTextPerRole(String[] roles, String[] textLines) {
		StringBuilder rez = new StringBuilder();
		for (String r : roles) {
			rez.append(r + ":\n"); // добавляем к роли : и переносим на следующую строку
			Pattern p = Pattern.compile(r + ":");//создаем шаблон "Роль:"
			for (int i = 0; i < textLines.length; i++) {
				Matcher m = p.matcher(textLines[i]); //проверяем, содержится ли шаблон в массиве текста к ролям
				if (m.find() && m.start() == 0) {
					rez.append(i + 1).append(") ").append((new StringBuilder(textLines[i])).delete(0, r.length() + 2).toString()).append("\n");
				}
			}
			rez.append("\n");
		}
		return rez.toString();
	}
}