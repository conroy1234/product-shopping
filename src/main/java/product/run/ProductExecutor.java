package product.run;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import product.factory.ProductService;
import product.model.Product;

public class ProductExecutor {

	public static void main(String[] args) throws IOException {

		List<Product> products = new ArrayList<Product>();
		int sum = ProductService.INSTANCE.checkout(products);
		JOptionPane.showMessageDialog(null, "£" + sum);

	}
}
