package CommandObject
import linksharing1.*

import grails.validation.Validateable

class UserControllerCo implements Validateable {
    String username
    String password
    boolean enabled = true
    String email
    String firstname
    String lastname
    byte[] photo
    String confirmpassword
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
    //boolean admin=Role.listOrderByAuthority().contains("ROLE_ADMIN")
    Date dateCreated
    Date lastUpdated
    static hasMany = [topics:Topic,subscriptions:Subscription]
    static constraints={
        importFrom User
        confirmpassword(nullable: false,
        validator:{passwd,obj->
            return passwd==obj.confirmpassword

        })

    }
}
