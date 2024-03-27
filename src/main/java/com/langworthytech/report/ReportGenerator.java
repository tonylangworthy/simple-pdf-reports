package com.langworthytech.report;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReportGenerator {

    public void createReport(String outputFilepath) throws FileNotFoundException {

        Document doc = new Document(PageSize.A4);

        PdfWriter.getInstance(doc, new FileOutputStream(outputFilepath));
        doc.open();
        createTable(doc);
        doc.close();
    }

    private void createTable(Document doc) {

        float width = doc.getPageSize().getWidth();

        float[] columnDefinitionSize = {20F, 20F, 20F, 20F, 20F};

        PdfPTable table = new PdfPTable(columnDefinitionSize);
        table.getDefaultCell().setBorder(0);
        table.setHorizontalAlignment(0);
        table.setTotalWidth(width - 72);
        table.setLockedWidth(true);

        table.setHeaderRows(1);
        table.addCell("vin");
        table.addCell("year");
        table.addCell("make");
        table.addCell("model");
        table.addCell("location");

        VehicleData data = new VehicleData();
        data.vehicleList().forEach(v -> {
            addTableRow(table, v);
        });
        doc.add(table);
    }

    private void addTableRow(PdfPTable table, VehicleModel vehicle) {

        Font font8 = FontFactory.getFont(FontFactory.HELVETICA, 8);

        table.addCell(new Phrase(vehicle.getVin(), font8));
        table.addCell(new Phrase(vehicle.getYear(), font8));
        table.addCell(new Phrase(vehicle.getMake(), font8));
        table.addCell(new Phrase(vehicle.getModel(), font8));
        table.addCell(new Phrase(vehicle.getCity() + ", " + vehicle.getState(), font8));
    }
}
