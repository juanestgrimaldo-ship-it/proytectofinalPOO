package Vista;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import Modelo.Alumno;
import Modelo.AlumnoEnPrueba;
import Modelo.AlumnoSinPrueba;
import Modelo.Asesoria;
import Modelo.Asignatura;
import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class UsaAlumno extends javax.swing.JFrame {

    private ArrayList<Alumno> losAlumnos;
    private ArrayList<Asignatura> lasAsignaturas;

    public UsaAlumno() {
        initComponents();
        losAlumnos = new ArrayList<Alumno>();
        lasAsignaturas = new ArrayList<Asignatura>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        Asignatura asignatura1 = new Asignatura("AyP", "Algoritmia y Programación");
        Asignatura asignatura2 = new Asignatura("POO", "Programación Orientada a Objetos");
        Asignatura asignatura3 = new Asignatura("EDyA1", "Estructura de Datos y Algoritmos 1");
        Asignatura asignatura4 = new Asignatura("BD1", "Bases de Datos 1");
        lasAsignaturas.add(asignatura1);
        lasAsignaturas.add(asignatura2);
        lasAsignaturas.add(asignatura3);
        lasAsignaturas.add(asignatura4);

        Alumno mario = new AlumnoEnPrueba(2.8, 2233409, "Mario Ríos");
        Alumno camila = new AlumnoSinPrueba(2, 2241834, "Camila Ramírez");
        Alumno walter = new AlumnoSinPrueba(5, 2219045, "Walter Malagón");
        Alumno bernardo = new AlumnoEnPrueba(2.5, 2228342, "Bernardo Guzmán");
        Alumno jenifer = new AlumnoEnPrueba(3.1, 2211834, "Jenifer Valencia");

        mario.adicionarAsesoria(new Asesoria(asignatura2, "VIRTUAL", LocalDate.of(2026, 8, 12), 15));
        mario.adicionarAsesoria(new Asesoria(asignatura2, "PRESENCIAL", LocalDate.of(2026, 8, 28), 20));
        camila.adicionarAsesoria(new Asesoria(asignatura1, "PRESENCIAL", LocalDate.of(2026, 8, 11), 22));
        walter.adicionarAsesoria(new Asesoria(asignatura4, "PRESENCIAL", LocalDate.of(2026, 10, 9), 25));
        walter.adicionarAsesoria(new Asesoria(asignatura3, "VIRTUAL", LocalDate.of(2026, 10, 14), 15));

        losAlumnos.add(mario);
        losAlumnos.add(camila);
        losAlumnos.add(walter);
        losAlumnos.add(bernardo);
        losAlumnos.add(jenifer);
    }

    public Alumno buscarAlumno(ArrayList<Alumno> info, int codigoDado) {
        Alumno res = null;

        for (Alumno a : info) {
            if (a.getCodigo() == codigoDado) {
                res = a;
            }
        }

        return res;
    }

    public Asignatura buscarAsignatura(ArrayList<Asignatura> info, String codigoDado) {
        Asignatura res = null;

        for (Asignatura a : info) {
            if (a.getCodigo().equals(codigoDado)) {
                res = a;
            }
        }

        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxTipoAlumno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        insertarAlumno = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoAsignatura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreAsignatura = new javax.swing.JTextField();
        insertarAsignatura = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAlumnoAsesoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAsignaturaAsesoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxModalidad = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JTextField();
        registrarAsesoria = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbxReporte = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtCodigoConsulta = new javax.swing.JTextField();
        ejecutarReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de alumnos que asisten a asesorías");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ALUMNO");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo:");

        cbxTipoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN PRUEBA", "SIN PRUEBA" }));

        jLabel5.setText("Promedio:");

        jLabel6.setText("Semestre:");

        insertarAlumno.setText("Insertar alumno");
        insertarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarAlumnoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ASIGNATURA");

        jLabel8.setText("Código:");

        jLabel9.setText("Nombre:");

        insertarAsignatura.setText("Insertar asignatura");
        insertarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarAsignaturaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ASESORÍA");

        jLabel11.setText("Código alumno:");

        jLabel12.setText("Asignatura:");

        jLabel13.setText("(código, ej: POO)");

        jLabel14.setText("Modalidad:");

        cbxModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESENCIAL", "VIRTUAL" }));

        jLabel15.setText("Fecha:");

        jLabel16.setText("(AAAA-MM-DD)");

        jLabel17.setText("Minutos:");

        registrarAsesoria.setText("Registrar asesoría");
        registrarAsesoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAsesoriaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("REPORTES");

        jLabel19.setText("Reporte:");

        cbxReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listado de alumnos", "Consulta de un alumno" }));

        jLabel20.setText("Código alumno:");

        ejecutarReporte.setText("Ejecutar reporte");
        ejecutarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarReporteActionPerformed(evt);
            }
        });

        txaResultado.setEditable(false);
        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbxTipoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(insertarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(insertarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtAlumnoAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtAsignaturaAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbxModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registrarAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ejecutarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(insertarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAlumnoAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAsignaturaAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(registrarAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ejecutarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarAlumnoActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigoAlumno.getText());
            String nombre = txtNombreAlumno.getText();
            String tipo = (String) cbxTipoAlumno.getSelectedItem();

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe digitar el nombre del alumno");
            } else if (buscarAlumno(losAlumnos, codigo) != null) {
                JOptionPane.showMessageDialog(null, "Ya existe un alumno con el código " + codigo);
            } else if (tipo.equals("EN PRUEBA")) {
                double promedio = Double.parseDouble(txtPromedio.getText());
                if (promedio < 0 || promedio > 5) {
                    JOptionPane.showMessageDialog(null, "El promedio debe estar entre 0 y 5");
                } else {
                    losAlumnos.add(new AlumnoEnPrueba(promedio, codigo, nombre));
                    JOptionPane.showMessageDialog(null, "Alumno en prueba insertado");
                }
            } else if (tipo.equals("SIN PRUEBA")) {
                int semestre = Integer.parseInt(txtSemestre.getText());
                if (semestre < 1) {
                    JOptionPane.showMessageDialog(null, "El semestre debe ser mayor que 0");
                } else {
                    losAlumnos.add(new AlumnoSinPrueba(semestre, codigo, nombre));
                    JOptionPane.showMessageDialog(null, "Alumno sin prueba insertado");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise los datos numéricos (código, promedio o semestre)");
        }
    }//GEN-LAST:event_insertarAlumnoActionPerformed

    private void insertarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarAsignaturaActionPerformed
        String codigo = txtCodigoAsignatura.getText();
        String nombre = txtNombreAsignatura.getText();

        if (codigo.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe digitar el código y el nombre de la asignatura");
        } else if (buscarAsignatura(lasAsignaturas, codigo) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe una asignatura con el código " + codigo);
        } else {
            lasAsignaturas.add(new Asignatura(codigo, nombre));
            JOptionPane.showMessageDialog(null, "Asignatura insertada");
        }
    }//GEN-LAST:event_insertarAsignaturaActionPerformed

    private void registrarAsesoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAsesoriaActionPerformed
        try {
            int codigoAlumno = Integer.parseInt(txtAlumnoAsesoria.getText());
            String codigoAsignatura = txtAsignaturaAsesoria.getText();
            String modalidad = (String) cbxModalidad.getSelectedItem();
            LocalDate fecha = LocalDate.parse(txtFecha.getText());
            int minutos = Integer.parseInt(txtMinutos.getText());

            Alumno elAlumno = buscarAlumno(losAlumnos, codigoAlumno);
            Asignatura laAsignatura = buscarAsignatura(lasAsignaturas, codigoAsignatura);

            if (elAlumno == null) {
                JOptionPane.showMessageDialog(null, "No existe un alumno con el código " + codigoAlumno);
            } else if (laAsignatura == null) {
                JOptionPane.showMessageDialog(null, "No existe una asignatura con el código " + codigoAsignatura);
            } else if (minutos <= 0) {
                JOptionPane.showMessageDialog(null, "Los minutos deben ser mayores que 0");
            } else {
                Asesoria nvaAsesoria = new Asesoria(laAsignatura, modalidad, fecha, minutos);
                int esfuerzo = elAlumno.adicionarAsesoria(nvaAsesoria);
                JOptionPane.showMessageDialog(null, "Asesoría registrada. Esfuerzo: " + esfuerzo);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise el código del alumno y los minutos");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "La fecha debe tener el formato AAAA-MM-DD, por ejemplo 2026-08-28");
        }
    }//GEN-LAST:event_registrarAsesoriaActionPerformed

    private void ejecutarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ejecutarReporteActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxModalidad;
    private javax.swing.JComboBox<String> cbxReporte;
    private javax.swing.JComboBox<String> cbxTipoAlumno;
    private javax.swing.JButton ejecutarReporte;
    private javax.swing.JButton insertarAlumno;
    private javax.swing.JButton insertarAsignatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarAsesoria;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtAlumnoAsesoria;
    private javax.swing.JTextField txtAsignaturaAsesoria;
    private javax.swing.JTextField txtCodigoAlumno;
    private javax.swing.JTextField txtCodigoAsignatura;
    private javax.swing.JTextField txtCodigoConsulta;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreAsignatura;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
