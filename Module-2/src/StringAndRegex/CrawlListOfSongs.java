package StringAndRegex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlListOfSongs {
    public static final String PATH ="D:\\JAVA\\Module-2\\src\\TextCrawlFile.html";


    public static void main(String[] args) {


        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();

            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // remove all new line
            content = content.replaceAll("\\n+", "");

            // regex
            Pattern p = Pattern.compile("href\">(.*?)</a>");
            Matcher m = p.matcher(content);

            bufferedWriter.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "    \n" +
                    "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                    "</head>\n" +
                    "<body>\n");
            while (m.find()) {
                System.out.println(m.group(1) + "\n");
                bufferedWriter.write(m.group(1) + "\n");
            }

            bufferedWriter.write("</body>\n" +
                    "</html>");
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Successful");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
