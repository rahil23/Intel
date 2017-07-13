package Synchronized;



public class NonSync {
	public static void main(String[] args) throws InterruptedException {
		MainThread obj = new MainThread();
		MainThread obj2 = new MainThread();
		Normal a1 = new Normal();
		obj.seta1(a1);
		obj2.seta1(a1);
		obj.start();
		obj2.start();
		}

}

class MainThread extends Thread {
	Normal a1;

	public void seta1(Normal a) {
	a1 = a;
	}

	@Override
	public void run() {

		try {
			a1.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class Normal {

	public synchronized void m1() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("Inside m1 Method" + Thread.currentThread());
		}
	}

}
