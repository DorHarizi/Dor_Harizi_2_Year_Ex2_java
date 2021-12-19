package GUI;

import Graph.myGraphAlgo;
import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.EdgeData;
import tmp.GGSherpa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.*;

public class my_Frame extends JFrame {
    public DirectedWeightedGraph graph;
    public  DirectedWeightedGraphAlgorithms my_Graph_Algo;

    // ***** size screen *****
    Dimension scale = Toolkit.getDefaultToolkit().getScreenSize();
    public double minX;
    public double minY;
    public double maxX;
    public double maxY;

    // ***** classes *****
    Panel panel= new Panel(graph);
    JFrame frame=new JFrame();



    //**** constructor ****
    public my_Frame() throws Exception {
        super("Directed Weighted Graph Algorithms - Dor Harizi");
        this.my_Graph_Algo = new myGraphAlgo();
        this.my_Graph_Algo.load("C:/Users/dorha/IdeaProjects/Dor_Harizi_2_Year_Ex2_java/data/G2.json");
        this.graph = this.my_Graph_Algo.getGraph();
        setFrame();

    }

    public void setFrame() {
        ImageIcon image = new ImageIcon("src/GUI/slogn dor harizi.jpg");
        this.preferredSize();
        this.setSize(scale.width, scale.height);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());
        this.getContentPane().setLayout(null);
        this.setBackground(Color.black);
        this.setVisible(true);
    }

    protected class Panel extends JPanel {
        private myGraphAlgo my_Algo_Graph;


        public Panel(DirectedWeightedGraph g) throws Exception {
            this.my_Algo_Graph = new myGraphAlgo();
            this.my_Algo_Graph.init(g);

            if (this.my_Algo_Graph.getGraph() == null) {
                throw new Exception("Activist the graph filed\n " +
                        "The graph didn't change or didn't exist");
            }
            int width = scale.width;
            int height = (int) (scale.height * 0.8);
            this.setLayout(new BorderLayout());
            this.setPreferredSize(new Dimension((int) (width / 1.5), (int) (height / 1.5)));
            repaint();
        }

        public void paint(Graphics g) {
            Graphics2D graph2D = (Graphics2D) g;
            graph2D.setPaint(Color.BLACK);
            graph2D.setStroke(new BasicStroke(1));
            Iterator<api.NodeData> tmpIter = graph.nodeIter();
            minX = Integer.MAX_VALUE;
            minY = Integer.MAX_VALUE;
            maxY = Integer.MIN_VALUE;
            maxX = Integer.MIN_VALUE;
            while (tmpIter.hasNext()) {
                api.NodeData tmpNode = tmpIter.next();
                if (tmpNode.getLocation().x() < minX) {
                    minX = tmpNode.getLocation().x();
                }
                if (tmpNode.getLocation().x() > maxX) {
                    maxX = tmpNode.getLocation().x();
                }
                if (tmpNode.getLocation().y() < minY) {
                    minY = tmpNode.getLocation().y();
                }
                if (tmpNode.getLocation().y() > maxY) {
                    maxY = tmpNode.getLocation().y();
                }
            }
            double ABSx = Math.abs(minX - maxX);
            double ABSy = Math.abs(minY - maxY);
            double scaleX = (getWidth() / ABSx) * 0.8;
            double scaleY = (getHeight() / ABSy) * 0.8;

            Iterator<api.NodeData> nodesIter = graph.nodeIter();
            while (nodesIter.hasNext()) {
                graph2D.setPaint(Color.BLACK);
                graph2D.setStroke(new BasicStroke(1));
                api.NodeData n = nodesIter.next();
                double x = (n.getLocation().x() - minX) * scaleX * 0.98 + 30;
                double y = (n.getLocation().y() - minY) * scaleY * 0.98 + 30;
                graph2D.fillOval((int) x - (scale.height / 2)+30, (int) y - (scale.width / 2)+30, scale.width, scale.height);
            }
            Iterator<EdgeData> edgesIter = graph.edgeIter();
            while (edgesIter.hasNext()) {
                EdgeData e = edgesIter.next();
                graph2D.setPaint(Color.yellow);
                double srcX = (graph.getNode(e.getSrc()).getLocation().x() - minX) * scaleX * 0.98 + 30;
                int x1 = (int) srcX;
                double srcY = (graph.getNode(e.getSrc()).getLocation().y() - minY) * scaleY * 0.98 + 30;
                int y1 = (int) srcY;
                double destX = (graph.getNode(e.getDest()).getLocation().x() - minX) * scaleX * 0.98 + 30;
                int x2 = (int) destX;
                double destY = (graph.getNode(e.getDest()).getLocation().y() - minY) * scaleY * 0.98 + 30;
                int y2 = (int) destY;
                graph2D.setStroke(new BasicStroke(3));
                graph2D.setPaint(Color.yellow);
                drawArrowLine(graph2D, x1, y1, x2, y2, 15, 7);
            }
        }
            /**
             * Draw an arrow line between two points.
             * @param g the graphics component.
             * @param x1 x-position of first point.
             * @param y1 y-position of first point.
             * @param x2 x-position of second point.
             * @param y2 y-position of second point.
             * @param d  the width of the arrow.
             * @param h  the height of the arrow.
             * this code has been taken from:
             *          https://stackoverflow.com/questions/2027613/how-to-draw-a-directed-arrow-line-in-java,
             *          with some modifications to fit to out needs.
             */
            /**
             * Draw an arrow line between two points.
             * @param g the graphics component.
             * @param x1 x-position of first point.
             * @param y1 y-position of first point.
             * @param x2 x-position of second point.
             * @param y2 y-position of second point.
             * @param d  the width of the arrow.
             * @param h  the height of the arrow.
             * this code has been taken from:
             *          https://stackoverflow.com/questions/2027613/how-to-draw-a-directed-arrow-line-in-java,
             *          with some modifications to fit to out needs.
             */
            private void drawArrowLine (Graphics g,int x1, int y1, int x2, int y2, int d, int h){
                int dx = x2 - x1, dy = y2 - y1;
                double D = Math.sqrt(dx * dx + dy * dy);
                double xm = D - d, xn = xm, ym = h, yn = -h, x;
                double sin = dy / D, cos = dx / D;

                x = xm * cos - ym * sin + x1;
                ym = xm * sin + ym * cos + y1;
                xm = x;

                x = xn * cos - yn * sin + x1;
                yn = xn * sin + yn * cos + y1;
                xn = x;

                int[] Xpoints = {x2, (int) xm, (int) xn};
                int[] Ypoints = {y2, (int) ym, (int) yn};
                g.drawLine(x1, y1, x2, y2);
                g.setColor(Color.white);
                g.fillPolygon(Xpoints, Ypoints, 3);
            }

        }
    }