package org.example.projectZooEcosystem;

/*
 12.
 Create Registration Class in which you would have variables such as email,
 userName and password that have an access scope only within its own class.
 After creating an object of the class, the user should be able to call methods
 and in each method separately pass values to set users email, username and
 password.
 Requirements:
 ● Valid email consider to be only yahoo
 ● Valid userName and password cannot be empty and should be of
 length larger than 6 characters. Also valid passwords cannot contain
 userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public String setEmail(String email) {
        if (email.endsWith("Yahoo.com")) {
            return email;
        }
        return "Only yahoo email";
    }

    public String setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("User Name cannot be empty");
        }
        if (userName.length() > 6) {
            return userName;
        }
        return "The userName should be more than 6 character";
    }

    public String setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password cannot ne empty");
        } else if (password.length() > 6) {
            return password;
        }
        return "password should be more the than 6 character";
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        String myEmail = registration.setEmail("Barkat@yahoo.com");
        String myName = registration.setUserName("bark0233");
        String myPass = registration.setPassword("12345mfg");
        System.out.println("My email: " + myEmail);
        System.out.println("my userName: " + myName);
        System.out.println("my password: " + myPass);
    }

}

