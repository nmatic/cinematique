/*
 * Nom fichier: CinematiqueGUI.java
 * Description: Calculateur de la cinématique avec une interface graphique.
 * Auteur: Victor Babin
 * Version: 2.0
 * Date: 28-octobre-2016
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CinematiqueGUI extends javax.swing.JFrame {


    /**
     * Creates new form CinematiqueGUI
     */
    public CinematiqueGUI() {
        initComponents();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valeurA = new javax.swing.JFormattedTextField();
        valeurDt = new javax.swing.JFormattedTextField();
        valeurVf = new javax.swing.JFormattedTextField();
        labelDt = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        valeurVi = new javax.swing.JFormattedTextField();
        valeurXf = new javax.swing.JFormattedTextField();
        valeurXi = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        labelXi = new javax.swing.JLabel();
        labelXf = new javax.swing.JLabel();
        labelVi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat = new javax.swing.JTextArea();
        valRecherche = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labelVf = new javax.swing.JLabel();
        calculerButton = new javax.swing.JButton();
        barreMenu = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        menuReset = new javax.swing.JMenuItem();
        menuQuitter = new javax.swing.JMenuItem();
        menuAide = new javax.swing.JMenu();
        menuComment = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculateur de la cinématique");
        setBounds(new java.awt.Rectangle(0, 0, 316, 427));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("icon.gif")).getImage());
        setIconImages(null);
        setResizable(false);

        labelDt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelDt.setText("Variation du temps:");

        labelA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelA.setText("Accélération:");

        valeurXi.setAutoscrolls(false);

        jLabel10.setText("(toutes les valeurs doivent être en mètres et en secondes.)");

        labelXi.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelXi.setText("Position initiale:");

        labelXf.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelXf.setText("Position finale:");

        labelVi.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelVi.setText("Vitesse initiale:");

        resultat.setEditable(false);
        resultat.setRows(5);
        resultat.setAutoscrolls(false);
        resultat.setBorder(javax.swing.BorderFactory.createTitledBorder("Résultat"));
        jScrollPane1.setViewportView(resultat);

        valRecherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Donnée recherchée--", "Position initiale", "Position finale", "Vitesse initiale", "Vitesse finale", "Variation du temps", "Accélération" }));
        valRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valRechercheActionPerformed(evt);
            }
        });

        jLabel2.setText("Donnée recherchée:");

        labelVf.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelVf.setText("Vitesse finale:");

        calculerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculerButton.setForeground(new java.awt.Color(255, 0, 51));
        calculerButton.setText("=");
        calculerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculerButtonActionPerformed(evt);
            }
        });

        menuFichier.setText("Fichier");
        menuFichier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuReset.setText("Réinitialiser");
        menuReset.setToolTipText("");
        menuReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResetActionPerformed(evt);
            }
        });
        menuFichier.add(menuReset);

        menuQuitter.setText("Quitter");
        menuQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuitterActionPerformed(evt);
            }
        });
        menuFichier.add(menuQuitter);

        barreMenu.add(menuFichier);

        menuAide.setText("?");

        menuComment.setText("Comment utiliser le calculateur");
        menuComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCommentActionPerformed(evt);
            }
        });
        menuAide.add(menuComment);

        menuAbout.setText("À propos");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuAide.add(menuAbout);

        barreMenu.add(menuAide);

        setJMenuBar(barreMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelXf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelXi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelVi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelVf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelA, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(valeurXf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valeurVi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valeurVf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valeurDt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valeurA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valeurXi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelA, labelDt, labelVf, labelVi, labelXf, labelXi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {valeurA, valeurDt, valeurVf, valeurVi, valeurXf, valeurXi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(valRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelXi)
                                    .addComponent(valeurXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelXf)
                                    .addComponent(valeurXf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valeurVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valeurVf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valeurDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valeurA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelA)))
                            .addComponent(calculerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {valeurA, valeurDt, valeurVf, valeurVi, valeurXf, valeurXi});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int valeurRecherche = 1; // liste déroulante, valeur par def = 1
    
    // Déclaration des booleens pour les cases des valeurs connues
    private boolean bXi = false;
    private boolean bXf = false;
    private boolean bVi = false;
    private boolean bVf = false;
    private boolean bDt = false;
    private boolean bA = false;
    
    // Variables de lecture du formulaire
    private double deplacementInitial, deplacementFinal, vitesseInitiale, vitesseFinale, variationTemps, acceleration;

    // Variables de sortie
    private String unit, formule, formuleDonnees;
    private double result;
    
    // Message d'erreur
    public void errorDialog(String errorMessage){
        JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Erreur", JOptionPane.ERROR_MESSAGE);
    }    
    
    // Reinitialisation
    public void showFields(){
        // Xi
        labelXi.setVisible(true);
        valeurXi.setVisible(true);
        // Xf
        labelXf.setVisible(true);
        valeurXf.setVisible(true);    
        // Vi
        labelVi.setVisible(true);
        valeurVi.setVisible(true);    
        // Vf
        labelVf.setVisible(true);
        valeurVf.setVisible(true);    
        // Dt
        labelDt.setVisible(true);
        valeurDt.setVisible(true);    
        // A
        labelA.setVisible(true);
        valeurA.setVisible(true);
        
    }
    public void resetFields(){
        valeurXi.setText("");
        valeurXf.setText("");
        valeurVi.setText("");
        valeurVf.setText("");
        valeurDt.setText("");
        valeurA.setText("");
    }
    public void resetButton(){
        resetFields();
        showFields();
        Instructions();
    }
    // Équations 1:
    public double vf_1(double a, double vi, double d_t){
        return (vi + a*d_t);
    }
        
    public double vi_1(double a, double vf, double d_t){
        return (-(a*d_t - vf));
    }
        
    public double a_1(double vi, double vf, double d_t){
        double d_v = vf - vi;
        return (d_v/d_t);    
    }

    public double d_t_1(double vi, double vf, double a){
        double d_v = vf - vi;
        return (d_v/a);
    }
    // Équations 2:
    public double xf_2(double xi, double vi, double vf, double d_t){
        return (xi + 0.5*(vi + vf)*d_t);
        //R: xf C: xi, vi, vf, d_t
    }    
    public double xi_2(double xf, double vi, double vf, double d_t){
        return (-(0.5*(vi + vf)*d_t - xf));
        //R: xi C: xf, vi, vf, d_t        
    }    
    public double vi_2(double xi, double xf, double vf, double d_t){
        double d_x = xf - xi;
        return ((2 * d_x)/(d_t) - vf);
        //R: vi C: xf, xi, d_t, vf        
    }    
    public double vf_2(double xi, double xf, double vi, double d_t){
        double d_x = xf - xi;
        return ((2 * d_x)/(d_t) - vi);
        //R: vf C: xf, xi, d_t, vi        
    }
    public double d_t_2(double xi, double xf, double vi, double vf){
        double d_x = xf - xi;
        return (d_x/(0.5*(vi + vf)));
    }
    // Équations 3:
    public double xf_3(double a, double xi, double vi, double d_t){
        double ans = xi + (vi*d_t) + (0.5*a*(d_t*d_t));
        return ans;
    }
    public double xi_3(double a, double xf, double vi, double d_t){
        return (-((vi*d_t) + (0.5*a*(d_t*d_t)) - xf));
    }  
    public double d_t1_3(double a, double xi, double xf, double vi){
        double d_x = xf - xi;
        double d = (vi*vi) - 4*((a/2)*(d_x));
        double ans = (-vi + Math.sqrt(d))/a;
        return ans;
    }
    public double d_t2_3(double a, double xi, double xf, double vi){
        double d_x = xf - xi;
        double d = (vi*vi) - 4*((a/2)*(d_x));
        return ((-vi - Math.sqrt(d))/a);
    } 
    public double vi_3(double xi, double xf, double a, double d_t){
        double d_x = xf - xi;
        return ((0.5*a*(d_t*d_t)-d_x)/-d_t);
    }
    public double a_3(double xi, double xf, double d_t, double vi){
        double d_x = xf - xi;
        return ((vi*d_t-d_x)/(d_t*d_t))/(-0.5);
    }
    // Équations 4:
    public double vf_4(double xi, double xf, double vi, double a){
        double d_x = xf - xi;
        double anss = (vi*vi) + 2*a*d_x;
        return Math.sqrt(anss);
    }
    public double vi_4(double xi, double xf, double vf, double a){
        
        double d_x = xf - xi;
        double anss = -(2*a*d_x - (vf*vf));
        return Math.sqrt(anss);
    }
    public double a_4(double xi, double xf, double vi, double vf){
        double d_x = xf - xi;
        return (((vf*vf) - (vi*vi))/2*d_x);
    }
    public double xi_4(double vi, double vf, double a, double xf){
        return -((((vf*vf) - (vi*vi))/(2*a)) - xf);
    }  
    public double xf_4(double vi, double vf, double a, double xi){
        return (((vf*vf) - (vi*vi))/2*a) + xi;
    } 

    public void Instructions(){
        resultat.setText("1. Choisir la donnée recherchée." + "\n 2. Entrer seulement les \n valeurs connues." + "\n 3. Appuyer sur le bouton \"=\".");
    
    }
    
    private void valRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valRechercheActionPerformed
        valeurRecherche = valRecherche.getSelectedIndex();
        showFields();
        switch(valeurRecherche){
            case 1:
                labelXi.setVisible(false);
                valeurXi.setVisible(false);
                break;
            case 2:
                labelXf.setVisible(false);
                valeurXf.setVisible(false);
                break;
            case 3:
                labelVi.setVisible(false);
                valeurVi.setVisible(false);    
		break;
            case 4:
                labelVf.setVisible(false);
                valeurVf.setVisible(false);   
                break;
            case 5:
                labelDt.setVisible(false);
                valeurDt.setVisible(false);    
                break;
            case 6:
                labelA.setVisible(false);
                valeurA.setVisible(false);  
                break;
        }
    }//GEN-LAST:event_valRechercheActionPerformed

    private void menuResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResetActionPerformed
        resetButton();
    }//GEN-LAST:event_menuResetActionPerformed

    private void menuQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuQuitterActionPerformed

    private void menuCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCommentActionPerformed
        JOptionPane.showMessageDialog(new JFrame(), "1. Choisir la donnée recherchée." + "\n 2. Entrer seulement les valeurs connues." + "\n 3. Appuyer sur le bouton \"Calculer\".", "Aide", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuCommentActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(new JFrame(), "(c)2016 Victor Babin" + "\n Calculateur de la cinématique en Java" + "\n https://github.com/vicbab ", "À propos", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void calculerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculerButtonActionPerformed
        bXi = !valeurXi.getText().isEmpty();
        bXf = !valeurXf.getText().isEmpty();
        bVi = !valeurVi.getText().isEmpty();
        bVf = !valeurVf.getText().isEmpty();
        bDt = !valeurDt.getText().isEmpty();
        bA = !valeurA.getText().isEmpty();
        // Trouver la position initiale(1):
        if(valeurRecherche == 1 && bXf == true && bVi == true && bVf == true && bDt == true){
            unit = " m";
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            result = xi_2(deplacementFinal, vitesseInitiale, vitesseFinale, variationTemps);
            formule = "Xi = -½ *(Vi + Vf)* \u0394t - Xf";
            formuleDonnees = "Xi = -½ * (" + vitesseInitiale + " + " + vitesseFinale + ") * " + variationTemps + " - " + deplacementFinal;
            System.out.println(formule);
            resultat.setText(String.valueOf(formule + "\n" + formuleDonnees + "\n" + "Xi = " + result + unit));
            
        }
        else if(valeurRecherche == 1 && bA == true && bXf == true && bVi == true && bDt == true){
            unit = " m";
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = xi_3(acceleration, deplacementFinal, vitesseInitiale, variationTemps);
            resultat.setText(String.valueOf(result + unit));
            
            
        }
        else if(valeurRecherche == 1 && bVi == true && bVf == true && bA == true && bXf == true){
            unit = " m";
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = xi_4(vitesseInitiale, vitesseFinale, acceleration, deplacementFinal);
            
            resultat.setText(String.valueOf(result + unit));

        }
        // Trouver le déplacement final(2):
        else if(valeurRecherche == 2 && bXi == true && bVi == true && bVf == true && bDt == true){
            unit = " m";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = xf_2(deplacementInitial, vitesseInitiale, vitesseFinale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 2 && bA == true && bXi == true && bVi == true && bDt == true){
            unit = " m";
            acceleration = Double.parseDouble(valeurA.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            
            result = xf_3(acceleration, deplacementInitial, vitesseInitiale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 2 && bXi == true && bVi == true && bVf == true && bA == true){
            unit = " m";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = xf_4(vitesseInitiale, vitesseFinale, acceleration, deplacementInitial);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        // Trouver la vitesse initiale(3):
        else if(valeurRecherche == 3 && bA == true && bVf == true && bDt == true){
            unit = " m/s";
            acceleration = Double.parseDouble(valeurA.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = vi_1(acceleration, vitesseFinale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 3 && bXf == true && bXi == true && bVf == true && bDt == true){
            unit = " m/s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = vi_2(deplacementInitial, deplacementFinal, vitesseFinale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 3 && bXf == true && bXi == true && bA == true && bDt == true){
            unit = " m/s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = vi_3(deplacementInitial, deplacementFinal, acceleration, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 3 && bXf == true && bXi == true &&  bVf == true && bA == true){
            unit = " m/s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = vi_4(deplacementInitial, deplacementFinal, vitesseFinale, acceleration);
            resultat.setText(String.valueOf(result + unit));
            
        }
        // Trouver la vitesse finale(4):
        else if(valeurRecherche == 4 && bA == true && bDt == true && bVi == true){
            unit = " m/s";
            acceleration = Double.parseDouble(valeurA.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            
            formule = "Vf = Vi * a\u0394t";
            result = vf_1(acceleration, vitesseInitiale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
            
        }
        else if(valeurRecherche == 4 && bXf == true && bXi == true && bVi == true && bDt == true){
            unit = " m/s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = vf_2(deplacementInitial, deplacementFinal, vitesseInitiale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit));
        }
        else if(valeurRecherche == 4 && bXf == true && bXi == true && bVi == true && bA == true){
            unit = " m/s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = vf_4(deplacementInitial, deplacementFinal, vitesseInitiale, acceleration);
            
            resultat.setText(String.valueOf(result + unit));            
        }   
        // Trouver la variation du temps (5):
        else if(valeurRecherche == 5 && bVi == true && bVf == true && bA == true){
            unit = " s";
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            acceleration = Double.parseDouble(valeurA.getText());
            
            result = d_t_1(vitesseInitiale, vitesseFinale, acceleration);
            
            resultat.setText(String.valueOf(result + unit)); 
            
        }
        else if(valeurRecherche == 5 && bXi == true && bXf == true && bVi == true && bVf == true){
            unit = " s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            
            result = d_t_2(deplacementInitial, deplacementFinal, vitesseInitiale, vitesseFinale);
            
            resultat.setText(String.valueOf(result + unit)); 
        }
        else if(valeurRecherche == 5 && bXi == true && bXf == true && bVi == true && bA == true){
            unit = " s";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            
            double result1 = d_t1_3(acceleration, deplacementInitial, deplacementFinal, vitesseInitiale);
            double result2 = d_t2_3(acceleration, deplacementInitial, deplacementFinal, vitesseInitiale);
            
            resultat.setText(String.valueOf(result1 + unit + " ou " + result2 + unit)); 
        }
        // Trouver l'accélération(6):
        else if(valeurRecherche == 6 && bVi == true && bVf == true && bDt == true){
            unit = " m/s²";
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = a_1(vitesseInitiale, vitesseFinale, variationTemps);
            
            resultat.setText(String.valueOf(result + unit)); 
        }
        else if(valeurRecherche == 6 && bXi == true && bXf == true && bVi == true && bDt == true){
            unit = " m/s²";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            variationTemps = Double.parseDouble(valeurDt.getText());
            
            result = a_3(deplacementInitial, deplacementFinal, variationTemps, vitesseInitiale);
            
            resultat.setText(String.valueOf(result + unit)); 
        }
        else if(valeurRecherche == 6 && bXi == true && bXf == true && bVi == true && bVf == true){
            unit = " m/s²";
            deplacementInitial = Double.parseDouble(valeurXi.getText());
            deplacementFinal = Double.parseDouble(valeurXf.getText());
            vitesseInitiale = Double.parseDouble(valeurVi.getText());
            vitesseFinale = Double.parseDouble(valeurVf.getText());
            
            result = a_4(deplacementInitial, deplacementFinal, vitesseInitiale, vitesseFinale);
            
            resultat.setText(String.valueOf(result + unit)); 
        }
        else{
            resultat.setText(String.valueOf("Impossible à calculer."));
            errorDialog("Impossible à calculer.");
        }
    }//GEN-LAST:event_calculerButtonActionPerformed
    
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CinematiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CinematiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CinematiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CinematiqueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CinematiqueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barreMenu;
    private javax.swing.JButton calculerButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelDt;
    private javax.swing.JLabel labelVf;
    private javax.swing.JLabel labelVi;
    private javax.swing.JLabel labelXf;
    private javax.swing.JLabel labelXi;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenu menuAide;
    private javax.swing.JMenuItem menuComment;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenuItem menuQuitter;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JTextArea resultat;
    private javax.swing.JComboBox<String> valRecherche;
    private javax.swing.JFormattedTextField valeurA;
    private javax.swing.JFormattedTextField valeurDt;
    private javax.swing.JFormattedTextField valeurVf;
    private javax.swing.JFormattedTextField valeurVi;
    private javax.swing.JFormattedTextField valeurXf;
    private javax.swing.JFormattedTextField valeurXi;
    // End of variables declaration//GEN-END:variables
}
