package SampleProject;

public class GoodsApp {
	public static void main(String[] args) {
//		Goods camera = new Goods();
//		Goods notebook = new Goods(900000, "LG그램");
//		Goods cup = new Goods(2000, "머그컵");
//		
//		// 사과, 바나나, 망고 객체
//		Goods apple = new Goods(1000, "사과");
//		Goods banana = new Goods(500, "바나나");
//		Goods mango = new Goods(3000, "망고");
	
		Goods[] lgArr = new Goods[3];
		Goods[] mugCup = new Goods[5];
	
		for(int i = 0; i < lgArr.length; i++) {
			lgArr[i] = new Goods("LG그램" + i, 900000 - (i * 10000));
		}
		for(int i = 0; i < lgArr.length; i++) {
			lgArr[i].showInfo();
		}
		
		
		for(int i = 0; i < mugCup.length; i++) {
			mugCup[i] = new Goods("머그컵" + i, 5000 + (i * 100));
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
