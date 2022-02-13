package 조선인키우기;

public class 서당 extends 마을 {

	서당(int 이름) {
		super(이름);
		// TODO Auto-generated constructor stub
	}

	static void 이가탄서당() {
		/*서당.add(1);
		서당.add(2);
		서당.add(3);
		서당.add(4);
		서당.add(5);*/
		System.out.println("서당에 오셨습니다.");
		System.out.println("서당은 유학에 관련된 도구들을 취급합니다. 유학에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 중용 (400전) : 한달이 지날때마다 유학을 3 증가시켜준다. " );
					System.out.println("1. 서경  (800전) : 한달이 지날때마다 유학을 6 증가시켜준다. " );
					System.out.println("2. 역경  (1200전) : 한달이 지날때마다 유학을 9 증가시켜준다. " );
					System.out.println("3. 시경 (400전) : 한달이 지날때마다 작문을 3 증가시켜준다. " );
					System.out.println("4. 논어 (400전) : 한달이 지날때마다 화술을 3 증가시켜준다. " );
					System.out.println("5. 맹자 (400전) : 한달이 지날때마다 식견을 3 증가시켜준다. " );
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<400) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(1)!=true) {
					캐릭터.돈 -= 400;
					마을.가방.add(1);
					System.out.println("중용을 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<800) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(2)!=true) {
							캐릭터.돈 -= 800;
							마을.가방.add(2);
							System.out.println("서경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<1200) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(3)!=true) {
							캐릭터.돈 -= 1200;
							마을.가방.add(3);
							System.out.println("역경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(4)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(4);
							System.out.println("시경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(5)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(5);
							System.out.println("논어를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==5) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(6)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(6);
							System.out.println("맹자를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==6) {
						continue 이전;
					}
						else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 중용 (300전) " );
					if(마을.가방.contains(1)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 서경 (600전) " );
					if(마을.가방.contains(2)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 역경 (900전) " );
					if(마을.가방.contains(3)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 시경 (300전) " );
					if(마을.가방.contains(4)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("4. 논어 (300전) " );
					if(마을.가방.contains(5)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("5. 맹자 (300전) " );
					if(마을.가방.contains(6)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(1)==true) {
						캐릭터.돈 += 300; 
						int a = 마을.가방.indexOf(1); 
						마을.가방.remove(a); 
						System.out.println("중용을 판매했습니다.");
						}	else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
						}	else if (n==1) {
							if(마을.가방.contains(2)==true) {
							캐릭터.돈 += 600; 
							int a = 마을.가방.indexOf(2); 
							마을.가방.remove(a);
							System.out.println("서경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(3)==true) {
							캐릭터.돈 += 900; 
							int a = 마을.가방.indexOf(3); 
							마을.가방.remove(a); 
							System.out.println("역경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(4)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(4); 
							마을.가방.remove(a); 
							System.out.println("시경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==4) {
							if(마을.가방.contains(5)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(5); 
							마을.가방.remove(a); 
							System.out.println("논어를 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==5) {
							if(마을.가방.contains(6)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(6); 
							마을.가방.remove(a); 
							System.out.println("맹자를 판매했습니다.");
							}	 else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}else if (n==6) {
							continue 이전;
						}	 else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
				//	서당.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}
	static void 소룡서당() {
		/*서당.add(1);
		서당.add(2);
		서당.add(3);
		서당.add(4);
		서당.add(5);*/
		System.out.println("서당에 오셨습니다.");
		System.out.println("서당은 유학에 관련된 도구들을 취급합니다. 유학에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 중용 (500전) : 한달이 지날때마다 유학을 2 증가시켜준다. " );
					System.out.println("1. 서경  (1000전) : 한달이 지날때마다 유학을 4 증가시켜준다. " );
					System.out.println("2. 역경  (1500전) : 한달이 지날때마다 유학을 6 증가시켜준다. " );
					System.out.println("3. 시경 (500전) : 한달이 지날때마다 작문을 2 증가시켜준다. " );
					System.out.println("4. 논어 (500전) : 한달이 지날때마다 화술을 2 증가시켜준다. " );
					System.out.println("5. 맹자 (500전) : 한달이 지날때마다 식견을 2 증가시켜준다. " );
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(1)!=true) {
					캐릭터.돈 -= 500;
					마을.가방.add(1);
					System.out.println("중용을 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<1000) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(2)!=true) {
							캐릭터.돈 -= 1000;
							마을.가방.add(2);
							System.out.println("서경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<1500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(3)!=true) {
							캐릭터.돈 -= 1500;
							마을.가방.add(3);
							System.out.println("역경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(4)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(4);
							System.out.println("시경을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(5)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(5);
							System.out.println("논어를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==5) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(6)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(6);
							System.out.println("맹자를 구매했습니다.");
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
					System.out.print("0. 중용 (250전) " );
					if(마을.가방.contains(1)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 서경 (500전) " );
					if(마을.가방.contains(2)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 역경 (750전) " );
					if(마을.가방.contains(3)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 시경 (250전) " );
					if(마을.가방.contains(4)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("4. 논어 (250전) " );
					if(마을.가방.contains(5)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("5. 맹자 (250전) " );
					if(마을.가방.contains(6)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("6. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(1)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(1); 
						마을.가방.remove(a); 
						System.out.println("중용을 판매했습니다.");
						}
						}	else if (n==1) {
							if(마을.가방.contains(2)==true) {
							캐릭터.돈 += 500; 
							int a = 마을.가방.indexOf(2); 
							마을.가방.remove(a);
							System.out.println("서경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(3)==true) {
							캐릭터.돈 += 750; 
							int a = 마을.가방.indexOf(3); 
							마을.가방.remove(a);
							System.out.println("역경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(4)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(4); 
							마을.가방.remove(a); 
							System.out.println("시경을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==4) {
							if(마을.가방.contains(5)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(5); 
							마을.가방.remove(a); 
							System.out.println("논어를 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==5) {
							if(마을.가방.contains(6)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(6); 
							마을.가방.remove(a); 
							System.out.println("맹자를 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}else if (n==6) {
							continue 이전;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
					//서당.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
}
	static void 박사서당() {
		/*	서당.add(1);
			서당.add(2);
			서당.add(3);
			서당.add(4);
			서당.add(5);*/
			System.out.println("서당에 오셨습니다.");
			System.out.println("서당은 유학에 관련된 도구들을 취급합니다. 유학에 특화된 자라면 더 좋은 효능을 발휘할 것입니다.");
			System.out.println("무엇을 하시겠습니까?");
			이전 : while (n>=0) {
				System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
				 n= sc.nextInt();
				if (n==1) {
					while (n>=0) {
						System.out.println("0. 중용 (500전) : 한달이 지날때마다 유학을 6 증가시켜준다. " );
						System.out.println("1. 서경  (1000전) : 한달이 지날때마다 유학을 12 증가시켜준다. " );
						System.out.println("2. 역경  (1500전) : 한달이 지날때마다 유학을 18 증가시켜준다. " );
						System.out.println("3. 시경 (500전) : 한달이 지날때마다 작문을 6 증가시켜준다. " );
						System.out.println("4. 논어 (500전) : 한달이 지날때마다 화술을 6 증가시켜준다. " );
						System.out.println("5. 맹자 (500전) : 한달이 지날때마다 식견을 6 증가시켜준다. " );
						System.out.println("6. 나간다. " );
					 n= sc.nextInt();
					if (n==0) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(1)!=true) {
						캐릭터.돈 -= 500;
						마을.가방.add(1);
						System.out.println("중용을 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
						}	else if (n==1) {
							if(캐릭터.돈<1000) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(2)!=true) {
								캐릭터.돈 -= 1000;
								마을.가방.add(2);
								System.out.println("서경을 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==2) {
							if(캐릭터.돈<1500) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(3)!=true) {
								캐릭터.돈 -= 1500;
								마을.가방.add(3);
								System.out.println("역경을 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==3) {
							if(캐릭터.돈<500) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(4)!=true) {
								캐릭터.돈 -= 500;
								마을.가방.add(4);
								System.out.println("시경을 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==4) {
							if(캐릭터.돈<500) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(5)!=true) {
								캐릭터.돈 -= 500;
								마을.가방.add(5);
								System.out.println("논어를 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==5) {
							if(캐릭터.돈<500) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(6)!=true) {
								캐릭터.돈 -= 500;
								마을.가방.add(6);
								System.out.println("맹자를 구매했습니다.");
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
						System.out.print("0. 중용 (250전) " );
						if(마을.가방.contains(1)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("1. 서경 (500전) " );
						if(마을.가방.contains(2)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("2. 역경 (1500전) " );
						if(마을.가방.contains(3)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("3. 시경 (250전) " );
						if(마을.가방.contains(4)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("4. 논어 (250전) " );
						if(마을.가방.contains(5)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("5. 맹자 (250전) " );
						if(마을.가방.contains(6)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.println("6. 나간다. " );
					 n= sc.nextInt();
					 if (n==0) {
							if(마을.가방.contains(1)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(1); 
							마을.가방.remove(a); 
							System.out.println("중용을 판매했습니다.");
							}	else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
							}	else if (n==1) {
								if(마을.가방.contains(2)==true) {
								캐릭터.돈 += 500; 
								int a = 마을.가방.indexOf(2); 
								마을.가방.remove(a);
								System.out.println("서경을 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==2) {
								if(마을.가방.contains(3)==true) {
								캐릭터.돈 += 750; 
								int a = 마을.가방.indexOf(3); 
								마을.가방.remove(a); 
								System.out.println("역경을 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==3) {
								if(마을.가방.contains(4)==true) {
								캐릭터.돈 += 250; 
								int a = 마을.가방.indexOf(4); 
								마을.가방.remove(a); 
								System.out.println("시경을 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==4) {
								if(마을.가방.contains(5)==true) {
								캐릭터.돈 += 250; 
								int a = 마을.가방.indexOf(5); 
								마을.가방.remove(a); 
								System.out.println("논어를 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==5) {
								if(마을.가방.contains(6)==true) {
								캐릭터.돈 += 250; 
								int a = 마을.가방.indexOf(6); 
								마을.가방.remove(a); 
								System.out.println("맹자를 판매했습니다.");
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
						//서당.clear();
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}		
				}	
		}

}
