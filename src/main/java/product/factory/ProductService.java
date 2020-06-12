package product.factory;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import product.model.Product;

public enum ProductService {

	INSTANCE;

	ProductService() {

	}

	public static int checkout(List<Product> products) throws IOException {
		String name = JOptionPane.showInputDialog("please select item");
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("select quantity"));
		DataFetcher prod = productBasket(name);
		String[] list = prod.getProd();
		Product product = getProduct(list[0], Integer.parseInt(list[1]), quantity);
		JOptionPane.showMessageDialog(null, product);
		int dialogResult = JOptionPane.showConfirmDialog(null, "would you like to continue?");
		if (dialogResult == JOptionPane.YES_OPTION) {
			checkout(products);
		}
		products.add(product);
		return addProduct(products);
	}

	private static int addProduct(List<Product> products) {
		return products.stream().map(Product::getTotalPrice).reduce(0, Integer::sum);
	}

	private static DataFetcher productBasket(String productName) throws IOException {
		return new DataFetcher(productName);
	}

	private static Product getProduct(String productName, int price, int quantity) {
		return new Product(productName, price, quantity);
	}
}
