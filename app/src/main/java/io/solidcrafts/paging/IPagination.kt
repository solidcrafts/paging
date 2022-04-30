package io.solidcrafts.paging

interface IPagination<Key, Item> {
    fun nextPage(key: Key) : Result<List<Item>>
}