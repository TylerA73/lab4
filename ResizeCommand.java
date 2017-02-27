/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Rectangle;

/**
 *
 * @author Tyler
 */
public class ResizeCommand implements Command{
    Rectangle r;
    int height;
    int width;
    
    
    ResizeCommand(int w, int h, Rectangle r){
        this.r = r;
        width = w;
        height = h;
    }
    
    @Override
    public void execute(){
        this.r.setSize(width, height);
    }
    
    @Override
    public void undo(){
        
    }
    
}
