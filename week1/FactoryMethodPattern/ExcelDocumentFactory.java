package com.document;

public class ExcelDocumentFactory extends DocumentFactory {
	public Doc createDocument() {
        return new ExcelDocument();
    }

}
