package ru.stqa.pft.coolbox;

   class Drumkit {

       boolean topHat = true;
       boolean snare = true;

       void playTopHat () {
           System.out.println("динь динь ди-динь");
       }

       void playSnare () {
           System.out.println("бах бах ба-бах");
       }
   }
    class DrumKitTestDrive {
        public static void main(String[] args) {
            Drumkit d = new Drumkit();
            d.playSnare();
            d.snare = true;
            d.playTopHat();
            if (d.snare = false) {
                d.playSnare();
            }
        }
    }








