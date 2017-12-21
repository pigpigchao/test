package daili;

public class RealStar implements Star {
	/**
	 * 真实角色（明星艺人）：
	 */
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("张学友.sing()");// 真实角色的操作：真正的业务逻辑
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();// 真实对象的操作（明星唱歌）
		proxy.collectMoney();
	}
}