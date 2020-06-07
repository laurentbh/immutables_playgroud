package org.example;

import org.example.ressources.ImmutableTopLevel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ImmutableTopLevel obj = ImmutableTopLevel.builder()
                .code(1)
                .name("lol")
                .build();
    }
}
