package com.titansg.odin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView from our layout
        final TextView peerIdTextView = findViewById(R.id.peerIdText);

        // Call the native Rust code and display the result
        ScommCore.startNode(); // Initialize the node
        String peerId = ScommCore.getPeerId();
        peerIdTextView.setText("Peer ID: " + peerId);
    }
}
