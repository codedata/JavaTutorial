package tw.codedata;
 
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.springframework.ui.Model;
 
public class DvdControllerTest {
    List<Dvd> dvds;
    Map attributesOfModel;
    DvdController controller;
    Model model;

    @Before
    public void setUp() {
        dvds =  new ArrayList<>(Arrays.asList(new Dvd("dvd1", 1, 2, new Director("director1"))));
        
        attributesOfModel = new HashMap();
        
        controller = new DvdController();
        controller.setDvdDao(new DvdDao() {
            public void saveDvd(Dvd dvd) {
                dvds.add(dvd);
            }
            public List<Dvd> allDvds() {
                return dvds;
            }
        });

        model = new Model() {
            @Override
            public Model addAttribute(String attributeName, Object attributeValue) {
                attributesOfModel.put(attributeName, attributeValue);
                return this;
            }

            @Override
            public Model addAttribute(Object attributeValue) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Model addAllAttributes(Collection<?> attributeValues) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Model addAllAttributes(Map<String, ?> attributes) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Model mergeAttributes(Map<String, ?> attributes) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsAttribute(String attributeName) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Map<String, Object> asMap() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
    }

    @Test
    public void testList() {
        String result = controller.list(model);
        assertEquals("list", result);
        assertEquals(dvds, attributesOfModel.get("dvds"));
    }
    
    @Test
    public void testAdd() {
        String result = controller.add("dvd1", 1, 2, "director1", model);
        Dvd dvd = (Dvd) attributesOfModel.get("dvd");
        
        assertEquals("success", result);
        assertEquals(2, dvds.size());
        assertEquals("dvd1", dvd.getTitle());
    }
}
