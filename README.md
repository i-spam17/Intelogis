# test case for Intelogis
This framework for test **Intelogis**    

1. перейти на страницу https://ilswebreact-develop.azurewebsites.net/
2. кликнуть на поле Логин
3. ввести логин "**********"
4. клик на поле Пароль
5. ввести пароль "************"
6. клик на кнопку Войти

ожидаемый результат - отображается рабочий стол авторизованного пользователя

Check-list:
1. login page:

    1.1. positive:

    1.1.1. check the form when the fields are filling with valid data

    1.2. negative

    1.2.1. check the form when the fields are filling with not valid data


command run: mvn clean test        
command report: allure serve target/allure-results

for comments and bug: telegram @W_Ilya
