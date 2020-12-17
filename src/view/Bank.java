package view;

import controller.Banker;

public class Bank extends javax.swing.JFrame {

	// Variables declaration - do not modify                     
    private javax.swing.JPanel Background;
    private javax.swing.JLabel investPrecentTickLbl;
    private javax.swing.JPanel accountInfoPnl;
    private javax.swing.JLabel accountNumLbl;
    private javax.swing.JLabel accountPnlLbl;
    private javax.swing.JLabel checkPnlLbl;
    private javax.swing.JPanel checkingPnl;
    private javax.swing.JLabel checkingValue;
    private javax.swing.JLabel creditsLbl;
    private javax.swing.JPanel cryptoPnl;
    private javax.swing.JLabel cryptoPnlLbl;
    private javax.swing.JLabel cryptoPrecentTickLbl;
    private javax.swing.JLabel cryptoValue;
    private javax.swing.JPanel investmentPnl;
    private javax.swing.JLabel investmentValue;
    private javax.swing.JLabel investmentsPnlLbl;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel routingNumLbl;
    private javax.swing.JPanel savingPnl;
    private javax.swing.JLabel savingValue;
    private javax.swing.JLabel savingsPnlLbl;
    private javax.swing.JToggleButton showToggleBtn;
    private javax.swing.JPanel suggestionPnl;
    private javax.swing.JLabel suggestionPnlLbl;
    private javax.swing.JLabel suggestionValue;
    private javax.swing.JLabel titleLbl;
    
    private Banker banker = new Banker();
	
