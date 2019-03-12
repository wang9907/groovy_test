package com.groovy.design

class Car {
	def miles = 0
	final year

	Car(theYear) {
		year=theYear
	}

	public static void main(String[] args) {
		Car car = new Car(2008)
		println "year:$car.year"
		println "Miles:$car.miles"
		car.miles=25
		println "Mile:$car.miles"
	}
}

