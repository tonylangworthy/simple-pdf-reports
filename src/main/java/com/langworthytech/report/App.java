package com.langworthytech.report;

import com.lowagie.text.DocumentException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        if(args.length < 1) {
            System.err.println("Please specify your desired output path as an argument.");
            System.exit(1);
        }

        ReportGenerator playground = new ReportGenerator();

        try {
            playground.createReport(args[0]);
        } catch (DocumentException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
