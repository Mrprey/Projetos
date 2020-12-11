package Model

class Matche(val player1: Player, val player2: Player) {
    var gols_player1 = 0
    var gols_player2 = 0
    private var win: Boolean = false
    var in_progress = true

    fun winner(): Player {
       // if(in_progress){
         //   return
     //   }
        if (win){
            return player1
        }
        else{
            return player2
        }
    }

}