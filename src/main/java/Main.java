import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main
{
    public static void main (String args[]) throws Exception {

        Server srv = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        srv.setHandler(context);

        srv.start();
        srv.join();
    }

}
