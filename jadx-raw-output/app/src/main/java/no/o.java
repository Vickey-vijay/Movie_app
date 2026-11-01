package no;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* JADX INFO: compiled from: SOAPActionProcessorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class o implements po.h, ErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f64920a = Logger.getLogger(po.h.class.getName());

    public void D(Document document, Element element, nn.d dVar) {
        Element elementCreateElementNS = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Fault");
        element.appendChild(elementCreateElementNS);
        mn.m.c(document, elementCreateElementNS, "faultcode", "s:Client");
        mn.m.c(document, elementCreateElementNS, "faultstring", "UPnPError");
        Element elementCreateElement = document.createElement("detail");
        elementCreateElementNS.appendChild(elementCreateElement);
        Element elementCreateElementNS2 = document.createElementNS("urn:schemas-upnp-org:control-1-0", "UPnPError");
        elementCreateElement.appendChild(elementCreateElementNS2);
        int errorCode = dVar.c().getErrorCode();
        String message = dVar.c().getMessage();
        f64920a.fine("Writing fault element: " + errorCode + " - " + message);
        mn.m.c(document, elementCreateElementNS2, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(errorCode));
        mn.m.c(document, elementCreateElementNS2, "errorDescription", message);
    }

    @Override // po.h
    public void a(qn.b bVar, nn.d dVar) throws UnsupportedDataException {
        f64920a.fine("Reading body of " + bVar + " for: " + dVar);
        if (f64920a.isLoggable(Level.FINER)) {
            f64920a.finer("===================================== SOAP BODY BEGIN ============================================");
            f64920a.finer(bVar.d());
            f64920a.finer("-===================================== SOAP BODY END ============================================");
        }
        String strI = i(bVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryE = e();
            documentBuilderFactoryE.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryE.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            Document document = documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(strI)));
            r(document, p(document), bVar, dVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10, strI);
        }
    }

    @Override // po.h
    public void b(qn.c cVar, nn.d dVar) throws UnsupportedDataException {
        f64920a.fine("Writing body of " + cVar + " for: " + dVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            Element elementZ = z(documentNewDocument);
            if (dVar.c() != null) {
                A(documentNewDocument, elementZ, cVar, dVar);
            } else {
                C(documentNewDocument, elementZ, cVar, dVar);
            }
            if (f64920a.isLoggable(Level.FINER)) {
                f64920a.finer("===================================== SOAP BODY BEGIN ============================================");
                f64920a.finer(cVar.d());
                f64920a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10);
        }
    }

    @Override // po.h
    public void c(qn.c cVar, nn.d dVar) throws UnsupportedDataException {
        f64920a.fine("Reading body of " + cVar + " for: " + dVar);
        if (f64920a.isLoggable(Level.FINER)) {
            f64920a.finer("===================================== SOAP BODY BEGIN ============================================");
            f64920a.finer(cVar.d());
            f64920a.finer("-===================================== SOAP BODY END ============================================");
        }
        String strI = i(cVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryE = e();
            documentBuilderFactoryE.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryE.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            Document document = documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(strI)));
            Element elementP = p(document);
            ActionException actionExceptionQ = q(document, elementP);
            if (actionExceptionQ == null) {
                s(document, elementP, cVar, dVar);
            } else {
                dVar.i(actionExceptionQ);
            }
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10, strI);
        }
    }

    @Override // po.h
    public void d(qn.b bVar, nn.d dVar) throws UnsupportedDataException {
        f64920a.fine("Writing body of " + bVar + " for: " + dVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            B(documentNewDocument, z(documentNewDocument), bVar, dVar);
            if (f64920a.isLoggable(Level.FINER)) {
                f64920a.finer("===================================== SOAP BODY BEGIN ============================================");
                f64920a.finer(bVar.d());
                f64920a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10);
        }
    }

    public nn.b f(ActionArgument actionArgument, String str) throws ActionException {
        try {
            return new nn.b(actionArgument, str);
        } catch (InvalidValueException e10) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Wrong type or invalid value for '" + actionArgument.e() + "': " + e10.getMessage(), e10);
        }
    }

    public List<Node> h(NodeList nodeList, ActionArgument[] actionArgumentArr) throws ActionException {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.e());
            arrayList.addAll(Arrays.asList(actionArgument.b()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Node nodeItem = nodeList.item(i10);
            if (nodeItem.getNodeType() == 1 && arrayList.contains(j(nodeItem))) {
                arrayList2.add(nodeItem);
            }
        }
        if (arrayList2.size() >= actionArgumentArr.length) {
            return arrayList2;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + arrayList2.size());
    }

    public ActionException t(Element element) {
        NodeList childNodes = element.getChildNodes();
        String strM = null;
        String strM2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            short s10 = 1;
            if (nodeItem.getNodeType() == 1 && j(nodeItem).equals("Fault")) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                int i11 = 0;
                while (i11 < childNodes2.getLength()) {
                    Node nodeItem2 = childNodes2.item(i11);
                    if (nodeItem2.getNodeType() == s10 && j(nodeItem2).equals("detail")) {
                        NodeList childNodes3 = nodeItem2.getChildNodes();
                        int i12 = 0;
                        while (i12 < childNodes3.getLength()) {
                            Node nodeItem3 = childNodes3.item(i12);
                            if (nodeItem3.getNodeType() == s10 && j(nodeItem3).equals("UPnPError")) {
                                NodeList childNodes4 = nodeItem3.getChildNodes();
                                int i13 = 0;
                                while (i13 < childNodes4.getLength()) {
                                    Node nodeItem4 = childNodes4.item(i13);
                                    if (nodeItem4.getNodeType() == s10) {
                                        if (j(nodeItem4).equals(IronSourceConstants.EVENTS_ERROR_CODE)) {
                                            strM = mn.m.m(nodeItem4);
                                        }
                                        if (j(nodeItem4).equals("errorDescription")) {
                                            strM2 = mn.m.m(nodeItem4);
                                        }
                                    }
                                    i13++;
                                    s10 = 1;
                                }
                            }
                            i12++;
                            s10 = 1;
                        }
                    }
                    i11++;
                    s10 = 1;
                }
                z10 = true;
            }
        }
        if (strM == null) {
            if (z10) {
                throw new RuntimeException("Received fault element but no error code");
            }
            return null;
        }
        try {
            int iIntValue = Integer.valueOf(strM).intValue();
            ErrorCode byCode = ErrorCode.getByCode(iIntValue);
            if (byCode != null) {
                f64920a.fine("Reading fault element: " + byCode.getCode() + " - " + strM2);
                return new ActionException(byCode, strM2, false);
            }
            f64920a.fine("Reading fault element: " + iIntValue + " - " + strM2);
            return new ActionException(iIntValue, strM2);
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Error code was not a number");
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f64920a.warning(sAXParseException.toString());
    }

    public Element x(Document document, Element element, qn.b bVar, nn.d dVar) {
        f64920a.fine("Writing action request element: " + dVar.a().d());
        Element elementCreateElementNS = document.createElementNS(bVar.a(), "u:" + dVar.a().d());
        element.appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    public Element y(Document document, Element element, qn.c cVar, nn.d dVar) {
        f64920a.fine("Writing action response element: " + dVar.a().d());
        Element elementCreateElementNS = document.createElementNS(cVar.a(), "u:" + dVar.a().d() + "Response");
        element.appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    public Element z(Document document) {
        Element elementCreateElementNS = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Envelope");
        Attr attrCreateAttributeNS = document.createAttributeNS("http://schemas.xmlsoap.org/soap/envelope/", "s:encodingStyle");
        attrCreateAttributeNS.setValue("http://schemas.xmlsoap.org/soap/encoding/");
        elementCreateElementNS.setAttributeNode(attrCreateAttributeNS);
        document.appendChild(elementCreateElementNS);
        Element elementCreateElementNS2 = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Body");
        elementCreateElementNS.appendChild(elementCreateElementNS2);
        return elementCreateElementNS2;
    }

    public void A(Document document, Element element, qn.c cVar, nn.d dVar) throws Exception {
        D(document, element, dVar);
        cVar.b(u(document));
    }

    public void B(Document document, Element element, qn.b bVar, nn.d dVar) throws Exception {
        v(document, x(document, element, bVar, dVar), dVar);
        bVar.b(u(document));
    }

    public void C(Document document, Element element, qn.c cVar, nn.d dVar) throws Exception {
        w(document, y(document, element, cVar, dVar), dVar);
        cVar.b(u(document));
    }

    public DocumentBuilderFactory e() throws FactoryConfigurationError {
        return DocumentBuilderFactory.newInstance();
    }

    public Node g(List<Node> list, ActionArgument actionArgument) {
        for (Node node : list) {
            if (actionArgument.g(j(node))) {
                return node;
            }
        }
        return null;
    }

    public String i(qn.a aVar) throws UnsupportedDataException {
        if (aVar.c()) {
            return aVar.d().trim();
        }
        throw new UnsupportedDataException("Can't transform null or non-string/zero-length body of: " + aVar);
    }

    public String j(Node node) {
        if (node.getPrefix() != null) {
            return node.getNodeName().substring(node.getPrefix().length() + 1);
        }
        return node.getNodeName();
    }

    public void k(Element element, nn.d dVar) throws ActionException {
        dVar.l(o(element.getChildNodes(), dVar.a().c()));
    }

    public void l(Element element, nn.d dVar) throws ActionException {
        dVar.n(o(element.getChildNodes(), dVar.a().f()));
    }

    public Element m(Element element, qn.b bVar, nn.d dVar) {
        NodeList childNodes = element.getChildNodes();
        f64920a.fine("Looking for action request element matching namespace:" + bVar.a());
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                String strJ = j(nodeItem);
                if (strJ.equals(dVar.a().d())) {
                    if (nodeItem.getNamespaceURI() != null && nodeItem.getNamespaceURI().equals(bVar.a())) {
                        f64920a.fine("Reading action request element: " + strJ);
                        return (Element) nodeItem;
                    }
                    throw new UnsupportedDataException("Illegal or missing namespace on action request element: " + nodeItem);
                }
            }
        }
        throw new UnsupportedDataException("Could not read action request element matching namespace: " + bVar.a());
    }

    public Element n(Element element, nn.d dVar) {
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (j(nodeItem).equals(dVar.a().d() + "Response")) {
                    f64920a.fine("Reading action response element: " + j(nodeItem));
                    return (Element) nodeItem;
                }
            }
        }
        f64920a.fine("Could not read action response element");
        return null;
    }

    public nn.b[] o(NodeList nodeList, ActionArgument[] actionArgumentArr) throws ActionException {
        List<Node> listH = h(nodeList, actionArgumentArr);
        nn.b[] bVarArr = new nn.b[actionArgumentArr.length];
        for (int i10 = 0; i10 < actionArgumentArr.length; i10++) {
            ActionArgument actionArgument = actionArgumentArr[i10];
            Node nodeG = g(listH, actionArgument);
            if (nodeG != null) {
                f64920a.fine("Reading action argument: " + actionArgument.e());
                bVarArr[i10] = f(actionArgument, mn.m.m(nodeG));
            } else {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Could not find argument '" + actionArgument.e() + "' node");
            }
        }
        return bVarArr;
    }

    public Element p(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null && j(documentElement).equals("Envelope")) {
            NodeList childNodes = documentElement.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (nodeItem.getNodeType() == 1 && j(nodeItem).equals("Body")) {
                    return (Element) nodeItem;
                }
            }
            throw new RuntimeException("Response envelope did not contain 'Body' child element");
        }
        throw new RuntimeException("Response root element was not 'Envelope'");
    }

    public ActionException q(Document document, Element element) throws Exception {
        return t(element);
    }

    public void r(Document document, Element element, qn.b bVar, nn.d dVar) throws Exception {
        k(m(element, bVar, dVar), dVar);
    }

    public void s(Document document, Element element, qn.c cVar, nn.d dVar) throws Exception {
        l(n(element, dVar), dVar);
    }

    public String u(Document document) throws Exception {
        String strI = mn.m.i(document);
        while (true) {
            if (!strI.endsWith("\n") && !strI.endsWith("\r")) {
                return strI;
            }
            strI = strI.substring(0, strI.length() - 1);
        }
    }

    public void v(Document document, Element element, nn.d dVar) {
        String string;
        for (ActionArgument actionArgument : dVar.a().c()) {
            f64920a.fine("Writing action input argument: " + actionArgument.e());
            if (dVar.e(actionArgument) != null) {
                string = dVar.e(actionArgument).toString();
            } else {
                string = "";
            }
            mn.m.c(document, element, actionArgument.e(), string);
        }
    }

    public void w(Document document, Element element, nn.d dVar) {
        String string;
        for (ActionArgument actionArgument : dVar.a().f()) {
            f64920a.fine("Writing action output argument: " + actionArgument.e());
            if (dVar.g(actionArgument) != null) {
                string = dVar.g(actionArgument).toString();
            } else {
                string = "";
            }
            mn.m.c(document, element, actionArgument.e(), string);
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }
}
