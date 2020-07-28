package com.wipro.interfaces;

public class PlayableTest {
	

		public static void main(String[] args) {
			        Veena v = new Veena();
			        Saxophone s = new Saxophone();
			        //c. Place the above instances in a variable of type Playable and then call play()./
			         Playable pv = new Veena();
			         Playable ps = new Saxophone();
			        
			        v.play(); //a. Create an instance of Veena and call play() method/
			        s.play(); //b. Create an instance of Saxophone and call play() method/
			        
			        pv.play(); //c. Place the above instances in a variable of type Playable and then call play()./
			        ps.play();
			        
			    }
		}




