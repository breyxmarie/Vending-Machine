
import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.Popup;
import javax.swing.PopupFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miaag
 */
public class Vending_Machine extends javax.swing.JFrame {

    /**
     * Creates new form Vending_Machine
     */
    double moneyamount = 0;
    double totalamount = 0;
    int cokequan = 1;
    int spritequan = 1;
    int royalquan = 1;
    int vcutquan = 1;
    int cheetosquan = 1;
    int patataquan = 1;
    int miloquan = 1;
    int chuckiequan = 1;
    int kopikoquan = 1;
    int pringlesquan = 1;
    int pretzelquan = 1;
    int mangjuanquan = 1;
    int picaquan = 1;
    private Popup popup;

    public Vending_Machine() {
        initComponents();

        ImageIcon cokelabel = new ImageIcon("src/images/coke.png");
        Image img = cokelabel.getImage();
        Image scale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(scale);
        jLabel1.setIcon(scaled);

        ImageIcon spritelabel = new ImageIcon("src/images/sprite.png");
        Image img1 = spritelabel.getImage();
        Image scale1 = img1.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled1 = new ImageIcon(scale1);
        jLabel2.setIcon(scaled1);

        ImageIcon royalabel = new ImageIcon("src/images/royal.png");
        Image img2 = royalabel.getImage();
        Image scale2 = img2.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled2 = new ImageIcon(scale2);
        jLabel3.setIcon(scaled2);

        ImageIcon vcutlabel = new ImageIcon("src/images/vcut.png");
        Image img3 = vcutlabel.getImage();
        Image scale3 = img3.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled3 = new ImageIcon(scale3);
        jLabel4.setIcon(scaled3);

        ImageIcon cheetoslabel = new ImageIcon("src/images/cheetos.png");
        Image img4 = cheetoslabel.getImage();
        Image scale4 = img4.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled4 = new ImageIcon(scale4);
        jLabel6.setIcon(scaled4);

        ImageIcon patatalabel = new ImageIcon("src/images/patata.png");
        Image img5 = patatalabel.getImage();
        Image scale5 = img5.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled5 = new ImageIcon(scale5);
        jLabel9.setIcon(scaled5);

        ImageIcon milolabel = new ImageIcon("src/images/milo.png");
        Image img6 = milolabel.getImage();
        Image scale6 = img6.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled6 = new ImageIcon(scale6);
        jLabel5.setIcon(scaled6);

        ImageIcon chuckielabel = new ImageIcon("src/images/chuckie.png");
        Image img7 = chuckielabel.getImage();
        Image scale7 = img7.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled7 = new ImageIcon(scale7);
        jLabel7.setIcon(scaled7);

        ImageIcon kopikolabel = new ImageIcon("src/images/kopiko.png");
        Image img8 = kopikolabel.getImage();
        Image scale8 = img8.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled8 = new ImageIcon(scale8);
        jLabel8.setIcon(scaled8);

        ImageIcon pretzellabel = new ImageIcon("src/images/pretzel.png");
        Image img9 = pretzellabel.getImage();
        Image scale9 = img9.getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled9 = new ImageIcon(scale9);
        jLabel18.setIcon(scaled9);

        ImageIcon mangjuanlabel = new ImageIcon("src/images/mang juan.png");
        Image img10 = mangjuanlabel.getImage();
        Image scale10 = img10.getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled10 = new ImageIcon(scale10);
        jLabel17.setIcon(scaled10);

        ImageIcon picalabel = new ImageIcon("src/images/pica.png");
        Image img11 = picalabel.getImage();
        Image scale11 = img11.getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled11 = new ImageIcon(scale11);
        jLabel16.setIcon(scaled11);

        ImageIcon twentylabel = new ImageIcon("src/images/20.png");
        Image img12 = twentylabel.getImage();
        Image scale12 = img12.getScaledInstance(coin20.getWidth(), coin20.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled12 = new ImageIcon(scale12);
        coin20.setIcon(scaled12);

        ImageIcon tenlabel = new ImageIcon("src/images/10.png");
        Image img13 = tenlabel.getImage();
        Image scale13 = img13.getScaledInstance(coin10.getWidth(), coin10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled13 = new ImageIcon(scale13);
        coin10.setIcon(scaled13);

        ImageIcon fivelabel = new ImageIcon("src/images/5.png");
        Image img14 = fivelabel.getImage();
        Image scale14 = img14.getScaledInstance(coin5.getWidth(), coin5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled14 = new ImageIcon(scale14);
        coin5.setIcon(scaled14);

        ImageIcon onelabel = new ImageIcon("src/images/1.png");
        Image img15 = onelabel.getImage();
        Image scale15 = img15.getScaledInstance(coin1.getWidth(), coin1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled15 = new ImageIcon(scale15);
        coin1.setIcon(scaled15);

        ImageIcon twentyfivelabel = new ImageIcon("src/images/25.png");
        Image img16 = twentyfivelabel.getImage();
        Image scale16 = img16.getScaledInstance(coinquarter.getWidth(), coinquarter.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled16 = new ImageIcon(scale16);
        coinquarter.setIcon(scaled16);

        ImageIcon thousandlabel = new ImageIcon("src/images/1000.jpg");
        Image img17 = thousandlabel.getImage();
        Image scale17 = img17.getScaledInstance(bill1000.getWidth(), bill1000.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled17 = new ImageIcon(scale17);
        bill1000.setIcon(scaled17);

        ImageIcon bill500label = new ImageIcon("src/images/500.jpg");
        Image img18 = bill500label.getImage();
        Image scale18 = img18.getScaledInstance(bill500.getWidth(), bill500.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled18 = new ImageIcon(scale18);
        bill500.setIcon(scaled18);

        ImageIcon bill200label = new ImageIcon("src/images/200.jpg");
        Image img19 = bill200label.getImage();
        Image scale19 = img19.getScaledInstance(bill200.getWidth(), bill200.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled19 = new ImageIcon(scale19);
        bill200.setIcon(scaled19);

        ImageIcon bill100label = new ImageIcon("src/images/100.jpg");
        Image img20 = bill100label.getImage();
        Image scale20 = img20.getScaledInstance(bill100.getWidth(), bill100.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled20 = new ImageIcon(scale20);
        bill100.setIcon(scaled20);

        ImageIcon bill50label = new ImageIcon("src/images/50.jpg");
        Image img21 = bill50label.getImage();
        Image scale21 = img21.getScaledInstance(bill50.getWidth(), bill50.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled21 = new ImageIcon(scale21);
        bill50.setIcon(scaled21);

        // jLabel1.setIcon(i);
        // jLabel2.setIcon(new ImageIcon ("src/images/coke.png"));
        billspanel.setVisible(false);
        coinspanel.setVisible(false);
        jPanel12.setVisible(false);

        coin20.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 20;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        coin10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 10;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        coin5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 5;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        coin1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 1;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        coinquarter.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += .25;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        bill1000.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 1000;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        bill500.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 500;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        bill200.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 200;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        bill100.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 100;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        bill50.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                moneyamount += 50;
                txtfieldamount.setText(Double.toString(moneyamount));
            }
        });

        vend.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {
                double amountpaid = moneyamount - totalamount;

                if (amountpaid >= 0 && !"".equals(receipt.getText())) {
                    JOptionPane.showMessageDialog(null,
                            "Thank You For Vending With Us! \n Please check below for any change and Don't Forget your Orders");
                    changetxtfld.setText("Php " + amountpaid);

                    txtfieldamount.setText("0");
                    String or = receipt.getText();
                    orderscomplete.setText("Orders:  \n" + or);
                    receipt.setText("");
                    cokecb.setSelected(false);
                    cokequanfield.setText("");
                    spritecb.setSelected(false);
                    spritequanfld.setText("");
                    royalcb.setSelected(false);
                    royalquanfld.setText("");
                    cheetoscb.setSelected(false);
                    cheetosquanfld.setText("");
                    vcutcb.setSelected(false);
                    vcutquanfld.setText("");
                    patatacb.setSelected(false);
                    patataquanfld.setText("");
                    milocb.setSelected(false);
                    miloquanfld.setText("");
                    kopikocb.setSelected(false);
                    kopikoquanfld.setText("");
                    chuckiecb.setSelected(false);
                    chuckiequanfld.setText("");
                    picacb.setSelected(false);
                    picaquanfld.setText("");
                    pretzelcb.setSelected(false);
                    pretzelquanfld.setText("");
                    mangjuancb.setSelected(false);
                    mangjuanquanfld.setText("");

                    moneyamount = 0;
                    totalamount = 0;
                    cokequan = 1;
                    spritequan = 1;
                    royalquan = 1;
                    vcutquan = 1;
                    cheetosquan = 1;
                    patataquan = 1;
                    miloquan = 1;
                    chuckiequan = 1;
                    kopikoquan = 1;
                    pringlesquan = 1;
                    pretzelquan = 1;
                    mangjuanquan = 1;
                    picaquan = 1;
                    totallbl.setText("0");
                    jLabel12.setText("Thank You for Vending With Us!");

                } else if (amountpaid < 0) {
                    JOptionPane.showMessageDialog(null, "Insufficient Funds");
                } else {
                    JOptionPane.showMessageDialog(null, "Nothing to Vend");
                }
            }
        });

        Frame frame = new Frame("Example Frame");

// Create a component to add to the frame; in this case a text area with sample text
        Component textArea = new TextArea("Move mouse here to see mouse motion info...");

        final JPopupMenu pop = new JPopupMenu();
        pop.add(new JMenuItem("Coke"));
        pop.add(new JMenuItem("PHP 22"));
        pop.add(new JMenuItem("Paste"));
        pop.setInvoker(this);

        jLabel1.addMouseMotionListener(new MouseMotionAdapter() {

            // public void mouseExited(MouseEvent evt) {
            // popup.hide();
            // }
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("    Coke Php 22.0");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();

                // Process current position of cursor while all mouse buttons are up.
                if (evt.isPopupTrigger()) {
                    showPopup(evt);
                }

            }

            @Override
            public void mouseDragged(MouseEvent evt) {

                if (evt.isPopupTrigger()) {
                    showPopup(evt);
                }
                // Process current position of cursor while mouse button is pressed.

                // if (popup != null) {
                // popup.hide();
                // }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                // popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text,
                // evt.getXOnScreen(), evt.getYOnScreen());
                // popup.show();
            }

            private void showPopup(MouseEvent me) {
                pop.show(me.getComponent(), me.getX(), me.getY());
            }

        });

        jLabel1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent evt) {
                if (popup != null) {
                    // popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                // JLabel text = new JLabel(" Coke Php 22");
                // popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text,
                // evt.getXOnScreen(), evt.getYOnScreen());
                // popup.show();

            }

            @Override
            public void mouseExited(MouseEvent evt) {
                // jLabel1.getMouseMotionListeners().mouseMoved(evt);
                // popup.hide();
            }
        });

        jLabel2.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Sprite Php 20.0");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel3.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Royal Php 21.0");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel5.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Milo Php 35.25");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel7.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Chuckie Php 35.25");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel8.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Kopiko Php 20.25");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel6.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Cheetos Php 40.25");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel18.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Pretzel Php 23.5");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel9.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Patata Php 25.75");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel17.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Mang Juan Php 15.75");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel4.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Vcut Php 30.0");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });

        jLabel16.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {

                if (popup != null) {
                    popup.hide();
                }
                // JLabel text = new JLabel("You've clicked at: " + evt.getPoint());
                JLabel text = new JLabel("   Pic-A Php 45.75");
                popup = PopupFactory.getSharedInstance().getPopup(evt.getComponent(), text, evt.getXOnScreen(),
                        evt.getYOnScreen());
                popup.show();
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel4 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		cokecb = new javax.swing.JCheckBox();
		cokequanfield = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		spritecb = new javax.swing.JCheckBox();
		spritequanfld = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		royalcb = new javax.swing.JCheckBox();
		royalquanfld = new javax.swing.JTextField();
		jPanel6 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		milocb = new javax.swing.JCheckBox();
		miloquanfld = new javax.swing.JTextField();
		jPanel7 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		cheetoscb = new javax.swing.JCheckBox();
		cheetosquanfld = new javax.swing.JTextField();
		jPanel8 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		chuckiecb = new javax.swing.JCheckBox();
		chuckiequanfld = new javax.swing.JTextField();
		jPanel9 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		kopikocb = new javax.swing.JCheckBox();
		kopikoquanfld = new javax.swing.JTextField();
		jPanel16 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		pretzelcb = new javax.swing.JCheckBox();
		pretzelquanfld = new javax.swing.JTextField();
		jPanel10 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		patatacb = new javax.swing.JCheckBox();
		patataquanfld = new javax.swing.JTextField();
		jPanel15 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		mangjuancb = new javax.swing.JCheckBox();
		mangjuanquanfld = new javax.swing.JTextField();
		jPanel5 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		vcutcb = new javax.swing.JCheckBox();
		vcutquanfld = new javax.swing.JTextField();
		jPanel13 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		picacb = new javax.swing.JCheckBox();
		picaquanfld = new javax.swing.JTextField();
		jPanel17 = new javax.swing.JPanel();
		jPanel14 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		changetxtfld = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		orderscomplete = new javax.swing.JTextArea();
		jPanel11 = new javax.swing.JPanel();
		txtfieldamount = new javax.swing.JTextField();
		receipttxtarea = new javax.swing.JScrollPane();
		receipt = new javax.swing.JTextArea();
		insertmoney = new javax.swing.JComboBox<>();
		jLabel14 = new javax.swing.JLabel();
		coinspanel = new javax.swing.JPanel();
		coin20 = new javax.swing.JButton();
		coin10 = new javax.swing.JButton();
		coin1 = new javax.swing.JButton();
		coin5 = new javax.swing.JButton();
		coinquarter = new javax.swing.JButton();
		billspanel = new javax.swing.JPanel();
		bill1000 = new javax.swing.JButton();
		bill500 = new javax.swing.JButton();
		bill100 = new javax.swing.JButton();
		bill200 = new javax.swing.JButton();
		bill50 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jPanel12 = new javax.swing.JPanel();
		totallbl = new javax.swing.JLabel();
		vend = new javax.swing.JButton();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 102, 102));

		jPanel4.setBackground(new java.awt.Color(204, 225, 248));
		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel1.setBackground(new java.awt.Color(204, 225, 248));

		jLabel1.setText("    ");
		jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel1MouseExited(evt);
			}
		});

		cokecb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		cokequanfield.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				cokequanfieldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(cokecb)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(cokequanfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(26, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cokecb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(cokequanfield, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel2.setBackground(new java.awt.Color(204, 225, 248));

		jLabel2.setText("   ");

		spritecb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		spritequanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				spritequanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(spritecb)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(spritequanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 21, Short.MAX_VALUE))
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel2,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(spritecb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(spritequanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel3.setBackground(new java.awt.Color(204, 225, 248));

		jLabel3.setText("   ");

		royalcb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		royalquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				royalquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(royalcb)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(royalquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addContainerGap(24, Short.MAX_VALUE).addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(16, 16, 16)
						.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(royalcb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(royalquanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel6.setBackground(new java.awt.Color(204, 225, 248));

		jLabel5.setText("    ");

		milocb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		miloquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				miloquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(milocb)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(miloquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel6Layout.createSequentialGroup().addContainerGap(22, Short.MAX_VALUE).addComponent(jLabel5,
								javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(14, 14, 14)
						.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(milocb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(miloquanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel7.setBackground(new java.awt.Color(204, 225, 248));

		jLabel6.setText("   ");

		cheetoscb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		cheetosquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				cheetosquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel7Layout.createSequentialGroup().addComponent(cheetoscb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cheetosquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 4, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cheetoscb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(cheetosquanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel8.setBackground(new java.awt.Color(204, 225, 248));

		jLabel7.setText("   ");

		chuckiecb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		chuckiequanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				chuckiequanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel8Layout.createSequentialGroup().addComponent(chuckiecb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(chuckiequanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 31, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addGap(14, 14, 14)
						.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(chuckiecb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(chuckiequanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel9.setBackground(new java.awt.Color(204, 225, 248));

		jLabel8.setText("    ");

		kopikocb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		kopikoquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				kopikoquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(kopikocb)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(kopikoquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 22, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
						.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(kopikocb).addComponent(kopikoquanfld,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel16.setBackground(new java.awt.Color(204, 225, 248));

		jLabel18.setText("   ");

		pretzelcb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		pretzelquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				pretzelquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
		jPanel16.setLayout(jPanel16Layout);
		jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel16Layout.createSequentialGroup().addContainerGap().addGroup(jPanel16Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel16Layout.createSequentialGroup()
								.addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(
								jPanel16Layout.createSequentialGroup().addComponent(pretzelcb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(pretzelquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 36, Short.MAX_VALUE)))));
		jPanel16Layout.setVerticalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel16Layout.createSequentialGroup().addContainerGap(22, Short.MAX_VALUE)
						.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(pretzelcb).addComponent(pretzelquanfld,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel10.setBackground(new java.awt.Color(204, 225, 248));
		jPanel10.setPreferredSize(new java.awt.Dimension(85, 168));

		jLabel9.setText("   ");

		patatacb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		patataquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				patataquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel10Layout.createSequentialGroup().addComponent(patatacb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(patataquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(39, Short.MAX_VALUE)))));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(patatacb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(patataquanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel15.setBackground(new java.awt.Color(204, 225, 248));

		jLabel17.setText("   ");

		mangjuancb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		mangjuanquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				mangjuanquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel15Layout.createSequentialGroup().addComponent(mangjuancb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(mangjuanquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 29, Short.MAX_VALUE))
								.addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))));
		jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(30, 30, 30)
						.addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(mangjuancb).addComponent(mangjuanquanfld,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel5.setBackground(new java.awt.Color(204, 225, 248));

		jLabel4.setText("   ");

		vcutcb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		vcutquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				vcutquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel5Layout.createSequentialGroup().addComponent(vcutcb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(vcutquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 26, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(vcutcb, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(vcutquanfld, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel13.setBackground(new java.awt.Color(204, 225, 248));

		jLabel16.setText("  ");

		picacb.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cokecbItemStateChanged(evt);
			}
		});

		picaquanfld.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				picaquanfldKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel13Layout.createSequentialGroup().addComponent(picacb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(picaquanfld, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 21, Short.MAX_VALUE))
								.addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))));
		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(picacb).addComponent(picaquanfld, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(30, 30, 30)
								.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 13, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createSequentialGroup().addGap(153, 153, 153)
												.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
												.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(17, 17, 17)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel4Layout.createSequentialGroup().addGap(6, 6, 6)
														.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(18, 18, 18).addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel4Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel4Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 156,
												Short.MAX_VALUE)
										.addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap(39, Short.MAX_VALUE)));

		jPanel17.setBackground(new java.awt.Color(254, 236, 231));
		jPanel17.setForeground(new java.awt.Color(255, 102, 102));

		jPanel14.setBackground(new java.awt.Color(254, 224, 215));
		jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel12.setText("   ");

		jLabel13.setText("Change:");

		changetxtfld.setEditable(false);
		changetxtfld.setText("Php");

		orderscomplete.setEditable(false);
		orderscomplete.setColumns(20);
		orderscomplete.setRows(5);
		jScrollPane1.setViewportView(orderscomplete);

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel14Layout.createSequentialGroup().addGap(40, 40, 40)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(113, 113, 113)
								.addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(changetxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel14Layout.createSequentialGroup().addComponent(jLabel13).addGap(28,
														28, 28))))
						.addGroup(jPanel14Layout.createSequentialGroup().addGap(76, 76, 76).addComponent(jLabel12)))
						.addContainerGap(106, Short.MAX_VALUE)));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel12)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(jPanel14Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(changetxtfld, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel11.setBackground(new java.awt.Color(238, 66, 66));

		txtfieldamount.setEditable(false);
		txtfieldamount.setText("0.00");

		receipt.setEditable(false);
		receipt.setColumns(20);
		receipt.setRows(5);
		receipttxtarea.setViewportView(receipt);

		insertmoney.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Input Money Here", "Bills", "Coins" }));
		insertmoney.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				insertmoneyItemStateChanged(evt);
			}
		});

		jLabel14.setText("Orders:");

		coin1.setText("   ");

		coin5.setText("  ");

		coinquarter.setText("    ");

		javax.swing.GroupLayout coinspanelLayout = new javax.swing.GroupLayout(coinspanel);
		coinspanel.setLayout(coinspanelLayout);
		coinspanelLayout.setHorizontalGroup(coinspanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(coinspanelLayout.createSequentialGroup().addGroup(coinspanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(coinspanelLayout.createSequentialGroup().addGap(31, 31, 31)
								.addComponent(coin5, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(coin1, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(coinspanelLayout.createSequentialGroup().addGap(81, 81, 81).addComponent(coinquarter,
								javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(coinspanelLayout.createSequentialGroup().addGap(34, 34, 34)
								.addComponent(coin20, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(coin10, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(23, Short.MAX_VALUE)));
		coinspanelLayout.setVerticalGroup(coinspanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(coinspanelLayout.createSequentialGroup().addGap(31, 31, 31)
						.addGroup(coinspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(coin10, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
								.addComponent(coin20, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(coinspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(coin1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
								.addComponent(coin5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(coinquarter,
								javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE)));

		bill1000.setText("  ");

		bill500.setText("  ");

		bill200.setText("  ");

		bill50.setText("   ");

		javax.swing.GroupLayout billspanelLayout = new javax.swing.GroupLayout(billspanel);
		billspanel.setLayout(billspanelLayout);
		billspanelLayout.setHorizontalGroup(billspanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(billspanelLayout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(billspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(bill200, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(bill50, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
								.addComponent(bill100, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(bill1000, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(bill500, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(43, Short.MAX_VALUE)));
		billspanelLayout
				.setVerticalGroup(billspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(billspanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(bill1000, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bill500, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bill100, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bill50, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bill200, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel15.setText("Amount");

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 55, Short.MAX_VALUE));

		totallbl.setText("0.00");

		vend.setText("Vend");
		vend.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				vendKeyPressed(evt);
			}
		});

		jLabel19.setText("Total: Php");

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(receipttxtarea)
				.addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
						.addGap(0, 37, Short.MAX_VALUE)
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(billspanel, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(coinspanel, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28))
				.addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel11Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(jLabel14))
						.addGroup(jPanel11Layout.createSequentialGroup().addGap(40, 40, 40)
								.addComponent(insertmoney, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(vend))
						.addGroup(jPanel11Layout.createSequentialGroup().addGap(75, 75, 75)
								.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtfieldamount, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel11Layout.createSequentialGroup().addGap(39, 39, 39)
												.addComponent(jLabel15))))
						.addGroup(jPanel11Layout.createSequentialGroup().addGap(64, 64, 64).addComponent(jLabel19)
								.addGap(33, 33, 33).addComponent(totallbl)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
						.addContainerGap().addComponent(jLabel14).addGap(13, 13, 13)
						.addComponent(receipttxtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(totallbl).addComponent(jLabel19))
						.addGap(15, 15, 15).addComponent(jLabel15)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtfieldamount, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(insertmoney, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(vend))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(coinspanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(billspanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46)
						.addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
		jLabel20.setText("VENDING MACHINE");

		javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel17Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26, 26, 26))
				.addGroup(jPanel17Layout.createSequentialGroup().addGap(177, 177, 177).addComponent(jLabel20)
						.addContainerGap(212, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel17Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(86, 86, 86)));
		jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel20)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 734,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(1495, 1495, 1495)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(66, 66, 66).addComponent(jPanel4,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(71, 71, 71).addComponent(jPanel4,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1008,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

    private void insertmoneyItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_insertmoneyItemStateChanged
        // TODO add your handling code here:
        if (insertmoney.getSelectedIndex() == 0) {
            billspanel.setVisible(false);
            coinspanel.setVisible(false);

        }
        if (insertmoney.getSelectedIndex() == 1) {
            billspanel.setVisible(true);
            coinspanel.setVisible(false);

        }
        if (insertmoney.getSelectedIndex() == 2) {
            coinspanel.setVisible(true);
            billspanel.setVisible(false);

        }
    }// GEN-LAST:event_insertmoneyItemStateChanged

    private void cokecbItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cokecbItemStateChanged
        // TODO add your handling code here:

        if (evt.getSource() == cokecb) {
            cokequan = 1;
            String checkcokequan = cokequanfield.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    cokequan = Integer.parseInt(cokequanfield.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                cokequan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Coke   x " + cokequan + "\n");

            } else {
                String tempres = "Coke   x " + cokequan;
                String tobereplace = receipt.getText();
                // System.out.println(tobereplace);
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // tobereplace = tobereplace.replaceAll(tempres, " ");
                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }

        }

        ////// SPRITE
        if (evt.getSource() == spritecb) {
            spritequan = 1;
            String checkcokequan = spritequanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    spritequan = Integer.parseInt(spritequanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                spritequan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 20 * spritequan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Sprite   x " + spritequan + "\n");
            } else {
                String tempres = "Sprite   x " + spritequan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 20 * spritequan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        ///// ROYAL
        if (evt.getSource() == royalcb) {
            royalquan = 1;
            String checkcokequan = royalquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    royalquan = Integer.parseInt(royalquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                royalquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 21 * royalquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Royal   x " + royalquan + "\n");
            } else {
                String tempres = "Royal   x " + royalquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 21 * royalquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        /////// vcut
        if (evt.getSource() == vcutcb) {
            vcutquan = 1;
            String checkcokequan = vcutquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    vcutquan = Integer.parseInt(vcutquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                vcutquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 30 * vcutquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Vcut   x " + vcutquan + "\n");
            } else {
                String tempres = "Vcut   x " + vcutquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 30 * vcutquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // CHEETOS
        if (evt.getSource() == cheetoscb) {
            cheetosquan = 1;
            String checkcokequan = cheetosquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    cheetosquan = Integer.parseInt(cheetosquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                cheetosquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 40.50 * vcutquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Cheetos   x " + cheetosquan + "\n");
            } else {
                String tempres = "Cheetos   x " + cheetosquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 40.5 * cheetosquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // MILO
        if (evt.getSource() == milocb) {
            miloquan = 1;
            String checkcokequan = miloquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    miloquan = Integer.parseInt(miloquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                miloquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 30.25 * miloquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Milo   x " + miloquan + "\n");
            } else {
                String tempres = "Milo   x " + miloquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 30.25 * miloquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // PATATA
        if (evt.getSource() == patatacb) {
            patataquan = 1;
            String checkcokequan = patataquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    patataquan = Integer.parseInt(patataquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                patataquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 25.75 * patataquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Patata   x " + patataquan + "\n");
            } else {
                String tempres = "Patata   x " + patataquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 25.75 * patataquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // CHUCKIE
        if (evt.getSource() == chuckiecb) {
            chuckiequan = 1;
            String checkcokequan = chuckiequanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    chuckiequan = Integer.parseInt(chuckiequanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                chuckiequan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 35.25 * chuckiequan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Chuckie   x " + chuckiequan + "\n");
            } else {
                String tempres = "Chuckie   x " + chuckiequan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 35.25 * chuckiequan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        /// KOPIKO
        if (evt.getSource() == pretzelcb) {
            pretzelquan = 1;
            String checkcokequan = pretzelquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    pretzelquan = Integer.parseInt(pretzelquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                pretzelquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 23.5 * pretzelquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Pretzel   x " + pretzelquan + "\n");
            } else {
                String tempres = "Pretzel   x " + pretzelquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 23.5 * pretzelquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // KOPIKO
        if (evt.getSource() == kopikocb) {
            kopikoquan = 1;
            String checkcokequan = kopikoquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    kopikoquan = Integer.parseInt(kopikoquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                kopikoquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 20.25 * kopikoquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Kopiko   x " + kopikoquan + "\n");
            } else {
                String tempres = "Kopiko   x " + kopikoquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 20.25 * kopikoquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // MANGJUAN
        if (evt.getSource() == mangjuancb) {
            mangjuanquan = 1;
            String checkcokequan = mangjuanquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    mangjuanquan = Integer.parseInt(mangjuanquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                mangjuanquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 15.25 * mangjuanquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Mang Juan   x " + mangjuanquan + "\n");
            } else {
                String tempres = "Mang Juan   x " + mangjuanquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 15.25 * mangjuanquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }

        // PIC A
        if (evt.getSource() == picacb) {
            picaquan = 1;
            String checkcokequan = picaquanfld.getText();

            if (!"".equals(checkcokequan)) {
                try {
                    picaquan = Integer.parseInt(picaquanfld.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please Input a Number");
                }
            } else {
                picaquan = 1;
            }
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                totalamount += 45.75 * picaquan;
                totallbl.setText(Double.toString(totalamount));

                receipt.append("Pic-A   x " + picaquan + "\n");
            } else {
                String tempres = "Pic-A   x " + picaquan;
                String tobereplace = receipt.getText();
                int start = receipt.getText().indexOf(tempres);
                int endIndex = tempres.length();
                System.out.println(start);
                totalamount -= 45.75 * picaquan;
                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, "\r");
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);

            }
        }
    }// GEN-LAST:event_cokecbItemStateChanged

    private void cokequanfieldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_cokequanfieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (cokecb.isSelected() == true) {

                String tempres = "Coke   x " + cokequan;
                String tobereplace = receipt.getText();

                totalamount -= 22 * cokequan;
                cokequan = 1;
                String checkcokequan = cokequanfield.getText();

                if (!"".equals(checkcokequan)) {
                    try {
                        cokequan = Integer.parseInt(cokequanfield.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Coke   x " + cokequan;

                totallbl.setText(Double.toString(totalamount));

                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");

                receipt.setText(r);
                totalamount += 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

            }
        }
    }// GEN-LAST:event_cokequanfieldKeyPressed

    private void spritequanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_spritequanfldKeyPressed
        // TODO add your handling code here:

        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (spritecb.isSelected() == true) {
                String tempres = "Sprite   x " + spritequan;

                String tobereplace = receipt.getText();
                totalamount -= 20 * spritequan;
                spritequan = 1;
                String checkspritequan = spritequanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        spritequan = Integer.parseInt(spritequanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Sprite   x " + spritequan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 20 * spritequan;
                totallbl.setText(Double.toString(totalamount));

            }
        }
    }// GEN-LAST:event_spritequanfldKeyPressed

    private void royalquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_royalquanfldKeyPressed
        // TODO add your handling code here:

        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (royalcb.isSelected() == true) {
                String tempres = "Royal   x " + royalquan;

                String tobereplace = receipt.getText();
                totalamount -= 21 * royalquan;
                royalquan = 1;
                String checkspritequan = royalquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        royalquan = Integer.parseInt(royalquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Royal   x " + royalquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 21 * royalquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_royalquanfldKeyPressed

    private void vcutquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_vcutquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (vcutcb.isSelected() == true) {
                String tempres = "Vcut   x " + vcutquan;

                String tobereplace = receipt.getText();
                totalamount -= 30 * vcutquan;
                vcutquan = 1;
                String checkspritequan = vcutquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        vcutquan = Integer.parseInt(vcutquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Vcut   x " + vcutquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 30 * vcutquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_vcutquanfldKeyPressed

    private void cheetosquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_cheetosquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (cheetoscb.isSelected() == true) {
                String tempres = "Cheetos   x " + cheetosquan;

                String tobereplace = receipt.getText();
                totalamount -= 40.5 * cheetosquan;
                vcutquan = 1;
                String checkspritequan = cheetosquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        cheetosquan = Integer.parseInt(cheetosquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Cheetos   x " + cheetosquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 40.5 * cheetosquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_cheetosquanfldKeyPressed

    private void patataquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_patataquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (patatacb.isSelected() == true) {
                String tempres = "Patata   x " + patataquan;

                String tobereplace = receipt.getText();
                totalamount -= 25.75 * patataquan;
                patataquan = 1;
                String checkspritequan = patataquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        patataquan = Integer.parseInt(patataquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Patata   x " + patataquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 25.75 * patataquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_patataquanfldKeyPressed

    private void miloquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_miloquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (milocb.isSelected() == true) {
                String tempres = "Milo   x " + miloquan;

                String tobereplace = receipt.getText();
                totalamount -= 30.25 * miloquan;
                miloquan = 1;
                String checkspritequan = miloquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        miloquan = Integer.parseInt(miloquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Milo   x " + miloquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 30.25 * miloquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }

    }// GEN-LAST:event_miloquanfldKeyPressed

    private void chuckiequanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_chuckiequanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (chuckiecb.isSelected() == true) {
                String tempres = "Chuckie   x " + chuckiequan;

                String tobereplace = receipt.getText();
                totalamount -= 35.25 * chuckiequan;
                chuckiequan = 1;
                String checkspritequan = chuckiequanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        chuckiequan = Integer.parseInt(chuckiequanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Chuckie   x " + chuckiequan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 35.25 * chuckiequan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_chuckiequanfldKeyPressed

    private void kopikoquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_kopikoquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (kopikocb.isSelected() == true) {
                String tempres = "Kopiko   x " + kopikoquan;

                String tobereplace = receipt.getText();
                totalamount -= 20.25 * kopikoquan;
                kopikoquan = 1;
                String checkspritequan = kopikoquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        kopikoquan = Integer.parseInt(kopikoquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Kopiko   x " + kopikoquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 20.25 * kopikoquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_kopikoquanfldKeyPressed

    private void pretzelquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_pretzelquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (pretzelcb.isSelected() == true) {
                String tempres = "Pretzel   x " + pretzelquan;

                String tobereplace = receipt.getText();
                totalamount -= 23.5 * pretzelquan;
                pretzelquan = 1;
                String checkspritequan = pretzelquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        pretzelquan = Integer.parseInt(pretzelquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Pretzel   x " + pretzelquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 23.5 * pretzelquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_pretzelquanfldKeyPressed

    private void mangjuanquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_mangjuanquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (mangjuancb.isSelected() == true) {
                String tempres = "Mang Juan   x " + mangjuanquan;

                String tobereplace = receipt.getText();
                totalamount -= 15.25 * mangjuanquan;
                mangjuanquan = 1;
                String checkspritequan = mangjuanquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        mangjuanquan = Integer.parseInt(mangjuanquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Mang Juan   x " + mangjuanquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 15.25 * mangjuanquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_mangjuanquanfldKeyPressed

    private void picaquanfldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_picaquanfldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            if (picacb.isSelected() == true) {
                String tempres = "Pic-A   x " + picaquan;

                String tobereplace = receipt.getText();
                totalamount -= 45.75 * picaquan;
                picaquan = 1;
                String checkspritequan = picaquanfld.getText();

                if (!"".equals(checkspritequan)) {
                    try {
                        picaquan = Integer.parseInt(picaquanfld.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please Input a Number");
                    }
                }
                String newres = "Pic-A   x " + picaquan;

                // System.out.println(start);
                // totalamount -= 22 * cokequan;
                totallbl.setText(Double.toString(totalamount));

                // receipt.replaceSelection(newres);
                // receipt.setText(tempres.replace(tempres,newres));
                String r;
                r = tobereplace.replaceAll(tempres, newres);
                r = r.replace(System.getProperty("line.separator"), "");
                receipt.setText(r);
                totalamount += 45.75 * picaquan;
                totallbl.setText(Double.toString(totalamount));
            }
        }
    }// GEN-LAST:event_picaquanfldKeyPressed

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        // popup.hide();
    }// GEN-LAST:event_jLabel1MouseExited

    private void vendKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_vendKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_vendKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vending_Machine().setVisible(true);
            }
        });
    }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton bill100;
	private javax.swing.JButton bill1000;
	private javax.swing.JButton bill200;
	private javax.swing.JButton bill50;
	private javax.swing.JButton bill500;
	private javax.swing.JPanel billspanel;
	private javax.swing.JTextField changetxtfld;
	private javax.swing.JCheckBox cheetoscb;
	private javax.swing.JTextField cheetosquanfld;
	private javax.swing.JCheckBox chuckiecb;
	private javax.swing.JTextField chuckiequanfld;
	private javax.swing.JButton coin1;
	private javax.swing.JButton coin10;
	private javax.swing.JButton coin20;
	private javax.swing.JButton coin5;
	private javax.swing.JButton coinquarter;
	private javax.swing.JPanel coinspanel;
	private javax.swing.JCheckBox cokecb;
	private javax.swing.JTextField cokequanfield;
	private javax.swing.JComboBox<String> insertmoney;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel16;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JCheckBox kopikocb;
	private javax.swing.JTextField kopikoquanfld;
	private javax.swing.JCheckBox mangjuancb;
	private javax.swing.JTextField mangjuanquanfld;
	private javax.swing.JCheckBox milocb;
	private javax.swing.JTextField miloquanfld;
	private javax.swing.JTextArea orderscomplete;
	private javax.swing.JCheckBox patatacb;
	private javax.swing.JTextField patataquanfld;
	private javax.swing.JCheckBox picacb;
	private javax.swing.JTextField picaquanfld;
	private javax.swing.JCheckBox pretzelcb;
	private javax.swing.JTextField pretzelquanfld;
	private javax.swing.JTextArea receipt;
	private javax.swing.JScrollPane receipttxtarea;
	private javax.swing.JCheckBox royalcb;
	private javax.swing.JTextField royalquanfld;
	private javax.swing.JCheckBox spritecb;
	private javax.swing.JTextField spritequanfld;
	private javax.swing.JLabel totallbl;
	private javax.swing.JTextField txtfieldamount;
	private javax.swing.JCheckBox vcutcb;
	private javax.swing.JTextField vcutquanfld;
	private javax.swing.JButton vend;
	// End of variables declaration//GEN-END:variables
}
