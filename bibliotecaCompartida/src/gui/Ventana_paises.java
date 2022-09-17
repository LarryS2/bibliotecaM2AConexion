/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Modelo.ModeloPais;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import logico.Pais;

/**
 *
 * @author Fiction
 */
public class Ventana_paises extends javax.swing.JDialog {

    /**
     * Creates new form Ventana_paises
     */
    ModeloPais mp = new ModeloPais();
    int idp;
    public Ventana_paises(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ModeloPais.getTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backround = new javax.swing.JPanel();
        panelsuperior2 = new javax.swing.JPanel();
        labelidioma = new javax.swing.JLabel();
        labelcodpais = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelnompais = new javax.swing.JLabel();
        txtnombrepais = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapaises = new javax.swing.JTable();
        btnagregar = new javax.swing.JPanel();
        btnlabeagregar = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JPanel();
        btnlabelactualizar = new javax.swing.JLabel();
        btneliminar = new javax.swing.JPanel();
        btnlabeleliminar = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JPanel();
        btnlabellimpiar = new javax.swing.JLabel();
        btnrvolver = new javax.swing.JPanel();
        btnlabelvolver = new javax.swing.JLabel();
        txtdescpais = new javax.swing.JTextField();
        labeldescpais = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnbuscar = new javax.swing.JPanel();
        btnlabelbuscar = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        labelidpais = new javax.swing.JLabel();
        txtcodigopais = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backround.setBackground(new java.awt.Color(255, 255, 255));

        panelsuperior2.setBackground(new java.awt.Color(0, 153, 153));

        labelidioma.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelidioma.setForeground(new java.awt.Color(255, 255, 255));
        labelidioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelidioma.setText("REGISTRAR PAÍSES");

        javax.swing.GroupLayout panelsuperior2Layout = new javax.swing.GroupLayout(panelsuperior2);
        panelsuperior2.setLayout(panelsuperior2Layout);
        panelsuperior2Layout.setHorizontalGroup(
            panelsuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperior2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelidioma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelsuperior2Layout.setVerticalGroup(
            panelsuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperior2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(labelidioma)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        labelcodpais.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelcodpais.setForeground(new java.awt.Color(102, 102, 102));
        labelcodpais.setText("CÓDIGO:");

        labelnompais.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelnompais.setForeground(new java.awt.Color(102, 102, 102));
        labelnompais.setText("NOMBRE PAÍS:");

        txtnombrepais.setBorder(null);
        txtnombrepais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrepaisKeyTyped(evt);
            }
        });

