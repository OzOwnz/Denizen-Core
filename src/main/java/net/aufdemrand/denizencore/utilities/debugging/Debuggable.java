package net.aufdemrand.denizencore.utilities.debugging;

public interface Debuggable {

    public boolean shouldDebug() throws Exception;

    public boolean shouldFilter(String criteria) throws Exception;
}
