import grails.plugin.springsecurity.SpringSecurityService
import linksharing1.*
import CommandObject.*

import linksharing1.User
import org.springframework.security.access.annotation.Secured
import CommandObject.*
@Secured("permitAll")
class UserController {
    def springSecurityService

    def index() {
        render "Text"
    }

    def save(UserControllerCo userControllerCo){
        println "what"
      //=new UserControllerCo(firstname:params.firstname,lastname: params.lastname,email: params.email,username: params.username,password: params.password,confirmpassword: params.confirmpassword)

       if(userControllerCo.hasErrors()){
           userControllerCo.errors.allErrors.each {
               println it
           }

       }
        else{
           User user=new User(userControllerCo.properties)
           if(user.save(flush:true,failOnError:true)){
           render(view: "/login/auth")
           }
           else{
               render "Issue"
           }
       }
    }
   // @Secured("permitAll")
    def registration(){
      render view: "Register"


    }
    def timeline(){
       User user=springSecurityService.currentUser
        render(view: "timeline",model: [user:user])
    }
    def topic(String id){
        User user=User.get(id)
        render view: "/user/topic",model: [user:user]
    }
    def addTopic(TopicCo topicCo){
        User user=springSecurityService.currentUser
        if(topicCo.hasErrors()){
            topicCo.errors.allErrors.each {
                println it
            }
        }


        Topic topic=new Topic(topicCo)
        topic.user=user
        topic.save(failOnError:true)
        Subscription subscription=new Subscription(user,topic,topicCo)
        subscription.save(failOnError:true,flush:true)
//        Subscription subscription1=Subscription.where {
//            topic.user.id=user.id
//        }.list()


        render view: "timeline" ,model: [subscription:subscription,user:user,topic:topic]




    }

}


