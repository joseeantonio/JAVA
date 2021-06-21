public class Usuario {

    private String nombre;
    private String login;
    private String Email;

    public Usuario(String nombre, String login, String email) {
        this.nombre = nombre;
        this.login = login;
        Email = email;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


}
