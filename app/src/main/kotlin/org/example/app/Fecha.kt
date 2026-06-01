package org.example.app

class Fecha(
    private var day: Int = 0,
    private var month: Int = 0,
    private var year: Int = 0
) {

    override fun toString(): String {
        return "$day/$month/$year"
    }
}