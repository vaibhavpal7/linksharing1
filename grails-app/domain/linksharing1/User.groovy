package linksharing1

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	String email
	String firstname
	String lastname
	byte[] photo

	//boolean admin=Role.listOrderByAuthority().contains("ROLE_ADMIN")
	Date dateCreated
	Date lastUpdated
	//static hasMany = [topics:Topic]


	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this)*.role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
		password blank: false, password: true
		username blank: false, unique: true
		firstname nullable: false
		lastname nullable: true
		photo nullable: true

		email nullable: false
		accountExpired nullable:true
		accountLocked nullable:true
		passwordExpired nullable:true
		dateCreated nullable: true
		lastUpdated nullable: true

//		password validator: {passwd,obj->
//			return passwd==obj.confirmpassword
//
//		}


	}

	static mapping = {
		password column: '`password`'
	}
}
