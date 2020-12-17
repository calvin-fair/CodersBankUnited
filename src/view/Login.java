package view;

public class Login extends javax.swing.JFrame {
	
	// Variables                   
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Icon;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordTB;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameTB;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        UsernameTB = new javax.swing.JTextField();
        PasswordTB = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coders Bank United");
        setBackground(new java.awt.Color(242, 242, 247));
        setIconImages(null);
        setResizable(false);

        Background.setBackground(new java.awt.Color(55, 50, 61));

        Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\CFair\\Desktop\\CBU\\Logos\\Logo@2x.png")); 
        Icon.setMaximumSize(new java.awt.Dimension(200, 210));

        Title.setBackground(new java.awt.Color(242, 242, 247));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        Title.setForeground(new java.awt.Color(196, 175, 222));
        Title.setText("Coders Bank United");

        UsernameTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
        UsernameTB.setText("Username...");
        UsernameTB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameTBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameTBFocusLost(evt);
            }
        });
        

        PasswordTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
        PasswordTB.setText("Password...");
        PasswordTB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTBFocusLost(evt);
            }
        });

        LoginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title)
                    .addComponent(UsernameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTB, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addGap(30, 30, 30)
                .addComponent(UsernameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBtn)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	Bank bank = new Bank(UsernameTB.getText());
    	bank.setVisible(true);
    	super.dispose();
    }                                        
    
    private void UsernameTBFocusGained(java.awt.event.FocusEvent evt) {                                       
    	if(UsernameTB.getText().trim().equals("Username...")) {
        	UsernameTB.setText("");
        }
    }
    
    private void UsernameTBFocusLost(java.awt.event.FocusEvent evt) {                                       
        if(UsernameTB.getText().trim().equals("")) {
        	UsernameTB.setText("Username...");
        }
    } 

    @SuppressWarnings("deprecation")
	private void PasswordTBFocusGained(java.awt.event.FocusEvent evt) {                                       
    	if(PasswordTB.getText().trim().equals("Password...")) {
    		PasswordTB.setText("");
        }
    }
    
    @SuppressWarnings("deprecation")
	private void PasswordTBFocusLost(java.awt.event.FocusEvent evt) {                                       
    	if(PasswordTB.getText().trim().equals("")) {
    		PasswordTB.setText("Password...");
        }
    }
    
    public static void main(String args[]) {
    	Login log = new Login();
    	log.setVisible(true);
    }               
}
