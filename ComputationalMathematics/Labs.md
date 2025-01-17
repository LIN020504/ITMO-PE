<head>
    <script src="https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML" type="text/javascript"></script>
    <script type="text/x-mathjax-config">
        MathJax.Hub.Config({
            tex2jax: {
            skipTags: ['script', 'noscript', 'style', 'textarea', 'pre'],
            inlineMath: [['$','$']]
            }
        });
    </script>
</head>

# Labs

## Лабораторная работа 1. «Решение системы линейных алгебраических уравнений СЛАУ»

1. No варианта определяется как номер в списке группы согласно ИСУ. 
2. В программе численный метод должен быть реализован в виде отдель- ной подпрограммы/метода/класса, в который исходные/выходные данные передаются в качестве параметров.
3. Размерность матрицы n<=20 (задается из файла или с клавиатуры - по выбору конечного пользователя).
4. Должна быть реализована возможность ввода коэффициентов матрицы, как с клавиатуры, так и из файла (по выбору конечного пользователя).

### Для прямых методов должно быть реализовано:

- Вычисление определителя
- Вывод треугольной матрицы (включая преобразованный столбец В)
- Вывод вектора неизвестных: $x_1, x_2, \cdots, x_n$
- Вывод вектора невязок: $r_1, r_2, \cdots, r_n$

### Для итерационных методов должно быть реализовано:

- Точность задается с клавиатуры/файла
- Проверка диагонального преобладания (в случае, если диагональное преобладание в исходной матрице отсутствует, сделать перестановку строк/столбцов до тех пор, пока преобладание не будет достигнуто). В случае невозможности достижения диагонального преобладания - вы- водить соответствующее сообщение.
- Вывод вектора неизвестных: 𝑥1, 𝑥2, ... , 𝑥𝑛
- Вывод количества итераций, за которое было найдено решение.
- Вывод вектора погрешностей: $\lvert x_i^{(𝑘)} − x_i^{(𝑘−1)}\rvert$

### Содержание отчета:

- Цель работы,
- Описание метода, расчетные формулы,
- Листинг программы (по крайне мере, где реализован сам метод)
- Примеры и результаты работы программы,
- Выводы.
- Отчет предоставляется в электронном/бумажном виде.

### Варианты задания
- Метод Гаусса
- Метод Гаусса с выбором главного элемента по столбцам
- Метод простых итераций
- Метод Гаусса-Зейделя

### Контрольные вопросы к защите лабораторной работы:

1. Что является решением системы линейных алгебраических уравнений?
2. Сформулируйте признак отсутствия корней системы линейных алгебраических уравнений.
3. Оцените достоинства и недостатки прямых методов решения СЛАУ?
4. Оцените достоинства и недостатки итерационных методов решения СЛАУ?
5. Как вычислить определитель, если решать СЛАУ методом Гаусса?
6. Идея метода Гаусса с выбором главного элемента по столбцам/строкам?
7. Что такое сходимость итерационного метода?
8. Какое достаточное условие сходимости итерационных методов решения СЛАУ?
9. Чем отличается метод простой итерации от метода Гаусса-Зейделя?
10. Идея метода Гаусса-Зейделя?
11. В каких случаях применяется метод Гаусса с выбором главного элемента?
12. Как определить погрешность решения СЛАУ методом Гаусса?
13. Назовите критерии окончания итерационного процесса метода простой итерации.
14. Если норма преобразованной матрицы будет больше 1, что это означает?
15. Если диагональный элемент равен нулю, можно ли использовать метод Гаусса?

## Лабораторная работа №2 Численное решение нелинейных уравнений и систем

Цель работы: изучить численные методы решения нелинейных уравнений и их систем, найти корни заданного нелинейного уравнения/системы нелинейных уравнений, выполнить программную реализацию методов.

№ варианта определяется как номер в списке группы согласно ИСУ.

Лабораторная работа состоит из двух частей: вычислительной и программной

### 1 Вычислительная реализация задачи

