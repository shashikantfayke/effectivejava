package chepter1.staticfactory;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private Services() {

    }

    private static final Map<String, Provider> PROVIDERS = new ConcurrentHashMap();
    private static final String DEFAULT_PROVIDER_NAME = "<DEF>";

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }
    
    public static void registerProvider(String name, Provider p) {
        PROVIDERS.put(name, p);
    }
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String name) {
        Provider provider=PROVIDERS.get(name);
        if (provider==null){
            throw new IllegalArgumentException("No Provider registered with name:"+name);
        }
        return provider.newService();

    }

}
