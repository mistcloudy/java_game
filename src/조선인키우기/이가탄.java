package 조선인키우기;


import java.util.Scanner;

public class 이가탄 extends 캐릭터 {
	 int 진행;
	 이가탄(int 이름) {
		캐릭터.이름 = 1;
		캐릭터.성명 = "이가탄";
		캐릭터.나이=15;
		// 체력=20;
		캐릭터.힘=50;
		캐릭터.지혜=50;
		// 양심=50;
		캐릭터.최대피로=100;
		캐릭터.피로=0;
		//문과=10;
		캐릭터.유학=50;
		//사서=5;
		//삼경=5;
		캐릭터.작문=5;
		캐릭터.식견=5;
		캐릭터.화술=5;
		//무과=10;
		캐릭터.무술=50;
		//권각술=5;
		//검술=5;
		//창술=5;
		//궁술=5;
		캐릭터.승마술=5;
		캐릭터.병법= 5;
		캐릭터.실전=10;
		캐릭터.농사=0;
		캐릭터.사냥=0;
		캐릭터.나무=0;
		캐릭터.장사=0;
		캐릭터.주막=0;
		캐릭터.필사=0;
		캐릭터.진행=0;
		캐릭터.돈=7000;
		캐릭터.년=1;
		캐릭터.월=1;
	}
	 
		static Scanner sc = new Scanner(System.in);
		
