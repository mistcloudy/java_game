package 조선인키우기;

import java.util.Scanner;

public class 엔딩 extends 캐릭터 {	
	static int a;
	static Scanner sc = new Scanner(System.in);
	static void 왕 () {
		if(캐릭터.무술>150 && 캐릭터.유학>150 && 캐릭터.힘>150 && 캐릭터.지혜>150 && 캐릭터.돈>5000) {
			System.out.println("당신은 문무를 겸비한 최고의 재능을 가졌습니다.");
			System.out.println("알고보니 왕의 먼 후손이었다는게 밝혀졌고, 정당한 절차를 밟고 왕으로 추대받았습니다.	");
			System.out.println(캐릭터.성명 + "은 왕이 되었습니다!");
			a=1;
		}
	}
	
	static void 왕점 () {
		if(캐릭터.무술>150 && 캐릭터.유학>150 && 캐릭터.힘>150 && 캐릭터.지혜>150 && 캐릭터.돈>5000) {
			System.out.println(캐릭터.성명 + "은 왕이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 왕조건 () {
			System.out.println("엔딩 이름 : 왕");
			System.out.println("- 조선인 키우기의 히든 엔딩입니다. 한 쪽으로 치우치지 않으면서, 높은 능력치를 요구하고 있습니다. 이미 캐릭별 엔딩목표를 달성했으면 도전해보세요.");
			System.out.println("필요한 능력치는 다음과 같습니다.");
			System.out.println("------------------------------------------------");
			System.out.println("-힘 150	");
			System.out.println("-지혜 150	");
			System.out.println("-무술 150	");
			System.out.println("-유학 150	");
			System.out.println("-돈 5000	");
			System.out.println("------------------------------------------------");
			System.out.println("부족한 능력치는 다음과 같습니다.");
			System.out.println("------------------------------------------------");
			if((150-캐릭터.힘)>0) {
				System.out.println("-힘이 " + (150-캐릭터.힘) +"만큼 부족합니다.");
			}
			if((150-캐릭터.지혜)>0) {
				System.out.println("-지혜 " + (150-캐릭터.지혜) +"만큼 부족합니다.");
			}
			if((150-캐릭터.무술)>0) {
				System.out.println("-무술이 " + (150-캐릭터.무술) +"만큼 부족합니다.");
			}
			if((150-캐릭터.유학)>0) {
				System.out.println("-유학이 " + (150-캐릭터.유학) +"만큼 부족합니다.");
			}
			
			if((5000-캐릭터.돈)>0) {
				System.out.println("-돈이 " + (5000-캐릭터.돈) +"전 만큼 부족합니다.");
			}
			System.out.println("------------------------------------------------");
	}
	
	static void 대부호 () {
		if(캐릭터.돈>10000 && 캐릭터.무술>75 && 캐릭터.유학>75 && 캐릭터.힘>75 && 캐릭터.지혜>75) {
			System.out.println("명예 따위 중요하지 않습니다.");
			System.out.println("손 안에 들고 있는 돈이 가장 중요하거든요.");
			if(캐릭터.이름==1) {
				System.out.println("추가로 이가탄은 캐릭터 목표를 달성했습니다!");
				System.out.println("축하드립니다!");
			}
			System.out.println(캐릭터.성명 + "은 대부호가 되었습니다!");
			a=1;
		}
	}
	
	static void 대부호점 () {
		if(캐릭터.돈>10000 && 캐릭터.무술>75 && 캐릭터.유학>75 && 캐릭터.힘>75 && 캐릭터.지혜>75) {
			System.out.println(캐릭터.성명 + "은 대부호가 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	
	static void 대부호조건 () {
		System.out.println("엔딩 이름 : 대부호");
		System.out.println("- 조선인 키우기 이가탄 캐릭의 목표 엔딩입니다. 능력치 육성은 최소한의 조건만 요구하고, 나머지는 돈을 버는 것에 집중해야합니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-힘 75	");
		System.out.println("-지혜 75	");
		System.out.println("-무술 75	");
		System.out.println("-유학 75	");
		System.out.println("-돈 10000	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((75-캐릭터.힘)>0) {
			System.out.println("-힘이 " + (75-캐릭터.힘) +"만큼 부족합니다.");
		}
		if((75-캐릭터.지혜)>0) {
			System.out.println("-지혜가 " + (75-캐릭터.지혜) +"만큼 부족합니다.");
		}
		if((75-캐릭터.무술)>0) {
			System.out.println("-무술이 " + (75-캐릭터.무술) +"만큼 부족합니다.");
		}
		if((75-캐릭터.유학)>0) {
			System.out.println("-유학이 " + (75-캐릭터.유학) +"만큼 부족합니다.");
		}
		
		if((10000-캐릭터.돈)>0) {
			System.out.println("-돈이 " + (10000-캐릭터.돈) +"전 만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	
	static void 장군 () {
		if(캐릭터.무술>150  && 캐릭터.병법>150 && 캐릭터.승마술>150 && 캐릭터.실전>150) {
			System.out.println(캐릭터.성명 + "은 장군이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 장군점 () {
		if(캐릭터.무술>150 && 캐릭터.병법>150 && 캐릭터.승마술>150 && 캐릭터.실전>150) {
			System.out.println("조선 천하제일검.");
			System.out.println("그를 부르는 또 다른 명칭입니다.");
			if(캐릭터.이름==2) {
				System.out.println("추가로 이소룡은 캐릭터 목표를 달성했습니다!");
				System.out.println("축하드립니다!");
			}
			System.out.println(캐릭터.성명 + "은 장군이 되었습니다!");
			a=1;
		}
	}
	
	static void 장군조건 () {
		System.out.println("엔딩 이름 : 장군");
		System.out.println("- 조선인 키우기 이소룡 캐릭의 목표 엔딩입니다. 힘과 무술 관련 능력치의 높은 요구 조건을 가지고 있습니다. ");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-힘 150	");
		System.out.println("-무술 150	");	
		System.out.println("-병법 150	");
		System.out.println("-승마술 150	");
		System.out.println("-실전 150	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((150-캐릭터.힘)>0) {
			System.out.println("-힘이 " + (150-캐릭터.힘) +"만큼 부족합니다.");
		}
		if((150-캐릭터.무술)>0) {
			System.out.println("-무술이 " + (150-캐릭터.무술) +"만큼 부족합니다.");
		}
		if((150-캐릭터.병법)>0) {
			System.out.println("-병법이 " + (150-캐릭터.병법) +"만큼 부족합니다.");
		}
		if((150-캐릭터.승마술)>0) {
			System.out.println("-승마술이 " + (150-캐릭터.승마술) +"만큼 부족합니다.");
		}
		if((150-캐릭터.실전)>0) {
			System.out.println("-실전이 " + (150-캐릭터.실전) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 재상 () {
		if(캐릭터.작문>150 && 캐릭터.화술>150 && 캐릭터.식견>150 && 캐릭터.유학>150 && 캐릭터.지혜>150) {
			System.out.println("조선에서 그를 글과 말로 이길 수 있는 자는 없습니다.");
			System.out.println("그가 국정을 다스리는 한 나라가 기울 일이 없을 것입니다.");
			if(캐릭터.이름==1) {
				System.out.println("추가로 이박사는 캐릭터 목표를 달성했습니다!");
				System.out.println("축하드립니다!");
			}
			System.out.println(캐릭터.성명 + "은 재상이 되었습니다!");
			a=1;
		}
	}
	
	static void 재상점 () {
		if(캐릭터.작문>150 && 캐릭터.화술>150 && 캐릭터.식견>150 && 캐릭터.유학>150 && 캐릭터.지혜>150) {
			System.out.println(캐릭터.성명 + "은 재상이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 재상조건 () {
		System.out.println("엔딩 이름 : 재상");
		System.out.println("- 조선인 키우기 이박사 캐릭의 목표 엔딩입니다. 지혜와 유학 관련 능력치의 높은 요구 조건을 가지고 있습니다. ");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-지혜 150	");
		System.out.println("-유학 150	");
		System.out.println("-작문 150	");
		System.out.println("-화술 150	");
		System.out.println("-식견 150	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((150-캐릭터.지혜)>0) {
			System.out.println("-지혜가 " + (150-캐릭터.지혜) +"만큼 부족합니다.");
		}
		if((150-캐릭터.유학)>0) {
			System.out.println("-유학이 " + (150-캐릭터.유학) +"만큼 부족합니다.");
		}
		if((150-캐릭터.작문)>0) {
			System.out.println("-작문이 " + (150-캐릭터.작문) +"만큼 부족합니다.");
		}
		if((150-캐릭터.화술)>0) {
			System.out.println("-화술이 " + (150-캐릭터.화술) +"만큼 부족합니다.");
		}
		if((150-캐릭터.식견)>0) {
			System.out.println("-식견이 " + (150-캐릭터.식견) +"만큼 부족합니다.");
		}
		
		System.out.println("------------------------------------------------");
}
	
	
	static void 무관 () {
		if(캐릭터.무술>100 && 캐릭터.병법>100 && 캐릭터.승마술>100 && 캐릭터.실전>100) {
			System.out.println("그는 그의 무예로 오롯이 과거시험 무과를 급제하였습니다.");
			System.out.println(캐릭터.성명 + "은 무관이 되었습니다!");
			a=1;
		}
	}
	
	static void 무관점 () {
		if(캐릭터.무술>100 && 캐릭터.병법>100 && 캐릭터.승마술>100 && 캐릭터.실전>100) {
			System.out.println(캐릭터.성명 + "은 무관이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 무관조건 () {
		System.out.println("엔딩 이름 : 무관");
		System.out.println("- 힘과 무술 관련 능력치를 일정치 육성했을 때 나오는 엔딩입니다. 장군 엔딩보다 낮은 요구 조건을 가지고 있습니다. ");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-힘 100	");
		System.out.println("-무술 100	");	
		System.out.println("-병법 100	");
		System.out.println("-승마술 100	");
		System.out.println("-실전 100	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((100	-캐릭터.힘)>0) {
			System.out.println("-힘이 " + (100-캐릭터.힘) +"만큼 부족합니다.");
		}
		if((100-캐릭터.무술)>0) {
			System.out.println("-무술이 " + (100-캐릭터.무술) +"만큼 부족합니다.");
		}
		if((100-캐릭터.병법)>0) {
			System.out.println("-병법이 " + (100-캐릭터.병법) +"만큼 부족합니다.");
		}
		if((100-캐릭터.승마술)>0) {
			System.out.println("-승마술이 " + (100-캐릭터.승마술) +"만큼 부족합니다.");
		}
		if((100-캐릭터.실전)>0) {
			System.out.println("-실전이 " + (100-캐릭터.실전) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 문관 () {
		if(캐릭터.작문>100 && 캐릭터.화술>100 && 캐릭터.식견>100 && 캐릭터.유학>100 && 캐릭터.지혜>100) {
			System.out.println("그는 그의 유학으로 오롯이 과거시험 과를 급제하였습니다.");
			System.out.println(캐릭터.성명 + "은 문관이 되었습니다!");
			a=1;
		}
	}
	
	static void 문관점 () {
		if(캐릭터.작문>100 && 캐릭터.화술>100 && 캐릭터.식견>100 && 캐릭터.유학>100 && 캐릭터.지혜>100) {
			System.out.println(캐릭터.성명 + "은 문관이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 문관조건 () {
		System.out.println("엔딩 이름 : 문관");
		System.out.println("- 지혜와 유학 관련 능력치를 일정치 육성했을 때 나오는 엔딩입니다. 재상 엔딩보다 낮은 요구 조건을 가지고 있습니다. ");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-지혜 100	");
		System.out.println("-유학 100	");
		System.out.println("-작문 100	");
		System.out.println("-화술 100	");
		System.out.println("-식견 100	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((100-캐릭터.지혜)>0) {
			System.out.println("-지혜가 " + (100-캐릭터.지혜) +"만큼 부족합니다.");
		}
		if((100-캐릭터.유학)>0) {
			System.out.println("-유학이 " + (100-캐릭터.유학) +"만큼 부족합니다.");
		}
		if((100-캐릭터.작문)>0) {
			System.out.println("-작문이 " + (100-캐릭터.작문) +"만큼 부족합니다.");
		}
		if((100-캐릭터.화술)>0) {
			System.out.println("-화술이 " + (100-캐릭터.화술) +"만큼 부족합니다.");
		}
		if((100-캐릭터.식견)>0) {
			System.out.println("-식견이 " + (100-캐릭터.식견) +"만큼 부족합니다.");
		}
		
		System.out.println("------------------------------------------------");
}
	
	static void 필사사 () {
		if(캐릭터.필사>20 && 캐릭터.작문>50) {
			System.out.println("그가 써내려간 책만 수백권이 넘습니다.");
			System.out.println(캐릭터.성명 + "은 필사사가 되었습니다!");
			a=1;
		}
	}
	
	static void 필사사점 () {
		if(캐릭터.필사>20 && 캐릭터.작문>50) {
			System.out.println(캐릭터.성명 + "은 팔사사가 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 필사사조건 () {
		System.out.println("엔딩 이름 : 필사사");
		System.out.println("- 필사경험과 작문이 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-필사경험 20");
		System.out.println("-작문 50	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.필사)>0) {
			System.out.println("-필사경험이 " + (20-캐릭터.필사) +"만큼 부족합니다.");
		}
		if((50-캐릭터.작문)>0) {
			System.out.println("-작문이 " + (50-캐릭터.작문) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	
	static void 사냥꾼 () {
		if( 캐릭터.무술>75 && 캐릭터.사냥>20) {
			System.out.println("저 하늘 멀리 나는 새도 쏘아 맞출 수 있습니다.");
			System.out.println(캐릭터.성명 + "은 사냥꾼이 되었습니다!");
			a=1;
		}
	}
	
	static void 사냥꾼점 () {
		if( 캐릭터.무술>75 && 캐릭터.사냥>20) {
			System.out.println(캐릭터.성명 + "은 사냥꾼이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 사냥꾼조건 () {
		System.out.println("엔딩 이름 : 필사사");
		System.out.println("- 사냥경험과 무술이 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-사냥경험 20");
		System.out.println("-무술 75	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.사냥)>0) {
			System.out.println("-사냥경험이 " + (20-캐릭터.사냥) +"만큼 부족합니다.");
		}
		if((75-캐릭터.무술)>0) {
			System.out.println("-무술이 " + (75-캐릭터.무술) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 상인 () {
		if(캐릭터.화술>50 && 캐릭터.장사>20) {
			System.out.println("무언가를 팔 때야말로 희열을 느낍니다.");
			System.out.println(캐릭터.성명 + "은 상인이 되었습니다!");
			a=1;
		}
	}
	
	static void 상인점 () {
		if(캐릭터.화술>50 && 캐릭터.장사>20) {
			System.out.println(캐릭터.성명 + "은 상인이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 상인조건 () {
		System.out.println("엔딩 이름 : 상인");
		System.out.println("- 장사경험과 화술이 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-장사경험 20");
		System.out.println("-화술 50	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.장사)>0) {
			System.out.println("-장사경험이 " + (20-캐릭터.장사) +"만큼 부족합니다.");
		}
		if((50-캐릭터.화술)>0) {
			System.out.println("-화술이 " + (50-캐릭터.화술) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 농사꾼 () {
		if(캐릭터.힘>50 && 캐릭터.농사>20) {
			System.out.println("귀농은 언제나 옳습니다.");
			System.out.println(캐릭터.성명 + "은 농사꾼이 되었습니다!");
			a=1;
		}
	}
	
	static void 농사꾼점 () {
		if(캐릭터.힘>50 && 캐릭터.농사>20) {
			System.out.println(캐릭터.성명 + "은 농사꾼이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 농사꾼조건 () {
		System.out.println("엔딩 이름 : 농사꾼");
		System.out.println("- 농사경험과 힘이 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-농사경험 20");
		System.out.println("-힘 50	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.농사)>0) {
			System.out.println("-농사경험이 " + (20-캐릭터.농사) +"만큼 부족합니다.");
		}
		if((50-캐릭터.힘)>0) {
			System.out.println("-힘이 " + (50-캐릭터.힘) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 나무꾼 () {
		if(캐릭터.힘>75 && 캐릭터.나무>20) {
			System.out.println("오늘은 나무를 팼습니다. 다음날도 나무를 팼습니다.");
			System.out.println(캐릭터.성명 + "은 나무꾼이 되었습니다!");
			a=1;
		}
	}
	
	static void 나무꾼점 () {
		if(캐릭터.힘>75 && 캐릭터.나무>20) {
			System.out.println(캐릭터.성명 + "은 나무꾼이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 나무꾼조건 () {
		System.out.println("엔딩 이름 : 나무꾼");
		System.out.println("- 나무경험과 힘이 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-나무경험 20");
		System.out.println("-힘 75	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.나무)>0) {
			System.out.println("-나무경험이 " + (20-캐릭터.나무) +"만큼 부족합니다.");
		}
		if((75-캐릭터.힘)>0) {
			System.out.println("-힘이 " + (75-캐릭터.힘) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	static void 주막주인 () {
		if(캐릭터.지혜>50 && 캐릭터.주막>20) {
			System.out.println("주막에서 열심히 일을 했군요.");
			System.out.println(캐릭터.성명 + "은 주막주인이 되었습니다!");
			a=1;
		}
	}
	
	static void 주막주인점 () {
		if(캐릭터.지혜>50 && 캐릭터.주막>20) {
			System.out.println(캐릭터.성명 + "은 주막주인이 될 운명을 가지고 있습니다.");
			a=1;
		}
	}
	
	static void 주막주인조건 () {
		System.out.println("엔딩 이름 : 주막주인");
		System.out.println("- 주막경험과 지혜가 일정 능력치 달성되었다면 볼 수 있는 엔딩입니다.");
		System.out.println("필요한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		System.out.println("-주막경험 20");
		System.out.println("-지혜 50	");
		System.out.println("------------------------------------------------");
		System.out.println("부족한 능력치는 다음과 같습니다.");
		System.out.println("------------------------------------------------");
		if((20-캐릭터.주막)>0) {
			System.out.println("-주막경험 " + (20-캐릭터.주막) +"만큼 부족합니다.");
		}
		if((50-캐릭터.지혜)>0) {
			System.out.println("-지혜가 " + (50-캐릭터.지혜) +"만큼 부족합니다.");
		}
		System.out.println("------------------------------------------------");
}
	
	
	static void 평민 () {
			System.out.println("대체 뭘 한 건가요...?");
			System.out.println(캐릭터.성명 + "은 평민이 되었습니다!");
			a=1;
	}
	
	static void 평민점 () {
		System.out.println(캐릭터.성명 + "은 평민이 될 운명을 가지고 있습니다.");
		a=1;
}
	
	static void 평민조건 () {
		System.out.println("엔딩 이름 : 평민");
		System.out.println("- 다른 엔딩 조건을 아무것도 채우지 못했을 때 볼 수 있는 엔딩입니다. 능력 요구치가 없습니다.");
		
}
	
	
	
	static void 엔딩조건 () {
		System.out.println("------------------------------------------------");
		System.out.println("추가로, " +캐릭터.성명 + "이 볼 수 있는 엔딩조건들을 확인하실 수 있습니다." );
		int n=0;
		while (n>=0) {
		System.out.println("1. 왕 2. 대부호 3. 장군 4. 재상 5. 무관 6. 문관 7. 필사사 ");
		System.out.println("8. 사냥꾼 9. 상인 10. 나무꾼 11. 농사꾼 12. 주막주인 13. 평민 14. 그만보기");
		n= sc.nextInt();
		if (n==1) {
			왕조건();
		} else if (n==2) {
			대부호조건();
		} else if (n==3) {
			장군조건();
		} else if (n==4) {
			재상조건();
		}  else if (n==5) {
			무관조건();
		}  else if (n==6) {
			문관조건();
		}  else if (n==7) {
			필사사조건();
		}  else if (n==8) {
			사냥꾼조건();
		}  else if (n==9) {
			상인조건();
		}  else if (n==10) {
			나무꾼조건();
		}  else if (n==11) {
			농사꾼조건();
		}  else if (n==12) {
			주막주인조건();
		}  else if (n==13) {
			평민조건();
		}  else if (n==14) {
			return;
		}  else {
			System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
			continue;
		}
		}
	}
	static void 엔딩결정 () {
		a=0;
		System.out.println("------------------------------------------------");
		System.out.println("시간이 지나 " +캐릭터.성명 +"의 길이 결정될 때가 되었습니다." );
		System.out.println("당신의 노력이 성과를 맞는 순간입니다." );
		System.out.println("------------------------------------------------");
		System.out.println("1...." );
		try {
		     Thread.sleep(1000);
		    } catch (InterruptedException e) {
		     // TODO Auto-generated catch block
		     e.printStackTrace();
		    }
		System.out.println("2...." );
		try {
		     Thread.sleep(1000);
		    } catch (InterruptedException e) {
		     // TODO Auto-generated catch block
		     e.printStackTrace();
		    }
		System.out.println("3...." );
		try {
		     Thread.sleep(1000);
		    } catch (InterruptedException e) {
		     // TODO Auto-generated catch block
		     e.printStackTrace();
		    }
		System.out.println("------------------------------------------------");
		왕();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		대부호();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		장군();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		재상();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		무관();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		문관();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		필사사();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		상인(); 
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		사냥꾼();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		나무꾼();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		농사꾼();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		주막주인();
		if (a==1) {
			System.out.println("------------------------------------------------");
			return;
		}
		평민();
		return;
	}
	
	
	static void 미리보기 () {
		a=0;
		System.out.println("------------------------------------------------");
		System.out.println("점쟁이가 당신의 집에 찾아왔습니다." );
		System.out.println(캐릭터.성명 +"의 미래를 보여주겠다고 말하고 있습니다." );
		System.out.println("점쟁이의 이야기를 들어보시겠습니까?" );
		System.out.println("1. 예 2. 아니오" );
		int n=0;
		while (n>=0) {
		n= sc.nextInt();
		if (n==1) {
			System.out.println("점쟁이가 미래를 점쳐주고 있습니다. 잠시 기다려주세요." );
			System.out.println("1...." );
			try {
			     Thread.sleep(1000);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
			System.out.println("2...." );
			try {
			     Thread.sleep(1000);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
			System.out.println("3...." );
			try {
			     Thread.sleep(1000);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
		} else if (n==2) {
			System.out.println("점쟁이는 다시 찾아오겠다는 말을 남기고 떠났습니다." );
			return;
		} else {
			System.out.println("잘못 입력 하셨습니다. 다시 선택 해주세요.");
			continue;
		}
		break;
		}
		System.out.println("------------------------------------------------");
		왕점();
		if (a==1) {
			 엔딩조건 ();
			return;
		}
		대부호점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		장군점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		재상점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		무관점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		문관점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		필사사점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		상인점(); 
		if (a==1) {
			엔딩조건 ();
			return;
		}
		사냥꾼점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		나무꾼점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		농사꾼점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		주막주인점();
		if (a==1) {
			엔딩조건 ();
			return;
		}
		평민점();
		엔딩조건 ();
		return;
	}
}
