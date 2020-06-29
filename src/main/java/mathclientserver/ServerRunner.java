package mathclientserver;

public class ServerRunner {
    public static void main(String[] args){
        run();
    }


    public static void run(){
        int port = 455;
        Server server = new Server(port);
        server.run();
    }
}
