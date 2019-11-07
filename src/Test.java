
public class Test {


	public static void main(String[] args) {

	placeBoatTest();
	shootAtTest();
	hitTest();
	boatInitialTest();
	boatNameTest();
	sunkTest();
	allSunkTest();
	}

	public static void placeBoatTest() {
		System.out.println("\n--------------------------------------placeBoat Test------------------------------");
		/*FIX THIS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		 * */


		//		Place a vertical aircraft carrier in the middle of the board. Should not throw exception. 
		//		Test Script: 
		boolean works = true;
		System.out.println("Place a vertical aircraft carrier in the middle of the board.\n Should Print:   TRUE.");
		GoodOcean ocean1 = new GoodOcean();
		Boat boat11 = new Boat("Aircraft Carrier", new Position(4,4), "vertical");
		try { ocean1.placeBoat(boat11.name(),boat11.direction(),boat11.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
			works= false;
		}
		System.out.println("Actual output: " + works);













		//		Place a horizontal battleship that starts at the bottom right corner. Should throw exception (array index out of bounds)
		//		Test Script:

		boolean works2 = false;
		System.out.println("\nPlace horizontal battleship that starts at the bottom right corner.\n Should Print:   TRUE.");
		GoodOcean ocean2 = new GoodOcean();
		Boat boat21 = new Boat("Horizontal", new Position(9,9), "horizontal");
		try { ocean2.placeBoat(boat21.name(),boat21.direction(),boat21.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works2= true;
			//System.out.println(ex);
		}
		System.out.println("Actual output: " + works2);





		//		Place a vertical Destroyer that starts on the bottom left square. should throw exception
		//		Test Script:

		boolean works3 = false;
		System.out.println("Place horizontal battleship that starts at the bottom right corner.\n Should Print:   FALSE.");
		GoodOcean ocean3 = new GoodOcean();
		Boat boat31 = new Boat("Destroyer", new Position(9,0), "horizontal");
		try { ocean3.placeBoat(boat31.name(),boat31.direction(),boat31.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works3= true;
		}
		System.out.println("Actual output: " + works3);



		//		Place a vertical destroyer that starts on the top left corner. 
		//Then, place a vertical cruiser that starts from the same starting position. 
		//Should throw and exception (ADD THE EXCEPTION NAME HERE)
		//		Test Script:

		boolean works4 = false;
		System.out.println("Place two boats on top left corner.\n Should Print:   true");
		GoodOcean ocean4 = new GoodOcean();
		Boat boat41 = new Boat("Destroyer", new Position(0,0), "vertical");
		Boat boat42 = new Boat("Cruiser", new Position(0,0), "vertical");
		try { ocean4.placeBoat(boat41.name(),boat41.direction(),boat41.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		try { ocean4.placeBoat(boat42.name(),boat42.direction(),boat42.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works4= true;
		}
		System.out.println("Actual output: " + works4);




		//		Place a horizontal cruiser that starts in the middle of the board. 
		//      Place a vertical battleship that starts from the same starting position as the cruiser. 
		//		Should throw exception.
		//		Test Script:

		boolean works5 = false;
		System.out.println("Place vertical boat and horizontal boat in same position in middle of board\n Should Print:   true");
		GoodOcean ocean5 = new GoodOcean();
		Boat boat51 = new Boat("Cruiser", new Position(5,5), "horizontal");
		Boat boat52 = new Boat("Battleship", new Position(5,5), "vertical");
		try { ocean5.placeBoat(boat51.name(),boat51.direction(),boat51.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		try { ocean5.placeBoat(boat52.name(),boat52.direction(),boat52.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works5= true;
		}
		System.out.println("Actual output: " + works5);





		//		Place a horizontal cruiser that starts in the middle of the board. 
		//Place a vertical battleship that starts from the position directly below the starting position of the cruiser.
		//Should not throw exception.
		//		Test Script:

		boolean works6 = true;
		System.out.println("Place vertical boat below horizontal boat \n Should Print:   true");
		GoodOcean ocean6 = new GoodOcean();
		Boat boat61 = new Boat("Cruiser", new Position(5,5), "horizontal");
		Boat boat62 = new Boat("Battleship", new Position(6,5), "vertical");
		try { ocean6.placeBoat(boat61.name(),boat61.direction(),boat61.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		try { ocean6.placeBoat(boat62.name(),boat62.direction(),boat62.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works6= false;
		}
		System.out.println("Actual output: " + works6);




		boolean works7 = false;
		System.out.println("Place vertical boat that overlaps in the last position with a horizontal boat \n Should Print:   true");
		GoodOcean ocean7 = new GoodOcean();
		Boat boat71 = new Boat("Cruiser", new Position(5,5), "horizontal");
		Boat boat72 = new Boat("Battleship", new Position(2,7), "vertical");
		try { ocean7.placeBoat(boat71.name(),boat71.direction(),boat71.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		try { ocean7.placeBoat(boat72.name(),boat72.direction(),boat72.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }

			works7= true;
		}
		System.out.println("Actual output: " + works7);





		/*	System.out.println("Place a vertical aircraft carrier in the middle of the board. Should not throw exception.");
		Boat thisBoat = new Boat("Aircraft Carrier", new Position(4,4), "vertical");
		System.out.println("Should print false");
		System.out.println("-------------------------------------------------------------------------\n");
		 */

		System.out.println("-----------------------------------hit TEST--------------------------------------\n");
	}


	public static void shootAtTest() {
		System.out.println("\n -------------shoot at test----------------------------------");
		//		Shoots at a position in each of the corners of the ocean where no boat is placed
		GoodOcean ocean = new GoodOcean();
		Boat boat1 = new Boat("Aircraft Carrier", new Position(3,3), "vertical");
		Boat boat2 = new Boat("Battleship", new Position(3,4), "vertical");
		Boat boat3 = new Boat("Cruiser", new Position(3,5), "vertical");
		Boat boat4 = new Boat("Destroyer", new Position(3,6), "vertical");
		Boat boat5 = new Boat("Submarine", new Position(3,7), "vertical");

		try {
			ocean.placeBoat(boat1.name(), boat1.direction(), boat1.position());
			ocean.placeBoat(boat2.name(), boat2.direction(), boat2.position());
			ocean.placeBoat(boat3.name(), boat3.direction(), boat3.position());
			ocean.placeBoat(boat4.name(), boat4.direction(), boat4.position());
			ocean.placeBoat(boat5.name(), boat5.direction(), boat5.position());
		} catch(Exception ex) {
		}


		ocean.shootAt(new Position(0,0));
		ocean.shootAt(new Position(9,0));
		ocean.shootAt(new Position(0,9));
		ocean.shootAt(new Position(9,9));
		System.out.println("Shoots at a position in each of the corners of the ocean where no boat is placed");
		System.out.println("Should Return False");
		System.out.println(ocean.hit(new Position(0,0)));
		System.out.println("Should Return False");
		System.out.println(ocean.hit(new Position(9,0)));
		System.out.println("Should Return False");
		System.out.println(ocean.hit(new Position(0,9)));
		System.out.println("Should Return False");
		System.out.println(ocean.hit(new Position(9,9)));
		System.out.println("");

		//		Shoots at the position directly outside of the boat should not record that anything has been hit in that spot

		System.out.println("Shoots at the position directly outside of the boat should not record that anything has been hit in that spot");
		GoodOcean ocean1 = new GoodOcean();
		try {
			ocean1.placeBoat("Aircraft Carrier", "vertical", new Position(4,4));
		} catch(Exception ex) {
		}

		ocean1.shootAt(new Position(4,5));
		System.out.println("Should print false");
		System.out.println(ocean1.hit(new Position(4,5)));


		//		Shoots at the edges of boat should record that the boat has been hit at the selected spot of the ocean

		GoodOcean ocean2 = new GoodOcean();
		Boat boat6 = new Boat("Aircraft Carrier", new Position(4,4), "vertical");
		try{
			ocean2.placeBoat(boat6.name(), boat6.direction(), boat6.position());
		} catch(Exception ex) {
		}

		ocean2.shootAt(new Position(4,4));
		ocean2.shootAt(new Position(8,4));

		System.out.println("Shoot at the edges of boat (aircraft carrier), should record that the boat has been hit at the selected part of the ocean, should return true");
		System.out.println(ocean2.hit(new Position(4,4)));
		System.out.println("Shoot at the edges of boat (aircraft carrier), should record that the boat has been hit at the selected part of the ocean, should return true");
		System.out.println(ocean2.hit(new Position(8,4)));

		//		Shoots at the middle of the boat and should record that the boat has been hit at the specific spot in the ocean

		ocean2.shootAt(new Position(6,4));
		System.out.println("Shoots at the middle of the boat and should record that the boat has been hit at the specific spot in the ocean, should return true");
		System.out.println(ocean2.hit(new Position(6,4)));


		//		Shoots at the boat in each corner of the ocean and should record the position that has been hit in each position.

		GoodOcean ocean3 = new GoodOcean();
		Boat boat7 = new Boat("Submarine", new Position(0,0), "vertical");
		Boat boat8 = new Boat("Destroyer", new Position(9,0), "horizontal");
		Boat boat9 = new Boat("Battleship", new Position(0,9), "vertical");
		Boat boat10 = new Boat("Cruiser", new Position (9, 7), "horizontal");
		try {
			ocean3.placeBoat(boat7.name(), boat7.direction(), boat7.position());
			ocean3.placeBoat(boat8.name(), boat8.direction(), boat8.position());
			ocean3.placeBoat(boat9.name(), boat9.direction(), boat9.position());
			ocean3.placeBoat(boat10.name(), boat10.direction(), boat10.position());
		} catch (Exception ex) {
		}

		ocean3.shootAt(new Position(0,0));
		ocean3.shootAt(new Position(9,0));
		ocean3.shootAt(new Position(0,9));
		ocean3.shootAt(new Position(9,9));
		System.out.println("Shoots at the boat in each corner of the ocean and should record the position that has been hit in each position, should return true");
		System.out.println(ocean3.hit(new Position(0,0)));
		System.out.println("Shoots at the boat in each corner of the ocean and should record the position that has been hit in each position, should return true");
		System.out.println(ocean3.hit(new Position(9,0)));
		System.out.println("Shoots at the boat in each corner of the ocean and should record the position that has been hit in each position, should return true");
		System.out.println(ocean3.hit(new Position(0,9)));
		System.out.println("Shoots at the boat in each corner of the ocean and should record the position that has been hit in each position, should return true");
		System.out.println(ocean3.hit(new Position(9,9)));

	}






	static void hitTest() {
		//		Place a horizontal boat on the board and call hit one position above the starting position. Should return false
		//		Test Script:
		GoodOcean a = new GoodOcean();
		Boat test1 = new Boat("Aircraft Carrier", new Position(4,4), "horizontal");
		try { a.placeBoat(test1.name(),test1.direction(),test1.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		System.out.println("horiz Aircraft Carrier in middle of board; call hit one above boat.  \n should return : False");
		a.shootAt(new Position(3,4));
		System.out.println("Actual output: " + a.hit(new Position(3,4)));




		//		Place a horizontal boat on the board and call hit one position right of the starting position. Should return true
		//		Test Script:

		GoodOcean b = new GoodOcean();
		Boat test2 = new Boat("Submarine", new Position(4,4), "horizontal");
		try { b.placeBoat(test2.name(),test2.direction(),test2.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		System.out.println("horiz Submarine in middle of board; call hit right of starting position.  \n should return : True");
		b.shootAt(new Position(4,5));
		System.out.println("Actual output: " + b.hit(new Position(4,5)));

		//		Place a horizontal boat on the board and call hit one position left of the starting position. Should return false
		//		Test Script:
		System.out.println("horiz Submarine in middle of board; call hit one position left of starting position.  \n should return : False");
		b.shootAt(new Position(4,3));
		System.out.println("Actual output: " + b.hit(new Position(4,3)));




		//		Place a horizontal boat on the board and call hit one position below the starting position. Should return false
		//		Test Script:

		System.out.println("horiz Submarine in middle of board; call hit one position below starting position.  \n should return : False");
		b.shootAt(new Position(5,4));
		System.out.println("Actual output: " + b.hit(new Position(5,4)));


		//		Place a vertical boat on the board and call hit one position above the starting position. Should return false
		//		Test Script:

		GoodOcean c = new GoodOcean();
		Boat test3 = new Boat("Cruiser", new Position(4,4), "vertical");
		try { c.placeBoat(test3.name(),test3.direction(),test3.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		System.out.println("Vertical cruiser in middle of board; call hit one position above starting position.  \n should return : False");
		c.shootAt(new Position(3,4));
		System.out.println("Actual output: " + c.hit(new Position(3,4)));




		//		Place a vertical boat on the board and call hit one position right of the starting position. Should return false
		//		Test Script:

		System.out.println("Vertical cruiser in middle of board; call hit one position right of starting position.  \n should return : False");
		c.shootAt(new Position(4,5));
		System.out.println("Actual output: " + c.hit(new Position(4,5)));


		//		Place a vertical boat on the board and call hit one position left of the starting position. Should return false
		//		Test Script:
		System.out.println("Vertical cruiser in middle of board; call hit one position left of starting position.  \n should return : False");
		c.shootAt(new Position(4,3));
		System.out.println("Actual output: " + c.hit(new Position(4,3)));
		//		Place a vertical boat on the board and call hit one position below the starting position. Should return true.
		//		Test Script:
		System.out.println("Vertical cruiser in middle of board; call hit one position below starting position.  \n should return : True");
		c.shootAt(new Position(5,4));
		System.out.println("Actual output: " + c.hit(new Position(5,4)));

		//		Place a horizontal Battleship on the board and call hit one position left of the ending position. Should return true
		//		Test Script:
		GoodOcean d = new GoodOcean();
		Boat test4 = new Boat("Battleship", new Position(8,5), "horizontal");
		try { d.placeBoat(test4.name(),test4.direction(),test4.position()); 
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		System.out.println("horizontal battleship in middle of board; call hit one position left of ending position.  \n should return : true");
		d.shootAt(new Position(8,7));
		System.out.println("Actual output: " + d.hit(new Position(8,7)));

		//		Place a horizontal boat on the board and call hit one position right of the ending position and call on the position above the ending position and call on the position below the ending position. Should return false.
		//		Test Script:

		System.out.println("horizontal battleship in middle of board; call hit one position above of ending position.  \n should return : false");
		d.shootAt(new Position(7,7));
		System.out.println("Actual output: " + d.hit(new Position(7,7)));

		System.out.println("horizontal battleship in middle of board; call hit one position right of ending position.  \n should return : false");
		d.shootAt(new Position(7,8));
		System.out.println("Actual output: " + d.hit(new Position(7,8)));

		System.out.println("horizontal battleship in middle of board; call hit one position below of ending position.  \n should return : false");
		d.shootAt(new Position(9,7));
		System.out.println("Actual output: " + d.hit(new Position(9,7)));


	}

	static public void boatInitialTest() {
		System.out.println("-----------------------------BOATINITIAL TEST--------------------------------------------\n");
		//				If a position at the right edge of an aircraft carrier has been hit, pass the corresponding position of the boat. Should return ‘A.’
		//				Test Script:

		GoodOcean a = new GoodOcean();
		Boat test1 = new Boat("Aircraft Carrier", new Position(0,4), "horizontal");
		try { a.placeBoat(test1.name(),test1.direction(),test1.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		a.shootAt(new Position(0,8));
		System.out.println("Right position of aircraft carrier hit, pass that position.  \n boatInitial should return : A");
		System.out.println("Actual output: " + a.boatInitial(new Position (0,8)));


		//				If a position at the right edge of a destroyer has been hit, pass the corresponding initial of the boat. Should return ‘D.’
		//				Test Script:


		Boat test2 = new Boat("Destroyer", new Position(5,4), "horizontal");
		try { a.placeBoat(test2.name(),test2.direction(),test2.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		a.shootAt(new Position (5,5));
		System.out.println("\nRight position of destroyer hit, pass that position. \n boatInitial should return : D.");
		System.out.println("Actual output: " + a.boatInitial(new Position (5,5)));



		//				If a position at the right edge of a cruiser has been hit, pass the corresponding initial of the boat. Should return ‘C.’
		//				Test Script:

		Boat test3 = new Boat("Cruiser", new Position(7,5), "horizontal");
		try { a.placeBoat(test3.name(),test3.direction(),test3.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		a.shootAt(new Position (7,7));
		System.out.println("\nRight position of Cruiser hit, pass that position. \n boatInitial should return : C.");
		System.out.println("Actual output: " + a.boatInitial(new Position (7,7)));



		//				If a position at the right edge of a submarine has been hit, pass the corresponding initial of the boat. Should return ‘S.’
		//				Test Script:
		GoodOcean oc = new GoodOcean();
		Boat test4 = new Boat("Submarine", new Position(8,5), "horizontal");
		try { oc.placeBoat(test4.name(),test4.direction(),test4.position()); 
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		oc.shootAt(new Position (8,7));
		System.out.println("\nRight position of Submarine hit, pass that position. \n boatInitial should return : S.");
		System.out.println("Actual output: " + oc.boatInitial(new Position (8,7)));



		//				If a position at the right edge of a battleship has been hit, pass the corresponding initial of the boat. Should return ‘B.’
		//				Test Script:

		Boat test5 = new Boat("Battleship", new Position(9,5), "horizontal");
		try { a.placeBoat(test5.name(),test5.direction(),test5.position()); 
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		a.shootAt(new Position (9,8));
		System.out.println("\nRight position of Battleship hit, pass that position. \n boatInitial should return : B.");
		System.out.println("Actual output: " + a.boatInitial(new Position (9,8)));



		//				Place a vertical cruiser on the middle of the board. Hit all the positions of the  cruiser, and call the boatInitial method while passing in the position immediately right of the starting position of the cruiser. It should not return anything 
		//				Test Script:

		GoodOcean b = new GoodOcean();
		Boat test6 = new Boat("Cruiser", new Position(4,4), "vertical");
		try { b.placeBoat(test6.name(),test6.direction(),test6.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		b.shootAt(new Position (4,4));
		b.shootAt(new Position (5,4));
		b.shootAt(new Position (6,4));
		System.out.println("\nAll positions of Cruiser hit, pass position right of the Cruiser.  \n boatInitial should return nothing : .");
		System.out.println("Actual output: " + b.boatInitial(new Position (4,5)));
		System.out.println("\nAll positions of Cruiser hit, pass position left of the Cruiser.  \n boatInitial should return nothing : .");
		System.out.println("Actual output: " + b.boatInitial(new Position (4,3)));
		System.out.println("\nAll positions of Cruiser hit, pass position below the Cruiser.  \n boatInitial should return nothing : .");
		System.out.println("Actual output: " + b.boatInitial(new Position (7,4)));
		System.out.println("\nAll positions of Cruiser hit, pass position above the Cruiser.  \n boatInitial should return nothing : .");
		System.out.println("Actual output: " + b.boatInitial(new Position (3,4)));





		//				Place a horizontal destroyer on the right edge of the board. Hit all the positions of the boat and call boatInitial, passing in the position directly above the starting position of the destroyer; it should not return anything. 
		//				Test Script:

		Boat test7 = new Boat("Destroyer", new Position(4,9), "horizontal");
		try { b.placeBoat(test7.name(),test7.direction(),test7.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		b.shootAt(new Position (4,9));
		b.shootAt(new Position (5,9));
		System.out.println("\nAll positions of destroyer hit, pass position above it. \n boatInitial should return nothing: ");
		System.out.println("Actual output: " + b.boatInitial(new Position (3,9)));



	}


	public static void boatNameTest() {
	   	 // DONE   	Place a horizontal Aircraft Carrier boat on the board, calls boatName, should return “Aircraft Carrier.”
	   	 // DONE           	Test Script:
	   	 // DONE           	Place a horizontal Battleship boat on the board , calls boatName, should return “Battleship.”
	   	 // DONE          	Test Script:
	   	 // DONE       	Place a horizontal Cruiser boat on the board, calls boatName, should return “Cruiser.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a horizontal Destroyer boat on the board, calls boatName, should return “Destroyer.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a horizontal Submarine boat on the board, calls boatName, should return “Submarine.”
	   	 // DONE       	Test Script:    
	   	 // DONE       	Place a vertical Aircraft Carrier boat on the board , calls boatName, should return “Aircraft Carrier.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a vertical Battleship boat on the board , calls boatName, should return “Battleship.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a vertical Cruiser boat on the board, calls boatName, should return “Cruiser.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a vertical Destroyer boat on the board, calls boatName, should return “Destroyer.”
	   	 // DONE       	Test Script:
	   	 // DONE       	Place a vertical Submarine boat on the board, calls boatName, should return “Submarine.”
	   	 // DONE       	Test Script:
	   	 boolean horizontalAircraftCarrier = false;
	   	 boolean verticalAircraftCarrier = false;
	   	 
	   	 boolean horizontalBattleship = false;
	   	 boolean verticalBattleship = false;
	   	 
	   	 boolean horizontalCruiser = false;
	   	 boolean verticalCruiser = false;
	   	 
	   	 boolean horizontalSubmarine = false;
	   	 boolean verticalSubmarine = false;

	   	 boolean horizontalDestroyer = false;
	   	 boolean verticalDestroyer = false;
	   	 System.out.println("Test : \nPlace a horizontal Aircraft Carrier boat on the board, calls boatName, should return “Aircraft Carrier.”");
	   	 for(int a = 0; a < 6; a++) {
	   		 for(int b = 0; b <  6; b++) {

	   			 GoodOcean ocean1 = new GoodOcean();

	   			 Boat aircraftCarrierTest = new Boat("Aircraft Carrier", new Position(a,a), "horizontal");
	   			 try{ocean1.placeBoat(aircraftCarrierTest.name(), aircraftCarrierTest.direction(), aircraftCarrierTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean1.shootAt(aircraftCarrierTest.position());
	   			 if(ocean1.boatName(aircraftCarrierTest.position()).equalsIgnoreCase("Aircraft Carrier") ) {
	   				 horizontalAircraftCarrier = true;
	   			 }else {
	   				 System.out.println(aircraftCarrierTest.direction() + " AND " +  "X: " + a + "  	Y: " + b );
	   				 horizontalAircraftCarrier = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("AircraftCarrier Works on all Spaces: " + horizontalAircraftCarrier);
	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 
	   	 
	   	 System.out.println("--------------------------------------------------------------------");
	   	 
	   	 System.out.println("Test : \nPlace a horizontal Battleship boat on the board , calls boatName, should return “Battleship.");
	   	 for(int a = 0; a < 7; a++) {
	   		 for(int b = 0; b <  7; b++) {
	   			 GoodOcean ocean2 = new GoodOcean();
	   			 Boat battleshipTest = new Boat("Battleship", new Position(a,b), "horizontal");
	   			 try{ocean2.placeBoat(battleshipTest.name(), battleshipTest.direction(), battleshipTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean2.shootAt(battleshipTest.position());
	   			 if(ocean2.boatName(battleshipTest.position()).equalsIgnoreCase("Battleship") ) {
	   				 horizontalBattleship = true;
	   			 }else {
	   				 System.out.println(battleshipTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 horizontalBattleship= false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Battleship Works on all Spaces: " + horizontalBattleship);
	   	 System.out.println("--------------------------------------------------------------------");

	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 
	   	 
	   	 System.out.println("Test : \nPlace a horizontal Cruiser boat on the board, calls boatName, should return “Cruiser.”");
	   	 for(int a = 0; a < 8; a++) {
	   		 for(int b = 0; b <  8; b++) {

	   			 GoodOcean ocean3 = new GoodOcean();
	   			 Boat cruiserTest = new Boat("Cruiser", new Position(a,b), "horizontal");
	   			 try{ocean3.placeBoat(cruiserTest.name(), cruiserTest.direction(), cruiserTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean3.shootAt(cruiserTest.position());
	   			 if(ocean3.boatName(cruiserTest.position()).equalsIgnoreCase("Cruiser") ) {
	   				 horizontalCruiser = true;
	   			 }else {
	   				 System.out.println(cruiserTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 horizontalCruiser = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Cruiser Works on all Spaces: " + horizontalCruiser);
	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --     
	   	 System.out.println("--------------------------------------------------------------------");
	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 
	   	 
	   	 System.out.println("Test : \nPlace a horizontal Submarine boat on the board, calls boatName, should return “Submarine.");
	   	 for(int a = 0; a < 8; a++) {
	   		 for(int b = 0; b <  8; b++) {

	   			 GoodOcean ocean4 = new GoodOcean();
	   			 Boat submarineTest = new Boat("Submarine", new Position(a,b), "horizontal");
	   			 try{ocean4.placeBoat(submarineTest.name(), submarineTest.direction(), submarineTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean4.shootAt(submarineTest.position());
	   			 
	   			 if(ocean4.boatName(submarineTest.position()).equalsIgnoreCase("Submarine") ) {
	   				 horizontalSubmarine = true;
	   			 }else {
	   				 System.out.println(submarineTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 horizontalSubmarine = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Submarine Works on all Spaces: " + horizontalSubmarine);
	   	      
	   	 System.out.println("--------------------------------------------------------------------");
	   	 
	   	 
	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
	   	 
	   	 
	   	 
	   	 System.out.println("Test : \nPlace a horizontal Destroyer boat on the board, calls boatName, should return “Destroyer.");
	   	 for(int a = 0; a < 9; a++) {
	   		 for(int b = 0; b <  9; b++) {

	   			 GoodOcean ocean5 = new GoodOcean();
	   			 Boat destroyerTest = new Boat("Destroyer", new Position(4,4), "horizontal");
	   			 try{ocean5.placeBoat(destroyerTest.name(), destroyerTest.direction(), destroyerTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean5.shootAt(destroyerTest.position());
	   			 if(ocean5.boatName(destroyerTest.position()).equalsIgnoreCase("Destroyer") ) {
	   				 horizontalDestroyer = true;
	   			 }else {
	   				 System.out.println(destroyerTest.direction() + " AND " +"X: " + a + "  	Y: " + b  );
	   				 horizontalDestroyer = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Destroyer Works on all Spaces: " + horizontalDestroyer);
	   	 System.out.println("--------------------------------------------------------------------");


	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
	   	 System.out.println("--------------------------------------------------------------------");
	   	 System.out.println("--------------------------------------------------------------------");
	   	 System.out.println("--------------------------------------------------------------------");
	   	 System.out.println("--------------------------------------------------------------------");
	   	 System.out.println("---VERTICAL TEST STARTS HERE---");




	   	 System.out.println("Test : \nPlaces a VERTICAL Aircraft Carrier boat on the board, calls boatName, should return “Aircraft Carrier");
	   	 for(int a = 0; a < 6; a++) {
	   		 for(int b = 0; b <  6; b++) {

	   			 GoodOcean ocean6 = new GoodOcean();
	   			 Boat VerticalAircraftCarrierTest = new Boat("Aircraft Carrier", new Position(4,4), "vertical");
	   			 try{ocean6.placeBoat(VerticalAircraftCarrierTest.name(), VerticalAircraftCarrierTest.direction(), VerticalAircraftCarrierTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean6.shootAt(VerticalAircraftCarrierTest.position());
	   			 if(ocean6.boatName(VerticalAircraftCarrierTest.position()).equalsIgnoreCase("Aircraft Carrier") ) {
	   				 verticalAircraftCarrier = true;
	   			 }else {
	   				 System.out.println(VerticalAircraftCarrierTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 verticalAircraftCarrier = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("AircraftCarrier Works on all Spaces: " + verticalAircraftCarrier);
	   	 System.out.println("--------------------------------------------------------------------");





	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 
	   	 System.out.println("Test : \nPlace a VERTICAL Battleship boat on the board , calls boatName, should return “Battleship.");
	   	 for(int a = 0; a < 7; a++) {
	   		 for(int b = 0; b <  7; b++) {
	   			 GoodOcean ocean7 = new GoodOcean();
	   			 Boat battleshipTest = new Boat("Battleship", new Position(a,b), "vertical");
	   			 try{ocean7.placeBoat(battleshipTest.name(), battleshipTest.direction(), battleshipTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean7.shootAt(battleshipTest.position());
	   			 if(ocean7.boatName(battleshipTest.position()).equalsIgnoreCase("Battleship") ) {
	   				 verticalBattleship = true;
	   			 }else {
	   				 System.out.println(battleshipTest.direction()  + " AND " + "X: " + a + "  	Y: " + b  );
	   				 verticalBattleship= false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Battleship Works on all Spaces: " + verticalBattleship);
	   	 System.out.println("--------------------------------------------------------------------");

	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 
	   	 System.out.println("Test : \nPlace a vertical Cruiser boat on the board, calls boatName, should return “Cruiser.”");
	   	 for(int a = 0; a < 8; a++) {
	   		 for(int b = 0; b <  8; b++) {

	   			 GoodOcean ocean8 = new GoodOcean();
	   			 Boat cruiserTest = new Boat("Cruiser", new Position(a,b), "horizontal");
	   			 try{ocean8.placeBoat(cruiserTest.name(), cruiserTest.direction(), cruiserTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean8.shootAt(cruiserTest.position());
	   			 if(ocean8.boatName(cruiserTest.position()).equalsIgnoreCase("Cruiser") ) {
	   				 verticalCruiser = true;
	   			 }else {
	   				 System.out.println(cruiserTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 verticalCruiser = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Cruiser Works on all Spaces: " + verticalCruiser);
	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --     
	   	 System.out.println("--------------------------------------------------------------------");

	   	 //-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

	   	 System.out.println("Test : \nPlace a VERTICAL Submarine boat on the board, calls boatName, should return “Submarine.");
	   	 for(int a = 0; a < 8; a++) {
	   		 for(int b = 0; b <  8; b++) {

	   			 GoodOcean ocean4 = new GoodOcean();
	   			 Boat submarineTest = new Boat("Submarine", new Position(a,b), "vertical");
	   			 try{ocean4.placeBoat(submarineTest.name(), submarineTest.direction(), submarineTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean4.shootAt(submarineTest.position());
	   			 
	   			 if(ocean4.boatName(submarineTest.position()).equalsIgnoreCase("Submarine") ) {
	   				 verticalSubmarine = true;
	   			 }else {
	   				 System.out.println(submarineTest.direction() + " AND " + "X: " + a + "  	Y: " + b  );
	   				 verticalSubmarine = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Submarine Works on all Spaces: " + verticalSubmarine);
	   	      
	   	 System.out.println("--------------------------------------------------------------------");
	    
	   	 System.out.println("Test : \nPlace a VERTICAL Destroyer boat on the board, calls boatName, should return “Destroyer.");
	   	 for(int a = 0; a < 9; a++) {
	   		 for(int b = 0; b <  9; b++) {

	   			 GoodOcean ocean5 = new GoodOcean();
	   			 Boat destroyerTest = new Boat("Destroyer", new Position(4,4), "vertical");
	   			 try{ocean5.placeBoat(destroyerTest.name(), destroyerTest.direction(), destroyerTest.position());

	   			 }catch(Exception ex){
	   				 // Put statements here to do if the exception is thrown} }
	   			 }
	   			 ocean5.shootAt(destroyerTest.position());
	   			 if(ocean5.boatName(destroyerTest.position()).equalsIgnoreCase("Destroyer") ) {
	   				 verticalDestroyer = true;
	   			 }else {
	   				 System.out.println(destroyerTest.direction() + " AND " +"X: " + a + "  	Y: " + b  );
	   				 verticalDestroyer = false;
	   			 }

	   		 }
	   	 }
	   	 System.out.println("Destroyer Works on all Spaces: " + verticalDestroyer);
	   	 System.out.println("--------------------------------------------------------------------");

	    }


	

	public static void sunkTest() {
		System.out.println("---------------------------------sunk test--------------------------------------------------\n");
		//		Place an aircraft carrier on TOP ROW OF board, hit it once, sunk should return false 
		//		

		Boat sunk1 = new Boat("Aircraft Carrier", new Position (0,3), "horizontal");
		GoodOcean ocean1 = new GoodOcean();

		try { ocean1.placeBoat(sunk1.name(),sunk1.direction(),sunk1.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		ocean1.shootAt(new Position(0,3));
		System.out.println("\nAicraft carrier on top row, hit one position. Sunk should return FALSE.\n Actual output: "+((ocean1.sunk(new Position(0,3)))));

		//				Place a battleship with no hits on it, should return false
		//				Test Script:

		Boat sunk2 = new Boat ("Battleship", new Position (4,2), "vertical");
		GoodOcean ocean2= new GoodOcean();
		try { ocean2.placeBoat(sunk2.name(),sunk2.direction(),sunk2.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}

		System.out.println("\nBattleship with no hits on a valid position on board; sunk should return FALSE\n Actual output:");
		System.out.print(ocean2.sunk(sunk2.position()));


		//				Place a cruiser on the board, hit it on all of its positions, should return true.
		//				Test Script:	

		Boat sunk3 = new Boat ("Cruiser", new Position (7,6), "horizontal");
		GoodOcean ocean3= new GoodOcean();
		try { ocean3.placeBoat(sunk3.name(),sunk3.direction(),sunk3.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		ocean3.shootAt(new Position(7,6));
		ocean3.shootAt(new Position(7,7));
		ocean3.shootAt(new Position(7,8));
		System.out.println("\nCruiser with with all positions hit; sunk should return TRUE\n Actual output:");
		System.out.print(ocean3.sunk(sunk3.position()));


		//				Call sunk on a position with no battleship on it, should return false
		//				Test Script:

		Boat sunk4 = new Boat ("Battleship", new Position (2,7), "horizontal");
		GoodOcean ocean4= new GoodOcean();
		try { ocean4.placeBoat(sunk4.name(),sunk4.direction(),sunk4.position()); 

		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown} }
		}
		ocean4.shootAt(new Position(7,8));
		System.out.println("\nBattleship with no positions hit; sunk should return FALSE\n Actual output:");
		System.out.print(ocean4.sunk(new Position (2,2)));




		//				Call sunk on a position outside of the board, should return false
		//				Test Script:



		/*System.out.println("\ncall on a position outside the board; sunk should return FALSE\n Actual output:");
		try{

		} catch (Exception ex){

		}System.out.print(ocean4.sunk(new Position (16,16)));
		 */


	}

	static void allSunkTest() {
		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		ocean1.shootAt(new Position(9,0));
		ocean1.shootAt(new Position(9,1));
		ocean1.shootAt(new Position(9,2));
		ocean1.shootAt(new Position(9,3));

		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(9,4));
		ocean1.shootAt(new Position(9,5));
		ocean1.shootAt(new Position(9,6));

		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,7));
		ocean1.shootAt(new Position(0,8));


		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(7,7));
		ocean1.shootAt(new Position(8,7));
		ocean1.shootAt(new Position(9,7));




		System.out.println("\n. Hit all boats on all corners.\nallSunk should return TRUE.\n Actual output: "+(ocean1.allSunk()));




		//		One boat with one part which has not been hit yet returns false
		//		Test Script:
		secondAllSunkTest();


		//		



		//      One boat which has not been hit returns false
		//		Test Script:
		thirdAllSunkTest();




		//		Two unhit boats returns false
		//		Test Script:

		fourthAllSunkTest();

		//		Three unhit boats returns false
		//		Test Script:

		fifthAllSunkTest();

		//		Four unsunken boats  returns false
		//		Test Script:

		sixthAllSunkTest();




		//no sunken boats return false
		//test script:

		seventhAllSunkTest();







	}

	private static void secondAllSunkTest() {
		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		ocean1.shootAt(new Position(9,0));
		ocean1.shootAt(new Position(9,1));
		ocean1.shootAt(new Position(9,2));
		ocean1.shootAt(new Position(9,3));

		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(9,4));
		ocean1.shootAt(new Position(9,5));
		ocean1.shootAt(new Position(9,6));

		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,7));
		ocean1.shootAt(new Position(0,8));


		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(7,7));
		ocean1.shootAt(new Position(8,7));








		System.out.println("\none boat not hit completely. \nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));

	}

	private static void thirdAllSunkTest() {
		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		ocean1.shootAt(new Position(9,0));
		ocean1.shootAt(new Position(9,1));
		ocean1.shootAt(new Position(9,2));
		ocean1.shootAt(new Position(9,3));

		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(9,4));
		ocean1.shootAt(new Position(9,5));
		ocean1.shootAt(new Position(9,6));

		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,7));
		ocean1.shootAt(new Position(0,8));


		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}










		System.out.println("\n. one boat not hit at all.\nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));


	}

	private static void fourthAllSunkTest() {
		//		Two unhit boats returns false
		//		Test Script:

		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		ocean1.shootAt(new Position(9,0));
		ocean1.shootAt(new Position(9,1));
		ocean1.shootAt(new Position(9,2));
		ocean1.shootAt(new Position(9,3));

		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(9,4));
		ocean1.shootAt(new Position(9,5));
		ocean1.shootAt(new Position(9,6));

		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}



		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}









		System.out.println("\n.Two boats not hit.\nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));


	}

	private static void fifthAllSunkTest(){

		//		Three unhit boats returns false
		//		Test Script:

		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		ocean1.shootAt(new Position(9,0));
		ocean1.shootAt(new Position(9,1));
		ocean1.shootAt(new Position(9,2));
		ocean1.shootAt(new Position(9,3));

		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}


		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}



		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}








		System.out.println("\n.three boats not hit.\nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));




	}

	private static void sixthAllSunkTest(){
		//		Four unsunken boats  returns false
		//		Test Script:

		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}
		ocean1.shootAt(new Position(0,0));
		ocean1.shootAt(new Position(0,1));
		ocean1.shootAt(new Position(0,2));
		ocean1.shootAt(new Position(0,3));
		ocean1.shootAt(new Position(0,4));

		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}


		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}


		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}



		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}






		System.out.println("\n. 4 boats not hit.\nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));


	}

	private static void seventhAllSunkTest(){

		System.out.println("---------------------------------ALL sunk test--------------------------------------------------\n");
		boolean works = true;

		//		One boat in each corner each being sunk returns true
		//		Test Script:

		Boat all1 = new Boat("Aircraft Carrier", new Position (0,0), "horizontal");
		GoodOcean ocean1 = new GoodOcean();


		try { ocean1.placeBoat(all1.name(),all1.direction(),all1.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}


		Boat all2 = new Boat("Battleship", new Position (9,0), "horizontal");
		try { ocean1.placeBoat(all2.name(),all2.direction(),all2.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown
			works = false;
		}




		Boat all3 = new Boat("Cruiser", new Position (9,4), "horizontal");
		try { ocean1.placeBoat(all3.name(),all3.direction(),all3.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}


		Boat all4 = new Boat("Destroyer", new Position (0,7), "horizontal");
		try { ocean1.placeBoat(all4.name(),all4.direction(),all4.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}


		Boat all5 = new Boat("Submarine", new Position (7,7), "vertical");
		try { ocean1.placeBoat(all5.name(),all5.direction(),all5.position());
		}catch(Exception ex){ 
			// Put statements here to do if the exception is thrown}
			works = false;
		}







		System.out.println("\n.no Boats hit.\nallSunk should return FALSE.\n Actual output: "+(ocean1.allSunk()));

	}



}















