package proxy.dynamic

class PersonBeanImpl: PersonBean {

    @JvmField var name: String = ""
    @JvmField var gender: String = ""
    @JvmField var interest: String = ""
    @JvmField var rating: Int = 999
    @JvmField var ratingCount: Int = 0

    override fun getName(): String {
        return this.name
    }

    override fun getGender(): String {
        return this.gender
    }

    override fun getInterest(): String {
        return this.interest
    }

    override fun getHotOrNotRating(): Int {
        return if(ratingCount == 0) {
            0
        } else {
            this.rating /  this.ratingCount
        }
    }

    override fun setName(name: String) {
        this.name = name
    }

    override fun setGender(gender: String) {
        this.gender = gender
    }

    override fun setInterest(interest: String) {
        this.interest = interest
    }

    override fun setHotOrNotRating(rating: Int) {
        this.rating += rating
        ratingCount++
    }

}