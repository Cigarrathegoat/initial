package personalProjects;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;

/**
 * Determine quais peças de uma máquina devem ser trocadas
 * e quando se deve trocar as que ainda não precisam ser trocadas agora.
 *
 * 1. estabalish when each piece must be replaced
 * 2. Gather information on when each piece was last replaced
 * 3. Calculate time remaining.
 * 4. if time for next replacement already elapsed, say so and say by how much
 * 5. if time for next replacement has not yet elapsed, say how long until it does
 *
 */

public class TimeToReplace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        //LocalDateTime

        Calendar today = Calendar.getInstance();
        String piece = "";
        String lastReplaced = "";
        int year = 0;

        System.out.println("Current date : " + (today.get(Calendar.MONTH) + 1) + "-"
                + today.get(Calendar.DATE) + "-" + today.get(Calendar.YEAR));

        System.out.println("Please input the piece you would like to know about:");
        piece = scanner.next();
        System.out.println("Thank you.\nNow please input the date it was last replaced.");
        lastReplaced = scanner.next();
        //Date lastReplaceDate = new SimpleDateFormat("dd/MM/yyyy").parse(lastReplaced);
        //try {
       //     long timeDifference = today.getTime() - lastReplaceDate.getTime();
        }


    }

