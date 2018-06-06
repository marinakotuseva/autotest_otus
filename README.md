autotest

---
Homework 5
---

Задание:

Добавить запуск теста через Internet Explorer/Edge/Safari
Создать автоматический тест по следующему сценарию:
1. Открыть сайт http://automationpractice.com/index.php
2. Навести указатель мыши на Women
3. Дождаться появление меню c помощью ExpectedConditions
4. Выбрать в меню T-Shirts 
5. Проверить, что результаты появились на странице

Задание нужно сделать на любом из четырех браузеров на выбор:
InternetExplorer,
Edge,
Opera,
Safari

* Дополнительное задание:
Сделать параметр запуска headless, по которому Google Chrome запускается в headless режиме
Рекомендации:
Применить паттерн PageObject, вынести Menu в отдельный компонент


Решение:

Создал:
- синглтон с методом с switch case для вызова нужного браузера (chrome, firefox, opera), опера - глючит
- HomePage c ожиданем элемента в течении 10 секунд, через ExpectedConditions вида `new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(optionValue));`
- Выывающией HomePage класс Homework5Test

Для запуска в скрытом режиме добавил для хрома `.addArguments("--headless");`

 

---
Homework 4
---

Задание:

Сайт: blazedemo.com/login
Описать новый Page Object на страницу Login(если не реализован)
Навести указатель мыши на кнопку login
- Проверить, что размер кнопки не поменялся
- Проверить, что цвет кнопки в наведенном состоянии - rgba(37, 121, 169, 1)

Решение:

Создал:
- LoginPage который находит кнопку "Login" по `"//button[@type='submit']"` и выполняет операцию сравнения через `assertEquals`
- Homework4Text который вызывает LoginPage, берет из него данные о кнопке и передает их вновь для сравнения LoginPage


---
Homework 3
---

Задание:

1. Воспользоваться двумя паттернами на выбор (например, Page Object и Singleton) 
2. Добавить maven surefire plugin и добавить тест в suite TestNG (осуществить запуск теста командой mvn test)
3. Проект должен находиться на GitHub/BitBucket
4*(не обязательное): 
- Добавить библиотеку lombok к проекту, 
- воспользоваться фильтрацией из JDK 8, 
- добавить Profiles к maven, 
- добавить дополнительный TestNG suite и запускать suite командой mvn test -Dsuite=suite_name

Решение:

Создал WebDriverManager.java для предварительного определения WebDriver, потом на него в классах будем ссылаться (демонстрируем, что разобрался как-то в Singleton)

Создал Homework3.java, который немного показывает Page Object, в части определения передаваемых переменных заранее.

Создал testng.xml, testng-2.xml, testng-3.xml для управления какие классы будут запущены.

В pom.xml настроил ссылку на эти .xml и параметризовал, чтобы вызывая через mvn можно было выбрать профиль используя команду:
`mvn test -Pthree`

---
Homework 2
---

Задание:

1) На странице результатов поиска показаны рейсы из/в город, которые были выбраны
2) На странице заполнения данных пассажира необходимо проверить 
а. номер выбранного рейса, название авиакомпании, цена из результатов поиска рейса
б. конечную цену(Total price) которая считается по формуле Total price= Price + Arbitrary Fee and Taxes
3) Заполнить любыми данными поля 
4) Покупка билета завершена(есть ID, Status, Amount , последние 4 цифры введенной карты и expiration date карты)

Также необходимо: 
1. Добавить @After и @Before в тест
2. Установить implicit wait
3. Добавить Expected Conditions в тех местах, где они нужны

Необходимо использовать ТОЛЬКО xpath и/или css селекторы.
Сдача задания архивом или ссылкой на github

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
