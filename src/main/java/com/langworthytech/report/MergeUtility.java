package com.langworthytech.report;

import com.lowagie.text.Document;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeUtility {

    private String basePath = "/Users/tonylangworthy/Documents/uploads";
    private String[] templates = {"bill-of-sale.pdf", "good-buyers-guide.pdf",
            "odometer-disclosure-statement.pdf", "title-application.pdf"};

    public void test() {

        PdfCopyFields newPdf = null;

        try {
            newPdf = new PdfCopyFields(new FileOutputStream(basePath + "/concatenatedforms.pdf"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(String file: templates) {
            try(PdfReader reader = new PdfReader(basePath + "/templates/" + file)) {
            newPdf.addDocument(reader);

         } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }

        }
        newPdf.close();
    }
}
