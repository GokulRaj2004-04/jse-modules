package com.document;

public class PdfDocumentFactory extends DocumentFactory {
	public Doc createDocument() {
        return new PdfDocument();
    }
}
