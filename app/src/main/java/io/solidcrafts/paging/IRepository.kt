package io.solidcrafts.paging

interface IRepository<Item> {
    fun loadItems(): Result<List<Item>>
}