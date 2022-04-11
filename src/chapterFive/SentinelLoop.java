package chapterFive;

import java.security.SecureRandom;

public class SentinelLoop {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int count = 0;

            for( ;count <= 100; ) {
                count = random.nextInt(150);
                System.out.println(count);
            }

            while ( count != 100) {
                count = random. nextInt(150);
                System.out.println(count);
            }

            for( ; ; ) {
                count = random.nextInt(150);
                System.out.println(count);
                if (count == 100){
                    break;
                }
            }
        }
    }