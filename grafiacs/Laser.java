

public class Laser implements Runnable {

	int x;
	int y;
	private final Game game;
	boolean laser, alive;
	double grados;
	double a=0,b=0,c=10,grados2;

	public Laser(Game game, int x, int y, boolean laser, boolean alive, double grados) {
		this.game = game;
		this.x = x;
		this.y = y;
		this.laser = laser;
		this.alive = alive;
		this.grados = grados;
	}

	public void run() {

		if (laser) {
			while (y > 0) {
				game.repaint();
				try {
					Thread.sleep(40);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				grados2 = Math.toRadians(grados);
				b= Math.cos(grados2)*c;
				
				a = Math.sin(grados2)*c;
				y -= b;
				x += a;
				if(y>800)
					break;
				if(x<0)
					break;
				if(x>1500)
					break;
			}
			alive = false;
		}

	}

}