import linksharing1.*
class BootStrap {

    def init = { servletContext ->
        Role role =new Role(authority: "ROLE_ADMIN").save(failOnError:true)

       // User user=new User(username: "me",password: "me").save(failOnError:true)
        User user=new User(username: "me",password: "me",firstname: "vaibhav",lastname: "Pal",email: "vaibhavpal7@gmail.com").save(failOnError:true)
        UserRole.create(user,role)
        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }
    def destroy = {
    }
}
