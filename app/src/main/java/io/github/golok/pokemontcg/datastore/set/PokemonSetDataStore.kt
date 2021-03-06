package io.github.golok.pokemontcg.datastore.set

import io.github.golok.pokemontcg.model.PokemonSet

interface PokemonSetDataStore {
    suspend fun getSets(): MutableList<PokemonSet>?
    suspend fun addAll(sets: MutableList<PokemonSet>?)
}