        tablapaises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablapaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapaisesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapaises);

        btnagregar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabeagregar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabeagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabeagregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabeagregar.setText("AGREGAR");
        btnlabeagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabeagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabeagregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnagregarLayout = new javax.swing.GroupLayout(btnagregar);
        btnagregar.setLayout(btnagregarLayout);
        btnagregarLayout.setHorizontalGroup(
            btnagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnagregarLayout.setVerticalGroup(
            btnagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnactualizar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelactualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelactualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelactualizar.setText("ACTUALIZAR");
        btnlabelactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelactualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnactualizarLayout = new javax.swing.GroupLayout(btnactualizar);
        btnactualizar.setLayout(btnactualizarLayout);
        btnactualizarLayout.setHorizontalGroup(
            btnactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnactualizarLayout.setVerticalGroup(
            btnactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btneliminar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabeleliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabeleliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabeleliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabeleliminar.setText("ELIMINAR");
        btnlabeleliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabeleliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabeleliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btneliminarLayout = new javax.swing.GroupLayout(btneliminar);
        btneliminar.setLayout(btneliminarLayout);
        btneliminarLayout.setHorizontalGroup(
            btneliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeleliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btneliminarLayout.setVerticalGroup(
            btneliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeleliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabellimpiar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabellimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabellimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabellimpiar.setText("LIMPIAR");
        btnlabellimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabellimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabellimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnlimpiarLayout = new javax.swing.GroupLayout(btnlimpiar);
        btnlimpiar.setLayout(btnlimpiarLayout);
        btnlimpiarLayout.setHorizontalGroup(
            btnlimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlimpiarLayout.setVerticalGroup(
            btnlimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnrvolver.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelvolver.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelvolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelvolver.setText("VOLVER");
        btnlabelvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelvolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelvolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnrvolverLayout = new javax.swing.GroupLayout(btnrvolver);
        btnrvolver.setLayout(btnrvolverLayout);
        btnrvolverLayout.setHorizontalGroup(
            btnrvolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelvolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnrvolverLayout.setVerticalGroup(
            btnrvolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelvolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        txtdescpais.setBorder(null);
        txtdescpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescpaisKeyTyped(evt);
            }
        });

        labeldescpais.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labeldescpais.setForeground(new java.awt.Color(102, 102, 102));
        labeldescpais.setText("DESCRIPCIÓN:");

        btnbuscar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelbuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelbuscar.setText("BUSCAR");
        btnlabelbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelbuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnbuscarLayout = new javax.swing.GroupLayout(btnbuscar);
        btnbuscar.setLayout(btnbuscarLayout);
        btnbuscarLayout.setHorizontalGroup(
            btnbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnbuscarLayout.setVerticalGroup(
            btnbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        labelid.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelid.setForeground(new java.awt.Color(102, 102, 102));
        labelid.setText("ID:");

        labelidpais.setEnabled(false);

        txtcodigopais.setBorder(null);
        try {
            txtcodigopais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout backroundLayout = new javax.swing.GroupLayout(backround);
        backround.setLayout(backroundLayout);
        backroundLayout.setHorizontalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsuperior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(backroundLayout.createSequentialGroup()
                                    .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelcodpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelnompais, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                    .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backroundLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtnombrepais, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backroundLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                                .addComponent(labelidpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtcodigopais))))))
                            .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backroundLayout.createSequentialGroup()
                                .addComponent(labeldescpais, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdescpais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnrvolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        backroundLayout.setVerticalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backroundLayout.createSequentialGroup()
                .addComponent(panelsuperior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelid, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(labelidpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelcodpais, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigopais, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombrepais, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelnompais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescpais, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeldescpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backroundLayout.createSequentialGroup()
                                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnrvolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Agregar() {
        try {
            
            Pais pais = new Pais();
            String codigo = txtcodigopais.getText().trim();
            String nombre = txtnombrepais.getText().trim();
            String descripcion = txtdescpais.getText().trim();
            
            if (codigo.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
            } else {
                if (pais.Validar_Nombre_Pais(nombre) == false) {
                    JOptionPane.showMessageDialog(null, "NOMBRE DEL PAÍS NO VÁLIDO");
                } else {
                
                    pais.setCodigo_pais(codigo);
                    pais.setNombre_pais(nombre);
                    pais.setDesc_pais(descripcion);
                    if (mp.RegistrarPais(pais)) {
                        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                        ModeloPais.Limpiar_Tabla();
                        ModeloPais.getTabla();
                        LimpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR EL PAÍS");
                        ModeloPais.Limpiar_Tabla();
                        ModeloPais.getTabla();
                    }   
                }
            }
        } catch (HeadlessException | NumberFormatException | NullPointerException e) {
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    public void LimpiarCampos() {
        labelidpais.setText(null);
        txtcodigopais.setText(null);
        txtdescpais.setText(null);
    }
    
    
    private void txtnombrepaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrepaisKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
        } else {
            if (txtnombrepais.getText().length() >= 50) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtnombrepaisKeyTyped

    private void tablapaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapaisesMouseClicked
        int fila = tablapaises.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA");
        } else {
            labelcodpais.disable();
            idp = Integer.parseInt((String) tablapaises.getValueAt(fila, 0).toString());
            String codigo = (String) tablapaises.getValueAt(fila, 1);
            String nombre = (String) tablapaises.getValueAt(fila, 2);
            String descripcion = (String) tablapaises.getValueAt(fila, 3);

            labelidpais.setText("" + idp);
            txtcodigopais.setText(codigo);
            txtnombrepais.setText(nombre);
            txtdescpais.setText(descripcion);
        }
    }//GEN-LAST:event_tablapaisesMouseClicked

    private void btnlabeagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabeagregarMouseClicked
        Agregar();
    }//GEN-LAST:event_btnlabeagregarMouseClicked

    private void btnlabelactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelactualizarMouseClicked
        //Modificar();
    }//GEN-LAST:event_btnlabelactualizarMouseClicked

    private void btnlabeleliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabeleliminarMouseClicked
//        try {
//
//            Idioma idioma = new Idioma();
//            //int id = Integer.parseInt(txtid.getText().trim());
//            if (mi.EliminarIdioma(idioma)) {
//                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
//                LimpiarCampos();
//            } else {
//                JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL REGISTRO");
//            }
//        } catch (HeadlessException | NumberFormatException e) {
//
//        }
    }//GEN-LAST:event_btnlabeleliminarMouseClicked

    private void btnlabellimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabellimpiarMouseClicked
        LimpiarCampos();
        ModeloPais.Limpiar_Tabla();
        ModeloPais.getTabla();
    }//GEN-LAST:event_btnlabellimpiarMouseClicked

    private void btnlabelvolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelvolverMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnlabelvolverMouseClicked

    private void txtdescpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescpaisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescpaisKeyTyped

    private void btnlabelbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelbuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlabelbuscarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Ventana_paises dialog = new Ventana_paises(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backround;
    private javax.swing.JPanel btnactualizar;
    private javax.swing.JPanel btnagregar;
    private javax.swing.JPanel btnbuscar;
    private javax.swing.JPanel btneliminar;
    private javax.swing.JLabel btnlabeagregar;
    private javax.swing.JLabel btnlabelactualizar;
    private javax.swing.JLabel btnlabelbuscar;
    private javax.swing.JLabel btnlabeleliminar;
    private javax.swing.JLabel btnlabellimpiar;
    private javax.swing.JLabel btnlabelvolver;
    private javax.swing.JPanel btnlimpiar;
    private javax.swing.JPanel btnrvolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelcodpais;
    private javax.swing.JLabel labeldescpais;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelidioma;
    private javax.swing.JLabel labelidpais;
    private javax.swing.JLabel labelnompais;
    private javax.swing.JPanel panelsuperior2;
    public static javax.swing.JTable tablapaises;
    private javax.swing.JFormattedTextField txtcodigopais;
    private javax.swing.JTextField txtdescpais;
    private javax.swing.JTextField txtnombrepais;
    // End of variables declaration//GEN-END:variables
}
