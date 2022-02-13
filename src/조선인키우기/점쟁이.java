package 조선인키우기;

public class 점쟁이 implements Runnable {
	//엔딩 엔딩 = new 엔딩();
	static	int u = 0;
	public synchronized void 점쟁이카운트() {
		u++;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(u>=0) {
				try {
				     Thread.sleep(100000);
				    } catch (InterruptedException e) {
				     // TODO Auto-generated catch block
				     e.printStackTrace();
				    }
				u++;
			if(u==1) {
				while(u>=1) {
					try {
					     Thread.sleep(200);
					    } catch (InterruptedException e) {
					     // TODO Auto-generated catch block
					     e.printStackTrace();
					    }
					if(u==2){
						
				엔딩.미리보기();
				u=0;
				
					}
				}
		}
	}
	}
}

