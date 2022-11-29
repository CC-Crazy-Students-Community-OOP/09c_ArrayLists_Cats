package com.cc.java;
import java.util.ArrayList;

public class App {

	public static void main( String[] args ) {
		// Vorüberlegung
		// Cat cat = new Cat("Grizabella");
		// // out(cat.getAttributes());
		
		//cat1 / cat2 .. more of the same ...DRY
		for (int i = 0; i < 10; i++) 
		{
			new Cat("someone_" + i); // Objekt, aber KEINE Referenz!
		}
		
		String [] nameArr = { "Grizabella", "Alonzo", "RumTumTugger", "Suzanne" };
		ArrayList<Cat> objList = new ArrayList<>();

		out( c( "#y" ) + "---Cats Array:-----------------------------" );
		for ( int i = 0; i < nameArr.length - 1; i++ ){
			objList.add( new Cat( nameArr[ i ] ) );
			objList.add( new Cat( "someone_" + i ) );
			out( t( 1 ) + c( "#r" ) +  "Cats: " + c( "#g" ) +  objList );
		}

		out( c( "#y" ) + "---Cats:-----------------------------------" );
		out( t( 1 ) + c( "#g" ) + objList );

		out( "\n" + c( "#y" ) + "---getAttributes:--------------------------" );
		out( t( 1 ) + c( "#g" ) +  objList.get( 0 ).getAttributes() );
		out( t( 1 ) + c( "#g" ) +  objList.get( 1 ).getAttributes() );
		out( t( 1 ) + c( "#g" ) +  objList.get( objList.size() - 1 ).getAttributes() );
	}
	
	// out
	public static void out( String o ) { System.out.println( o ); }
	// colored out
	public static String c( String c ) {
		switch ( c ) {
			case "#r": return "\u001b[31m";
			case "#g": return "\u001b[32m";
			case "#y": return "\u001b[33m";
			case "#b": return "\u001b[34m";
			case "#p": return "\u001b[35m";
			case "#c": return "\u001b[36m";
			default: return "\u001b[0m";
		}
	}
	// tab controler
	public static String t( int t ) {
        switch ( t ) {
            case 1: return "\t";
            case 2: return "\t";
            case 3: return "\t\t\t";
            case 4: return "\t\t\t\t";
            default: return "";
        }
    }

}
