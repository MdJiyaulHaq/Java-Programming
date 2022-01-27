package com.Advance.Applet;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayAudioFile extends Applet implements ActionListener {
    Button play, stop, loop;
    AudioClip audioClip;

    public void init() {
        play = new Button("play music");
        add(play);
        play.addActionListener(this);
        stop = new Button("stop music");
        add(stop);
        stop.addActionListener(this);
        loop = new Button("play in loop");
        add(loop);
        loop.addActionListener(this);

        audioClip = getAudioClip(getCodeBase(), "azan.mp3");
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Button source = (Button) actionEvent.getSource();
        if (source.getLabel() == "play music") {
            audioClip.play();
        } else if (source.getLabel() == "stop music") {
            audioClip.stop();
        } else {
            audioClip.loop();
        }
    }
}