package 조선인키우기;

import java.util.ArrayList;
import java.util.Scanner;

public class 마을  {
	static int 이름;
	static String 성명;
	static int 나이;
	//체력 =20;
	static int 힘;
	static int 지혜;
	//int 양심=50;
	static int 최대피로;
	static int 피로;
	//static int 문과;
	static int 유학;
	/*static int 사서;
	static int 삼경;*/
	//int 소학;
	//int 대학;
	static int 작문;
	static int 식견;
	static int 화술;
	//static int 무과;
	static int 무술;
	/*static int 권각술;
	static int 검술;
	static int 창술;
	static int 궁술;*/
	static int 승마술;
	static int 병법;
	static int 실전;	
	static int 농사;
	static int 사냥;
	static int 나무;
	static int 장사;
	static int 주막;
	static int 필사;
	static int 진행;
	static int 돈;
	static int 년;
	static int 월; 

	이가탄 이가탄 = new 이가탄(1);
	이소룡 이소룡 = new 이소룡(2);
	이박사 이박사 = new 이박사(3);
	
	
	마을(int 이름) {
		
		이가탄(1); 
		이박사(2);
		이소룡(3);
	}
	
	

	/*static ArrayList<Integer> 시장  = new ArrayList<Integer>();	
	static ArrayList<Integer> 뒷골목  = new ArrayList<Integer>();
	static ArrayList<Integer> 서당  = new ArrayList<Integer>();
	static ArrayList<Integer> 주막2 = new ArrayList<Integer>();*/
	static ArrayList<Integer> 가방  = new ArrayList<Integer>();
	
	static int n;
	
	private void 이소룡(int i) {
		// TODO Auto-generated method stub
		
	}
	private void 이박사(int i) {
		// TODO Auto-generated method stub
		
	}
	private void 이가탄(int i) {
		// TODO Auto-generated method stub
		
	}
	static Scanner sc = new Scanner(System.in);
	
	static void 마을() {
		System.out.println("마을에 왔습니다.");
		System.out.println("어디로 가시겠습니까?");
		while (n>=0) {
		System.out.println("보유 금액 : " + 캐릭터.돈 +"전");
		System.out.println("1. 시장 2. 뒷골목 3. 서당 4. 주막 5. 돌아간다. ");
		 n= sc.nextInt();
		if (n==1) {
			if(캐릭터.이름==1) {
				시장.이가탄시장();
			}
			if(캐릭터.이름==2) {
				시장.소룡시장();
			}
			if(캐릭터.이름==3) {
				시장.박사시장();
			}
		} else if (n==2) {
			if(캐릭터.이름==1) {
				뒷골목.이가탄뒷골목();
			}
			if(캐릭터.이름==2) {
				뒷골목.소룡뒷골목();
			}if(캐릭터.이름==3) {
				뒷골목.박사뒷골목();
			}
			
		} else if (n==3) {
			if(캐릭터.이름==1) {
				서당.이가탄서당();
			}
			if(캐릭터.이름==2) {
				서당.소룡서당();
			}if(캐릭터.이름==3) {
				서당.박사서당();
			}
		} else if (n==4) {
			if(캐릭터.이름==1) {
				주막집.이가탄주막();
			}
			if(캐릭터.이름==2) {
				주막집.소룡주막();
			}if(캐릭터.이름==3) {
				주막집.박사주막();
			}
		} else if (n==5) {
			return;
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
			continue;
		}
		}
		
	}
}
