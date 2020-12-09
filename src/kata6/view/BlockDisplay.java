package kata6.view;

import kata6.model.Block;

/**
 *
 * @author Juanjo
 */
public interface BlockDisplay extends Block.Observer {
    void display(Block block);
    
    
}
