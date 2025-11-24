package com.titansg.odin;

public class ScommCore {
    // Load the native library on class initialization
    static {
        System.loadLibrary("scomm_core");
    }

    // Declare the native methods that will be implemented in Rust
    public static native String getPeerId();
    public static native void startNode();
}
