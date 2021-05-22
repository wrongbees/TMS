package com.Lesson7.task5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Censorship {
    private static String[] blackWords;

    public static void blackListFileSearcher(String file, String blackList) throws FileNotFoundException {
        String message = "Текст прошел проверку на цензуру";

        try (FileReader readerFile = new FileReader(file);
             BufferedReader blReader = new BufferedReader(new FileReader(blackList))) {

            /*
            формируем StringBuilder для черного списка,
             */
            StringBuilder blackString = new StringBuilder();

            while (blReader.ready()) {
                blackString.append(blReader.readLine());
            }
            /*
            формируем массив из слов "черного списка"
            в списке слова разделены запятой.
             */
            blackWords = blackString.toString().replace(" ", "").split(",");

            /*
            будем пробовать читать по словам из файла и проверять слово на наличие его в массиве
             */


            int oneByte;
            while (readerFile.ready()) {
                StringBuilder oneWord = new StringBuilder();
                /*
                читаем слово пока не упремся в пробел
                 */
                while ((oneByte = readerFile.read()) != 32 &
                        oneByte != 46 & oneByte != 44 & readerFile.ready()) {

                    if (oneByte != 10)//не будем аппендить возврат корретки
                        oneWord.append((char) oneByte);          // и перевод строки
                }

                String wordForCheck = oneWord.toString().replaceAll("\\s*(\\s|,|!|\\.|-|\\?|\\(|\\)|;|:)\\s*","");
                if (Censorship.censorshipСheck(wordForCheck)){ // вызываем метод проверки с черным списком
                    message = "Текст не прошел проверку на цензуру";
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(message);
    }

    private static boolean censorshipСheck(String wordForCheck){
        for (String blackWord : blackWords)
            if(wordForCheck.toLowerCase().equals(blackWord.toLowerCase())){
                System.out.println(wordForCheck);
                return true;
            }
        return false;

    }

    public static void main(String[] args) throws FileNotFoundException {

        Censorship.blackListFileSearcher("e:/test/source.txt", "e:/test/result.txt");
    }
}
