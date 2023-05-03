<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Регистрация</title>
</head>
<body>
    <form method="post" action="/registration">
        <label for = "username">Имя пользователя: </label>
        <input type="text" name = "username" id = "username">
        <label for = "password">Пароль: </label>
        <input type = "password" name = "password" id = "password">
        <input type = "hidden" name = "_csrf" value="${_csrf.token}">
        <input type="submit" value = "Зарегистриоваться">
    </form>
</body>
</html>