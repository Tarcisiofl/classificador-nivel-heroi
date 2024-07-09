class Hero(
    private val nickName: String,
    private val xp: Int
) {

    fun outputMessage(): String {
        return "O herói de nome $nickName está no nível de ${getRank()}"
    }

    private fun getRank(): String {
        return when {
            xp <= 1000 -> "Ferro"
            xp <= 2000 -> "Bronze"
            xp <= 5000 -> "Prata"
            xp <= 7000 -> "Ouro"
            xp <= 8000 -> "Platina"
            xp <= 9000 -> "Ascendente"
            xp <= 10000 -> "Imortal"
            else -> "Radiante"
        }
    }
}