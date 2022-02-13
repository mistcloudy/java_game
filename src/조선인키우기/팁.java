package 조선인키우기;

import java.util.Hashtable;

public class 팁 implements Runnable{
	
	Hashtable<Integer, String> 해쉬 = new Hashtable<Integer, String>();
	int i;
	static int tip = 0;
	static int tip2 = 0;
	
	public void 일과팁문구 () {
		if(i==0) {
		해쉬.put(0, "일과 정하기는 일주일동안 집중해서 할 일을 선택하는 과정입니다.");
		} else if (i==1) {
		해쉬.put(0, "한 주가 끝날 때마다 이벤트가 등장합니다. 아무 일도 일어나지 않을 수 있습니다.");
		} else if (i==2) {
			해쉬.put(0, "현재 능력치는 4주차 일정이 끝나고 한달이 지났을 때 확인 가능합니다.");
			} else if (i==3) {
				해쉬.put(0, "일과 정하기에서 휴식은 피로가 10이상 쌓여야 할 수 있습니다.");
			} else if (i==4) {
				해쉬.put(0, "초급, 중급, 고급, 단계 별로 요구하는 능력치가 있습니다. 능력치가 낮다면 초급 단계만 할 수 있습니다.");
			} else if (i==5) {
				해쉬.put(0, "일과정하기를 하는 중에 피로가 최대피로를 넘으면 이어지는 주차를 진행하지 못합니다.");
			} else if (i==6) {
				해쉬.put(0, "노동은 힘과 관련된 노동 + 지혜와 관련된 노동으로 나뉘어져 있습니다.");
			} else if (i==7) {
				해쉬.put(0, "높은 단계의 일과를 수행할 수록 얻을 수 있는 능력치의 폭이 커집니다.");
			} else if (i==8) {
				해쉬.put(0, "노동을 하면 관련된 경험 능력치를 얻을 수 있는 노동들이 있습니다. ");
			}
		 System.out.println(해쉬.get(0));
	}
	
	public void 팁문구 () {
		if(i==0) {
		해쉬.put(1, "피로가 최대피로를 넘으면 일과정하기를 할 수 없습니다.");
		} else if (i==1) {
		해쉬.put(1, "휴식은 피로가 30이상 쌓여야 할 수 있습니다.");
		} else if (i==2) {
			해쉬.put(1, "마을에서는 도구를 사고 파는게 가능합니다.");
			} else if (i==3) {
				해쉬.put(1, "도구는 종류당 하나만 가질 수 있습니다.");
			} else if (i==4) {
				해쉬.put(1, "도구는 한달이 지나면 효과가 발동합니다.");
			} else if (i==5) {
				해쉬.put(1, "현재상태보기에서는 캐릭터의 현재 능력치를 볼 수 있습니다.");
			} else if (i==6) {
				해쉬.put(1, "점쟁이는 게임을 플레이 하다 보면 찾아옵니다.");
			} else if (i==7) {
				해쉬.put(1, "점쟁이는 현재능력치를 기준으로 미래를 알려줍니다.");
			} else if (i==8) {
				해쉬.put(1, "날짜가 지나 2년이 되면 엔딩이 나옵니다.");
			} else if (i==9) {
				해쉬.put(1, "엔딩은 엔딩조건이 더 달성하기 힘든게 우선해서 나옵니다.");
			}
		 System.out.println(해쉬.get(1));
	}
	
	public void 팁카운트 () {
		tip++;
	}
	
	public static void 일과팁카운트 () {
		tip2++;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tip>=0) {
			try {
			     Thread.sleep(200);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
			
		if(tip==1) {
			 int random = (int)(Math.random()*10);
			 i=random;
			 System.out.println("---------------------------------------------------------");
			 System.out.print("Tip. ");
			 팁문구();
			 System.out.println("---------------------------------------------------------");
			tip=0;
	}
		if(tip2==1) {
			 int random = (int)(Math.random()*9);
			 i=random;
			 System.out.println("-----------------------------------------------------------------------------------------------");
			 System.out.print("Tip. ");
			 일과팁문구();
			 System.out.println("-----------------------------------------------------------------------------------------------");
			tip2=0;
	}
}
}
	}


