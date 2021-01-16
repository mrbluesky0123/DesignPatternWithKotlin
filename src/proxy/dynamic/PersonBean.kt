package proxy.dynamic

interface PersonBean {
    fun getName(): String
    fun getGender(): String
    fun getInterest(): String
    fun getHotOrNotRating(): Int

    fun setName(name: String)
    fun setGender(gender: String)
    fun setInterest(interest: String)
    fun setHotOrNotRating(rating: Int)
}