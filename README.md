autotest

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

P.S. так какэ то было мое первое знакомство с Java было тяжко, если бы не лекция я бы точно не справился.
