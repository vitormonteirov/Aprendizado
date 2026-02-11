package Aprendizado.UseTheHeadJAVA;
import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.sound.midi.ShortMessage.*;

public class BeatBox {
    private ArrayList<JCheckBox> checkBoxList;               //Armazena caixas de Seleçao
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;

    String[] instrumentNames = { "Bass Drum", "Closed HiBat ", "Open Hibat", "Acoustic Snare", "Crash Cymball",
            "Hand Clap", "High Tom", "Bongo", "Maracas", "Whristle", "Low Conga", "Cowbell",
            "VibraSlap", "Low-mid tom", "High Agogo", "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63}; //Teclas reais dos instrumentos

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }
    public void buildGUI() {
        JFrame frame = new JFrame("Cyber BeatBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); //Borda vazia nos fornece margem entre as bordas do painel

        Box buttonBox = new Box(BoxLayout.X_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(e -> buildTrackAndStart());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(e-> sequencer.stop());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Up Tempo");
        upTempo.addActionListener(e -> changeTempo(1.03f));
        buttonBox.add(upTempo);
// Ajuste de tempo por clique
        JButton downTempo = new JButton("Down Tempo");
        downTempo.addActionListener(e -> changeTempo(0.97f));
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (String instrumentName : instrumentNames) {
            JLabel instrLabel = new JLabel(instrumentName);
            instrLabel.setBorder(BorderFactory.createEmptyBorder(4, 1, 4, 1)); //Alinha o instrumento com a caixa de seleçao

        }
        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        frame.getContentPane().add(background);

        GridLayout grid =  new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);

        JPanel mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        checkBoxList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();  //Seleciona as caiuxas e as define como falsas para que não estejam marcadas
            c.setSelected(false);
            checkBoxList.add(c);
            mainPanel.add(c);
        }
        setUpMidi();

        frame.setBounds(50, 50, 300, 300);
        frame.pack();
        frame.setVisible(true);

    }
    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4); //configs padrões da MIDI
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void buildTrackAndStart() { //Criar array de 16 elementos para armazenar os valores das batidas
        int[] trackList;                //Se o instrumento nao tocar a batida, insere um zero

        sequence.deleteTrack(track); //Cancela antiga e insere nova
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];

            int key = instruments[i];

            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkBoxList.get(j + 16 * i);
                if (jc.isSelected()){
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            }
            makeTracks(trackList); //Cria eventos a cada batida de instrumento
            track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, 16));
        }
        track.add(makeEvent(PROGRAM_CHANGE, 9, 1, 0, 15));

        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void changeTempo(float tempoMultiplier) {
        float tempoFactor = sequencer.getTempoFactor();
        sequencer.setTempoFactor(tempoFactor * tempoMultiplier);
    }
    private void makeTracks(int[] List) {
        for (int i = 0; i < 16; i++) {
            int key= List[i];

            if (key != 0){
                track.add(makeEvent(NOTE_ON, 9, key, 100, i));
                track.add(makeEvent(NOTE_OFF, 9, key, 100, i + 1));
            }
        }
    }
    public static MidiEvent makeEvent(int cmd, int chn1, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chn1, one, two);
            event = new MidiEvent(msg, tick);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

}

