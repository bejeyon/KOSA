class Main {
	public static void main(String[] args) {
		for(int i = 0; i < args.length-1; i++) {
			for(int j = i + 1; j < args.length; j++) {
				if (Integer.parseInt(args[i]) == Integer.parseInt(args[j])) {
					System.out.println(j + "번째" + args[i] + "중복확인!!");
				} else {
					System.out.println("행운의 로또번호");
					for(i = 0; i < args.length; i++) {
						System.out.print(args[i] + " ");
					}
				}
			}	
		}
	}
}
