
package uts.wsd.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uts.wsd.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TextbooksLists_QNAME = new QName("http://www.uts.edu.au/31284/wsd-diary", "TextbooksLists");
    private final static QName _Exception_QNAME = new QName("http://soap.wsd.uts/", "Exception");
    private final static QName _IOException_QNAME = new QName("http://soap.wsd.uts/", "IOException");
    private final static QName _BookApp_QNAME = new QName("http://soap.wsd.uts/", "bookApp");
    private final static QName _FetchTextbook_QNAME = new QName("http://soap.wsd.uts/", "fetchTextbook");
    private final static QName _FetchTextbookResponse_QNAME = new QName("http://soap.wsd.uts/", "fetchTextbookResponse");
    private final static QName _FetchTextbooks_QNAME = new QName("http://soap.wsd.uts/", "fetchTextbooks");
    private final static QName _FetchTextbooksResponse_QNAME = new QName("http://soap.wsd.uts/", "fetchTextbooksResponse");
    private final static QName _GetBookApp_QNAME = new QName("http://soap.wsd.uts/", "getBookApp");
    private final static QName _GetBookAppResponse_QNAME = new QName("http://soap.wsd.uts/", "getBookAppResponse");
    private final static QName _Hello_QNAME = new QName("http://soap.wsd.uts/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://soap.wsd.uts/", "helloResponse");
    private final static QName _Textbooks_QNAME = new QName("http://soap.wsd.uts/", "textbooks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uts.wsd.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextbooksLists }
     * 
     */
    public TextbooksLists createTextbooksLists() {
        return new TextbooksLists();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link BookApplication }
     * 
     */
    public BookApplication createBookApplication() {
        return new BookApplication();
    }

    /**
     * Create an instance of {@link FetchTextbook }
     * 
     */
    public FetchTextbook createFetchTextbook() {
        return new FetchTextbook();
    }

    /**
     * Create an instance of {@link FetchTextbookResponse }
     * 
     */
    public FetchTextbookResponse createFetchTextbookResponse() {
        return new FetchTextbookResponse();
    }

    /**
     * Create an instance of {@link FetchTextbooks }
     * 
     */
    public FetchTextbooks createFetchTextbooks() {
        return new FetchTextbooks();
    }

    /**
     * Create an instance of {@link FetchTextbooksResponse }
     * 
     */
    public FetchTextbooksResponse createFetchTextbooksResponse() {
        return new FetchTextbooksResponse();
    }

    /**
     * Create an instance of {@link GetBookApp }
     * 
     */
    public GetBookApp createGetBookApp() {
        return new GetBookApp();
    }

    /**
     * Create an instance of {@link GetBookAppResponse }
     * 
     */
    public GetBookAppResponse createGetBookAppResponse() {
        return new GetBookAppResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Textbooks }
     * 
     */
    public Textbooks createTextbooks() {
        return new Textbooks();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextbooksLists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uts.edu.au/31284/wsd-diary", name = "TextbooksLists")
    public JAXBElement<TextbooksLists> createTextbooksLists(TextbooksLists value) {
        return new JAXBElement<TextbooksLists>(_TextbooksLists_QNAME, TextbooksLists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "bookApp")
    public JAXBElement<BookApplication> createBookApp(BookApplication value) {
        return new JAXBElement<BookApplication>(_BookApp_QNAME, BookApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTextbook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchTextbook")
    public JAXBElement<FetchTextbook> createFetchTextbook(FetchTextbook value) {
        return new JAXBElement<FetchTextbook>(_FetchTextbook_QNAME, FetchTextbook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTextbookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchTextbookResponse")
    public JAXBElement<FetchTextbookResponse> createFetchTextbookResponse(FetchTextbookResponse value) {
        return new JAXBElement<FetchTextbookResponse>(_FetchTextbookResponse_QNAME, FetchTextbookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTextbooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchTextbooks")
    public JAXBElement<FetchTextbooks> createFetchTextbooks(FetchTextbooks value) {
        return new JAXBElement<FetchTextbooks>(_FetchTextbooks_QNAME, FetchTextbooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTextbooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchTextbooksResponse")
    public JAXBElement<FetchTextbooksResponse> createFetchTextbooksResponse(FetchTextbooksResponse value) {
        return new JAXBElement<FetchTextbooksResponse>(_FetchTextbooksResponse_QNAME, FetchTextbooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getBookApp")
    public JAXBElement<GetBookApp> createGetBookApp(GetBookApp value) {
        return new JAXBElement<GetBookApp>(_GetBookApp_QNAME, GetBookApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "getBookAppResponse")
    public JAXBElement<GetBookAppResponse> createGetBookAppResponse(GetBookAppResponse value) {
        return new JAXBElement<GetBookAppResponse>(_GetBookAppResponse_QNAME, GetBookAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Textbooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "textbooks")
    public JAXBElement<Textbooks> createTextbooks(Textbooks value) {
        return new JAXBElement<Textbooks>(_Textbooks_QNAME, Textbooks.class, null, value);
    }

}
