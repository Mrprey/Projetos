package Model

class Player(private var name: String, private var team: String) {
    val in_season = In_Season()

    fun get_name(): String{
        return name
    }

    fun get_team(): String{
        return team
    }
}
