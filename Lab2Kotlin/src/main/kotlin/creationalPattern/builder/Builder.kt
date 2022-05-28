package creationalPattern.builder

class Work {
    private val name: String
    private val position: String
    private val company: String


    private constructor(name: String, position: String, company: String) {
        this.name = name
        this.position = position
        this.company = company
    }

    fun name() = name
    fun position() = position
    fun company() = company

    class Builder {
        private var name: String = ""
        private var position: String = ""
        private var company: String = ""

        fun changeName(name: String) = apply {
            this.name = name
        }

        fun changePosition(position: String) = apply {
            this.position = position
        }

        fun changeCompany(company: String) = apply {
            this.company = company
        }


        fun build() = Work(name, position, company)

    }

}


class Work2(
    private var name: String = "",
    private var position: String = "",
    private var company: String = "",

) {
    fun name() = name
    fun position() = position
    fun company() = company
}