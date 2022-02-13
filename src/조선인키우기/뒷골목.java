package 조선인키우기;

public class 뒷골목 extends 마을{
	뒷골목(int 이름) {
		super(이름);
		// TODO Auto-generated constructor stub
	}

	static void 이가탄뒷골목() {
		/*	뒷골목.add(17);
			뒷골목.add(18);
			뒷골목.add(19);*/
			System.out.println("뒷골목에 오셨습니다.");
			System.out.println("뒷골목은 평범하지 않은 도구들을 취급합니다. 강력한 효과를 보는 대신 대가를 치를 것입니다.");
			System.out.println("무엇을 하시겠습니까?");
			이전 : while (n>=0) {
				System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
				 n= sc.nextInt();
				if (n==1) {
					while (n>=0) {
						System.out.println("0. 망자의투구 (800전) : 한달이 지날때마다 힘과 무술을 5 증가시켜주지만 지혜와 유학을 5 하락시킨다. " );
						System.out.println("1. 금서  (800전) : 한달이 지날때마다 지혜와 유학을 5 증가시켜주지만 힘과 무술을 5 하락시킨다. " );
						System.out.println("2. 이상한약  (800전) : 한달이 지날때마다 피로를 8 감소시켜주지만 최대피로를 1 하락시킨다. " );
						System.out.println("3. 나간다. " );
					 n= sc.nextInt();
					 if (n==0) {
							if(캐릭터.돈<1000) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(17)!=true) {
							캐릭터.돈 -= 800;
							마을.가방.add(17);
							System.out.println("망자의투구를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
							}	else if (n==1) {
								if(캐릭터.돈<800) {
									System.out.println("시스템.돈이 충분하지 않습니다.");
									continue;
								}
								if(마을.가방.contains(18)!=true) {
									캐릭터.돈 -= 800;
									마을.가방.add(18);
									System.out.println("금서를 구매했습니다.");
									}	else {
										System.out.println("그 도구가 이미 마을.가방에 있습니다." );
										}
							}	else if (n==2) {
								if(캐릭터.돈<800) {
									System.out.println("시스템.돈이 충분하지 않습니다.");
									continue;
								}
								if(마을.가방.contains(19)!=true) {
									캐릭터.돈 -= 800;
									마을.가방.add(19);
									System.out.println("이상한약을 구매했습니다.");
									}	else {
										System.out.println("그 도구가 이미 마을.가방에 있습니다." );
										}
							}	else if (n==3) {
								continue 이전;
							}	 else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
					}
				} 		else if (n==2) {
					while (n>=0) {
						System.out.print("0. 망자의투구 (600전) " );
						if(마을.가방.contains(17)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("1. 금서 (600전) " );
						if(마을.가방.contains(18)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("2. 이상한약 (600전) " );
						if(마을.가방.contains(19)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.println("3. 나간다. " );
					 n= sc.nextInt();
					 if (n==0) {
							if(마을.가방.contains(17)==true) {
							캐릭터.돈 += 600; 
							int a = 마을.가방.indexOf(17); 
							마을.가방.remove(a); 
							System.out.println("망자의투구를 판매했습니다.");
							}	else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
							}	else if (n==1) {
								if(마을.가방.contains(18)==true) {
								캐릭터.돈 += 600; 
								int a = 마을.가방.indexOf(18); 
								마을.가방.remove(a);
								System.out.println("금서를 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==2) {
								if(마을.가방.contains(19)==true) {
								캐릭터.돈 += 600; 
								int a = 마을.가방.indexOf(19); 
								마을.가방.remove(a);
								System.out.println("이상한약을 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
								}
							}	else if (n==3) {
								continue 이전;
							}
								else {
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
								continue;
							
							}
					 break;
					}
				}	else if (n==3) {
						//뒷골목.clear();
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}		
				}	
		}
	static void 소룡뒷골목() {
		/*	뒷골목.add(17);
			뒷골목.add(18);
			뒷골목.add(19);*/
			System.out.println("뒷골목에 오셨습니다.");
			System.out.println("뒷골목은 평범하지 않은 도구들을 취급합니다. 강력한 효과를 보는 대신 대가를 치를 것입니다.");
			System.out.println("무엇을 하시겠습니까?");
			이전 : while (n>=0) {
				System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
				 n= sc.nextInt();
				if (n==1) {
					while (n>=0) {
						System.out.println("0. 망자의투구 (1000전) : 한달이 지날때마다 힘과 무술을 10 증가시켜주지만 지혜와 유학을 5 하락시킨다. " );
						System.out.println("1. 금서  (1000전) : 한달이 지날때마다 지혜와 유학을 5 증가시켜주지만 힘과 무술을 3 하락시킨다. " );
						System.out.println("2. 이상한약  (1000전) : 한달이 지날때마다 피로를 7 감소시켜주지만 최대피로를 2 하락시킨다. " );
						System.out.println("3. 나간다. " );
					 n= sc.nextInt();
					 if (n==0) {
							if(캐릭터.돈<1000) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(17)!=true) {
							캐릭터.돈 -= 1000;
							마을.가방.add(17);
							System.out.println("망자의투구를 구매했습니다.");
							}	else {
								System.out.println("그 도구가 이미 마을.가방에 있습니다." );
								}
							}	else if (n==1) {
								if(캐릭터.돈<1000) {
									System.out.println("시스템.돈이 충분하지 않습니다.");
									continue;
								}
								if(마을.가방.contains(18)!=true) {
									캐릭터.돈 -= 1000;
									마을.가방.add(18);
									System.out.println("금서를 구매했습니다.");
									}	else {
										System.out.println("그 도구가 이미 마을.가방에 있습니다." );
										}
							}	else if (n==2) {
								if(캐릭터.돈<1000) {
									System.out.println("시스템.돈이 충분하지 않습니다.");
									continue;
								}
								if(마을.가방.contains(19)!=true) {
									캐릭터.돈 -= 1000;
									마을.가방.add(19);
									System.out.println("이상한약을 구매했습니다.");
									}	else {
										System.out.println("그 도구가 이미 마을.가방에 있습니다." );
										}
							}	else if (n==3) {
								continue 이전;
							}	 else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
					}
				} 		else if (n==2) {
					while (n>=0) {
						System.out.print("0. 망자의투구 (500전) " );
						if(마을.가방.contains(17)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("1. 금서 (500전) " );
						if(마을.가방.contains(18)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.print("2. 이상한약 (500전) " );
						if(마을.가방.contains(19)!=true) {
							System.out.println("- 소유 X" );
						}	else {
							System.out.println("- 소유 O" );
						}
						System.out.println("3. 나간다. " );
					 n= sc.nextInt();
					 if (n==0) {
							if(마을.가방.contains(17)==true) {
							캐릭터.돈 += 500; 
							int a = 마을.가방.indexOf(17); 
							마을.가방.remove(a); 
							System.out.println("망자의투구를 판매했습니다.");
							}
							}	else if (n==1) {
								if(마을.가방.contains(18)==true) {
								캐릭터.돈 += 500; 
								int a = 마을.가방.indexOf(18); 
								마을.가방.remove(a);
								System.out.println("금서를 판매했습니다.");
								} else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}
							}	else if (n==2) {
								if(마을.가방.contains(19)==true) {
								캐릭터.돈 += 500; 
								int a = 마을.가방.indexOf(19); 
								마을.가방.remove(a);
								System.out.println("이상한약을 판매했습니다.");
								}  else {
									System.out.println("그 도구가 마을.가방에 없습니다." );
									}	
							}	else if (n==3) {
								continue 이전;
							}
								else {
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
								continue;
							}
							break;
							
					}
				}	else if (n==3) {
						//뒷골목.clear();
						return;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}		
				}	
		}
	static void 박사뒷골목() {
		/*뒷골목.add(17);
		뒷골목.add(18);
		뒷골목.add(19);*/
		System.out.println("뒷골목에 오셨습니다.");
		System.out.println("뒷골목은 평범하지 않은 도구들을 취급합니다. 강력한 효과를 보는 대신 대가를 치를 것입니다.");
		System.out.println("무엇을 하시겠습니까?");
		이전 : while (n>=0) {
			System.out.println("1. 물건을 산다. 2. 물건을 판다. 3. 나간다.");
			 n= sc.nextInt();
			if (n==1) {
				while (n>=0) {
					System.out.println("0. 망자의투구 (1000전) : 한달이 지날때마다 힘과 무술을 5 증가시켜주지만 지혜와 유학을 3 하락시킨다. " );
					System.out.println("1. 금서  (1000전) : 한달이 지날때마다 지혜와 유학을 10 증가시켜주지만 힘과 무술을 5 하락시킨다. " );
					System.out.println("2. 이상한약  (1000전) : 한달이 지날때마다 피로를 7 감소시켜주지만 최대피로를 2 하락시킨다. " );
					System.out.println("3. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(캐릭터.돈<1000) {
							System.out.println("시스템.돈이 충분하지 않습니다.");
							continue;
						}
						if(마을.가방.contains(17)!=true) {
						캐릭터.돈 -= 1000;
						마을.가방.add(17);
						System.out.println("망자의투구를 구매했습니다.");
						}	else {
							System.out.println("그 도구가 이미 마을.가방에 있습니다." );
							}
						}	else if (n==1) {
							if(캐릭터.돈<1000) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(18)!=true) {
								캐릭터.돈 -= 1000;
								마을.가방.add(18);
								System.out.println("금서를 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==2) {
							if(캐릭터.돈<1000) {
								System.out.println("시스템.돈이 충분하지 않습니다.");
								continue;
							}
							if(마을.가방.contains(19)!=true) {
								캐릭터.돈 -= 1000;
								마을.가방.add(19);
								System.out.println("이상한약을 구매했습니다.");
								}	else {
									System.out.println("그 도구가 이미 마을.가방에 있습니다." );
									}
						}	else if (n==3) {
							continue 이전;
						} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
						continue;
					}
					break;
				}
			} 		else if (n==2) {
				while (n>=0) {
					System.out.print("0. 망자의투구 (500전) " );
					if(마을.가방.contains(17)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("1. 금서 (500전) " );
					if(마을.가방.contains(18)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.print("2. 이상한약 (500전) " );
					if(마을.가방.contains(19)!=true) {
						System.out.println("- 소유 X" );
					}	else {
						System.out.println("- 소유 O" );
					}
					System.out.println("3. 나간다. " );
				 n= sc.nextInt();
				 if (n==0) {
						if(마을.가방.contains(17)==true) {
						캐릭터.돈 += 500; 
						int a = 마을.가방.indexOf(17); 
						마을.가방.remove(a); 
						System.out.println("망자의투구를 판매했습니다.");
						}
						}	else if (n==1) {
							if(마을.가방.contains(18)==true) {
							캐릭터.돈 += 500; 
							int a = 마을.가방.indexOf(18); 
							마을.가방.remove(a);
							System.out.println("금서를 판매했습니다.");
							} else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								}
						}	else if (n==2) {
							if(마을.가방.contains(19)==true) {
							캐릭터.돈 += 500; 
							int a = 마을.가방.indexOf(19); 
							마을.가방.remove(a);
							System.out.println("이상한약을 판매했습니다.");
							}  else {
								System.out.println("그 도구가 마을.가방에 없습니다." );
								} 
						}
						else if (n==3) {
							continue 이전;
						}else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
							continue;
						}
						break;
						
				}
			}	else if (n==3) {
				//	뒷골목.clear();
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. " );
					continue;
				}		
			}	
	}
	
	
}
