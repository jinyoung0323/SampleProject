package SampleProject;

public class GoodsApp {
	public static void main(String[] args) {
//		Goods camera = new Goods();
//		Goods notebook = new Goods(900000, "LG�׷�");
//		Goods cup = new Goods(2000, "�ӱ���");
//		
//		// ���, �ٳ���, ���� ��ü
//		Goods apple = new Goods(1000, "���");
//		Goods banana = new Goods(500, "�ٳ���");
//		Goods mango = new Goods(3000, "����");
	
		Goods[] lgArr = new Goods[3];
		Goods[] mugCup = new Goods[5];
	
		for(int i = 0; i < lgArr.length; i++) {
			lgArr[i] = new Goods("LG�׷�" + i, 900000 - (i * 10000));
		}
		for(int i = 0; i < lgArr.length; i++) {
			lgArr[i].showInfo();
		}
		
		
		for(int i = 0; i < mugCup.length; i++) {
			mugCup[i] = new Goods("�ӱ���" + i, 5000 + (i * 100));
		}
		for(int i = 0; i < mugCup.length; i++) {
			mugCup[i].showInfo();
		}
//		camera.showInfo();
//		notebook.showInfo();
//		cup.showInfo();
//		apple.showInfo();
//		banana.showInfo();
//		mango.showInfo();
	}
}
