package com.Advance.Applet;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayAudio2 extends Applet implements ActionListener {
    AudioClip sound;

    public void init() {

        sound = getAudioClip(getCodeBase(), "sample.mp3");

        Button play = new Button("Play");
        add(play);
        Button stop = new Button("Stop");
        add(stop);
        Button loop = new Button("Loop");
        add(loop);

        loop.addActionListener(this);
        play.addActionListener(this);
        stop.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ("Play".equals(s))
            sound.play();
        if ("Stop".equals(s))
            sound.stop();
        if ("Loop".equals(s))
            sound.loop();
    }
}