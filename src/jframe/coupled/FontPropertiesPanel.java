// Just some experiments
package jframe.coupled;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * 
 * @author emaphis
 */
public class FontPropertiesPanel extends JPanel {
   protected JList<String> nameList;
   protected JComboBox<Integer> sizeBox;
   protected JCheckBox boldBox;
   protected JCheckBox italicBox;
   
   protected SampleTextFrame frame;
   
   public final static int[] fontSizes = {10, 12, 14, 18, 24, 32, 48, 64};
   
   public FontPropertiesPanel(SampleTextFrame stf) {
       super();
       frame = stf;
       createComponents();
       buildLayot();
   }

    protected void buildLayot() {
        JLabel label;
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        
        constraints.insets = new Insets(5, 10, 5, 10);
        constraints.gridx = 0;
        label = new JLabel("Name:", JLabel.LEFT);
        layout.setConstraints(label, constraints);
        add(label);
        label = new JLabel("Size:", JLabel.LEFT);
        layout.setConstraints(label, constraints);
        add(label);
        layout.setConstraints(boldBox, constraints);
        add(boldBox);
        constraints.gridx++;
        nameList.setVisibleRowCount(3);
        JScrollPane jsp = new JScrollPane(nameList);
        layout.setConstraints(jsp, constraints);
        add(jsp);
        layout.setConstraints(sizeBox, constraints);
        add(sizeBox);
        layout.setConstraints(italicBox, constraints);
        add(italicBox);
    }

    protected void createComponents() {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] names = ge.getAvailableFontFamilyNames();
        nameList = new JList<>(names);
        nameList.setSelectedIndex(0);
        nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        nameList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                handleFontPropertyChange();       
            }
        }
        );
        
        Integer sizes[] = new Integer[fontSizes.length];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = fontSizes[i];
        }
        
        sizeBox = new JComboBox<>(sizes);
        sizeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleFontPropertyChange();
            }
        }
        );
        
        boldBox = new JCheckBox("Bold");
        boldBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleFontPropertyChange();
            }
        }
        );
        
        italicBox = new JCheckBox("Italic");
        italicBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                handleFontPropertyChange();
            }
        }
        );
    }
    
    protected void handleFontPropertyChange() {
        frame.refreshDisplayFont();
    }
    
    public String getSelectedFontName() {
        return nameList.getSelectedValue();
    }
    
    public int getSelectedFontSize() {
        return (Integer)sizeBox.getSelectedItem();
    }
    
    public boolean isBoldSelected() {
        return boldBox.isSelected();
    }
    
    public boolean isItalicSelected() {
        return italicBox.isSelected();
    }
}