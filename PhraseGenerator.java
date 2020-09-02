public class PhraseGenerator {
   public static void main(String[] args) {
      while (true) {
         String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
               "pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

         String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
               "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
               "targeted", "shared", "cooperative", "accelerated" };

         String[] wordListThree = { "process", "tipping-point", "solution", "architecture", "core competency",
               "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };
         int oneLength = wordListOne.length;
         int twoLength = wordListTwo.length;
         int threeLength = wordListThree.length;

         int oneRandom = (int) (Math.random() * oneLength);
         int twoRandom = (int) (Math.random() * twoLength);
         int threeRandom = (int) (Math.random() * threeLength);

         String phrase = "What we need is a " + wordListOne[oneRandom] + " " + wordListTwo[twoRandom] + " "
               + wordListThree[threeRandom];
         System.out.println(phrase);
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
