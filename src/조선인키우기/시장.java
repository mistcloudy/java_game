package 조선인키우기;

public class 시장 extends 마을 {

	시장(int 이름) {
		super(이름);
		// TODO Auto-generated constructor stub
	}

	


static void 이가탄시장() {
	/*시장.add(7);
	시장.add(8);
	시장.add(9);
	시장.add(10);
	시장.add(11);
	시장.add(12);*/
	System.out.println("시장에 오셨습니다.");
	System.out.println("시장은 무술에 관련된 도구들을 취급합니다. 무술에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
	System.out.println("무엇을 하시겠습니까?");
	이전 : while (n>=0) {
		System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
		 n= sc.nextInt();
		if (n==1) {
			while (n>=0) {
				System.out.println("0. 아대 (400전) : 한달이 지날때마다 무술을 3 증가시켜준다. " );
				System.out.println("1. 명검  (800전) : 한달이 지날때마다 무술을 6 증가시켜준다. " );
				System.out.println("2. 삼지창  (1200전) : 한달이 지날때마다 무술을 9 증가시켜준다. " );
				System.out.println("3. 말안장 (400전) : 한달이 지날때마다 승마술을 3 증가시켜준다. " );
				System.out.println("4. 지휘봉 (400전) : 한달이 지날때마다 병법을 3 증가시켜준다. " );
				System.out.println("5. 갑옷 (400전) : 한달이 지날때마다 실전을 3 증가시켜준다. " );
				System.out.println("6. 나간다. " );
			 n= sc.nextInt();
			if (n==0) {
				if(캐릭터.돈<400) {
					System.out.println("시스템.돈이 충분하지 않습니다.");
					continue;
				}
				if(마을.가방.contains(7)!=true) {
				캐릭터.돈 -= 400;
				마을.가방.add(7);
				System.out.println("아대를 구매했습니다.");
				}	else {
					System.out.println("그 도구가 이미 마을.가방에 있습니다." );
					}
				}	else if (n==1) {
					if(캐릭터.돈<800) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(8)!=true) {
						캐릭터.돈 -= 800;
						마을.가방.add(8);
						System.out.println("명검을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==2) {
					if(캐릭터.돈<1200) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(9)!=true) {
						캐릭터.돈 -= 1200;
						마을.가방.add(9);
						System.out.println("삼지창을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==3) {
					if(캐릭터.돈<400) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(10)!=true) {
						캐릭터.돈 -= 400; 
						마을.가방.add(10);
						System.out.println("말안장을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==4) {
					if(캐릭터.돈<400) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(11)!=true) {
						캐릭터.돈 -= 400;
						마을.가방.add(11);
						System.out.println("지휘봉을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==5) {
					if(캐릭터.돈<400) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(12)!=true) {
						캐릭터.돈 -= 400;
						마을.가방.add(12);
						System.out.println("갑옷을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==6) {
					continue 이전;
				}	 else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}
				break;
			}
		} 		else if (n==2) {
			while (n>=0) {
				System.out.print("0. 아대 (300전) " );
				if(마을.가방.contains(7)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("1. 명검 (600전) " );
				if(마을.가방.contains(8)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("2. 삼지창 (900전) " );
				if(마을.가방.contains(9)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("3. 말안장 (300전) " );
				if(마을.가방.contains(10)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("4. 지휘봉 (300전) " );
				if(마을.가방.contains(11)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("5. 갑옷 (300전) " );
				if(마을.가방.contains(12)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.println("6. 나간다. " );
			 n= sc.nextInt();
			 if (n==0) {
					if(마을.가방.contains(7)==true) {
					캐릭터.돈 += 300; 
					int a = 마을.가방.indexOf(7); 
					마을.가방.remove(a);
					System.out.println("아대를 판매했습니다.");
					}	else {
						System.out.println("그 도구가 마을.가방에 없습니다." );
						}
					}	else if (n==1) {
						if(마을.가방.contains(8)==true) {
						캐릭터.돈 += 600; 
						int a = 마을.가방.indexOf(8); 
						마을.가방.remove(a);
						System.out.println("명검을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==2) {
						if(마을.가방.contains(9)==true) {
						캐릭터.돈 += 900; 
						int a = 마을.가방.indexOf(9); 
						마을.가방.remove(a);
						System.out.println("삼지창을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==3) {
						if(마을.가방.contains(10)==true) {
						캐릭터.돈 += 300; 
						int a = 마을.가방.indexOf(10); 
						마을.가방.remove(a);
						System.out.println("말안장을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==4) {
						if(마을.가방.contains(11)==true) {
						캐릭터.돈 += 300; 
						int a = 마을.가방.indexOf(11); 
						마을.가방.remove(a); 
						System.out.println("지휘봉을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==5) {
						if(마을.가방.contains(12)==true) {
						캐릭터.돈 += 300; 
						int a = 마을.가방.indexOf(12); 
						마을.가방.remove(a); 
						System.out.println("갑옷을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==6) {
						continue 이전;
					}	 else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
			}
			}	else if (n==3) {
				//시장.clear();
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
				continue;
			}		
		}	
}
static void 소룡시장() {
	/*시장.add(7);
	시장.add(8);
	시장.add(9);
	시장.add(10);
	시장.add(11);
	시장.add(12);*/
	System.out.println("시장에 오셨습니다.");
	System.out.println("시장은 무술에 관련된 도구들을 취급합니다. 무술에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
	System.out.println("무엇을 하시겠습니까?");
	이전 : while (n>=0) {
		System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
		 n= sc.nextInt();
		if (n==1) {
			while (n>=0) {
				System.out.println("0. 아대 (500전) : 한달이 지날때마다 무술을 6 증가시켜준다. " );
				System.out.println("1. 명검  (1000전) : 한달이 지날때마다 무술을 12 증가시켜준다. " );
				System.out.println("2. 삼지창  (1500전) : 한달이 지날때마다 무술을 18 증가시켜준다. " );
				System.out.println("3. 말안장 (500전) : 한달이 지날때마다 승마술을 6 증가시켜준다. " );
				System.out.println("4. 지휘봉 (500전) : 한달이 지날때마다 병법을 6 증가시켜준다. " );
				System.out.println("5. 갑옷 (500전) : 한달이 지날때마다 실전을 6 증가시켜준다. " );
				System.out.println("6. 나간다. " );
			 n= sc.nextInt();
			if (n==0) {
				if(캐릭터.돈<500) {
					System.out.println("시스템.돈이 충분하지 않습니다.");
					continue;
				}
				if(마을.가방.contains(7)!=true) {
				캐릭터.돈 -= 500;
				마을.가방.add(7);
				System.out.println("아대를 구매했습니다.");
				}	else {
					System.out.println("그 도구가 이미 마을.가방에 있습니다." );
					}
				}	else if (n==1) {
					if(캐릭터.돈<1000) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(8)!=true) {
						캐릭터.돈 -= 1000;
						마을.가방.add(8);
						System.out.println("명검을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==2) {
					if(캐릭터.돈<1500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(9)!=true) {
						캐릭터.돈 -= 1500;
						마을.가방.add(9);
						System.out.println("삼지창을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==3) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(10)!=true) {
						캐릭터.돈 -= 500;
						마을.가방.add(10);
						System.out.println("말안장을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==4) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(11)!=true) {
						캐릭터.돈 -= 500;
						마을.가방.add(11);
						System.out.println("지휘봉을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==5) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(12)!=true) {
						캐릭터.돈 -= 500;
						마을.가방.add(12);
						System.out.println("갑옷을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
				}	else if (n==6) {
					continue 이전;
				}	 else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}
				break;
			}
		} 		else if (n==2) {
			while (n>=0) {
				System.out.print("0. 아대 (250전) " );
				if(마을.가방.contains(7)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("1. 명검 (500전) " );
				if(마을.가방.contains(8)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("2. 삼지창 (750전) " );
				if(마을.가방.contains(9)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("3. 말안장 (250전) " );
				if(마을.가방.contains(10)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("4. 지휘봉 (250전) " );
				if(마을.가방.contains(11)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.print("5. 갑옷 (250전) " );
				if(마을.가방.contains(12)!=true) {
					System.out.println("- 소유 X" );
				}	else {
					System.out.println("- 소유 O" );
				}
				System.out.println("6. 나간다. " );
			 n= sc.nextInt();
			 if (n==0) {
					if(마을.가방.contains(7)==true) {
					캐릭터.돈 += 250; 
					마을.가방.remove(7);
					System.out.println("아대를 판매했습니다.");
					}
					}	else if (n==1) {
						if(마을.가방.contains(8)==true) {
						캐릭터.돈 += 500; 
						int a = 마을.가방.indexOf(8); 
						마을.가방.remove(a);
						System.out.println("명검을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==2) {
						if(마을.가방.contains(9)==true) {
						캐릭터.돈 += 750; 
						int a = 마을.가방.indexOf(9); 
						마을.가방.remove(a);
						System.out.println("삼지창을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==3) {
						if(마을.가방.contains(10)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(10); 
						마을.가방.remove(a);
						System.out.println("말안장을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==4) {
						if(마을.가방.contains(11)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(11); 
						마을.가방.remove(a); 
						System.out.println("지휘봉을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==5) {
						if(마을.가방.contains(12)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(12); 
						마을.가방.remove(a); 
						System.out.println("갑옷을 판매했습니다.");
						} else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
					}	else if (n==6) {
						continue 이전;
					}	 else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
			}
			}	else if (n==3) {
			//	시장.clear();
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
				continue;
			}		
		}	
}
static void 박사시장() {
	/*	시장.add(7);
		시장.add(8);
		시장.add(9);
		시장.add(10);
		시장.add(11);
		시장.add(12);*/
		System.out.println("시장에 오셨습니다.");
		System.out.println("시장은 무술에 관련된 도구들을 취급합니다. 무술에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 아대 (500전) : 한달이 지날때마다 무술을 2 증가시켜준다. " );
					System.out.println("1. 명검  (1000전) : 한달이 지날때마다 무술을 4 증가시켜준다. " );
					System.out.println("2. 삼지창  (1500전) : 한달이 지날때마다 무술을 6 증가시켜준다. " );
					System.out.println("3. 말안장 (500전) : 한달이 지날때마다 승마술을 2 증가시켜준다. " );
					System.out.println("4. 지휘봉 (500전) : 한달이 지날때마다 병법을 2 증가시켜준다. " );
					System.out.println("5. 갑옷 (500전) : 한달이 지날때마다 실전을 2 증가시켜준다. " );
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(7)!=true) {
					캐릭터.돈 -= 500;
					마을.가방.add(7);
					System.out.println("아대를 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<1000) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(8)!=true) {
							캐릭터.돈 -= 1000;
							마을.가방.add(8);
							System.out.println("명검을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<1500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(9)!=true) {
							캐릭터.돈 -= 1500;
							마을.가방.add(9);
							System.out.println("삼지창을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(10)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(10);
							System.out.println("말안장을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(11)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(11);
							System.out.println("지휘봉을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==5) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(12)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(12);
							System.out.println("갑옷을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==6) {
						continue 이전;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 아대 (250전) " );
					if(마을.가방.contains(7)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 명검 (500전) " );
					if(마을.가방.contains(8)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 삼지창 (750전) " );
					if(마을.가방.contains(9)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 말안장 (250전) " );
					if(마을.가방.contains(10)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("4. 지휘봉 (250전) " );
					if(마을.가방.contains(11)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("5. 갑옷 (250전) " );
					if(마을.가방.contains(12)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(7)==true) {
						캐릭터.돈 += 250; 
						마을.가방.remove(7); 
						System.out.println("아대를 판매했습니다.");
						}	else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
						}	else if (n==1) {
							if(마을.가방.contains(8)==true) {
							캐릭터.돈 += 500; 
							int a = 마을.가방.indexOf(8); 
							마을.가방.remove(a);
							System.out.println("명검을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(9)==true) {
							캐릭터.돈 += 750; 
							int a = 마을.가방.indexOf(9); 
							마을.가방.remove(a);
							System.out.println("삼지창을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(10)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(10); 
							마을.가방.remove(a);
							System.out.println("말안장을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==4) {
							if(마을.가방.contains(11)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(11); 
							마을.가방.remove(a); 
							System.out.println("지휘봉을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==5) {
							if(마을.가방.contains(12)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(12); 
							마을.가방.remove(a); 
							System.out.println("갑옷을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==6) {
							continue 이전;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
				//	시장.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}

}