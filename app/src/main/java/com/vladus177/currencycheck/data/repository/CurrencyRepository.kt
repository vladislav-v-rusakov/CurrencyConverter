package com.vladus177.currencycheck.data

class CurrencyRepository(
    private val currencyLocalDataSource: CurrencyLocalDataSource,
    private val currencyRemoteDataSource: CurrencyRemoteDataSource
) {
    /*suspend fun getFeedLocalById(id: String): Feed {
        return feedLocalDataSource.getFeedById(id).toFeed()
    }

    suspend fun getLocalFeed(): List<Feed> {
        return feedLocalDataSource.getFeed().map { it.toFeed() }
    }

    suspend fun saveFeedLocalById(
        id: String, title: String, schedule: String, subtitle: String, startHour: String,
        endHour: String, date: String, icon: String, color: String, locationName: String,
        locationId: String, identifier: String
    ) {
        feedLocalDataSource.saveFeedById(
            id, title, schedule, subtitle, startHour, endHour, date, icon, color,
            locationName, locationId, identifier
        )
    }

    suspend fun saveFeedLocal(activities: List<Feed>?) {
        feedLocalDataSource.saveFeed(activities)
    }

    suspend fun getRemoteFeed(initialDate: String, limit: Int): FeedResponse? {

        val response = feedRemoteDataSource.getFeed(initialDate, limit)
        val feedItems = response?.data?.days?.map {
            it.toFeedsItems()
        }
        val items: MutableList<Feed> = ArrayList()

        if (feedItems != null) {
            for (list in feedItems) {
                list.items.map { items.add(it) }
            }
        }
        response?.let {
            return FeedResponse(items, response.status, response.message)
        }

        return FeedResponse(items, true, "")

    }*/
}