package org.vlagru;

public class cc37SearchAnArrayWithForLoop {

	public static void main(String[] args) {
		int[] znamky = {1, 72, 72, 44};
		
		for (int i = 0; i < znamky.length; i++) {
			if (znamky[i]==72) {
				System.out.println("Nasel jsem cislo " + znamky[i] + " v indexu " + i );
			}
		}

	}

}
