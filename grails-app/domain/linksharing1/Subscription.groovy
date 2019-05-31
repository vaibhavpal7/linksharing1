package linksharing1

import CommandObject.TopicCo
import Enums.Seriousness

class Subscription {

    static belongsTo = [user:User,topic:Topic]

    Seriousness seriousness
    Subscription(User user,Topic topic,TopicCo topicCo){
        this.user=user
        this.topic=topic

    }
//    Seriousness seriousness
//    Subscription(TopicCo topicCo){
//        this.seriousness=topicCo.seriousness
//
//    }

    static constraints = {
        seriousness nullable: true
    }
}
