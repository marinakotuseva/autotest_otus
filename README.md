autotest

---
Homework 2
---

Задание:

Пройти на BlazeDemo.com и протестировать основные поля и перейти до успешной покупки билета.

Решение:

Используя поиск xpath и cssSelector нашел основыне элементы

```
WebElement findselect_1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
WebElement find_button = driver.findElement(By.cssSelector("input[type='submit']"));
```

Для проверки переменной на нужное содержимое понял, что ее необходимо привести к текстовому виду:
```
WebElement find_from_to = driver.findElement((By.xpath("//h3")));
String find_from_to_text = find_from_to.getText();
assertEquals("Flights from San Diego to Berlin:", find_from_to_text, "Error!!");
```

Перед функцией и после можно использовать @BeforeClass и @AfterClass, для ликвидации повторов, если несколько методов в классе используется.



---
Homework 1
---

Задание:

Написать первый тест, позволяющий нажимать на кнопку Find Flights в приложении BlazeDemo.com
Сценарий:
1. Открыть страницу BlazeDemo.com
2. Нажать на кнопку FindFlights
Ожидаемый результат: открылась страница с результатами поиска

Решение:

Вопроизвел из лекции установку IDEA, установил Java, скачал WebDriver.
Настроил их взаимосвязь между собой.

Создал class Homework1:
```
WebDriver driver = new ChromeDriver();
driver.get("http://blazedemo.com/");
WebElement findbutton = driver.findElement(By.cssSelector("input[type='submit']"));
findbutton.click();
driver.quit();
```

Добавил поиск класса таблица на открывшейся странице для проверки.
```
WebElement findnewopen = driver.findElement(By.className("table"));
assertTrue(findnewopen.isDisplayed());
```

P.S. так какэ то было мое первое знакомство с Java было тяжко, если бы не лекция я бы точно не справился.
