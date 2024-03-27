package com.langworthytech.report;

import com.lowagie.text.DocumentException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ReportGenerator playground = new ReportGenerator();

        try {
            playground.createReport(args[0]);
        } catch (DocumentException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
