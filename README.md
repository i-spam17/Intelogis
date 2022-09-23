# test case for Intelogis
This framework for test **Intelogis**    

1. перейти на страницу https://ilswebreact-develop.azurewebsites.net/
2. кликнуть на поле Логин
3. ввести логин "rekame2869@seinfaq.com"
4. клик на поле Пароль
5. ввести пароль "XRCa91zn4fsJzcHW"
6. клик на кнопку Войти

ожидаемый результат - отображается рабочий стол авторизованного пользователя

Check-list:
1. main activity:

    1.1. check UI with screenshot
2. login activity:

    2.1. positive:

    2.1.1. check the form when the fields are filling with valid data

    2.1.2. check UI with screenshot

    2.2. negative

    2.2.1. check the form when the fields are filling with not valid data

3. forms activity

    3.1. positive:

    3.1.1. check Switch Element

    3.1.2. check visible Dropdown-list

    3.1.3. check the selection Dropdown-list item

4. swipe activity

    4.1. positive:

    4.1.1. check the title text of the 3-d card in the carousel

5. tab bar

    5.1. positive:

    5.1.1. check thr color change of icons when tap

command run: mvn clean test        
command report: allure serve target/allure-results

for comments and bug: telegram @W_Ilya
