package com.example.bassball

fun main() {
//    var j1=Joueur("bilal",5,Equipe.OCK,2,)
//    var j2=Joueur("wa hassane",5,Equipe.OCS,4,)
//    var j3=Joueur("nahas",5,Equipe.OCK,2,)
//
//    val list_joueur= mutableListOf<Joueur>(j1,j2,j3)
//    var j4 = Joueur("ossama",5,Equipe.OCS,8)
//    list_joueur.add(j4)


    var equipes = mutableListOf<Equipe>(
        Equipe(Pays.MAROC, "Raja"),
        Equipe(Pays.TUNISIE, "tunise"),
        Equipe(Pays.MOURITANIE, "moritan"),
        Equipe(Pays.EGYPTE, "ahli")
    )
    val joueur1 = Joueur(1, "Imad", 10)
    val joueur2 = Joueur(2, "salahedine", 15)
    val joueur3 = Joueur(3, "youssef", 8)
    val joueur4 = Joueur(4, "saad", 12)

    equipes[0].ajout(joueur1)
    equipes[0].ajout(joueur2)
    equipes[1].ajout(joueur2)
    equipes[2].ajout(joueur3)
    equipes[3].ajout(joueur4)

    equipes[0].setPoints(joueur1, 15)

    for (jou in equipes) {
        println(jou.Affichage())
    }
}

