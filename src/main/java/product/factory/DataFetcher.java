package product.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class DataFetcher {

	private final String[] prod;

	public DataFetcher(String productName) throws IOException {
		this.prod = search(productName);
		getProd();
	}

	private String[] search(String productName) throws IOException {
		return Files.lines(Paths.get("src/main/resources", productName)).collect(Collectors.toList())
				.set(0, productName).split(",");
	}

	public String[] getProd() {
		return prod;
	}

}
