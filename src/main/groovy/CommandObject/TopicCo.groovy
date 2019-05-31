package CommandObject

import Enums.Seriousness
import Enums.Visibility
import grails.validation.Validateable
import linksharing1.Subscription
import linksharing1.Topic

class TopicCo implements Validateable {
    String name
    Visibility visibility
    Seriousness seriousness=Seriousness.VerySerious

    static constraints={
        importFrom Topic
        importFrom Subscription
    }
}
