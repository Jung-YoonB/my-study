package java_002;

public class Run {

	public static void main(String[] args) {
		
		Dog popy = new Dog();
		Dog moongchi = new Dog();
		Dog mangmang = new Dog();
		Dog dduni = new Dog();
		
		popy.setName("뽀삐");
		popy.setAge(4);
		popy.setGender('F');
		popy.setBreed("비숑");
		popy.setWeight(5.2);
		popy.setSick("콜록 거리고 밥을 잘 안먹어요. 감기인 것 같아요.");
		
		moongchi.setName("뭉치");
		moongchi.setAge(2);
		moongchi.setGender('M');
		moongchi.setBreed("푸들");
		moongchi.setWeight(4.8);
		moongchi.setSick("스케일링 할 때라 왔어요.");
		
		mangmang.setName("망망이");
		mangmang.setAge(7);
		mangmang.setGender('M');
		mangmang.setBreed("요크셔테리어");
		mangmang.setWeight(3.9);
		mangmang.setSick("얼마전에 소파에서 뛰어내리다 미끄러진 후로 절뚝거려요.");
		
		dduni.setName("뚜니");
		dduni.setAge(10);
		dduni.setGender('F');
		dduni.setBreed("치와와");
		dduni.setWeight(3.2);
		dduni.setSick("자꾸 여기저기 핥고 긁어요. 긁다가 상처도 났어요.");
		
		popy.info();
		moongchi.info();
		mangmang.info();
		dduni.info();
		
	}

}
