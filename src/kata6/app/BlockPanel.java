package kata6.app;

import kata6.view.BlockDisplay;
import kata6.model.Block;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BlockPanel extends JPanel implements BlockDisplay {
    private static final int SIZE = 100;
    private Block block;
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        int d = Block.MAX * SIZE;
        g.setColor(Color.black);
        
        // Se dibujan las líneas verticales y horizontales del panel
        for (int i=0; i<= Block.MAX; i++){
            int c = i*SIZE;
            g.drawLine(0,c,d,c);
            g.drawLine(c, 0, c, d);
        }
        if(block == null) return;
        g.setColor(Color.red);
        g.fillRect((block.x()-1) * SIZE, (Block.MAX - block.y()) * SIZE, SIZE, SIZE);
    }

    @Override
    public void display(Block block) {
       this.block = block;
       repaint();
    }
    @Override
    public void changed() {
        repaint();
    }
    
}