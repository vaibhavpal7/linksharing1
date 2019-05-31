package linksharing1

import CommandObject.TopicCo
import Enums.Visibility

class Topic {
    String name
    static belongsTo = [user:User]
  //  static hasOne=[subscription:Subscription]
    static hasMany = [resources:Resource]
    Date dateCreated
    Date lastUpdated
Visibility visibility
    Topic(TopicCo topicCo){
        this.name=topicCo?.name
        this.visibility=topicCo?.visibility

    }

    static constraints = {
        dateCreated nullable: true
        lastUpdated nullable: true

    }
}
