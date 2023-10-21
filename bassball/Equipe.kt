package com.example.bassball

//////////////////qst3//////////partie3
class Equipe(var pays:Pays,var nom_Equipe:String){
    var liste2 = mutableListOf<Joueur>()
    fun recherche(j :Joueur) :Int{
        return liste2.indexOfFirst { it.nom==j.nom }

//        for (i in 0..liste2.size){
//            if (j.nom==liste2[i].nom){
//                return i
//                break
//            }
//        }
//        return -1
    }
    fun ajout(j :Joueur) :Boolean{
        if (recherche(j)!=-1){
            return false
        }else{
            liste2.add(j)
            return true
        } }

    fun suppression(j :Joueur) : Boolean{
        if (recherche(j)!=-1){
            liste2.remove(j)
            return true
        }
        else{
            return false

        } }
    fun setPoints(j :Joueur, points :Int){
        j.cumulnombre=points
    }
    fun Affichage():List<String>{
        var u= mutableListOf<String>()
        for(j in liste2){
            u.add(j.toString())
        }
        return  u
    }
}