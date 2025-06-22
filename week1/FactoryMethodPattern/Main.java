package com.document;

public class Main {
	public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactoryyy();
        Doc wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Doc pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Doc excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
