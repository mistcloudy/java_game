package 조선인키우기;

public class 캐릭터  {
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
	
	
	캐릭터 () {
		
	}
	static void 농사() {
		피로 += 6;
		힘 += 2;
		농사++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 힘 2 증가 ");
		System.out.println(" 농사경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년();
		return;
	}
	static void 나무() {
		피로 +=8;
		힘 +=3;
		나무++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 8 증가");
		System.out.println(" 힘 3 증가 ");
		System.out.println(" 나무경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 사냥() {
		피로 +=10;
		힘 +=4;
		무술 += 2;
		//궁술 +=2;
		사냥 ++;	
		실전++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 힘 4 증가 ");
		System.out.println(" 무술 2 증가");
		System.out.println(" 실전 1 증가");
		System.out.println(" 사냥경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 투기장() {
		피로 +=10;
		힘 +=4;
		무술 ++;
		//권각술 +=1;
		//검술 +=1; 
		//창술 +=1;
		실전+= 2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 힘 4 증가 ");
		System.out.println(" 무술 1 증가");
		//System.out.println(" 권각슐 1 증가");
		//System.out.println(" 검술 1 증가");
		//System.out.println(" 창술 1 증가");
		System.out.println(" 실전 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년();
		return;
	}
	static void 마구간() {
		피로 +=10;
		힘 +=4;
		무술 ++;
		승마술 +=3;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 힘 4 증가 ");
		System.out.println(" 무술 1 증가");
		System.out.println(" 승마슐 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 주막() {
		피로 +=6;
		지혜 +=2;
		//마을.돈++;
		주막++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 지혜 2 증가 ");
		System.out.println(" 주막경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}	
	static void 장사() {
		피로 +=8;
		지혜 +=3;
		화술 +=2;
		장사++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 8 증가");
		System.out.println(" 힘 3 증가 ");
		System.out.println(" 화술 2 증가 ");
		System.out.println(" 장사경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 필사() {
		피로 +=10;
		지혜 +=4;
		유학 ++; 
		작문 +=2;
		필사++;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 지혜 4 증가 ");
		System.out.println(" 유학 1 증가");
		System.out.println(" 작문 2 증가");
		System.out.println(" 필사경험 1 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 학당() {
		피로 +=10;
		지혜 +=4;
		유학 ++;
		//사서 +=2;
		화술 +=2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 지혜 4 증가 ");
		System.out.println(" 유학 1 증가");
		//System.out.println(" 사서 2 증가");
		System.out.println(" 화술 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 서점() {
		피로 +=10;
		지혜 +=4;
		유학 ++;
		//삼경 +=2;
		식견 +=2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 증가");
		System.out.println(" 지혜 4 증가 ");
		System.out.println(" 유학 1 증가");
		//System.out.println(" 삼경 2 증가");
		System.out.println(" 식견 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		//소학 +=1;
		//대학 +=1;
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 무술초급() {
		피로 +=2;
		힘 +=3;
		//무과 ++;
		무술 +=4;
		//궁술 +=2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 힘 3 증가 ");
		System.out.println(" 무술 4 증가");
		//System.out.println(" 권각술 4 증가");
		//System.out.println(" 궁술 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 무술중급() {
		피로 +=3;
		힘 +=6;
		//무과 += 2;
		무술 +=6;
		//권각술 +=3;
		//검술 +=6;
		//궁술 +=3;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 힘 6 증가 ");
		System.out.println(" 무술 6 증가");
		//System.out.println(" 권각술 3 증가");
		//System.out.println(" 검술 6 증가");
		//System.out.println(" 궁술 3 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 무술고급() {
		피로 +=4;
		힘 +=9;
		//무과 +=3;
		무술 +=8;
		//권각술 +=2;
		//검술 +=5;
		//창술 +=8;
		//궁술 +=4;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 힘 9 증가 ");
		System.out.println(" 무술 8 증가");
		//System.out.println(" 권각술 2 증가");
		//System.out.println(" 검술 5 증가");
		//System.out.println(" 창술 8 증가");
		//System.out.println(" 궁술 4 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 승마술초급() {
		피로 +=2;
		힘 +=2;
		무술 += 2;
		승마술 +=5;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 힘 2 증가 ");
		System.out.println(" 무술 2 증가");
		System.out.println(" 승마술 5 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 승마술중급() {
		피로 +=3;
		힘 +=3;
		무술 +=4;
		승마술 +=10;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 힘 3 증가 ");
		System.out.println(" 무술 4 증가");
		System.out.println(" 승마술 10 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 승마술고급() {
		피로 +=4;
		힘 +=4;
		무술 +=6;
		승마술 +=15;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 힘 4 증가 ");
		System.out.println(" 무술 6 증가");
		System.out.println(" 승마술 15 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	

	static void 병법초급() {
		피로 +=2;
		무술 ++;
		병법 +=5;
		실전 +=2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 병법 5 증가 ");
		System.out.println(" 무술 1 증가");
		System.out.println(" 실전 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 병법중급() {
		피로 +=3;
		무술 +=2;
		병법 +=10;
		실전 +=4;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 병법 10 증가 ");
		System.out.println(" 무술 2 증가");
		System.out.println(" 실전 4 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 병법고급() {
		피로 +=4;
		무술 +=3;
		병법 +=15;
		실전 +=6;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 병법 15 증가 ");
		System.out.println(" 무술 3 증가");
		System.out.println(" 실전 6 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 유학초급() {
		피로 +=2;
		지혜 +=3;
		유학 +=4;
		//사서 +=4;
		//삼경 +=2;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 지혜 3 증가 ");
		System.out.println(" 유학 4 증가");
		//System.out.println(" 사서 4 증가");
		//System.out.println(" 삼경 2 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 유학중급() {
		피로 +=3;
		지혜 +=6;
		유학 +=6;
		//사서 +=6;
		//소학 +=6;
		//삼경 +=4;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 지혜 6 증가 ");
		System.out.println(" 유학 6 증가");
		//System.out.println(" 사서 6 증가");
		//System.out.println(" 삼경 4 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 유학고급() {
		피로 +=4;
		지혜 +=9;
		유학 +=8;
		//사서 +=6;
		//삼경 +=8;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 지혜 9 증가 ");
		System.out.println(" 유학 8 증가");
		//System.out.println(" 사서 6 증가");
		//System.out.println(" 삼경 8 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		//대학 +=8;
		//소학 +=4;
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 논술초급() {
		피로 +=2;
		지혜 +=2;
		유학 ++;
		화술 +=3;
		작문 +=3;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 지혜 2 증가 ");
		System.out.println(" 유학 1 증가");
		System.out.println(" 화술 3 증가");
		System.out.println(" 작문 3 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 논술중급() {
		피로 +=3;
		지혜 +=3;
		유학 +=2;
		화술 +=6;
		작문 +=6;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 지혜 3 증가 ");
		System.out.println(" 유학 2 증가");
		System.out.println(" 화술 6 증가");
		System.out.println(" 작문 6 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 논술고급() {
		피로 +=4;
		지혜 +=4;
		유학 +=3;
		화술 +=9;
		작문 +=9;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 지혜 4 증가 ");
		System.out.println(" 유학 3 증가");
		System.out.println(" 화술 9 증가");
		System.out.println(" 작문 9 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 철학초급() {
		피로 +=2;
		지혜 +=2;
		유학 ++;
		식견 +=5;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 2 증가");
		System.out.println(" 지혜 2 증가 ");
		System.out.println(" 유학 1 증가");
		System.out.println(" 식견 5 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 철학중급() {
		피로 +=3;
		지혜 +=3;
		유학 +=2;
		식견 +=10;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 3 증가");
		System.out.println(" 지혜 3 증가 ");
		System.out.println(" 유학 2 증가");
		System.out.println(" 식견 10 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 철학고급() {
		피로 +=4;
		지혜 +=4;
		유학 +=3;
		식견 +=15;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 4 증가");
		System.out.println(" 지혜 4 증가 ");
		System.out.println(" 유학 3 증가");
		System.out.println(" 식견 15 증가");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	
	static void 휴식() {
		피로 -=10;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 10 감소");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행++;
		월();
		년(); 
		return;
	}
	static void 농사돈() {
		돈 += 50;
		return;
	}
	static void 나무돈() {
		돈 += 100;
		return;
	}
	static void 사냥돈() {
		돈 += 150;
		년(); 
		return;
	}
	static void 투기장돈() {
		돈 += 150;
		return;
	}
	static void 마구간돈() {
		돈 += 150;
		return;
	}
	static void 주막돈() {
		돈 += 50;
		return;
	}	
	static void 장사돈() {
		돈 += 100;
		return;
	}
	static void 필사돈() {
		돈 += 150;
		return;
	}
	static void 학당돈() {
		돈 += 150;
		return;
	}
	static void 서점돈() {
		돈 += 150;
		return;
	}
	
	static void 무술초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 무술중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 무술고급돈() {
		돈 -= 300;
		return;
	}
	
	static void 승마술초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 승마술중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 승마술고급돈() {
		돈 -= 300;
		return;
	}
	

	static void 병법초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 병법중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 병법고급돈() {
		돈 -= 300;
		return;
	}
	
	static void 유학초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 유학중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 유학고급돈() {
		돈 -= 300;
		return;
	}
	
	static void 논술초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 논술중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 논술고급돈() {
		돈 -= 300;
		return;
	}
	
	static void 철학초급돈() {
		돈 -= 100;
		return;
	}
	
	static void 철학중급돈() {
		돈 -= 200;
		return;
	}
	
	static void 철학고급돈() {
		돈 -= 300;
		return;
	}

	
	void 대휴식() {
		피로 -=30;
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(" 피로 30 감소");
		System.out.println("-----------------------------------------------------------------------------------------------");
		진행 +=4;
		월();
		년(); 
		return;
	}
	
	static void 월() {
		if(진행 > 3) 
		{
			월++; 
			진행 = 0;
		}		
		return;
	}
	
	static void 년() {
		if(월 > 12) 
		{
			년++;
			나이++;
			월 = 1;
		}
		return;
	}
	
	
	
	
	void 현재상태() {
		System.out.println(" -기본 정보- ");
		System.out.println(" 이름 : " + 성명);
		System.out.println(" 나이 : " + 나이 );
		System.out.println(" 힘 : " + 힘 );
		System.out.println(" 지혜 : " + 지혜 );
		System.out.println(" 피로 : " + 피로 + " / " + 최대피로 );
		System.out.println(" -------------- ");
		System.out.println(" -유학 관련 능력치- ");
	//	System.out.println(" 문과 : " + 문과 );
		System.out.println(" 유학 : " + 유학 );
		//System.out.println(" 사서 : " + 사서 );
		//System.out.println(" 삼경 : " + 삼경 );
		//System.out.println(" 소학 : " + 소학 );
		//System.out.println(" 대학 : " + 대학 );
		System.out.println(" 작문 : " + 작문 );
		System.out.println(" 식견 : " + 식견 );
		System.out.println(" 화술 : " + 화술 );
		System.out.println(" -------------- ");
		System.out.println(" -무술 관련 능력치- ");
		//System.out.println(" 무과 : " + 무과 );
		System.out.println(" 무술 : " + 무술 );
		//System.out.println(" 권각술 : " + 권각술 );
		//System.out.println(" 검술 : " + 검술 );
		//System.out.println(" 창술 : " + 창술 );
	//	System.out.println(" 궁술 : " + 궁술 );
		System.out.println(" 승마술 : " + 승마술 );
		System.out.println(" 병법 : " + 병법 );
		System.out.println(" 실전 : " + 실전 );
		System.out.println(" -------------- ");
		System.out.println(" -노동 경험 능력치- ");
		System.out.println(" 농사경험 : " + 농사 );
		System.out.println(" 사냥경험 : " + 사냥 );
		System.out.println(" 나무경험 : " + 나무 );
		System.out.println(" 장사경험 : " + 장사 );
		System.out.println(" 주막경험 : " + 주막 );
		System.out.println(" 필사경험 : " + 필사 );
		return;
	}
	
	void 변화 () {
		System.out.println(" 피로 : " + 피로 + " / " + 최대피로 );
		System.out.println(" 힘 : " + 힘 );
		System.out.println(" 지혜 : " + 지혜 );
		System.out.println(" 유학 : " + 유학 );
	//	System.out.println(" 사서 : " + 사서 );
		//System.out.println(" 삼경 : " + 삼경 );
		System.out.println(" 작문 : " + 작문 );
		System.out.println(" 식견 : " + 식견 );
		System.out.println(" 화술 : " + 화술 );
		System.out.println(" 무술 : " + 무술 );
		//System.out.println(" 권각술 : " + 권각술 );
		//System.out.println(" 검술 : " + 검술 );
		//System.out.println(" 창술 : " + 창술 );
		//System.out.println(" 궁술 : " + 궁술 );
		System.out.println(" 승마술 : " + 승마술 );
		System.out.println(" 병법 : " + 병법 );
		System.out.println(" 실전 : " + 실전 );
		System.out.println(" 농사경험 : " + 농사 );
		System.out.println(" 사냥경험 : " + 사냥 );
		System.out.println(" 나무경험 : " + 나무 );
		System.out.println(" 장사경험 : " + 장사 );
		System.out.println(" 주막경험 : " + 주막 );
		System.out.println(" 필사경험 : " + 필사 );
		System.out.println(" 돈 : " + 돈 );
		return;
	}
	

	
}
