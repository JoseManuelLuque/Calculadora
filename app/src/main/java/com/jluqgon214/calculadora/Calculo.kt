package com.jluqgon214.calculadora

class Calculo {

    var resultado = 0.toDouble()

    var operacion = ""

    fun calcular(): Double{
        var antes = false
        var numero1 = ""
        var numero2 = ""

        for(numero in operacion) {
            if (numero.isDigit() || numero.toString() == ".") {
                if (!antes) {
                    numero1 += numero
                }
                else {
                    numero2 += numero
                }
            }

            if (numero.toString() == "+" || numero.toString() == "-" || numero.toString() == "/" || numero.toString() == "x") {
                antes = true
            }
        }

        for (signo in operacion) {
            if (signo.toString() == "+"){
                resultado = numero1.toDouble() + numero2.toDouble()
                break
            }
            if (signo.toString() == "-"){
                resultado = numero1.toDouble() - numero2.toDouble()
                break
            }
            if (signo.toString() == "x"){
                resultado = numero1.toDouble() * numero2.toDouble()
                break
            }
            if (signo.toString() == "/"){
                resultado = numero1.toDouble() / numero2.toDouble()
                break
            }
        }

        operacion = ""
        return resultado
    }
}