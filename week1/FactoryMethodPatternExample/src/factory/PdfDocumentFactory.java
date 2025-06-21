package factory;

import Doc.Document;
import Doc.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory{
   public Document createDocument()
   {
	   return new PdfDocument();
   }
}