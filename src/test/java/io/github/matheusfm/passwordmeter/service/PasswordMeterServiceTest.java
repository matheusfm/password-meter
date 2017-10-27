package io.github.matheusfm.passwordmeter.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringJUnit4ClassRunner.class)
public class PasswordMeterServiceTest {

    //@Autowired
    private PasswordMeterService service;

    @Before
    public void setUp() {
        service = new PasswordMeterService();
    }

    @Test
    public void repeatCharacters() {
        int occurrences = service.repeatCharacters("11122");
        assertEquals(5, occurrences);
    }

}