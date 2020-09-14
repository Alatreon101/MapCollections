# MapCollections
1. Фильтр Мапы.
public boolean isUnique(Map<String, String> map);

Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.

Для пустой мапы метод возвращает true.

Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,

а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.

2. Корзина с использованием мапы.

Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:

interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}



