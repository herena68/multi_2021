package lamda;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream04 {

	public static void main(String[] args) {
		
		// Stream.iterate
		Stream.iterate(0,n -> n + 2)
		      .limit(10)
		      .forEach(System.out::print);

		System.out.println();
		// Stream.iterate
		Stream.iterate(0,n -> n + 2)
		      .limit(10)
		      .skip(3)
		      .forEach(i-> System.out.print(i+", "));

		System.out.println();
		// Stream.iterate
		Stream.iterate(0,n -> n + 2)
		      .limit(10)
		      .skip(3)
		      .map(i-> i*i)
	          .forEach(i-> System.out.print(i+", "));

		System.out.println();
		// Stream.iterate
		Stream.iterate(0,n -> n + 2)
		      .limit(15)
		      .filter(i-> (i%5) == 0)
	          .forEach(i-> System.out.print(i+", "));
		System.out.println();

		// fibonnaci with iterate
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }) // 여기서 t[0],t[1]이 어디서
				.limit(10)// 온건 가요?
				.forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));

		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0])
				.forEach(System.out::println);

		// random stream of doubles with Stream.generate
		Stream.generate(Math::random) //
				.limit(10).forEach(System.out::println);

		// stream of 1s with Stream.generate
		IntStream.generate(() -> 1).limit(5).forEach(System.out::println);

		IntStream.generate(new IntSupplier() {
			public int getAsInt() {
				return 2;
			}
		}).limit(5).forEach(System.out::println);

		IntSupplier fib = new IntSupplier() {
			private int previous = 0;
			private int current = 1;

			public int getAsInt() {
				int nextValue = this.previous + this.current;
				this.previous = this.current;
				this.current = nextValue;
				return this.previous;
			}
		};
		IntStream.generate(fib).limit(10).forEach(System.out::println);

		/*
		 * long uniqueWords = Files.lines(Paths.get("lambdasinaction/chap5/data.txt"),
		 * Charset.defaultCharset()) .flatMap(line -> Arrays.stream(line.split(" ")))
		 * .distinct() .count();
		 * 
		 * System.out.println("There are " + uniqueWords + " unique words in data.txt");
		 */

	}

}
