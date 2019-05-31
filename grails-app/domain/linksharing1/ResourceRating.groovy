package linksharing1

class ResourceRating {
    static belongsTo = [resouce:Resource]
    static hasMany = [users:User]
    Integer score

    static constraints = {
    }
}
