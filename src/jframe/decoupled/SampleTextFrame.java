
package jframe.decoupled;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class SampleTextFrame extends JFrame implements FontListener {
    
    //protected FontPropertiesPanel propertiesPanel;
    protected JPanel propertiesPanel;
    protected JTextField sampleText;
    protected JLabel displayArea;
    
    public static void main(String[] args) {
        SampleTextFrame stf = new SampleTextFrame();
        stf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stf.setVisible(true);
    }
    
    public SampleTextFrame() {
        super();
        createComponents();
        createDocumentListener();
        buildLayout();
        //displayArea.setFont(propertiesPanel.getSelectedFont());
        //propertiesPanel.setFontListener(this);
        pack();
    }

    protected void createComponents() {
        //propertiesPanel = new FontPropertiesPanel(this);
        sampleText = new JTextField(20);
        displayArea = new JLabel("");
        displayArea.setPreferredSize(new Dimension(200, 75));
        displayArea.setMinimumSize(new Dimension(200, 75));
    }

    private void createDocumentListener() {
        Document document = sampleText.getDocument();
        document.addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent event) {
                handleDocumentUpdate();
            }
            
            @Override
            public void insertUpdate(DocumentEvent event) {
                handleDocumentUpdate();
            }
            
            @Override
            public void removeUpdate(DocumentEvent event) {
                handleDocumentUpdate();
            }
        }
        );
    }
    
    private void buildLayout() {
        Container pane = getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        pane.setLayout(layout);
        constraints.insets = new Insets(5, 10, 5, 10);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 0;
        BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
        TitledBorder tb = new TitledBorder(bb, "Font");
        propertiesPanel.setBorder(tb);
        layout.setConstraints(propertiesPanel, constraints);
        pane.add(propertiesPanel);
        layout.setConstraints(sampleText, constraints);
        pane.add(sampleText);
        layout.setConstraints(displayArea, constraints);
        pane.add(displayArea);
    }
    
    protected void handleDocumentUpdate() {
        displayArea.setText(sampleText.getText());
    }

    //protected void refreshDisplayFont() {
    //    displayArea.setFont(getSelectedFont());
    //}
    
    //public Font getSelectedFont() {
    //    String name = propertiesPanel.getSelectedFontName();
    //    int style = 0;
    //    style += (propertiesPanel.isBoldSelected() ? Font.BOLD : 0);
    //    style += (propertiesPanel.isItalicSelected() ? Font.ITALIC : 0);
    //    int size = propertiesPanel.getSelectedFontSize();
    //    return new Font(name, style, size);
    //}
    
    @Override
    public void fontChanged(Font newFont) {
        displayArea.setFont(newFont);
    }
}
