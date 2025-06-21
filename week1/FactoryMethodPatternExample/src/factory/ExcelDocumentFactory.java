package factory;

import Doc.Document;
import Doc.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument()
    {
    	return new ExcelDocument();
    }
}