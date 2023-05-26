package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BlackJack {
	public static void putCard(HashMap<String, Integer> cardDeck) {
		cardDeck.put("♣2", 2);
		cardDeck.put("♣3", 3);
		cardDeck.put("♣4", 4);
		cardDeck.put("♣5", 5);
		cardDeck.put("♣6", 6);
		cardDeck.put("♣7", 7);
		cardDeck.put("♣8", 8);
		cardDeck.put("♣9", 9);
		cardDeck.put("♣10", 10);
		cardDeck.put("♣J", 10);
		cardDeck.put("♣Q", 10);
		cardDeck.put("♣K", 10);
		cardDeck.put("♣ACE", 11);

		cardDeck.put("♥2", 2);
		cardDeck.put("♥3", 3);
		cardDeck.put("♥4", 4);
		cardDeck.put("♥5", 5);
		cardDeck.put("♥6", 6);
		cardDeck.put("♥7", 7);
		cardDeck.put("♥8", 8);
		cardDeck.put("♥9", 9);
		cardDeck.put("♥10", 10);
		cardDeck.put("♥J", 10);
		cardDeck.put("♥Q", 10);
		cardDeck.put("♥K", 10);
		cardDeck.put("♥ACE", 11);

		cardDeck.put("◆2", 2);
		cardDeck.put("◆3", 3);
		cardDeck.put("◆4", 4);
		cardDeck.put("◆5", 5);
		cardDeck.put("◆6", 6);
		cardDeck.put("◆7", 7);
		cardDeck.put("◆8", 8);
		cardDeck.put("◆9", 9);
		cardDeck.put("◆10", 10);
		cardDeck.put("◆J", 10);
		cardDeck.put("◆Q", 10);
		cardDeck.put("◆K", 10);
		cardDeck.put("◆ACE", 11);

		cardDeck.put("♠2", 2);
		cardDeck.put("♠3", 3);
		cardDeck.put("♠4", 4);
		cardDeck.put("♠5", 5);
		cardDeck.put("♠6", 6);
		cardDeck.put("♠7", 7);
		cardDeck.put("♠8", 8);
		cardDeck.put("♠9", 9);
		cardDeck.put("♠10", 10);
		cardDeck.put("♠J", 10);
		cardDeck.put("♠Q", 10);
		cardDeck.put("♠K", 10);
		cardDeck.put("♠ACE", 11);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> cardDeck = new HashMap<>();
		putCard(cardDeck);

		Random randomNum = new Random();
		Set<String> keySet = cardDeck.keySet();
		List<String> keyList = new ArrayList<>(keySet);

		int size = keyList.size();
		int numberOfCards = randomNum.nextInt(size);
		String randomKey = keyList.get(numberOfCards);
		Integer randomVal = cardDeck.get(randomKey);

		int currentChips = 300;

		while (true) {
			System.out.println("♣♥◆♠ 블랙잭 ♣♥◆♠");
			System.out.println("1. 게임시작");
			System.out.println("2. 칩 확인");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			int mainMenuSelection = sc.nextInt();

			switch (mainMenuSelection) {
			case 1:

				break;
			case 2:
				System.out.println("현재 소지 칩: " + currentChips + "$\n");

				int innerWhileSwitch = 0;
				while (innerWhileSwitch == 0) {
					System.out.println("1.칩 충전\t2.메인화면");
					System.out.print(">>> ");
					int chipSelect = sc.nextInt();
					switch (chipSelect) {
					case 1:
						System.out.println("충전할 칩의 개수를 입력해주세요.");
						System.out.print(">>> ");
						int addChips = sc.nextInt();
						System.out.println(addChips+"개의 칩이 충전되었습니다.\n");
						
						currentChips += addChips;
						innerWhileSwitch++;
						break;
					case 2:
						System.out.println("메인화면으로 나가기\n");
						innerWhileSwitch++;
						break;
					}
				}
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				sc.close();
				return;
			}
		}
//		if(에이스 갖고 버스트되면 -10)

	}
}
