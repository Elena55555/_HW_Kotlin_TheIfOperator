package com.example.Kotlin_TheIfOperator
//Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
//Даны целые числа: 4, 45, -2, 8. Найти количество положительных чисел в исходном наборе.
//Даны два числа. Вывести большее из них.
//Дано целое число в диапазоне 1–7. Вывести строку — название дня не дели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
//Дано целое число K. Вывести строку-описание оценки, соответствующей числу (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если не лежит в диапазоне 1–5, то вывести строку «ошибка».
//Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан номер действия (целое число в диапазоне 1–4) и числа типа double(не равно 0). Выполнить над числами указанное действие и вывести результат.
fun main() {
	println("First task: ")
	val x = 5
	if (x > 0) {
		println(x + 1)
	} else println(x)
	println(" ")
	println("Second task: ")
	val a = 4
	val b = 45
	val c = -2
	val d = 8

	var k = 0
	if (a > 0)
		k = 1;
	if (b > 0)
		k = k + 1
	if (c > 0)
		k = k + 1
	if (d > 0)
		k = k + 1
	println(k)
	println(" ")

	println("Third task : ")
	val f = 10
	val g = 20
	val h = if (f > g) f else g
	println(h)
	println(" ")
	println("Fourth task : ")
	var n = 7

	if (n == 1) {
		println("It's Monday")
	} else if (n == 2) {
		println("It's Tuesday")
	} else if (n == 3) {
		println("It's Wednesday")
	} else if (n == 4) {
		println("It's Thursday")
	} else if (n == 5) {
		println("It's Friday")
	} else if (n == 6) {
		println("It's Saturday")
	} else if (n == 7) {
		println("It's Sunday")
	}
	println(" ")

	println("Fifth task : ")
	var K = 5
	val i = 1..5

	if (K == 1) {
		println("It's bad")
	} else if (K == 2) {
		println("It's  unsatisfactory")
	} else if (K == 3) {
		println("It's satisfactory")
	} else if (K == 4) {
		println("It's good")
	} else if (K == 5) {
		println("It's excellent")
	} else if ( K !in i) {
		println("This is a mistake")

	}
	println(" ")

	println("Sixth task  : ")
	val s = 4.0
	val m = 6.0
	var  actionNumberOf = 4
	if  (actionNumberOf == 1) {
		println(" Result of addition $s+ $m = " +  (s+m))

	} else if (actionNumberOf == 2) {
		println("Result of subtraction $s-$m = " + (s-m))

	} else if (actionNumberOf ==3){
		println("Result of multiplication $s*$m = "+ (s*m))

	} else if (actionNumberOf == 4) {
		println("Result of division $s/ $m = " + (s/m))
	}
}




















