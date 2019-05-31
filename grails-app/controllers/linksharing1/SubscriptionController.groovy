package linksharing1

import CommandObject.TopicCo
import org.springframework.security.access.annotation.Secured

@Secured("permitAll")
class SubscriptionController {
def springSecurityService
    def index() { }

    def subscibe(){

render(view: "Subscribe",model: [topicList:Topic.list()])


    }
    def addSubscription(TopicCo topicCo,String id){
        User user=springSecurityService.currentUser;
        Topic topic=Topic.get(id)
        Subscription subscription=new Subscription(user: user,topic: topic,TopicCo:topicCo)
        if(subscription.save(failOnError:true)){
            render "saved successfully"
        }

    }
}
