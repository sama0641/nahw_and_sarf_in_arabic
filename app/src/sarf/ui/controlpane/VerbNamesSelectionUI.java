package sarf.ui.controlpane;

import javax.swing.*;
import sarf.ui.*;
import java.awt.*;
import java.awt.event.*;


public class VerbNamesSelectionUI extends JPanel implements IControlPane {

    private SelectionInfo selectionInfo;

    public VerbNamesSelectionUI() {
        super(new BorderLayout());

        JPanel buttonsPanel = new APanel(new GridLayout(1, 4));

        JButton activeVerbBtn = new RenderedButton("������� ������� �������");
        JButton activeAllVerbBtn = new RenderedButton("�� ���������");
        JButton passiveVerbBtn = new RenderedButton("������� ������� �������");
        JButton derivedNamesBtn = new RenderedButton("������� �������");
        JButton gerundBtn = new RenderedButton("�������");

        buttonsPanel.add(activeAllVerbBtn);        
        buttonsPanel.add(activeVerbBtn);
        buttonsPanel.add(passiveVerbBtn);
        buttonsPanel.add(derivedNamesBtn);
        buttonsPanel.add(gerundBtn);

        add(buttonsPanel);

        activeVerbBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActiveVerbSelectionUI verbSelectionUI = (ActiveVerbSelectionUI) ControlPaneContainer.getInstance().openControlPane(ActiveVerbSelectionUI.class.getName());
                verbSelectionUI.setInfo(selectionInfo);
            }
        });
        
        
        activeAllVerbBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActiveAllVerbSelectionUI verbSelectionUI = (ActiveAllVerbSelectionUI) ControlPaneContainer.getInstance().openControlPane(ActiveAllVerbSelectionUI.class.getName());
                verbSelectionUI.setInfo(selectionInfo);
            }
        });        

        passiveVerbBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PassiveVerbSelectionUI verbSelectionUI = (PassiveVerbSelectionUI) ControlPaneContainer.getInstance().openControlPane(PassiveVerbSelectionUI.class.getName());
                verbSelectionUI.setInfo(selectionInfo);
            }
        });

        derivedNamesBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectionInfo.isTrilateral() && !selectionInfo.isAugmented()) {
                    TrilateralUnaugmentedNounsUI nounsUI = (TrilateralUnaugmentedNounsUI) ControlPaneContainer.getInstance().openControlPane(TrilateralUnaugmentedNounsUI.class.getName());
                    nounsUI.setInfo(selectionInfo);
                }
                else {
                    NamesSelectionUI namesSelectionUI = (NamesSelectionUI) ControlPaneContainer.getInstance().openControlPane(NamesSelectionUI.class.getName());
                    namesSelectionUI.setInfo(selectionInfo);
                }
            }
        });

        gerundBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectionInfo.isTrilateral() && !selectionInfo.isAugmented()) {
                    TrilateralUnaugmentedGerundsUI gerundSelectionUI = (TrilateralUnaugmentedGerundsUI) ControlPaneContainer.getInstance().openControlPane(TrilateralUnaugmentedGerundsUI.class.getName());
                    gerundSelectionUI.setInfo(selectionInfo);
                }
                else {
                    GerundSelectionUI gerundSelectionUI = (GerundSelectionUI) ControlPaneContainer.getInstance().openControlPane(GerundSelectionUI.class.getName());
                    gerundSelectionUI.setInfo(selectionInfo);
                }
            }
        });


    }

    public JComponent getComponent() {
        return this;
    }

    public void setInfo(SelectionInfo selectionInfo) {
        this.selectionInfo = selectionInfo;
    }

    private boolean opened = false;
    public void controlPaneOpened() {
        opened = true;
    }


    public void controlPaneClosed() {
        opened = false;
    }

}
