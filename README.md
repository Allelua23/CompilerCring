# CompilerCring
Курсовая работа студента группы ИСБ-118 Королевой Александры
# Запуск
Main класс принимает на вход название файла для считывания исходного кода и на выходе выдает файл cring.class с байт-кодом для JVM, работоспособность которого можно проверить с помощью команды java cring в командной строке
# Библиотеки
anlr-4.8-complete - для генерации грамматики.

asm-8.0.1 - для генерации байт-кода.
# 1. Грамматика языка
Грамматику входного языка представляет файл cring.g4, находящийся в папке src/grammaric
Пример программмы на созданном входном языке:

![image](https://user-images.githubusercontent.com/82500140/119269895-afc7de80-bc02-11eb-8ef7-539090c2249c.png)


# 2.Пример дерева разбора
На вход подается исходный код с циклом while:

![image](https://user-images.githubusercontent.com/82500140/119269958-fb7a8800-bc02-11eb-8ee5-ee297c7e64fb.png)

Дерево разбора:

![image](https://user-images.githubusercontent.com/82500140/119269947-eb62a880-bc02-11eb-991f-08e2f06b1f7d.png)


# 3. Пример работы компилятора
Здесь представлены скриншоты с выходными данными для JVM

![image](https://user-images.githubusercontent.com/82500140/119269971-0fbe8500-bc03-11eb-908d-6bd068cc1d74.png)

![image](https://user-images.githubusercontent.com/82500140/119270021-4a282200-bc03-11eb-90bb-beb05c7c9ad3.png)

