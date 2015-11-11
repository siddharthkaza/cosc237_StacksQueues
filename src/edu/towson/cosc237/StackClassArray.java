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
public class StackClassArray<T> implements StackADT<T> { 
    private int maxStackSize;  //variable to store the maximum stack size 
    private int stackTop;      //variable to point to the top of the stack 
    private T[] list;          //array of reference variables

   //Default constructor 
    public StackClassArray() { 
        maxStackSize = 100; 
        stackTop = 0; 
        list = (T[]) new Object[maxStackSize]; //create the array 
    }

    //Constructor with a parameter 
    public StackClassArray(int stackSize) { 
        if (stackSize <= 0) { 
            System.err.println("The size must be positive."); 
            System.err.println("Creating an array of the size 100."); 
            maxStackSize = 100; 
        } 
        else 
            maxStackSize = stackSize; 
        stackTop = 0; 
        list = (T[]) new Object[maxStackSize]; //create the array 
    }

    public void initializeStack()     { 
        for (int i = 0; i < stackTop; i++) 
            list[i] = null; 
        stackTop = 0; 
    }

    public boolean isEmptyStack() { 
        return (stackTop == 0); 
    }

    public boolean isFullStack()    { 
        return (stackTop == maxStackSize); 
    }

    public T peek()  { 
        if (isEmptyStack()) { 
            System.err.println("No top - the stack is empty!"); 
            return (T) list[0]; 
        } 
        else 
            return (T) list[stackTop - 1]; 
    }

    public void push(T newItem) { 
        if (isFullStack()) 
            System.err.println("Cannot push in a full stack!"); 
        else 
            list[stackTop] = newItem; 
        stackTop++; 
    }

    public void pop() { 
        if (isEmptyStack()) 
           System.err.println("Cannot pop from an empty stack!"); 
        else 
            stackTop--; 
        list[stackTop] = null; 
    } 
}
