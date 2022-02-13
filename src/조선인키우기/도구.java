package 조선인키우기;

public class 도구 {
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
	
	도구(int 이름) {
		이가탄(1); 
		이박사(2);
		이소룡(3);
		// TODO Auto-generated constructor stub
	}

	private void 이소룡(int i) {
		// TODO Auto-generated method stub
		
	}

	private void 이박사(int i) {
		// TODO Auto-generated method stub
		
	}

	private void 이가탄(int i) {
		// TODO Auto-generated method stub
		
	}	
	
	static void 중용() {
		if(캐릭터.이름==1) {
		캐릭터.유학 += 3;
		System.out.println("유학 3 증가");
		}
		if(캐릭터.이름==2) {
			캐릭터.유학 += 2;
			System.out.println("유학 2 증가");
	}
		if(캐릭터.이름==3) {
			캐릭터.유학 += 6;
			System.out.println("유학 6 증가");
		}
	}
	
		
	static void 서경() {
		if(캐릭터.이름==1) {
		캐릭터.유학 += 6;
		System.out.println("유학 6 증가");
	}if(캐릭터.이름==2) {
		캐릭터.유학 += 4;
		System.out.println("유학 4 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.유학 += 12;
		System.out.println("유학 12 증가");
	}
}
	
	static void 역경() {
		if(캐릭터.이름==1) {
		캐릭터.유학 += 9;
		System.out.println("유학 9 증가");
	}if(캐릭터.이름==2) {
		캐릭터.유학 += 6;
		System.out.println("유학 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.유학 += 18;
		System.out.println("유학 18 증가");
	}
}
	
	static void 시경() {
		if(캐릭터.이름==1) {
		캐릭터.작문 += 3;
		System.out.println("작문 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.작문 += 2;
		System.out.println("작문 2 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.작문 += 6;
		System.out.println("작문 6 증가");
	}
}
	
	static void 논어() {
		if(캐릭터.이름==1) {
		캐릭터.화술 += 3;
		System.out.println("화술 3 증가");
	} if(캐릭터.이름==2) {
		캐릭터.화술 += 2;
		System.out.println("화술 2 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.화술 += 6;
		System.out.println("화술 6 증가");
	}
}

	static void 맹자() {
		if(캐릭터.이름==1) {
		캐릭터.식견 += 3;
		System.out.println("식견 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.식견 += 2;
		System.out.println("식견 2 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.식견 += 6;
		System.out.println("식견 6 증가");
	}
}
	
	// 서당 
	
	static void 아대() {
		if(캐릭터.이름==1) {
		캐릭터.무술 += 3;
		System.out.println("무술 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.무술 += 6;
		System.out.println("무술 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.무술 += 2;
		System.out.println("무술 2 증가");
	}
}
	
	static void 명검() {
		if(캐릭터.이름==1) {
		캐릭터.무술 += 6;
		System.out.println("무술 6 증가");
	}if(캐릭터.이름==2) {
		캐릭터.무술 += 12;
		System.out.println("무술 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.무술 += 4;
		System.out.println("무술 4 증가");
	}
}
	
	static void 삼지창() {
		if(캐릭터.이름==1) {
		캐릭터.무술 += 9;
		System.out.println("무술 9 증가");
	}if(캐릭터.이름==2) {
		캐릭터.무술 += 18;
		System.out.println("무술 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.무술 += 6;
		System.out.println("무술 6 증가");
	}
}
	
	static void 말안장() {
		if(캐릭터.이름==1) {
		캐릭터.승마술 += 3;
		System.out.println("승마술 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.승마술 += 6;
		System.out.println("승마술 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.승마술 += 2;
		System.out.println("승마술 2 증가");
	}
}
	
	static void 지휘봉() {
		if(캐릭터.이름==1) {
		캐릭터.병법 += 3;
		System.out.println("병법 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.병법 += 6;
		System.out.println("병법 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.병법 += 2;
		System.out.println("병법 2 증가");
	}
}
	
	static void 갑옷() {
		if(캐릭터.이름==1) {
		캐릭터.실전 += 3;
		System.out.println("실전 3 증가");
	} if(캐릭터.이름==2) {
		캐릭터.실전 += 6;
		System.out.println("실전 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.실전 += 2;
		System.out.println("실전 2 증가");
	}
}
	
	static void 돼지국밥() {
		if(캐릭터.이름==1) {
		캐릭터.최대피로 += 4;
		System.out.println("최대피로 4 증가");
	}if(캐릭터.이름==2) {
		캐릭터.최대피로 += 2;
		System.out.println("최대피로 2 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.최대피로 += 2;
		System.out.println("최대피로 2 증가");
	}
}
	
	static void 추어탕() {
		if(캐릭터.이름==1) {
		캐릭터.지혜 += 3;
		System.out.println("지혜 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.지혜 += 2;
		System.out.println("지혜 2 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.지혜 += 6;
		System.out.println("지혜 6 증가");
	}
}
	
	static void 김치찌개() {
		if(캐릭터.이름==1) {
		캐릭터.힘 += 3;
		System.out.println("힘 3 증가");
	}if(캐릭터.이름==2) {
		캐릭터.힘 += 6;
		System.out.println("힘 6 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.힘 += 2;
		System.out.println("힘 2 증가");
	}
}
	
	static void 소머리국밥() {
		if(캐릭터.이름==1) {
		캐릭터.피로 -= 8;
		System.out.println("피로 8 감소");
	} if(캐릭터.이름==2) {
		캐릭터.피로 -= 5;
		System.out.println("피로 5 감소");
}
	if(캐릭터.이름==3) {
		캐릭터.피로 -= 5;
		System.out.println("피로 5 감소");
	}
}
	
	static void 망자의투구() {
		if(캐릭터.이름==1) {
	//	이가탄.무과 += 3;
		캐릭터.무술 += 5;
		캐릭터.힘 += 5;
		캐릭터.지혜 -= 5;
	//	이가탄.문과 -= 3;
		캐릭터.유학 -= 5;
		System.out.println("무술, 힘 5 증가하고 유학, 지혜 5 감소");
	}if(캐릭터.이름==2) {
		캐릭터.무술 += 10;
		캐릭터.힘 += 10;
		캐릭터.지혜 -= 5;
		//이소룡.문과 -= 3;
		캐릭터.유학 -= 5;
		System.out.println("무술, 힘 10 증가하고 유학, 지혜 5 감소");
}
	if(캐릭터.이름==3) {
		캐릭터.무술 += 5;
		캐릭터.힘 += 5;
		캐릭터.지혜 -= 3;
		//이박사.문과 -= 3;
		캐릭터.유학 -= 3;
		System.out.println("무술, 힘 5 증가하고 유학, 지혜 3 감소");
	}
}
	
	static void 금서() {
		if(캐릭터.이름==1) {
	//	이가탄.무과 -= 3;
		캐릭터.무술 -= 5;
		캐릭터.힘 -= 5;
		캐릭터.지혜 += 5;
	//	이가탄.문과 += 3;
		캐릭터.유학 += 5;
		System.out.println("무술, 힘 5 감소하고 유학, 지혜 5 증가");
	}if(캐릭터.이름==2) {
		캐릭터.무술 -= 3;
		캐릭터.힘 -= 3;
		캐릭터.지혜 += 5;
		//이소룡.문과 += 3;
		캐릭터.유학 += 5;
		System.out.println("무술, 힘 3 감소하고 유학, 지혜 5 증가");
}
	if(캐릭터.이름==3) {
		캐릭터.무술 -= 5;
		캐릭터.힘 -= 5;
		캐릭터.지혜 += 10;
	//	능력치.문과 += 3;
		캐릭터.유학 += 10;
		System.out.println("무술, 힘 5 감소하고 유학, 지혜 10 증가");
	}
}
	
	static void 이상한약() {
		if(캐릭터.이름==1) {
		캐릭터.피로 -= 9;
		캐릭터.최대피로 -= 1;
		System.out.println("피로 9 감소하고 최대피로 1 감소");
	}if(캐릭터.이름==2) {
		캐릭터.피로 -= 7;
		캐릭터.최대피로 -= 2;
		System.out.println("피로 7 감소하고 최대피로 2 감소");
}
	if(캐릭터.이름==3) {
		캐릭터.피로 -= 7;
		캐릭터.최대피로 -= 2;
		System.out.println("피로 7 감소하고 최대피로 2 감소");
	}
}
	
	static void 도구보기 () {
		System.out.println("가방 목록 ");
		System.out.println("---------------------------------------------------------");
		for(int i = 1; i<20; i++) {
			if (마을.가방.contains(1)&&i==1) {
				if(캐릭터.이름==1) {
				 System.out.println("-중용 : 한달마다 유학 3 증가");
				} else if(캐릭터.이름==2) {
				System.out.println("-중용 : 한달마다 유학 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-중용 : 한달마다 유학 6 증가");
				}
			}	else if (마을.가방.contains(2)&&i==2) {
				if(캐릭터.이름==1) {
				 System.out.println("-서경 : 한달마다 유학 3 증가");
				} else if(캐릭터.이름==2) {
					 System.out.println("-서경 : 한달마다 유학 4 증가");
			} else if(캐릭터.이름==3) {
				 System.out.println("-서경 : 한달마다 유학 12 증가");
				}
			}	else if (마을.가방.contains(3)&&i==3) {
				if(캐릭터.이름==1) {
				 System.out.println("-역경 : 한달마다 유학 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-역경 : 한달마다 유학 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-역경 : 한달마다 유학 18 증가");
				}
			}	else if (마을.가방.contains(4)&&i==4) {
				if(캐릭터.이름==1) {
				 System.out.println("-시경 : 한달마다 작문 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-시경 : 한달마다 작문 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-시경 : 한달마다 작문 6 증가");
				}
			}	else if (마을.가방.contains(5)&&i==5) {
				if(캐릭터.이름==1) {
				 System.out.println("-논어 : 한달마다 화술 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-논어 : 한달마다 화술 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-논어 : 한달마다 화술 6 증가");
				}
			}	else if (마을.가방.contains(6)&&i==6) {
				if(캐릭터.이름==1) {
				 System.out.println("-맹자 : 한달마다 식견 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-맹자 : 한달마다 식견 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-맹자 : 한달마다 식견 6 증가");
				}
			}	else if (마을.가방.contains(7)&&i==7) {
				if(캐릭터.이름==1) {
				 System.out.println("-아대 : 한달마다 무술 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-아대 : 한달마다 무술 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-아대 : 한달마다 무술 2 증가");
				}
			}	else if (마을.가방.contains(8)&&i==8) {
				if(캐릭터.이름==1) {
				 System.out.println("-명검 : 한달마다 무술 6 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-명검 : 한달마다 무술 12 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-명검 : 한달마다 무술 4 증가");
				}
			}	else if (마을.가방.contains(9)&&i==9) {
				if(캐릭터.이름==1) {
				 System.out.println("-삼지창 : 한달마다 무술 9 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-삼지창 : 한달마다 무술 18 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-삼지창 : 한달마다 무술 6 증가");
				}
			}	else if (마을.가방.contains(10)&&i==10) {
				if(캐릭터.이름==1) {
				 System.out.println("-말안장 : 한달마다 승마술 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-말안장 : 한달마다 승마술 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-말안장 : 한달마다 승마술 2 증가");
				}
			}	else if (마을.가방.contains(11)&&i==11) {
				if(캐릭터.이름==1) {
				 System.out.println("-지휘봉 : 한달마다 병법 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-지휘봉 : 한달마다 병법 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-지휘봉 : 한달마다 병법 2 증가");
				}
			}	else if (마을.가방.contains(12)&&i==12) {
				if(캐릭터.이름==1) {
				 System.out.println("-갑옷 : 한달마다 실전 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-갑옷 : 한달마다 실전 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-갑옷 : 한달마다 실전 2 증가");
				}
			}	else if (마을.가방.contains(13)&&i==13) {
				if(캐릭터.이름==1) {
				 System.out.println("-돼지국밥 : 한달마다 최대피로 4 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-돼지국밥 : 한달마다 최대피로 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-돼지국밥 : 한달마다 최대피로 2 증가");
				}
			}	else if (마을.가방.contains(14)&&i==14) {
				if(캐릭터.이름==1) {
				 System.out.println("-추어탕 : 한달마다 지혜 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-추어탕 : 한달마다 지혜 2 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-추어탕 : 한달마다 지혜 6 증가");
				}
			}	else if (마을.가방.contains(15)&&i==15) {
				if(캐릭터.이름==1) {
				 System.out.println("-김치찌개 : 한달마다 힘 3 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-김치찌개 : 한달마다 힘 6 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-김치찌개 : 한달마다 힘 2 증가");
				}
			}	else if (마을.가방.contains(16)&&i==16) {
				if(캐릭터.이름==1) {
				 System.out.println("-소머리국밥 : 한달마다 피로 8 감소");
				} else if(캐릭터.이름==2) {
					System.out.println("-소머리국밥 : 한달마다 피로 5 감소");
			} else if(캐릭터.이름==3) {
				System.out.println("-소머리국밥 : 한달마다 피로 5 감소");
				}
			}	else if (마을.가방.contains(17)&&i==17) {
				if(캐릭터.이름==1) {
				 System.out.println("-망자의투구 : 한달마다 무술, 힘 5 증가하고 유학, 지혜 5 감소 ");
				} else if(캐릭터.이름==2) {
					System.out.println("-망자의투구 : 한달마다 무술, 힘 10 증가하고 유학, 지혜 5 감소 ");
			} else if(캐릭터.이름==3) {
				System.out.println("-망자의투구 : 한달마다 무술, 힘 5 증가하고 유학, 지혜 3 감소 ");
				}
			}	else if (마을.가방.contains(18)&&i==18) {
				if(캐릭터.이름==1) {
				 System.out.println("-금서 : 한달마다 무술, 힘 5 감소하고 유학, 지혜 5 증가");
				} else if(캐릭터.이름==2) {
					System.out.println("-금서 : 한달마다 무술, 힘 3 감소하고 유학, 지혜 5 증가");
			} else if(캐릭터.이름==3) {
				System.out.println("-금서 : 한달마다 무술, 힘 5 감소하고 유학, 지혜 10 증가");
				}
			}	else if (마을.가방.contains(19)&&i==19) {
				if(캐릭터.이름==1) {
				 System.out.println("-이상한약 : 한달마다 피로 9 감소하고 최대피로 1 감소");
				} else if(캐릭터.이름==2) {
					System.out.println("-이상한약 : 한달마다 피로 7 감소하고 최대피로 2 감소");
			} else if(캐릭터.이름==3) {
				System.out.println("-이상한약 : 한달마다 피로 7 감소하고 최대피로 2 감소");
				}
			}	else {
				 System.out.println("-빈 공간");
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	

	static void 도구사용 () {
		for(int i = 1; i<20; i++) {
			if (마을.가방.contains(1)&&i==1) {
				 System.out.println("중용의 효과가 발동됐습니다.");
				 중용();
			}	else if (마을.가방.contains(2)&&i==2) {
				 System.out.println("서경의 효과가 발동됐습니다.");
				 서경();
			}	else if (마을.가방.contains(3)&&i==3) {
				 System.out.println("역경의 효과가 발동됐습니다.");
				 역경();
			}	else if (마을.가방.contains(4)&&i==4) {
				 System.out.println("시경의 효과가 발동됐습니다.");
				 시경();
			}	else if (마을.가방.contains(5)&&i==5) {
				 System.out.println("논어의 효과가 발동됐습니다.");
				 논어();
			}	else if (마을.가방.contains(6)&&i==6) {
				 System.out.println("맹자의 효과가 발동됐습니다.");
				 맹자();
			}	else if (마을.가방.contains(7)&&i==7) {
				 System.out.println("아대의 효과가 발동됐습니다.");
				 아대();
			}	else if (마을.가방.contains(8)&&i==8) {
				 System.out.println("명검의 효과가 발동됐습니다.");
				 명검();
			}	else if (마을.가방.contains(9)&&i==9) {
				 System.out.println("삼지창의 효과가 발동됐습니다.");
				 삼지창();
			}	else if (마을.가방.contains(10)&&i==10) {
				 System.out.println("말안장의 효과가 발동됐습니다.");
				 말안장();
			}	else if (마을.가방.contains(11)&&i==11) {
				 System.out.println("지휘봉의 효과가 발동됐습니다.");
				 지휘봉();
			}	else if (마을.가방.contains(12)&&i==12) {
				 System.out.println("갑옷의 효과가 발동됐습니다.");
				 갑옷();
			}	else if (마을.가방.contains(13)&&i==13) {
				 System.out.println("돼지국밥의 효과가 발동됐습니다.");
				 돼지국밥();
			}	else if (마을.가방.contains(14)&&i==14) {
				 System.out.println("추어탕의 효과가 발동됐습니다.");
				 추어탕();
			}	else if (마을.가방.contains(15)&&i==15) {
				 System.out.println("김치찌개의 효과가 발동됐습니다.");
				 김치찌개();
			}	else if (마을.가방.contains(16)&&i==16) {
				 System.out.println("소머리국밥의 효과가 발동됐습니다.");
				 소머리국밥();
			}	else if (마을.가방.contains(17)&&i==17) {
				 System.out.println("망자의투구의 효과가 발동됐습니다.");
				 망자의투구();
			}	else if (마을.가방.contains(18)&&i==18) {
				 System.out.println("금서의 효과가 발동됐습니다.");
				 금서();
			}	else if (마을.가방.contains(19)&&i==19) {
				 System.out.println("이상한약의 효과가 발동됐습니다.");
				 이상한약();
			}
		}
	}

}