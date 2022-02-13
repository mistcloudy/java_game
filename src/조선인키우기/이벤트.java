package 조선인키우기;

import java.util.Scanner;

public class 이벤트 implements Runnable{
	int i;
	static int eve = 0;
	static Scanner sc = new Scanner(System.in);
	int n = 0;
	
	public void 이벤트문구() {
		switch(i)  {
	    case 0:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");	
	    	System.out.println("-이벤트-");
	    	System.out.println("아무 일도 일어나지 않았습니다.");
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
	    	break;
	    case 1:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("길을 가다가 낯선 남자에게 시비가 걸렸습니다. 어떻게 해결하시겠습니까?");
		    while (n>=0) {
		    System.out.println("1. 싸움으로 해결한다. 2. 대화로 해결한다.");
		    n= sc.nextInt();
		    if (n==1) {
		    	 int random = (int)(Math.random()*2);
				 int f = random;
				 
				 if (f==0) {
					 System.out.println("낯선 남자와의 싸움에서 이기셨습니다.");
					 System.out.println("-힘 1 증가");
					 System.out.println("-실전 1 증가");
					 캐릭터.힘++;
					 캐릭터.실전++;
				    }	
				 	if (f==1) {
				 		System.out.println("낯선 남자와의 싸움에서 지고 말았습니다.");
						System.out.println("-피로 5 증가");
						캐릭터.피로+=5;
						} 
				 
		    }	else if (n==2) {
		    	 int random = (int)(Math.random()*2);
				 int f = random;
				 if (f==0) {
					 System.out.println("낯선 남자는 자신의 잘못을 인정하고 물러났습니다.");
					 System.out.println("-지혜 1 증가");
					 System.out.println("-화술 1 증가");
					 캐릭터.지혜++;
					 캐릭터.화술++;
				    }	
				 	if (f==1) {
						System.out.println("낯선 남자의 말에 밀려 사과를 하게 되었습니다.");
						System.out.println("-돈 100 전 감소");
						캐릭터.돈-=100	;
						} 
				} else {
					System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
					continue;
				}
				break;
		    }
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    case 2:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("몸의 상태가 나빠지는 것을 느끼고 있습니다. 어떻게 대응하시겠습니까?");
		    while (n>=0) {
			    System.out.println("1. 약을 사서 복용한다. 2. 그냥 냅둔다. ");
			    n= sc.nextInt();
			    if (n==1) {
			    	if (캐릭터.돈>200) {
			    	System.out.println("약을 먹어 몸이 확실히 회복 되었습니다. 전보다 더 힘이 나는 것 같습니다.");
			    	System.out.println("-피로 5 감소");
			    	System.out.println("-돈 50  감소");
			    	캐릭터.피로-=5;
			    	캐릭터.돈-=50;
			    	} else {
			    		System.out.println("보유한 돈이 부족합니다.");
			    		continue;
			    	}
			    }	else if (n==2) {
			    	System.out.println("건강상태가 더 악화되었습니다. 앞으로도 후유증이 남을 것 같습니다.");
			    	System.out.println("-피로 5 증가");
			    	System.out.println("-최대피로 2 감소");
			    	캐릭터.피로+=5;
			    	캐릭터.최대피로-=2;
					} else {
						System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
						continue;
					}
					break;
			    }
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    case 3:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("마을에서 야바위꾼을 보았습니다. ");
		    System.out.println("야바위꾼은 100전을 내고 세 개의 컵 중에 공이 들어있는 컵을 맞추면 200전으로 돌려주겠다고 합니다. ");
		    while (n>=0) {
			    System.out.println("1. 야바위를 해본다. 2. 하지 않는다.");
			    n= sc.nextInt();
			    if (n==1) {
			    	if (캐릭터.돈>100) {
			    		 System.out.println("어떤 컵을 선택 하시겠습니까? ");
			    		 int random = (int)(Math.random()*3);
			    		 int f = random;
			    		 while(f>=0) {
			    			 System.out.println("1. 첫번째 컵 2. 두번째 컵 3. 세번째 컵 ");
			    			 n= sc.nextInt();
			    			if(n<=3) {
			    		 if (f+1==n) {
			    			 System.out.println("컵을 열자 공이 들어있었습니다. 야바위꾼은 아쉬워하며 돈을 건냅니다.");
			    			 System.out.println("-돈 100 전 증가");
			    			 캐릭터.돈+=100;
			    		    }	else if (f+1!=n) {
			    					System.out.println("컵을 열어 보았으나 안에는 공이 들어있지 않았습니다. ");
			    					System.out.println("-돈 100 전 감소");
			    					캐릭터.돈-=100	;
			    				} 
			    		 } else {
			    			 System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			    		 }
			    			break;
			    		 } 
				    	} else {
				    		System.out.println("보유한 돈이 부족합니다.");
				    		continue;
				    	}
			    	return;
			    }	else if (n==2) {
						System.out.println("야바위꾼은 아쉽다는 듯이 혀를 찹니다. 당신은 그 자리를 떴습니다." );
						return;
					} else {
						System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
						continue;
					}

			    }
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    case 4:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("아무 일도 일어나지 않았습니다."); //유학 무술 관련
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    case 5:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("아무 일도 일어나지 않았습니다."); // 무술관련 능력치
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    case 6:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
		    System.out.println("-이벤트-");
		    System.out.println("아무 일도 일어나지 않았습니다."); // 유학관련능력치
		    System.out.println("-----------------------------------------------------------------------------------------------");
		    break;
	    default:
	    	 System.out.println("-----------------------------------------------------------------------------------------------");
			 System.out.println("-이벤트-");
			 System.out.println("아무 일도 일어나지 않았습니다.");
			 System.out.println("-----------------------------------------------------------------------------------------------");
			
		} 
	}
	
	public static void 이벤트카운트() {
		eve++;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(eve>=0) {
			try {
			     Thread.sleep(200);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
		if(eve==1) {
			 int random = (int)(Math.random()*8);
			 i=random;
			 이벤트문구();
			eve=0;
		
	}
}
}
		
	

}
