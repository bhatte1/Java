package practice1;

import java.awt.print.Printable;

import javax.sound.midi.Track;

public class TyrCatchBlock {

	public void m1() {

		tryCatch();

	}

	public void tryCatch() {

		System.out.println("Prina A");

		System.out.println("Print B");

		try {
			secondBlock();
		} catch (Exception e) {

			System.out.println("AE is coming");
			e.printStackTrace();

		}

		System.out.println("Print C");

	}

	public void secondBlock() throws Exception {
		
		

		int i = 9 / 0;

		System.out.println("Print D");
		

	}

	public static void main(String[] args) {

		TyrCatchBlock tc = new TyrCatchBlock();

		tc.tryCatch();

	}

}
