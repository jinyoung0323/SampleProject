package SampleProject;

public class ShapeApp {

    public static void main(String[] args) {
    	Shape[] sArray = new Shape[3];
    	
		
  		Shape s01 = new Circle(10);
  		Shape s02 = new Triangle(5, 5);
  		Shape s03 = new Rectangle(7, 7);
  
  		sArray[0] = s01;
  		sArray[1] = s02;
  		sArray[2] = s03;
  		
  		for(int i=0; i<sArray.length; i++) {
  		  //System.out.println(sArray[i].area());
  		}
  		
  		for(int i=0; i<sArray.length; i++) {
//  		  if(sArray[i] instanceof Triangle ) {
//          System.out.println("�ﰢ���� ������ " + sArray[i].area());
//        }
//  		  if(sArray[i] instanceof Circle ) {
//          System.out.println("���� ������ " + sArray[i].area());
//        }
//  		  if(sArray[i] instanceof Rectangle ) {
//          System.out.println("�簢���� ������ " + sArray[i].area());
//        }
  		}
		
    	/*
    	Shape[] sArray = new Shape[3];
    	
		
  		Shape s01 = new Rectangle("����", "����", 7, 7);
  		Shape s02 = new Triangle("�ʷ�", "�ʷ�", 5, 5);
  		Shape s03 = new Circle("���", "���", 10);
  
  		sArray[0] = s01;
  		sArray[1] = s02;
  		sArray[2] = s03;
  		
  		for(int i=0; i<sArray.length; i++) {
  			sArray[i].draw();
  		}
  		
  		for(int i=0; i<sArray.length; i++) {
  			if(sArray[i] instanceof Triangle ) {
  				System.out.println(sArray[i].area());
  			}
  		}
    	*/
    	
    	
  		Shape c = new Circle( 8 );
      Shape r = new Rectangle( 5, 6 );
      Shape t = new Triangle( 5, 6 );
      
      System.out.println( "Circle area: " +c.area());
      System.out.println( "Rectangle area: " +r.area());
      System.out.println( "Triangle area: " +t.area());
      
      // ��ü�� Circle Ŭ������ ��ü �ΰ�?
      System.out.println( c instanceof Circle );

      // ��ü�� Drawable �������̽��� �����Ͽ��°�?
      System.out.println( c instanceof Drawable );
      
      // ��ü�� Rectangle Ŭ������ �ν��Ͻ� �ΰ�?
      System.out.println( r instanceof Rectangle );
      
      // ��ü�� Shape Ŭ������ �ν��Ͻ� �ΰ�?
      System.out.println( r instanceof Shape );
      
      System.out.println( r instanceof Drawable );
		
    }
}
