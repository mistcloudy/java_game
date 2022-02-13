package 조선인키우기;

import java.util.Scanner;


public class 시나리오 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc = new Scanner(System.in);
		이벤트 이벤트 = new 이벤트();
		Thread 이벤트스레드 = new Thread(이벤트);
		점쟁이 점쟁이= new 점쟁이();
		Thread 점쟁이스레드 = new Thread(점쟁이);
		팁 팁= new 팁();
		Thread 팁스레드 = new Thread(팁);
		음악 시작음 = new 음악("mp3.mp3", true);
		//배경음악 배경음악 = new 배경음악("AnyConv.com__Movie_Start_Music-KP-241927993.wav");
		//Thread 배경음악스레드 = new Thread(배경음악);
		//배경음악 메인음악 = new 배경음악("hwanse.wav");
		//Thread 메인음악스레드 = new Thread(메인음악);
		캐릭터 능력치 =null;
		엔딩 엔딩 = new 엔딩();
		시작음.start();
		//배경음악스레드.start();
		팁스레드.start();
		이벤트스레드.start();
		System.out.println("조선인 키우기");
		System.out.println("게임을 시작합니다.");
		System.out.println("당신은 조선시대 사람입니다 누구로 진행하시겠습니까?");
		System.out.println("1. 이가탄(졸부) : 능력치는 평범하나 다른 인물보다 돈을 많이 들고 시작합니다. 돈 획득이나 소모에 관련되어 특화되어있습니다.");
		System.out.println("2. 이소룡(무도가) : 지혜와 유학에 관한 능력치가 낮고, 힘과 무술에 관한 능력치와 최대피로가 높습니다. 힘 및 무술에 특화되어있습니다.");
		System.out.println("3. 이박사(유생) : 지혜와 유학에 관한 능력치가 높고, 힘과 무술에 관한 능력치와 최대피로가 낮습니다. 지혜 및 유학에 특화되어있습니다.");
		while(n>=0) { 
		int 이름 = sc.nextInt();
		int x=1;
		int y=2;
		int z=3;
		if (이름==1) {
			도구 도구 = new 도구(x);
			//도구 이가탄도구= new 이가탄도구(x);
			//마을 이가탄마을 = new 이가탄마을(x);
			능력치 = new 이가탄(이름);
			System.out.println("당신은 이가탄을 선택하셨습니다.");
			System.out.println("이가탄은 대부호 집안의 집에 태어나 자랐습니다. 하지만 집안은 난에 휘말려 몰락하였고, 그는 몸 하나만 건사합니다.");
			System.out.println("돈이 많은 집안에서 자라 부족함이 없이 자랐던 그는 뭐 하나 뛰어나진 않지만, 돈을 버는 방법을 잘 알고 숨겨둔 재산이 있습니다.");
			System.out.println("부호의 집안에서 귀하게 자란 이가탄이 대부호가 될지 , 더 위대한 사람이 될지, 평범한 사람이 될지, 당신의 선택에 따라 달렸습니다.");
			System.out.println("---------------------------------------------------------");
			System.out.println("캐릭터 목표 : 대부호 엔딩 달성");
			System.out.println("달성조건 : 보유 금액 10000전 이상 + 힘, 지혜, 무술, 유학 능력치 75 이상");
		} else if (이름==2) {
			도구 도구 = new 도구(y);
			//도구 이소룡도구 = new 이소룡도구(y);
			//마을 이소룡마을 = new 이소룡마을(y);
			능력치 = new 이소룡(이름);
			System.out.println("당신은 이소룡을 선택하셨습니다.");
			System.out.println("이소룡은 장군 집안의 집에 태어나 자랐습니다. 하지만 집안은 난에 휘말려 몰락하였고, 그는 몸 하나만 건사합니다.");
			System.out.println("무예에 천부적인 소질을 가지고 단련해왔던 그는 다른 사람보다 육체적으로 강인합니다.");
			System.out.println("원래 장군의 피를 가진 이소룡이 장군이 될지, 더 위대한 사람이 될지, 평범한 사람이 될지, 당신의 선택에 따라 달렸습니다.");
			System.out.println("---------------------------------------------------------");
			System.out.println("캐릭터 목표 : 장군 엔딩 달성");
			System.out.println("달성조건 : 힘 및 무술관련 능력치 150 이상");
		} else if (이름==3) {
			도구 도구 = new 도구(z);
			//도구 이박사도구 = new 이박사도구(z);
			//마을 이박사마을 = new 이박사마을(z);
			능력치 = new 이박사(이름);
			System.out.println("당신은 이박사를 선택하셨습니다.");
			System.out.println("이박사는 재상 집안의 집에 태어나 자랐습니다. 하지만 집안은 난에 휘말려 몰락하였고, 그는 몸 하나만 건사합니다.");
			System.out.println("어릴 적 부터 남다른 두뇌를 타고난 그는 문인으로서 훌륭한 자질을 가지고 있습니다. ");
			System.out.println("군계일학의 재능을 보유한 이박사가 재상이 될지, 더 위대한 사람이 될지, 평범한 사람이 될지, 당신의 선택에 따라 달렸습니다.");
			System.out.println("---------------------------------------------------------");
			System.out.println("캐릭터 목표 : 재상 엔딩 달성");
			System.out.println("달성조건 : 지혜 및 유학관련 능력치 150 이상");
		} else {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			continue;
		}
		break;
		}
		
		//시작음악.clip.stop();
		//배경음악.stopMusic();
		
		
		시작음.close();
		//메인음악스레드.start();
		점쟁이스레드.start();
		//배경음악.playMusic("hwanse.wav");
		음악 메인음 = new 음악("00000002.mp3", true);
		
		메인음.start();
		while(n>=0) {	
			
		while(점쟁이.u>=0) {
			if(점쟁이.u==1) {
				점쟁이.u++;
			}
		if(점쟁이.u==2) {
			
			Thread.yield();
			try {
			     Thread.sleep(200);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
		}else if(점쟁이.u<2) {
				break;
			}
		}
		
		팁.팁카운트();
	
		while(팁.tip>=0) {
			if(팁.tip==1) {
				Thread.yield();
			}else if(팁.tip<1) {
					break;
				}
			}
		
		System.out.println("---------------------------------------------------------");
		System.out.println(" 이름 : " + 능력치.성명 );
		System.out.println(" 나이 : " + 능력치.나이  ); 
		System.out.println(" " + 능력치.년 + "년 " + 능력치.월 + "월" ); 
		System.out.println(" 피로 : " + 능력치.피로 + " / " + 능력치.최대피로 ); 
		System.out.println(" 보유 금액 : " + 능력치.돈 + "전" );
		System.out.println("---------------------------------------------------------");
		System.out.println("1. 현재상태 보기 2. 일과 정하기 3. 마을로 가기 4. 도구 보기 5. 휴식 ");
		System.out.println("---------------------------------------------------------");
		
		n= sc.nextInt();
		if(n==1) {
			능력치.현재상태();
		} else if (n==2) {
			if(능력치.피로>=능력치.최대피로) {
				System.out.println("피로가 높아서 일과를 진행할 수 없습니다.");
				continue;
			}
			if (능력치.이름==1) {
				메인음.close();
				음악 일과음 = new 음악("baram222.mp3", true);
				일과음.start();
				((이가탄)능력치).일과진행();
				System.out.println("---------------------------------------------------------");
				//이가탄도구.도구사용();
				도구.도구사용();
				일과음.close();
				메인음 = new 음악("00000002.mp3", true);
				메인음.start();
				//점쟁이.점쟁이카운트();
				
			} else if (능력치.이름==2) {
				메인음.close();
				음악 일과음 = new 음악("baram222.mp3", true);
				일과음.start();
				((이소룡)능력치).일과진행();
				System.out.println("---------------------------------------------------------");
				//이소룡도구.도구사용();
				도구.도구사용();
				일과음.close();
				메인음 = new 음악("00000002.mp3", true);
				메인음.start();
				//점쟁이.점쟁이카운트();
			
			} else if (능력치.이름==3) {
				메인음.close();
				음악 일과음 = new 음악("baram222.mp3", true);
				일과음.start();
				((이박사)능력치).일과진행();
				System.out.println("---------------------------------------------------------");
				//이박사도구.도구사용();
				도구.도구사용();
				일과음.close();
				메인음 = new 음악("00000002.mp3", true);
				메인음.start();
				//점쟁이.점쟁이카운트();
			}
		} else if (n==3) {
			메인음.close();
			음악 마을음 = new 음악("baram555.mp3", true);
			마을음.start();
			마을.마을();
			/*if (능력치.이름==1) {
				//((이가탄)능력치).마을();
				이가탄마을.마을();
			} else if (능력치.이름==2) {
				//((이소룡)능력치).마을();
				이소룡마을.마을();
			} else if (능력치.이름==3) {
				//((이박사)능력치).마을();
				이박사마을.마을();
			}*/
			마을음.close();
			메인음 = new 음악("00000002.mp3", true);
			메인음.start();
		} else if (n==4) {
			도구.도구보기();
			/*if (능력치.이름==1) {
				이가탄도구.도구보기();
			} else if (능력치.이름==2) {
				이소룡도구.도구보기();
			} else if (능력치.이름==3) {
				이박사도구.도구보기();
			}*/
			
		} else if (n==5) {
			if (능력치.피로<30) {
				System.out.println("피로가 충분히 쌓이지 않아서 휴식을 취할 필요가 없습니다.");
				continue;
			}
			능력치.대휴식() ;
			//점쟁이.점쟁이카운트();
			if (능력치.이름==1) {
				System.out.println("---------------------------------------------------------");
				도구.도구사용();
			} else if (능력치.이름==2) {
				System.out.println("---------------------------------------------------------");
				도구.도구사용();
			} else if (능력치.이름==3) {
				System.out.println("---------------------------------------------------------");
				도구.도구사용();
			}
		} else {
			System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
		}
			if (능력치.년==2) {
				break;
			}
		}
		//메인음악.stopMusic();
		엔딩.엔딩결정();	
		메인음.close();
	}

}
