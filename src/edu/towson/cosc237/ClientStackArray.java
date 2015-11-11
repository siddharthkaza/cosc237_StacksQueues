/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class ClientStackArray { 
    public static void main(String[] args) { 
        StackClassArray<Integer> intStack = new StackClassArray<Integer>(10); 
        StackClassArray<Integer> tempStack = new StackClassArray<Integer>(10); 
        Integer stackItem; 
        intStack.push(37); 
        intStack.push(10); 
        intStack.push(20); 
        intStack.push(27); 
        System.out.println("After push (37, 10, 20, 27) the top is: " + intStack.peek()); 
        System.out.println("The original stack in reverse order is: "); 
        while (!intStack.isEmptyStack())  { 
            stackItem = intStack.peek(); 
            System.out.print(stackItem + " "); 
            tempStack.push(stackItem); 
            intStack.pop(); 
        } 
        System.out.println("\nAfter print, the original stack is empty, temp stack is the reverse copy of the original."); 
        System.out.println("The original stack in direct order (temp stack in reverse order)is:"); 
        while (!tempStack.isEmptyStack())  { 
            stackItem = tempStack.peek(); 
            System.out.print(stackItem + " "); 
            intStack.push(stackItem); 
            tempStack.pop(); 
        } 
        System.out.println("\nAfter print, the copy stack is empty, the original stack was rebuilt."); 
        System.out.println("Can use the original stack in the remaining program."); 
    } 
} 
