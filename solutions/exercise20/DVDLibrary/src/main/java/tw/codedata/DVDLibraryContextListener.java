package tw.codedata;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

@WebListener
public class DVDLibraryContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        XmlWebApplicationContext xmlWebAppCtx = new XmlWebApplicationContext();
        xmlWebAppCtx.setServletContext(sce.getServletContext());
        xmlWebAppCtx.refresh();
        sce.getServletContext().setAttribute("dvdLibraryService", xmlWebAppCtx.getBean("dvdLibraryService"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {}
}
