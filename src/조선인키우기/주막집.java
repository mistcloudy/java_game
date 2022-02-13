package 조선인키우기;

public class 주막집 extends 마을 {

	주막집(int 이름) {
		super(이름);
		// TODO Auto-generated constructor stub
	}

	static void 이가탄주막() {
		/*주막2.add(13);
		주막2.add(14);
		주막2.add(15);
		주막2.add(16);*/
		System.out.println("주막에 오셨습니다.");
		System.out.println("주막은 요리의 제조법을 취급합니다. 요리를 누가 먹느냐에 따라 효과가 좋아질 수도 나빠질 수도 있습니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 :	while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 돼지국밥 (400전) : 한달이 지날때마다 최대피로를 증가시켜준다. " );
					System.out.println("1. 추어탕 (400전) : 한달이 지날때마다 지혜를 증가시켜준다. " );
					System.out.println("2. 김치찌개  (400전) : 한달이 지날때마다 힘을 증가시켜준다. " );
					System.out.println("3. 소머리국밥 (400전) : 한달이 지날때마다 피로를 감소시켜준다. " );
					System.out.println("4. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<400) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(13)!=true) {
					캐릭터.돈 -= 400;
					마을.가방.add(13);
					System.out.println("돼지국밥을 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(14)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(14);
							System.out.println("추어탕을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(15)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(15);
							System.out.println("김치찌개를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<400) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(16)!=true) {
							캐릭터.돈 -= 400;
							마을.가방.add(16);
							System.out.println("소머리국밥을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						continue 이전;
					}	 else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 돼지국밥 (300전) " );
					if(마을.가방.contains(13)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 추어탕 (300전) " );
					if(마을.가방.contains(14)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 김치찌개 (300전) " );
					if(마을.가방.contains(15)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 소머리국밥 (300전) " );
					if(마을.가방.contains(16)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("4. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(13)==true) {
						캐릭터.돈 += 300; 
						int a = 마을.가방.indexOf(13); 
						마을.가방.remove(a);  
						System.out.println("돼지국밥을 판매했습니다.");
						}	else {
							System.out.println("그 도구가 마을.가방에 없습니다." );
							}
						}	else if (n==1) {
							if(마을.가방.contains(14)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(14); 
							마을.가방.remove(a);
							System.out.println("추어탕을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(15)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(15); 
							마을.가방.remove(a);   
							System.out.println("김치찌개를 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(16)==true) {
							캐릭터.돈 += 300; 
							int a = 마을.가방.indexOf(16); 
							마을.가방.remove(a);
							System.out.println("소머리국밥을 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==4) {
							continue 이전;
						}	 else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
					//주막2.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}
	static void 소룡주막() {
		/*주막2.add(13);
		주막2.add(14);
		주막2.add(15);
		주막2.add(16);*/
		System.out.println("주막에 오셨습니다.");
		System.out.println("주막은 요리의 제조법을 취급합니다. 요리를 누가 먹느냐에 따라 효과가 좋아질 수도 나빠질 수도 있습니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 돼지국밥 (500전) : 한달이 지날때마다 최대피로를 2 증가시켜준다. " );
					System.out.println("1. 추어탕 (500전) : 한달이 지날때마다 지혜를 2 증가시켜준다. " );
					System.out.println("2. 김치찌개  (500전) : 한달이 지날때마다 힘을 6 증가시켜준다. " );
					System.out.println("3. 소머리국밥 (500전) : 한달이 지날때마다 피로를 5 감소시켜준다. " );
					System.out.println("4. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(13)!=true) {
					캐릭터.돈 -= 500;
					마을.가방.add(13);
					System.out.println("돼지국밥을 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(14)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(14);
							System.out.println("추어탕을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(15)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(15);
							System.out.println("김치찌개를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(16)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(16);
							System.out.println("소머리국밥을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						continue 이전;
					}	 else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 돼지국밥 (250전) " );
					if(마을.가방.contains(13)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 추어탕 (250전) " );
					if(마을.가방.contains(14)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 김치찌개 (250전) " );
					if(마을.가방.contains(15)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 소머리국밥 (250전) " );
					if(마을.가방.contains(16)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("4. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(13)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(13); 
						마을.가방.remove(a);  
						}
						}	else if (n==1) {
							if(마을.가방.contains(14)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(14); 
							마을.가방.remove(a);  
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(15)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(15); 
							마을.가방.remove(a);   
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(16)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(16); 
							마을.가방.remove(a);   
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	 else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
				//	주막2.clear();
					return;
				}	else if (n==4) {
					continue 이전;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}
	static void 박사주막() {
		/*주막2.add(13);
		주막2.add(14);
		주막2.add(15);
		주막2.add(16);*/
		System.out.println("주막에 오셨습니다.");
		System.out.println("주막은 요리의 제조법을 취급합니다. 요리를 누가 먹느냐에 따라 효과가 좋아질 수도 나빠질 수도 있습니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 돼지국밥 (500전) : 한달이 지날때마다 최대피로를 2 증가시켜준다. " );
					System.out.println("1. 추어탕 (500전) : 한달이 지날때마다 지혜를 6 증가시켜준다. " );
					System.out.println("2. 김치찌개  (500전) : 한달이 지날때마다 힘을 2 증가시켜준다. " );
					System.out.println("3. 소머리국밥 (500전) : 한달이 지날때마다 피로를 5 감소시켜준다. " );
					System.out.println("4. 나간다. " );
				 n= sc.nextInt();
				if (n==0) {
					if(캐릭터.돈<500) {
						System.out.println("시스템.돈이 충분하지 않습니다.");
						continue;
					}
					if(마을.가방.contains(13)!=true) {
					캐릭터.돈 -= 500;
					마을.가방.add(13);
					System.out.println("돼지국밥을 구매했습니다.");
					}	else {
						System.out.println("그 도구가 이미 마을.가방에 있습니다." );
						}
					}	else if (n==1) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(14)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(14);
							System.out.println("추어탕을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==2) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(15)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(15);
							System.out.println("김치찌개를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==3) {
						if(캐릭터.돈<500) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(16)!=true) {
							캐릭터.돈 -= 500;
							마을.가방.add(16);
							System.out.println("소머리국밥을 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
					}	else if (n==4) {
						continue 이전;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 돼지국밥 (250전) " );
					if(마을.가방.contains(13)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 추어탕 (250전) " );
					if(마을.가방.contains(14)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 김치찌개 (250전) " );
					if(마을.가방.contains(15)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("3. 소머리국밥 (250전) " );
					if(마을.가방.contains(16)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println(". 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(13)==true) {
						캐릭터.돈 += 250; 
						int a = 마을.가방.indexOf(13); 
						마을.가방.remove(a);  
						}
						}	else if (n==1) {
							if(마을.가방.contains(14)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(14); 
							마을.가방.remove(a);  
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(15)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(15); 
							마을.가방.remove(a);   
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==3) {
							if(마을.가방.contains(16)==true) {
							캐릭터.돈 += 250; 
							int a = 마을.가방.indexOf(16); 
							마을.가방.remove(a);   
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==4) {
							continue 이전;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
				}
				}	else if (n==3) {
					//주막2.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}

}
