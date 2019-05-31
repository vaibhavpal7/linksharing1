package linksharing1

class Resource {
    String description
    static belongsTo = [user:User,topic:Topic]
    Date dateCreated
    Date lastUpdated



    static constraints = {
    }
}
