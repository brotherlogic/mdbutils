package uk.co.brotherlogic.mdb;

import uk.co.brotherlogic.mdb.alarm.Alarm;

public class Utils
{
   public static void main(String[] args)
   {
      if (args[0].equals("alarm"))
      {
         Alarm alrm = new Alarm(8, 30 * 60 * 1000, 10);
         alrm.run();
      }
      if (args[0].equals("alarm2"))
      {
         Alarm alrm = new Alarm(10, 5 * 60 * 1000, 3);
         alrm.run();
      }

   }
}
