package uk.co.brotherlogic.mdb.scores;

import uk.co.brotherlogic.mdb.record.GetRecords;
import uk.co.brotherlogic.mdb.record.Record;

public class PrintScores
{

   public void printScores(String form) throws Exception
   {
      for (Record rec : GetRecords.create().getAllRecords())
      {
         if (rec.getSoldPrice() < 0)
            if (rec.getFormat().getBaseFormat().equals(form))
            {
               System.out.println(rec.getScore() + " " + rec.getAuthor() + " - " + rec.getTitle());
            }
      }
   }

   public static void main(String[] args) throws Exception
   {
      PrintScores scores = new PrintScores();
      scores.printScores("CD");
   }

}
