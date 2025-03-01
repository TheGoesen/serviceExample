module serviceExample.libImpl.main {
    requires serviceExample.lib.main;
    exports org.example.impl;
    provides org.example.Library with org.example.impl.LibImpl;

}