package com.jluqgon214.calculadora

class Calculo(num1: Int, num2: Int, res: Int, op: String) {

    var numero1 = num1

    var numero2 = num2

    var resultado = res

    var operacion = op

    init {
        numero1 = num1
        numero2 = num2
        resultado = res
        operacion = op
    }

    fun Calcular(operacion: String): Int{
        var num1 = ""
        var num2 = ""
        var antes = false

        for(numero in operacion) {
            if (numero.isDigit()) {
                if (antes == false) {
                    num1 = num1 + numero
                }
                else {
                    num2 = num2 + numero
                }
            }

            if (numero.toString() == "+" || numero.toString() == "-" || numero.toString() == "/" || numero.toString() == "x") {
                antes = true
            }
        }

        var resultado = 0

        for (signo in operacion) {
            if (signo.toString() == "+"){
                resultado = num1.toInt() + num2.toInt()
                break
            }
            if (signo.toString() == "-"){
                resultado = num1.toInt() - num2.toInt()
                break
            }
            if (signo.toString() == "x"){
                resultado = num1.toInt() * num2.toInt()
                break
            }
            if (signo.toString() == "/"){
                resultado = num1.toInt() / num2.toInt()
                break
            }
        }

        return resultado
    }
}