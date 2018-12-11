package paisaje;
import java.applet.Applet;
import java.awt.*;



public class paisaje extends Applet {
   @SuppressWarnings("serial")
   
    public void paint(Graphics g) {
	   
	   
		int i=0;
		int color = 0;
		int color1 = 50;
		for(int u=0; u<400;u++){
			g.setColor(new Color(0+color,0+color1,255));
			g.drawLine(0,u,1200,u);
			if(color == u/2){
				color++;
				color1++;
			}
		}
		/*
		g.setColor(new Color(255,255,0,64));
		g.fillOval(-200,-100,400,200);
		g.fillOval(-150,-70,300,140);
		g.fillOval(-100,-50,200,100);
		*/
		/*ARBOL
		i=0;
		for (i=0 ;i<6;i++){
		g.setColor(new Color(135,66,31));
		g.drawLine(450+ i, 255, 450+ i, 240);
		}
		
		g.setColor(new Color(56,94,15));
		i=0;
		int j=0;
		for(i=0; i < 78; i++){
		g.drawLine(415 - j, 239 - i, 490 + j, 239 - i);
		g.drawLine(415 - j, 240 - i, 490 + j, 240 - i);
		g.drawLine(415 - j, 241 - i, 490 + j, 241 - i);  
		i+=5;
		j-=3;
		}
		*/
		int j=0;
		for(int p=0;p<1196;p++){
			g.setColor(new Color(147,205,48));
			g.drawLine(0+p, 560, 0+p, 800);
			g.drawLine(0+p+1, 560, 0+p+1, 800);
			g.setColor(new Color(123,205,48));
			g.drawLine(0+(p+2),560,0+(p+2),800);
			g.drawLine(0+(p+3),560,0+(p+3),800);
			g.setColor(new Color(135,205,48));
			g.drawLine(0+(p+4),560, 0+(p+4), 800);
			g.drawLine(0+(p+5),560, 0+(p+5), 800);
			p=p+5;
		}
		//montañas
		g.setColor(new Color(0,49,38));
		int arrx[] = {0,133,150,166,186,200,300,323,340,366,406,433,446,466,513,533,546,620,633,643,710,726,733,816,833,856,866,913,930,940,956,986,1000,1013,1033,1116,1133,1146,1160,1200,1200,0};
		int arry[] = {360,266,260,256,260,266,360,366,373,360,343,336,340,343,383,393,390,360,353,356,358,350,343,303,308,303,306,330,333,330,326,320,316,320,324,283,276,283,290,306,560,560};
		g.fillPolygon(arrx,arry,42);
		//carro
		g.setColor(new Color(0,0,0));
		int arrx8[] = {233,263,290,326,320,326,313,310,300,296,300,283,266,236,238,222};
		int arry8[] = {250,270,266,297,310,313,336,332,340,336,316,305,310,289,273,260};
		g.fillPolygon(arrx8,arry8,16);
		g.fillOval(267, 310, 30, 30);
		g.fillOval(213, 266, 24, 24);
		//arboles
		int numArboles;
		for(numArboles = 0; numArboles<150; numArboles++){
			int largobase = (int)(Math.random()*(564-520))+520;
			int base = (int)(Math.random()*(1162-25))+25;
		for (i=0 ;i<6;i++){                                   
			g.setColor(new Color(135,66,31));                     
			g.drawLine(base+ i, largobase, base+ i, largobase-15);                 
		}                                                     
				                                                      
		g.setColor(new Color(56,94,15));                      
		i=0;                                                  
		j=0;                                              
		for(i=0; i < 78; i++){ 
			g.setColor(new Color(56,94,15)); 
			g.drawLine((base - 35) - j, (largobase - 16) - i, (base + 40) + j, (largobase - 16) - i);       
			g.drawLine((base - 35) - j, (largobase - 15) - i, (base + 40) + j, (largobase - 15) - i);       
			g.drawLine((base - 35) - j, (largobase - 14) - i, (base + 40) + j, (largobase - 14) - i);
			g.setColor(new Color(56,75,15));
			g.drawLine((base+5),(largobase-16)-i,(base+40)+j,(largobase-16)-i);
			g.drawLine((base+5),(largobase-15)-i,(base+40)+j,(largobase-15)-i);
			g.drawLine((base+5),(largobase-14)-i,(base+40)+j,(largobase-14)-i);
			i+=5;                                                 
			j-=3; 
		}                                                     
		}//fin arboles
		//casa
		int arrx1[] = {200,303,400,400,200};
		int arry1[] = {533,430,533,606,606};
		g.setColor(new Color(192,166,90));
		g.fillPolygon(arrx1, arry1, 5);
		int arrx2[] = {200,291,303};
		int arry2[] = {532,416,430};
		g.setColor(new Color(50,23,3));
		g.fillPolygon(arrx2,arry2,3);
		int arrx5[] = {200,303,310};
		int arry5[] = {532,430,436};
		g.setColor(new Color(175,140,80));
		g.fillPolygon(arrx5, arry5, 3);
		int cont = 0;
		int red = 83;
		int green = 51;
		g.setColor(new Color(83,51,0));
		for(int c=0;c<150;c++){
			cont++;
			if(cont == 3){
			red--;
			green--;
			g.setColor(new Color(red,green,0));
			cont = 0;
			}
			g.drawLine(291+c, 416, 400+c, 543);
		}
		int arrx3[] = {400,542,542,400};
		int arry3[] = {543,543,559,606};
		g.setColor(new Color(167,151,109));
		g.fillPolygon(arrx3, arry3, 4);
		//sombra
		int arrx4[] = {542,900,966,400};
		int arry4[] = {559,586,642,606};
		g.setColor(new Color(56,94,15));
		g.fillPolygon(arrx4,arry4,4);
		//puerta ventana
		for(int c=0;c<30;c++){
			g.setColor(new Color(47-c,47-c,47-c));
			g.drawLine(222+c, 605, 222+c, 550);
		}
		
		for(int c=0;c<17;c++){
			g.setColor(new Color(47-c,47-c,47-c));
			g.drawLine(293+c,530,293+c,502);
		}
    }

}