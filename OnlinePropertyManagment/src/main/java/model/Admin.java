package model;

public class Admin {
		String First_name;
		String Last_name;
		String email;
		String username;
		String password;
		String Re_Enter_password;
		
		public Admin(String First_name, String Last_name,String email, String username,String password, String Re_Enter_password) {
	        this.First_name = First_name;
	        this.Last_name = Last_name;
	        this.email = email;
	        this.username = username;
	        this.password = password;
	        this.Re_Enter_password = Re_Enter_password;
	    }
		
		public String getFirst_name() {
			return First_name;
		}
		public void setFirst_name(String first_name) {
			First_name = first_name;
		}
		public String getLast_name() {
			return Last_name;
		}
		public void setLast_name(String last_name) {
			Last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getRe_Enter_password() {
			return Re_Enter_password;
		}
		public void setRe_Enter_password(String re_Enter_password) {
			Re_Enter_password = re_Enter_password;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		
}
