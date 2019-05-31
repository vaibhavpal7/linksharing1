package linksharing1

class ReadingItem {
    static belongsTo = [resources:Resource,user:User]
    static hasMany = [users:User]

    static constraints = {
    }
}
