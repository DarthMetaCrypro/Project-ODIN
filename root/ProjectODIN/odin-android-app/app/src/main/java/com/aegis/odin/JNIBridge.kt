package com.aegis.odin

/**
 * JNI Bridge to the native Rust cryptographic core (scomm_core).
 * This object defines the external functions that are implemented in Rust.
 */
object JNIBridge {

    // Load the native library on object initialization.
    init {
        System.loadLibrary("scomm_core")
    }

    /**
     * Initializes the Rust core and returns its version string.
     * A fundamental function to verify the bridge is working.
     */
    external fun initializeCore(): String

    /**
     * Generates a new master key pair from a given seed and returns the public key.
     * The private key is securely stored within the Rust core.
     */
    external fun generateMasterKeys(seed: ByteArray): ByteArray
}