    public Bank(String user) {
    	banker.setAccountNum();
		banker.setRoutingNum();
		banker.setTimeMarker();
		banker.setUser(user);
        initComponents();
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        Background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        suggestionPnl = new javax.swing.JPanel();
        suggestionPnlLbl = new javax.swing.JLabel();
        suggestionValue = new javax.swing.JLabel();
        checkingPnl = new javax.swing.JPanel();
        checkPnlLbl = new javax.swing.JLabel();
        checkingValue = new javax.swing.JLabel();
        savingPnl = new javax.swing.JPanel();
        savingsPnlLbl = new javax.swing.JLabel();
        savingValue = new javax.swing.JLabel();
        investmentPnl = new javax.swing.JPanel();
        investmentsPnlLbl = new javax.swing.JLabel();
        investmentValue = new javax.swing.JLabel();
        investPrecentTickLbl = new javax.swing.JLabel();
        cryptoPnl = new javax.swing.JPanel();
        cryptoPnlLbl = new javax.swing.JLabel();
        cryptoValue = new javax.swing.JLabel();
        cryptoPrecentTickLbl = new javax.swing.JLabel();
        accountInfoPnl = new javax.swing.JPanel();
        accountPnlLbl = new javax.swing.JLabel();
        accountNumLbl = new javax.swing.JLabel();
        routingNumLbl = new javax.swing.JLabel();
        showToggleBtn = new javax.swing.JToggleButton();
        creditsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(banker.getUser() + "'s Account");
        setBackground(new java.awt.Color(28, 119, 195));
        setResizable(false);

        Background.setBackground(new java.awt.Color(55, 50, 61));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BackgroundMouseMoved(evt);
            }
        });

        logo.setBackground(new java.awt.Color(242, 242, 247));
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\CFair\\Desktop\\CBU\\Logos\\Logo@0,5x.png")); // NOI18N

        titleLbl.setBackground(new java.awt.Color(242, 242, 247));
        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(196, 175, 222));
        titleLbl.setText("WELCOME TO CODERS BANK UNITED");

        suggestionPnl.setBackground(new java.awt.Color(51, 4, 107));

        suggestionPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suggestionPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        suggestionPnlLbl.setText("Account Suggestions");

        suggestionValue.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        suggestionValue.setForeground(new java.awt.Color(196, 175, 222));
        suggestionValue.setText("<html><p>Hello " + banker.getUser() + " we don't currently have any suggestions for you.</p></html>");
        suggestionValue.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        suggestionValue.setMaximumSize(new java.awt.Dimension(79, 16));
        suggestionValue.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout suggestionPnlLayout = new javax.swing.GroupLayout(suggestionPnl);
        suggestionPnl.setLayout(suggestionPnlLayout);
        suggestionPnlLayout.setHorizontalGroup(
            suggestionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suggestionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suggestionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suggestionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(suggestionPnlLayout.createSequentialGroup()
                        .addComponent(suggestionPnlLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        suggestionPnlLayout.setVerticalGroup(
            suggestionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suggestionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suggestionPnlLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suggestionValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkingPnl.setBackground(new java.awt.Color(51, 4, 107));
        checkingPnl.setForeground(new java.awt.Color(255, 255, 255));
        checkingPnl.setPreferredSize(new java.awt.Dimension(70, 80));

        checkPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        checkPnlLbl.setText("Checking");

        checkingValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        checkingValue.setForeground(new java.awt.Color(196, 175, 222));
        checkingValue.setText(banker.getValue(5000, 5000));

        javax.swing.GroupLayout checkingPnlLayout = new javax.swing.GroupLayout(checkingPnl);
        checkingPnl.setLayout(checkingPnlLayout);
        checkingPnlLayout.setHorizontalGroup(
            checkingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkingPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(checkingPnlLayout.createSequentialGroup()
                        .addComponent(checkPnlLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        checkingPnlLayout.setVerticalGroup(
            checkingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkingPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkPnlLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        savingPnl.setBackground(new java.awt.Color(51, 4, 107));
        savingPnl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        savingPnl.setPreferredSize(new java.awt.Dimension(60, 80));

        savingsPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savingsPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        savingsPnlLbl.setText("Savings");

        savingValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        savingValue.setForeground(new java.awt.Color(196, 175, 222));
        savingValue.setText(banker.getValue(20000, 30000));

        javax.swing.GroupLayout savingPnlLayout = new javax.swing.GroupLayout(savingPnl);
        savingPnl.setLayout(savingPnlLayout);
        savingPnlLayout.setHorizontalGroup(
            savingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savingPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(savingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savingValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(savingPnlLayout.createSequentialGroup()
                        .addComponent(savingsPnlLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        savingPnlLayout.setVerticalGroup(
            savingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savingPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(savingsPnlLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        investmentPnl.setBackground(new java.awt.Color(51, 4, 107));
        investmentPnl.setPreferredSize(new java.awt.Dimension(211, 80));

        investmentsPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        investmentsPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        investmentsPnlLbl.setText("Investments");

        investmentValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        investmentValue.setForeground(new java.awt.Color(196, 175, 222));
        investmentValue.setText(banker.getValue(90000, 60000));

        investPrecentTickLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        investPrecentTickLbl.setForeground(new java.awt.Color(51, 153, 0));
        investPrecentTickLbl.setText("(+ 0.0%)");

        javax.swing.GroupLayout investmentPnlLayout = new javax.swing.GroupLayout(investmentPnl);
        investmentPnl.setLayout(investmentPnlLayout);
        investmentPnlLayout.setHorizontalGroup(
            investmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(investmentPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(investmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(investmentValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(investmentPnlLayout.createSequentialGroup()
                        .addComponent(investmentsPnlLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(investPrecentTickLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        investmentPnlLayout.setVerticalGroup(
            investmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(investmentPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(investmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(investmentsPnlLbl)
                    .addComponent(investPrecentTickLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(investmentValue, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        cryptoPnl.setBackground(new java.awt.Color(51, 4, 107));
        cryptoPnl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cryptoPnl.setPreferredSize(new java.awt.Dimension(211, 80));

        cryptoPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cryptoPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        cryptoPnlLbl.setText("Cryptocurrency");

        cryptoValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cryptoValue.setForeground(new java.awt.Color(196, 175, 222));
        cryptoValue.setText(banker.getValue(50000, 40000));

        cryptoPrecentTickLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cryptoPrecentTickLbl.setForeground(new java.awt.Color(51, 153, 0));
        cryptoPrecentTickLbl.setText("(+ 0.0%)");

        javax.swing.GroupLayout cryptoPnlLayout = new javax.swing.GroupLayout(cryptoPnl);
        cryptoPnl.setLayout(cryptoPnlLayout);
        cryptoPnlLayout.setHorizontalGroup(
            cryptoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cryptoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cryptoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cryptoValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cryptoPnlLayout.createSequentialGroup()
                        .addComponent(cryptoPnlLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cryptoPrecentTickLbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cryptoPnlLayout.setVerticalGroup(
            cryptoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cryptoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cryptoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cryptoPnlLbl)
                    .addComponent(cryptoPrecentTickLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cryptoValue, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountInfoPnl.setBackground(new java.awt.Color(51, 4, 107));
        accountInfoPnl.setPreferredSize(new java.awt.Dimension(270, 0));

        accountPnlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accountPnlLbl.setForeground(new java.awt.Color(196, 175, 222));
        accountPnlLbl.setText("Account Information");

        accountNumLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        accountNumLbl.setForeground(new java.awt.Color(196, 175, 222));
        accountNumLbl.setText("Account #: ***-***-****");

        routingNumLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        routingNumLbl.setForeground(new java.awt.Color(196, 175, 222));
		routingNumLbl.setText("Routing #: ****-****-****-****");

        showToggleBtn.setBackground(new java.awt.Color(51, 4, 107));
        showToggleBtn.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        showToggleBtn.setForeground(new java.awt.Color(196, 175, 222));
        showToggleBtn.setText("Show");
        showToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showToggleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountInfoPnlLayout = new javax.swing.GroupLayout(accountInfoPnl);
        accountInfoPnl.setLayout(accountInfoPnlLayout);
        accountInfoPnlLayout.setHorizontalGroup(
            accountInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountInfoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountInfoPnlLayout.createSequentialGroup()
                        .addComponent(accountPnlLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showToggleBtn))
                    .addGroup(accountInfoPnlLayout.createSequentialGroup()
                        .addGroup(accountInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(routingNumLbl)
                            .addComponent(accountNumLbl))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        accountInfoPnlLayout.setVerticalGroup(
            accountInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountInfoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountPnlLbl)
                    .addComponent(showToggleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountNumLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(routingNumLbl)
                .addContainerGap())
        );

        creditsLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        creditsLbl.setForeground(new java.awt.Color(196, 175, 222));
        creditsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLbl.setText("Developed by Calvin Fair");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cryptoPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(investmentPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savingPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(checkingPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(accountInfoPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(suggestionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(creditsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(checkingPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savingPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suggestionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(accountInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(investmentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cryptoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(creditsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }                     

    private void showToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	if(showToggleBtn.getText() == "Hide") {
    		showToggleBtn.setText("Show");
    		accountNumLbl.setText("Account #: ***-***-****");
    		routingNumLbl.setText("Routing #: ****-****-****-****");
    	} else {
    		showToggleBtn.setText("Hide");
    		accountNumLbl.setText("Account #: " + banker.getAccountNum());
    		routingNumLbl.setText("Routing #: " + banker.getRoutingNum());
    	}
    } 
    
    private void BackgroundMouseMoved(java.awt.event.MouseEvent evt) {                                      
        if(banker.checkMarker()) {
        	String investNewVal = banker.getValue(90000, 60000);
        	String cryptoNewVal = banker.getValue(50000, 40000);
        	
        	String investPrecent = banker.getPrecentageChange(investmentValue.getText(), investNewVal);
        	String cryptoPrecent = banker.getPrecentageChange(cryptoValue.getText(), cryptoNewVal);
        	
        	if(investPrecent.contains("+")) {
        		investPrecentTickLbl.setForeground(new java.awt.Color(51, 153, 0));
        	} else {
        		investPrecentTickLbl.setForeground(new java.awt.Color(204, 0, 0));
        	}
        	
        	if(cryptoPrecent.contains("+")) {
        		cryptoPrecentTickLbl.setForeground(new java.awt.Color(51, 153, 0));
        	} else {
        		cryptoPrecentTickLbl.setForeground(new java.awt.Color(204, 0, 0));
        	}
        	
        	suggestionValue.setText(banker.setSuggestions());
        	investPrecentTickLbl.setText(investPrecent);
        	cryptoPrecentTickLbl.setText(cryptoPrecent);
        	investmentValue.setText(investNewVal);
        	cryptoValue.setText(cryptoNewVal);
        }
    }                   
}
