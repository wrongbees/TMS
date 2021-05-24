package com.Lesson7.task5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Censorship {
    private static String[] blackWords;

    public static void blackListFileSearcher(String file, String blackList) throws FileNotFoundException {


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
            int countOffer = 0;
            while (readerFile.ready()) {
                StringBuilder oneOffer = new StringBuilder();
                /*
                читаем слово пока не упремся в пробел
                 */
                while ((oneByte = readerFile.read()) != 46 & oneByte != -1 & oneByte != 63 & oneByte != 33) {

                    if (oneByte != 10 & oneByte != 13 )//не будем аппендить возврат корретки
                        oneOffer.append((char) oneByte);          // и перевод строки
                }

                String offerForCheck = oneOffer.toString().replaceAll(",|!|\\.|-|\\?|\\(|\\)|;|:", "");
                if (Censorship.checkTheOffer(offerForCheck.split(" "))) {
                    System.out.println("Обнаружено не допустимое слово в предложении:");
                    System.out.println(oneOffer.toString());
                    countOffer++;
                }

            }
            if (countOffer == 0) {
                System.out.println("Текст прошел проверку на цензуру");
            } else {
                System.out.println("Обнаружено "+countOffer+" предложений подлежащих исправлению.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean censorshipСheck(String wordForCheck) {
        for (String blackWord : blackWords)
            if (wordForCheck.toLowerCase().equals(blackWord.toLowerCase())) {
                return true;
            }
        return false;

    }

    private static boolean checkTheOffer(String[] words) {
        boolean result = false;
        for (String word : words) {
            if (censorshipСheck(word)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Censorship.blackListFileSearcher("e:/test/source.txt", "e:/test/result.txt");
    }
}
