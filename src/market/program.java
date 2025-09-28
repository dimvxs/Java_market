package market;

import com.google.common.collect.ArrayListMultimap;
import java.util.ArrayList;
import java.util.Comparator;

import com.google.common.collect.Multimap;

public class program {

	public static void main(String[] args) {
//		Спроектуйте простий інтернет-магазин, використовуючи концепції ООП, такі як інкапсуляція, конструктори,
//		статичні компоненти.
//		Спроектуйте додаток для керування інтернет-магазином, який включає наступні класи (в окремих файлах):
//		- Product (продукт) з полями: назва, бренд, ціна.
//		- Cart (кошик), який містить продукти та керує їх додаванням і видаленням.
//		- User (користувач) з полями: імʼя, ідентифікатор користувача, кошики (список кошиків користувача).
//		- OnlineStore (інтернет-магазин) для керування всіма користувачами та їх кошиками.
//		Реалізуйте по 2 конструктори з делегуванням для кожного класу, щоб забезпечити коректне створення обʼєктів.
//		Додайте фіналізатор у класі Product, який виводитиме повідомлення при видаленні обʼєкта продукту.
//		Додайте статичний метод у OnlineStore, який підраховуватиме загальну кількість продуктів у всіх кошиках.
//		Використовуйте статичний блок ініціалізації для встановлення початкових даних у класі OnlineStore.
//		Рішення викласти в публічний репозиторій, посилання на який надіслати в коментар до цього дз.
		
//		Продовжуємо проектувати простий інтернет-магазин, використовуючи концепції ооп, такі як абстрагування, агрегація, успадкування, а також поліморфізм.
//		Реалізуйте агрегацію в класі Cart, який міститиме список продуктів і методи для їх додавання та видалення.
//		Створіть підкласи від Product, наприклад, PhysicalProduct (фізичний продукт) і DigitalProduct (цифровий
//		продукт) з додатковими полями та методами, такими як вага для PhysicalProduct.
//		Використовуйте абстрактні класи та інтерфейси для представлення спільної поведінки. Наприклад, створіть інтерфейс Purchasable для обʼєктів, які
//		можна купувати,
//		і реалізуйте його в класі Product.
//		Інкапсулюйте дані та надайте методи-доступу для роботиз полями.
//		Використовуйте поліморфізм для реалізації методів покупки, які можуть працювати з будь-якими обʼєктами, що реалізують інтерфейс Purchasable. Наприклад, створіть метод purchaseAll(Purchasable[] items) у класі OnlineStore, який обробляє покупку всіх обʼєктів у масиві.
//		+
//		口
//		Оформіть код у вигляді чистих і зрозумілих класів, розподіліть класи по окремих файлах.
//		Перевірте коректність роботи методів, обробку даних і винятків.
//		Посилання на публічний репозиторій GitHub надішліть у коментар до домашнього завдання на майстат.
//		!!! В РЕПОЗИТОРІЇ МАЮТЬ БУТИ СКРІНИ ПРАЦЮЮЧОГО ПРОЄКТУ !!!
//		Використання нейромережевих інструментів на кшталт ChatGPT для написання коду категорично не вітається!!!
		
		
		Product product = new Product("Sneakers", "Nike", 50); //creating product, for example sneakers
		Product product1 = new Product("T-shirt", "Nike", 70);
		Product product2 = new Product("Sneakers", "Adidas", 110);
		Product product3 = new Product("Jacket", "Nike", 90);
		Product product4 = new Product("Cap", "Nike", 40);
		ArrayList<Product> products = new ArrayList<>();
		products.add(product);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		
	
		//products.stream()
		products.parallelStream()
		.filter(p -> p.price > 40 && p.price < 100)
		.sorted(Comparator.comparing(Product::getName).reversed())
		.forEach(p -> {
			try {
				p.showProduct();
			} catch (ProductNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		try {
			product.showProduct(); //showing the product in the console
			
		}
		catch(ProductNotFoundException e)
		{
			System.out.println("error: " + e);
		}
		
		
		Card card = new Card("main", product); //creating a card
		
		OnlineStore store = new OnlineStore(); //creating a store
		User user = new User("Dima", 1, card, 100, Payment.createPayment("Dima", 100)); //creating user
		
		store.addUser(user); //adding the user to our store's system
		
	
		
		store.purchaseAll(user);
		
		Multimap<User, Card> userCards = ArrayListMultimap.create();
		userCards.put(user, card);
		

	}

}
