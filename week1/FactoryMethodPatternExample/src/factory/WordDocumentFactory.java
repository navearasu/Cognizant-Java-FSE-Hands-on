package factory;

import Doc.Document;
import Doc.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
  public Document createDocument()
  {
	  return new WordDocument();
  }
}