Задание:
1. Отделить корни заданного нелинейного уравнения графически (вид уравнения
представлен в табл. 6)
2. Определить интервалы изоляции корней.
3. Уточнить корни нелинейного уравнения (см. табл. 6) с точностью ε=10-2.
4. Используемые методы для уточнения каждого из 3-х корней многочлена представлены в таблице 7.
5. Вычисления оформить в виде таблиц (1-5), в зависимости от заданного метода.
  Для всех значений в таблице удержать 3 знака после запятой.
  5.1 Для метода половинного деления заполнить таблицу 1.
  5.2 Для метода хорд заполнить таблицу 2.
  5.3 Для метода Ньютона заполнить таблицу 3.
  5.4 Для метода секущих заполнить таблицу 4.
  5.5 Для метода простой итерации заполнить таблицу 5.
6. Заполненные таблицы отобразить в отчете. 

№ шага | a | b | x | f(a) | f(b) | f(x) | $\lvert a-b \rvert$
---|---|---|---|---|---|---|---
1 | | | | | | | 
2 | | | | | | | 
3... | | | | | | | 

>Уточнение корня уравнения методом половинного деления

№ шага | a | b | x | f(a) | f(b) | f(x) | $\lvert x_{k+1}-x_k \rvert$
---|---|---|---|---|---|---|---
1 | | | | | | | 
2 | | | | | | | 
3... | | | | | | | 

> Усточнение корня уравнения методом хорд

№ шага | $x_k$ | $f(x_k)$ | $f'(x_k)$ | $x_{k+1}$ | $\lvert x_{k+1}-x_k \rvert$
---|---|---|---|---|---
1 | | | | | 
2 | | | | | 
3... | | | | | 

>Уточнение корня уравнения методом Ньютона

№ шага | $x_{k-1}$ | $x_k$ | $x_{k+1}$ | $f(x_{k+1})$ | $\lvert x_{k+1}-x_k \rvert$
---|---|---|---|---|---
1 | | | | | 
2 | | | | | 
3... | | | | | 

> Уточнение корня уравнения методом секущих

№ шага | $x_k$ | $x_{k+1}$ | $f(x_{k+1})$ | $\lvert x_{k+1}-x_k \rvert$
---|---|---|---|---
1 | | | | 
2 | | | | 
3... | | | | 

> Уточнение корня уравнения методом простой итерации

### 2 Программная реализация задач

Для нелинейных уравнений:
1. Все численные методы (см. табл. 8) должны быть реализованы в виде отдельных подпрограмм/методов/классов.
2. Пользователь выбирает уравнение, корень/корни которого требуется вычислить (3-5 функций, в том числе и трансцендентные), из тех, которые предлагает программа.
3. Предусмотреть ввод исходных данных (границы интервала/начальное приближение к корню и погрешность вычисления) из файла или с клавиатуры по выбору конечного пользователя.
4. Выполнить верификацию исходных данных. Необходимо анализировать наличие корня на введенном интервале. Если на интервале несколько корней или они отсутствуют – выдавать соответствующее сообщение. Программа должна реагировать на некорректные введенные данные.
5. Для методов, требующих начальное приближение к корню (методы Ньютона, секущих, хорд с фиксированным концом), выбор начального приближения (а или b) вычислять в программе.
6. Для метода простой итерации проверять достаточное условие сходимости метода на введенном интервале.
7. Предусмотреть вывод результатов (найденный корень уравнения, значение функции в корне, число итераций) в файл или на экран по выбору конечного пользователя.
8. Организовать вывод графика функции, график должен полностью отображать весь исследуемый интервал (с запасом).

**Для систем нелинейных уравнений:**

1. Пользователь выбирает предлагаемые программой системы двух нелинейных
уравнений (2-3 системы).
2. Организовать вывод графика функций.
3. Начальные приближения ввести с клавиатуры.
4. Для метода простой итерации проверить достаточное условие сходимости.
5. Организовать вывод вектора неизвестных: 𝑥1, 𝑥2.
6. Организовать вывод количества итераций, за которое было найдено решение.
7. Организовать вывод вектора погрешностей: 
8. Проверить правильность решения системы нелинейных уравнений

## 3 Оформить отчет, который должен содержать:

1. Титульный лист.
2. Цель лабораторной работы.
3. Порядок выполнения работы.
4. Рабочие формулы используемых методов.
5. Графики функций на исследуемом интервале.
6. Заполненные таблицы вычислительной части лабораторной работы (в зависимости от варианта: табл. 1 – 5).
7. Листинг программы, по крайней мере, коды используемых методов.
8. Результаты выполнения программы при различных исходных данных.
9. Выводы

**Вид нелинейного уравнения для вычислительной реализации**

