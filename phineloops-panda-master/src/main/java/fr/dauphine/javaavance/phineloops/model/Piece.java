package fr.dauphine.javaavance.phineloops.model;

public class Piece {
    
	private int pieceNumber;
	private int pieceOrientation;
	private String format;
	
	private boolean[] direction=new boolean[4];
	
	public Piece(int pieceNumber, int pieceOrientation,String format) {
		this.pieceNumber=pieceNumber;
		this.pieceOrientation=pieceOrientation;
		this.format=format;
		}
	
	// On va définir la pièce par 4 direction [nord,sud,ouest,est]
	// Maintenant, on va créer une pièce par son numero, son orientation et son format de UNICODE
	
	public Piece(int number,int orientation) {
		switch(number) {
		case 0:
            Connection(false,false,false,false);
            format="\u0489";
            break;
		case 1:
            switch (orientation){
                case 0:
                    Connection(true,false,false,false);
                    format="\u21E7";
                    break;
                case 1:
                    Connection(false,false,false,true);
                    format="\u21E8";
                    break;
                case 2:
                    Connection(false,true,false,false);
                    format="\u21E9";
                    break;
                case 3:
                    Connection(false,false,true,false);
                    format="\u21E6";
                    break;

            }
            break;
		case 2:
            switch (orientation){
                case 0:
                    Connection(true,true,false,false);
                    format="\u2503";
                    break;
                case 1:
                	 Connection(false,false,true,true);
                	 format="\u2501";
                    break;
            }
            break;
		 case 3:
             switch (orientation){
                 case 0:
                     Connection(true,true,true,false);
                     format="\u2569";

                     break;
                 case 1:
                	 Connection(true,true,false,true);
                	 format="\u2560";
                     break;
                 case 2:
                	 Connection(false,true,true,true);
                	 format="\u2566";


                     break;
                 case 3:
                	 Connection(true,true,true,false);
                	 format="\u2563";
                     break;

             }
             break;
		 case 4:
			 Connection(true,true,true,true);
			 format="\u256C";
             break;
         case 5:
             switch (orientation){
                 case 0:
                	 Connection(true,false,false,true);
                	 format="\u2517";
                     break;
                 case 1:
                	 Connection(false,true,false,true);
                	 format="\u250F";
                     break;
                 case 2:
                	 Connection(false,true,true,false);
                	 format="\u2513";
                     break;
                 case 3:
                	 Connection(true,false,true,false);
                	 format="\u251B";
                     break;

             }
             break;
             
		}
		pieceNumber=number;
		pieceOrientation=orientation;
	}

	private void Connection(boolean northConnect, boolean eastConnect, boolean southConnect, boolean westConnect) {
		direction[0]=northConnect;
		direction[1]=eastConnect;
		direction[2]=southConnect;
		direction[3]=westConnect;
	}
	
	public Piece rotate() {
		Piece p = new Piece(this.pieceNumber, this.pieceOrientation);
		if(p.pieceNumber!=0) {
			boolean[] nPieceOrientation = new boolean[4];
			for(int i=0;i<p.direction.length;i++) {
				if(i!=3) 
					nPieceOrientation[i] = p.direction[i+1];
				else
					nPieceOrientation[3] = p.direction[0];
			}
			p.direction=nPieceOrientation;
		}
		return p;
	}
}
