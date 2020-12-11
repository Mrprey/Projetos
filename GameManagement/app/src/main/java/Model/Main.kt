package Model
import kotlin.collections.List as List1
import kotlin.collections.mutableListOf as mutableListOf1



fun main(){
    val players_name: MutableList<String> = randon_not_repetion(mutableListOf1("Anderson", "Vanderson", "Diogo", "Bruninho", "Leo", "Avanilson"))
    val teams_name = randon_not_repetion(mutableListOf1("Barcelona", "PSG", "borussia", "Milão", "Juventos", "Real"))

    val players : MutableList<Player> = list_players(players_name, teams_name)
    //print(players.size)
    for (i in 0 until players.size){
        println("${players[i].get_name()} com ${players[i].get_team()}")
    }
    tables_possibles(players)
}

