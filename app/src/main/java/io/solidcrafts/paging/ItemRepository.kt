package io.solidcrafts.paging

import javax.inject.Inject

class ItemRepository @Inject constructor(

) : IRepository<Item> {

    override fun loadItems(): Result<List<Item>> {
        TODO("Not yet implemented")
    }
}