package src.com.dragon.sol02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreMap implements com.dragon.sol02.ImplBasketMap {

    private static final Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        products.replace(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Корзина очищена");
        System.out.println(products.isEmpty());
    }

    @Override
    public List<String> getProducts() {
        for (Map.Entry<String, Integer> map : products.entrySet()) {
            System.out.println("Продукт: " + map.getKey() + "\t | Количество: " + map.getValue());
        }
        System.out.println("******************************");
        List<String> keyList = new ArrayList<>();
        keyList.addAll(products.keySet());
        return keyList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Map.Entry<String, Integer> map : products.entrySet()) {
            if (product.equals(map.getKey())) {
                System.out.println("Продукт: " + map.getKey() + "\t | Количество: " + map.getValue());
            }
        }
        System.out.println("******************************");
        return products.get(product);
    }
}
