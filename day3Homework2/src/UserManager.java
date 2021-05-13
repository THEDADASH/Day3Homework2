public class UserManager {

        public void add(User user){
            System.out.println(user.nickName+user.password + " :Kullanıcı adı ve şifre girildi.");
        }

        public void remove(User user){
            System.out.println(user.nickName+user.password + " :Kullanıcı kaldırıldı.");
        }

        public void addMultiple(User[] users){
            for (User user : users){
                add(user);
            }
        }
}
