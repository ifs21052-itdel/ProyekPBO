package models;

public class Database {
    private String host;
    private int port;
    private String username;
    private String password;
    private String database;
    
    public Database (String host, int port, String username, String password, String database){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.database = database;
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host){
        this.host = host;
    }
    
    public int getPort(){
        return port;
    }
    
    public void setPort(int port){
        this.port = port;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String Username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
    public String getDatabase(){
        return database;
    }
    
    public void setDatabase(String database){
        this.database = database;
    }
    
    @Override
    public String toString(){
        return "Database{" + "host=" + host + ", port=" + port + ", username= +"
                + username + ", password=" + password + ", database=" + database + '}';
    }
}