package uk.co.brotherlogic.mdb;

import java.io.File;

import uk.co.brotherlogic.mdb.alarm.Alarm;
import uk.co.brotherlogic.mdb.vgadd.VGAdd;

public class Utils
{
   public static void main(String[] args) throws Exception
   {
      if (args[0].equals("alarm"))
      {
         Alarm alrm = new Alarm(8, 30 * 60 * 1000, 10);
         alrm.run();
      }
      else if (args[0].equals("alarm2"))
      {
         Alarm alrm = new Alarm(10, 5 * 60 * 1000, 3);
         alrm.run();
      }
      else if (args[0].equals("vv"))
      {
         VGAdd adder = new VGAdd();
         adder.run(new File(args[1]));
      }
      else
         System.err.println("Unknown: : " + args[0]);

   }
}
