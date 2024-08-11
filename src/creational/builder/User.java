package creational.builder;

public class User {

    private final String userId;
    private final String username;
    private final String emailId;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.username = userBuilder.username;
        this.emailId = userBuilder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String userId;
        private String username;
        private String emailId;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
