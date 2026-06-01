package org.example.app

class Fecha(private var day: Int, private var month: Int, private var year: Int){
    override fun toString():String{
        return "Hoy es fecha(${day}/${month}/${year})"
    }
}