/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Consulta extends JFrame {

    public JLabel lblNombre, lblDirector, lblPais, lblClasificacion, lblanio, lblProyeccion;

    public JTextField nombre, director, pais, anio;
    public JComboBox clasificacion;

    ButtonGroup existencia = new ButtonGroup();
    public JRadioButton si;
    public JTable resultados;

    public JPanel table;

    public JButton insertar, eliminar, actualizar, buscar;

    public static final int ANCHOC = 130, ALTOC = 30;

    public Consulta() {
        super("Peliculas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        llenarTabla();
        Container container = getContentPane();
        container.add(lblNombre);
        container.add(lblDirector);
        container.add(lblPais);
        container.add(lblClasificacion);
        container.add(lblanio);
        container.add(nombre);
        container.add(director);
        container.add(pais);
        container.add(anio);
        container.add(clasificacion);
        container.add(lblProyeccion);
        container.add(si);
        container.add(insertar);
        container.add(eliminar);
        container.add(actualizar);
        container.add(buscar);
        container.add(table);
        setSize(800, 800);
        eventos();
    }

    public final void agregarLabels() {
        lblNombre = new JLabel("Nombre");
        lblDirector = new JLabel("Director");
        lblPais = new JLabel("Pais");
        lblClasificacion = new JLabel("Clasificacion");
        lblanio = new JLabel("Año");
        lblProyeccion = new JLabel("En proyeccion");
        lblNombre.setBounds(10, 10, ANCHOC, ALTOC);
        lblDirector.setBounds(10, 60, ALTOC, ANCHOC);
        lblPais.setBounds(10, 100, ALTOC, ANCHOC);
        lblClasificacion.setBounds(10, 140, ALTOC, ANCHOC);
        lblanio.setBounds(10, 170, ALTOC, ANCHOC);
        lblProyeccion.setBounds(10, 210, ALTOC, ANCHOC);

    }

    public final void formulario() {
        nombre = new JTextField();
        director = new JTextField();
        pais = new JTextField();
        anio = new JTextField();
        clasificacion = new JComboBox();
        resultados = new JTable();
        si = new JRadioButton("si",true);
        insertar = new JButton("Insertar");
        eliminar = new JButton("Eliminar");
        actualizar = new JButton("Actualizar");
        buscar = new JButton("Buscar");
        
        nombre.setBounds(180,10, ANCHOC, ALTOC);
        director.setBounds(180,50, ANCHOC, ALTOC);
        pais.setBounds(180,90, ANCHOC, ALTOC);
        anio.setBounds(180,120, ANCHOC, ALTOC);
        clasificacion.setBounds(180,150, ANCHOC, ALTOC);
        
        
        
    }

    public void llenarTabla() {

    }
 
    public void eventos() {

    }

}
