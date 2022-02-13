package 조선인키우기;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class 음악 extends Thread{

 	private Player player;
 	private boolean isLoop;
 	private File file;
 	private FileInputStream fis;
 	private BufferedInputStream bis;

 	public 음악(String name,boolean isloop) {
 		
 		try {
 			this.isLoop = isLoop;
 			file = new File(시나리오.class.getResource("../music/" + name).toURI());
 			fis = new FileInputStream(file);
 			bis = new BufferedInputStream(fis);
 			player = new Player(bis);

 		}catch(Exception e) {
 			System.out.println(e.getMessage());
 		}
 	}

 	public int getTime() {
 		if(player == null)
 			return 0;
 		return player.getPosition();
 	}

 	public void close() { 
 		isLoop = false;
 		player.close();
 		this.interrupt();
 	}

 	@Override
 	public void run() {
 		try {
 			do {
 				player.play();
 				fis = new FileInputStream(file);
 				bis = new BufferedInputStream(fis);
 				player = new Player(bis);
 				
 			}while(isLoop);

 		}catch(Exception e) {
 			System.out.println(e.getMessage());
 		}
 	}
 }

/*public class 배경음악 implements Runnable{
시나리오 시나리오 = new 시나리오();
public String musicFolder = "/Users/yujuhun/Downloads/";
public Clip clip;
public boolean isPlayed = true;
public File file;
private int n=1;

public 배경음악(String	 이름	) {
	file = new File(musicFolder+'/'+ 이름);
}
public void stopMusic() {
	if(clip != null) {
		clip.stop();
	}
}

public void playMusic(String 이름) {
	if (!isPlayed) {
		file = new File(musicFolder+'/'+ 이름);
		return;
	}
}

@Override
public void run() {
	// TODO Auto-generated method stub
	while(n>0) {
		if(!isPlayed) {
	   try { 
            if (file.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); 
            }
            else {
                System.out.println("음악을 재생하실 수 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

	
}
}
}
}

*/
