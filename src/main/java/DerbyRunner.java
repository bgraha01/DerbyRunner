import org.jukito.JukitoRunner;
import org.junit.runners.model.InitializationError;

import java.lang.reflect.InvocationTargetException;

/**
 * This runner will create in-memory Derby datasources for your test class.
 * Extending the Jukito runner incorporates its Guice implementation as well
 * as its auto mocking capability via Mockito.
 *
 * Taking advantage of the Jukito's Guice implementation allows the runner to create
 * Named Guice bindings at runtime that the user can then reference in the test class
 * to access their respective datasource.
 */
public class DerbyRunner extends JukitoRunner {
    /**
     * An extension of the Jukito runner which, in addition to its Guice and auto Mock
     * implementation will create in-memory Derby databases that can be referenced via annotated Named Guice bindings.
     * @param klass is the test class to be run.
     * @throws InitializationError
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public DerbyRunner(final Class<?> klass) throws InitializationError,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        super(klass);
        this.createInMemoryDatabases(klass);
    }

    /**
     * Creates the Derby in-memory databases.
     * @param testClass is the class which encapsulates the tests.
     */
    private void createInMemoryDatabases(final Class testClass) {

    }
}
