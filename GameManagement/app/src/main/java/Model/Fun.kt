package Model

fun randon_not_repetion(sorteio: MutableList<String>): MutableList<String> {
   // println(sorteio.size)
    val len = sorteio.size
    var sorteado = sorteio.random()
    val sorteados = mutableListOf(sorteado)
    while (sorteados.size <= len-1) {
        sorteio.remove(sorteado)
        sorteado = sorteio.random()
        sorteados.add(sorteado)

    }
    return sorteados
}

fun list_players(players: MutableList<String>, teams: MutableList<String>): MutableList<Player> {
    val players_list = mutableListOf(Player(players[0], teams[0]))
    for (i in 1 until players.size){
        players_list.add(Player(players[i], teams[i]))
    }
    return players_list
}

fun create_tables(players: MutableList<Player>, size_test: Int = 2):Int {
    var size = 2

    if(size_test > size){
        size = size_test
    }

    while (size < players.size) {
        if (players.size % size == 0) {
            return size
        }
        size += 1
    }
    return 1
}

fun tables_possibles(players: MutableList<Player>){
    var size = create_tables(players)
    while (size < players.size) {
        println("${size} tabela com ${players.size / size} times")
        if (size == 1){
            break
        }
        size = create_tables(players, size + 1)
    }
}