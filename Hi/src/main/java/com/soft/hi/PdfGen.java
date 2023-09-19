package com.soft.hi;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfGen {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\HP\\Desktop\\input.txt";
        String outputFilePath = "C:\\Users\\HP\\Desktop\\one.pdf";

        convertTextToPdf(inputFilePath, outputFilePath);
    }

    public static void convertTextToPdf(String inputFilePath, String outputFilePath) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(outputFilePath));
            document.open();

            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                document.add(new Paragraph(line));
            }
            reader.close();

            document.close();
            System.out.println("Conversion successful. PDF created at: " + outputFilePath);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
