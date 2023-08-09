package threads.examples.ch02.example2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import threads.examples.lib.*;


public class SwingTypeTester extends JFrame implements CharacterSource {

    private static final long serialVersionUID = 1L;

    protected RandomCharacterGenerator producer;
    private CharacterDisplayCanvas displayCanvas;
    private CharacterDisplayCanvas feedbackCanvas;
    private JButton quitButton;
    private JButton startButton;
    private CharacterEventHandler handler;

    public SwingTypeTester() {
        initComponents();
    }

    private void initComponents() {
        this.handler = new CharacterEventHandler();
        this.displayCanvas = new CharacterDisplayCanvas();
        this.feedbackCanvas = new CharacterDisplayCanvas(this);
        this.quitButton = new JButton();
        this.startButton = new JButton();
        add(displayCanvas, BorderLayout.NORTH);
        add(feedbackCanvas, BorderLayout.CENTER);
        JPanel p = new JPanel();
        this.startButton.setText("Start");
        quitButton.setText("Quit");
        p.add(startButton);
        p.add(quitButton);
        add(p, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                quit();
            }
        });

        feedbackCanvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (c != KeyEvent.CHAR_UNDEFINED)
                    newCharacter((int) c);
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                producer = new RandomCharacterGenerator();
                displayCanvas.setCharacterSource(producer);
                producer.start();
                feedbackCanvas.setEnabled(true);
                feedbackCanvas.requestFocus();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                quit();
            }
        });
        pack();
    }

    private void quit() {
        System.exit(0);
    }

    @Override
    public void addCharacterListener(CharacterListener cl) {
        handler.addCharacterListener(cl);
    }

    @Override
    public void removeCharacterListener(CharacterListener cl) {
        handler.removeCharacterListener(cl);
    }

    public void newCharacter(int c) {
        handler.fireNewCharacter(this, c);
    }

    @Override
    public void nextCharacter() {
        throw new IllegalStateException("We don't produce on demand.");
    }

    public static void main(String[] args) {
        new SwingTypeTester().setVisible(true);
    }
}
