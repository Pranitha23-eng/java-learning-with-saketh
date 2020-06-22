
public class NumberGenerator {
	public void numGen() {
		int i = 8;
		for (i = 8; i <= 8; i = i - 2) {
			if (i == 0) {
				System.out.println(1);
				break;
			}

			System.out.print(i);

			for (int j = i; j <= i; j = j - 2) {
				if (j == 2) {
					System.out.print(" ");
					System.out.println(1);
					break;
				}
				System.out.print(" ");
				System.out.print(j - 2 + " ");
			}

		}

	}

}
