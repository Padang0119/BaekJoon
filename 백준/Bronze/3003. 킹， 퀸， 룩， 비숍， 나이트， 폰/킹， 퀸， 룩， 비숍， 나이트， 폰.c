#include <stdio.h>

int main() {
	int input;

	for (int i = 0; i < 6; i++) {
		scanf("%d", &input);

		if (i < 2) {
			printf("%d ", 1 - input);
		} else if (i < 5) {
			printf("%d ", 2 - input);
		} else {
			printf("%d ", 8 - input);
        }
	}
}