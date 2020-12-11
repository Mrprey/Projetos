package Model

class In_Season {
    private var gols: Int = 0
    private var wins: Int = 0
    private var ties: Int = 0
    private var defeats: Int = 0
    private var n_matches: Int = 0

    fun get_n_matches(): Int{
        return n_matches
    }

    fun get_gols(): Int{
        return gols
    }

    fun get_wins(): Int{
        return wins
    }

    fun get_defeats(): Int{
        return defeats
    }

    fun get_ties(): Int{
        return ties
    }

    fun set_n_matches(){
        n_matches += 1
    }

    fun set_wins(){
        wins += 1
    }

    fun set_ties(){
        ties += 1
    }

    fun set_defeats(){
        defeats += 1
    }
}