		void 이가탄특혜() {
			캐릭터.돈 += 50;
		}
		int p;
		void 선택과정() {
			int n = 1;
			처음 : while (n>0) {
				if(캐릭터.피로>캐릭터.최대피로) {
					p=1;
					System.out.println("피로가 한계치를 넘었습니다. 일과를 진행할 수 없습니다." );
					return;
				}
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("1. 노동 : 일을 해서 돈을 법니다. 능력치가 작게 오르고 피로는 크게 오르는 대신 돈을 벌 수 있습니다." );
				System.out.println("2. 단련 : 무술과 관련된 단련을 받습니다. 무술과 관련된 능력치가 크게 오르고 피로는 작게 오르는 대신 돈을 지불해야합니다.");
				System.out.println("3. 교육 : 유학과 관련된 교육을 받습니다. 유학과 관련된 능력치가 크게 오르고 피로는 작게 오르는 대신 돈을 지불해야합니다.");
				System.out.println("4. 휴식 : 쌓인 피로를 풀기위해 휴식합니다. 아무런 능력치가 오르지 않는 대신 피로가 내려갑니다.");
				System.out.println("-----------------------------------------------------------------------------------------------");
			
				팁.일과팁카운트();
				while(팁.tip2>=0) {
					if(팁.tip2==1) {
						Thread.yield();
					}else if(팁.tip2<1) {
							break;
						}
					}
				
				n= sc.nextInt();
			if (n==1) {
				System.out.println("1. 초급 2. 중급 (힘+지혜 합 75이상) 3. 고급 (힘+지혜 합 150이상)" ); 
				while (n>0) {
				 n= sc.nextInt();
				if (n==1) {
					System.out.println("1. 농사 돕기 : 마을의 농사일을 도와줍니다. 힘이 증가하고 농사경험이 쌓입니다." );
					System.out.println("2. 주막 돕기 : 마을이 주막일을 도와줍니다. 지혜가 증가하고 주막경험이 쌓입니다." );
					System.out.println("3. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							농사();
							농사돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 농사 돕기를 진행합니다. 보수로 50 전을 받았습니다.");
							return;
						} else if (n==2) {
							주막();
							주막돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 주막 돕기를 진행합니다. 보수로 50 전을 받았습니다." );
							return;
						}  else if (n==3) {
							continue 처음;
						}  else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else if (n==2) {
					if (캐릭터.힘+캐릭터.지혜<=75) {
						System.out.println("요구 능력치가 부족합니다." );
						System.out.println("1. 초급 2. 중급 (힘+지혜 합 75이상) 3. 고급 (힘+지혜 합 150이상)" ); 
						continue;
					}
					System.out.println("1. 나무꾼 돕기 : 나무꾼을 도와 나무를 합니다. 힘이 증가하고 나무경험이 쌓입니다. " );
					System.out.println("2. 장사꾼 돕기 : 장사꾼을 도와 장사를 합니다. 지혜가 증가하고 장사경험이 쌓입니다." );
					System.out.println("3. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							나무();
							나무돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 나무꾼 돕기를 진행합니다. 보수로 100 전을 받았습니다.");
							return;
						} else if (n==2) {
							super.장사();
							super.장사돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 장사꾼 돕기를 진행합니다. 보수로 100 전을 받았습니다.");
							return;
						} else if (n==3) {
							continue 처음;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else if (n==3) {if (캐릭터.힘+캐릭터.지혜<=150) {
					System.out.println("요구 능력치가 부족합니다." );
					System.out.println("1. 초급 2. 중급 (힘+지혜 합 75이상) 3. 고급 (힘+지혜 합 150이상)" ); 
					continue;
				}
					System.out.println("1. 마구간 돕기 : 마구간의 말을 돌봐줍니다. 힘과 무술과 승마술이 증가합니다. " );
					System.out.println("2. 투기장 참여 : 투기장의 싸움꾼으로 참여합니다. 힘과 무술과 실전이 증가합니다. " );
					System.out.println("3. 사냥꾼 돕기 : 사냥꾼을 도와 동물들을 사냥합니다. 힘과 무술과 실전, 사냥경험이 증가합니다." );
					System.out.println("4. 필사하기 : 책을 베껴 쓰는 필사 작업을 합니다. 지혜와 유학과 작문, 필사경험이 증가합니다." );
					System.out.println("5. 학당 돕기 : 학당에서 아이들을 가르치는 일을 도와줍니다. 지혜와 유학과 화술이 증가합니다." );
					System.out.println("6. 서점 돕기 : 서점의 책과 관련된 일을 돕습니다. 지혜와 유학과 식견이 증가합니다." );
					System.out.println("7. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							마구간();
							마구간돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 마구간 돕기를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==2) {
							투기장();
							투기장돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 투기장 참여를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==3) {
							사냥();
							사냥돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 사냥꾼 돕기를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==4) {
							필사();
							필사돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 필사하기를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==5) {
							학당();
							학당돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 학당 돕기를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==6) {
							서점();
							서점돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 서점 돕기를 진행합니다. 보수로 150 전을 받았습니다.");
							return;
						} else if (n==7) {
							continue 처음;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}
				break;
				}
			} else if (n==2) {
				if (캐릭터.돈<100) {
					System.out.println("돈이 부족합니다. 단련을 진행할 수 없습니다." );
					continue;
				}
				System.out.println("1. 초급 - 100전 2. 중급 - 200전 (무술 50 이상) 3. 고급 - 300전 (무술 100이상)" );
				while (n>0) {
				 n= sc.nextInt();
				if (n==1) {
					System.out.println("1. 무술-초급 : 활쏘는 자세를 습득하면서 권각술을 중심으로 단련합니다. 힘과 무술이 증가합니다.");
					System.out.println("2. 승마술-초급 : 말을 타는 법을 배웁니다. 힘과 무술과 승마술이 증가합니다. " );
					System.out.println("3. 병법-초급 : 손자와 오자를 익히면서 기본적인 전술을 배웁니다. 힘과 무술과 병법과 실전이 증가합니다. 힘이 증가하지 않는 대신 병법이 크게 오릅니다." );
					System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							무술초급();
							무술초급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 무술-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
							return;
						} else if (n==2) {
							승마술초급();
							승마술초급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 승마술-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
							return;
						} else if (n==3) {
							병법초급();
							병법초급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 병법-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
							return;
						} else if (n==4) {
							continue 처음;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else if (n==2) {
					if (캐릭터.돈<200) {
						System.out.println("돈이 부족합니다. 중급을 진행할 수 없습니다." );
						System.out.println("1. 초급 - 100전 2. 중급 - 200전 (무술 50 이상) 3. 고급 - 300전 (무술 100이상)" );
						continue;
					}
					if (캐릭터.무술<=50) {
					System.out.println("요구 능력치가 부족합니다." );
					System.out.println("1. 초급 - 100전 2. 중급 - 200전 (무술 50 이상) 3. 고급 - 300전 (무술 100이상)" );
					continue;
				}
					System.out.println("1. 무술-중급 : 표적을 활로 실제로 쏴보면서 검술을 중심으로 단련합니다. 힘과 무술이 증가합니다.");
					System.out.println("2. 승마술-중급 : 말을 자유자재로 다룰 수 있도록 연습합니다. 힘과 무술과 승마술이 증가합니다. " );
					System.out.println("3. 병법-중급 : 사마법과 위료자를 익히면서 전술의 폭을 넓힙니다. 힘과 무술과 병법과 실전이 증가합니다. 힘이 증가하지 않는 대신 병법이 크게 오릅니다." );
					System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							무술중급();
							무술중급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 무술-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
							return;
						} else if (n==2) {
							승마술중급();
							승마술중급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 승마술-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
							return;
						} else if (n==3) {
							병법중급();
							병법중급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 병법-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
							return;
						} else if (n==4) {
							continue 처음;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else if (n==3) {
					if (캐릭터.돈<300) {
						System.out.println("돈이 부족합니다. 고급을 진행할 수 없습니다." );
						System.out.println("1. 초급 - 100전 2. 중급 - 200전 (무술 50 이상) 3. 고급 - 300전 (무술 100이상)" );
						continue;
					}
					if (캐릭터.무술<=100) {
						System.out.println("요구 능력치가 부족합니다." );
						System.out.println("1. 초급 - 100전 2. 중급 - 200전 (무술 50 이상) 3. 고급 - 300전 (무술 100이상)" ); 
						continue;
					}
					System.out.println("1. 무술-고급 : 여러 무술을 같이 수행하면서 창술을 중심으로 단련합니다. 힘과 무술이 증가합니다.");
					System.out.println("2. 승마술-고급 : 말을 탄 상태로 전투하는 법을 익힙니다. 힘과 무술과 승마술이 증가합니다. " );
					System.out.println("3. 병법-고급 : 삼략과 육도를 익히면서 실전적인 모의전쟁을 치뤄봅니다. 힘과 무술과 병법과 실전이 증가합니다. 힘이 증가하지 않는 대신 병법 경험이 크게 오릅니다." );
					System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
					while (n>0) {
						 n= sc.nextInt();
						if (n==1) {
							무술고급();
							무술고급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 무술-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
							return;
						} else if (n==2) {
							승마술고급();
							승마술고급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 승마술-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
							return;
						} else if (n==3) {
							병법고급();
							병법고급돈();
							이가탄특혜();
							System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
							System.out.println("이번 주차는 병법-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
							return;
						} else if (n==4) {
							continue 처음;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						}
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}
				break;
				}
			} else if (n==3) {
				if (캐릭터.돈<100) {
					System.out.println("돈이 부족합니다. 교육을 진행할 수 없습니다." );
					continue;
				}
				System.out.println("1. 초급 -100전 2. 중급 - 200전 (유학 50 이상) 3. 고급 - 300전 (유학 100이상)" ); 
				while (n>0) {
					 n= sc.nextInt();
					if (n==1) {
						System.out.println("1. 유학-초급 : 논자와 맹자, 시경을 공부합니다. 지혜와 유학이 증가합니다.");
						System.out.println("2. 논술-초급 : 기본적인 논법과 문법을 배워갑니다. 지혜와 유학과 화술과 작문이 증가합니다. " );
						System.out.println("3. 철학-초급 : 철학자들에 대한 기초지식과 역사를 알아봅니다. 지혜와 유학과 화술과 식견이 증가합니다.  " );
						System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
						while (n>0) {
							 n= sc.nextInt();
							if (n==1) {
								유학초급();
								유학초급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 유학-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
								return;
							} else if (n==2) {
								논술초급();
								논술초급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 논술-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
								return;
							} else if (n==3) {
								철학초급();
								철학초급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 철학-초급을 진행합니다. 대가로 100 전을 지불했습니다.");
								return;
							} else if (n==4) {
								continue 처음;
							} else {
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
								continue;
							}
							}
					} else if (n==2) {
						if (캐릭터.돈<200) {
							System.out.println("돈이 부족합니다. 중급을 진행할 수 없습니다." );
							System.out.println("1. 초급 - 100전 2. 중급 - 200전 (유학 50 이상) 3. 고급 - 300전 (유학 100이상)" );
							continue;
						}
						if (캐릭터.유학<=50) {
							System.out.println("요구 능력치가 부족합니다." );
							System.out.println("1. 초급 -100전 2. 중급 - 200전 (유학 50 이상) 3. 고급 - 300전 (유학 100이상)" ); 
							continue;
						}
						System.out.println("1. 유학-중급 : 중용과 상서를 공부합니다. 지혜와 유학이 증가합니다. ");
						System.out.println("2. 논술-중급 : 수준높은 논리에 대해서 이해를 해나갑니다. 지혜와 유학과 화술과 작문이 증가합니다.  " );
						System.out.println("3. 철학-중급 : 철학자들의 가르침을 비교해가며 철학관을 구축합니다. 지혜와 유학과 화술과 식견이 증가합니다.  " );
						System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
						while (n>0) {
							 n= sc.nextInt();
							if (n==1) {
								유학중급();
								유학중급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 유학-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
								return;
							} else if (n==2) {
								논술중급();
								논술중급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 논술-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
								return;
							} else if (n==3) {
								철학중급();
								철학중급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 철학-중급을 진행합니다. 대가로 200 전을 지불했습니다.");
								return;
							} else if (n==4) {
								continue 처음;
							} else {
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
								continue;
							}
							}
					} else if (n==3) {
						if (캐릭터.돈<300) {
							System.out.println("돈이 부족합니다. 고급을 진행할 수 없습니다." );
							System.out.println("1. 초급 - 100전 2. 중급 - 200전 (유학 50 이상) 3. 고급 - 300전 (유학 100이상)" );
							continue;
						}
						if (캐릭터.유학<=100) {
							System.out.println("요구 능력치가 부족합니다." );
							System.out.println("1. 초급 -100전 2. 중급 - 200전 (유학 50 이상) 3. 고급 - 300전 (유학 100이상)" ); 
							continue;
						}
						System.out.println("1. 유학-고급 : 대학과 주역을 공부합니다. 지혜와 유학이 증가합니다. ");
						System.out.println("2. 논술-고급 : 유생들과 설전을 거듭하고 습작을 써내려갑니다. 지혜와 유학과 화술과 작문이 증가합니다.  " );
						System.out.println("3. 철학-고급 : 심도있게 철학을 연구하며 자신만의 철학을 만들어냅니다. 지혜와 유학과 식견이 증가합니다.  " );
						System.out.println("4. 일과 다시 선택 : 일과를 다시 선택합니다." );
						while (n>0) {
							 n= sc.nextInt();
							if (n==1) {
								유학고급();
								유학고급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 유학-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
								return;
							} else if (n==2) {
								논술고급();
								논술고급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 논술-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
								return;
							} else if (n==3) {
								철학고급();
								철학고급돈();
								이가탄특혜();
								System.out.println("돈을 받거나 지불하는 행동을 해서 돈 50전을 얻습니다.");
								System.out.println("이번 주차는 철학-고급을 진행합니다. 대가로 300 전을 지불했습니다.");
								return;
							} else if (n==4) {
								continue 처음;
							} else {
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
								continue;
							}
							}
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
					}
			} else if (n==4) {
				if(캐릭터.피로<10) {
					System.out.println("피로가 쌓이지 않아서 휴식을 취할 필요가 없습니다.");
					continue;
				}
				휴식();
				System.out.println("이번 주차는 아무것도 하지않고 휴식을 취합니다." );
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
				continue;
			}
			break;
			}
		}
		
		void 일과진행() {
			System.out.println("한 달 동안 일과를 진행하세요.");
			System.out.println("1주차 일정  " );
			선택과정();
			이벤트.이벤트카운트();
			while(이벤트.eve>=0) {
				if(이벤트.eve==1) {
					Thread.yield();
				}else if(이벤트.eve<1) {
						break;
					}
				}
			System.out.println("2주차 일정 " );
			선택과정();
			이벤트.이벤트카운트();
			while(이벤트.eve>=0) {
				if(이벤트.eve==1) {
					Thread.yield();
				}else if(이벤트.eve<1) {
						break;
					}
				}
			System.out.println("3주차 일정  " );
			선택과정();
			이벤트.이벤트카운트();
			while(이벤트.eve>=0) {
				if(이벤트.eve==1) {
					Thread.yield();
				}else if(이벤트.eve<1) {
						break;
					}
				}
			System.out.println("4주차 일정  " );
			선택과정();
			이벤트.이벤트카운트();
			while(이벤트.eve>=0) {
				if(이벤트.eve==1) {
					Thread.yield();
				}else if(이벤트.eve<1) {
						break;
					}
				}
			if (p==1) {
				월++;
				년();
			}
			System.out.println("한달이 지났습니다." );
			변화();
			return;
		}
		}

