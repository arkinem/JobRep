package com.arkinem.jobrep.components;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.arkinem.jobrep.client.Constants;

/**
 * Reusable Button component with modern look and feel
 * @author Blazej Golinski
 *
 */
public class PrimaryButton extends JButton {
	private static final long serialVersionUID = 8876281546964470715L;
    
	/**
	 * sets initial layout and button label
	 * @param text button label text
	 */
    public PrimaryButton (String text) {
        super(text);
        setBorderPainted(false);
        setFocusPainted(false);

        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(Constants.primaryColor);
        setForeground(Constants.lightFontColor);
        setFont(new Font("Roboto", Font.BOLD, 12));
        setText(text);

        addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                if (getModel().isPressed()) {
                    setBackground(Constants.pressedPrimaryColor);
                } else if (getModel().isRollover()) {
                    setBackground(Constants.rolloverPrimaryColor);
                } else {
                    setBackground(Constants.primaryColor);
                }
            }
        });
    }
    
    /**
     * Set button label font size
     * @param size size in pixels
     */
    public void setFontSize(int size) {
    	 setFont(new Font("Roboto", Font.BOLD, size));
    }
}