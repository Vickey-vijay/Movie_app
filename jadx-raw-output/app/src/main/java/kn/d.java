package kn;

import com.ironsource.Z7;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import mn.g;
import mn.m;
import org.fourthline.cling.binding.xml.Descriptor$Device$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.types.InvalidValueException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import un.i;
import un.k;
import un.l;
import yn.h;
import yn.r;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: UDA10DeviceDescriptorBinderImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements a, ErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f62949a = Logger.getLogger(a.class.getName());

    public static URI r(String str) {
        if (str.startsWith("www.")) {
            str = "http://" + str;
        }
        if (str.contains(Z7.f27998r)) {
            str = str.replaceAll(Z7.f27998r, "%20");
        }
        try {
            return URI.create(str);
        } catch (Throwable th2) {
            f62949a.fine("Illegal URI, trying with ./ prefix: " + so.a.a(th2));
            try {
                return URI.create("./" + str);
            } catch (IllegalArgumentException e10) {
                f62949a.warning("Illegal URI '" + str + "', ignoring value: " + so.a.a(e10));
                return null;
            }
        }
    }

    @Override // kn.a
    public <D extends un.a> D a(D d10, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f62949a.fine("Populating device from XML descriptor: " + d10);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            return (D) e(d10, documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse device descriptor: " + e11.toString(), e11);
        }
    }

    @Override // kn.a
    public String b(un.a aVar, vn.c cVar, g gVar) throws DescriptorBindingException {
        try {
            f62949a.fine("Generating XML descriptor from device model: " + aVar);
            return m.i(c(aVar, cVar, gVar));
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not build DOM: " + e10.getMessage(), e10);
        }
    }

    public Document c(un.a aVar, vn.c cVar, g gVar) throws DescriptorBindingException {
        try {
            f62949a.fine("Generating DOM from device model: " + aVar);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            i(gVar, aVar, documentNewDocument, cVar);
            return documentNewDocument;
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not generate device descriptor: " + e10.getMessage(), e10);
        }
    }

    public <D extends un.a> D e(D d10, Document document) throws ValidationException, DescriptorBindingException {
        try {
            f62949a.fine("Populating device from DOM: " + d10);
            jn.d dVar = new jn.d();
            o(dVar, document.getDocumentElement());
            return (D) d(d10, dVar);
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse device DOM: " + e11.toString(), e11);
        }
    }

    public void f(g gVar, un.a aVar, Document document, Element element, vn.c cVar) {
        Element elementA = m.a(document, element, Descriptor$Device$ELEMENT.device);
        m.e(document, elementA, Descriptor$Device$ELEMENT.deviceType, aVar.getType());
        un.b bVarN = aVar.n(cVar);
        m.e(document, elementA, Descriptor$Device$ELEMENT.friendlyName, bVarN.d());
        if (bVarN.e() != null) {
            m.e(document, elementA, Descriptor$Device$ELEMENT.manufacturer, bVarN.e().a());
            m.e(document, elementA, Descriptor$Device$ELEMENT.manufacturerURL, bVarN.e().b());
        }
        if (bVarN.f() != null) {
            m.e(document, elementA, Descriptor$Device$ELEMENT.modelDescription, bVarN.f().a());
            m.e(document, elementA, Descriptor$Device$ELEMENT.modelName, bVarN.f().b());
            m.e(document, elementA, Descriptor$Device$ELEMENT.modelNumber, bVarN.f().c());
            m.e(document, elementA, Descriptor$Device$ELEMENT.modelURL, bVarN.f().d());
        }
        m.e(document, elementA, Descriptor$Device$ELEMENT.serialNumber, bVarN.i());
        m.e(document, elementA, Descriptor$Device$ELEMENT.UDN, aVar.r().b());
        m.e(document, elementA, Descriptor$Device$ELEMENT.presentationURL, bVarN.g());
        m.e(document, elementA, Descriptor$Device$ELEMENT.UPC, bVarN.j());
        if (bVarN.c() != null) {
            for (h hVar : bVarN.c()) {
                m.g(document, elementA, "dlna:" + Descriptor$Device$ELEMENT.X_DLNADOC, hVar, "urn:schemas-dlna-org:device-1-0");
            }
        }
        m.g(document, elementA, "dlna:" + Descriptor$Device$ELEMENT.X_DLNACAP, bVarN.b(), "urn:schemas-dlna-org:device-1-0");
        m.g(document, elementA, "sec:" + Descriptor$Device$ELEMENT.ProductCap, bVarN.h(), "http://www.sec.co.kr/dlna");
        m.g(document, elementA, "sec:" + Descriptor$Device$ELEMENT.X_ProductCap, bVarN.h(), "http://www.sec.co.kr/dlna");
        h(gVar, aVar, document, elementA);
        j(gVar, aVar, document, elementA);
        g(gVar, aVar, document, elementA, cVar);
    }

    public void i(g gVar, un.a aVar, Document document, vn.c cVar) {
        Element elementCreateElementNS = document.createElementNS("urn:schemas-upnp-org:device-1-0", Descriptor$Device$ELEMENT.root.toString());
        document.appendChild(elementCreateElementNS);
        k(gVar, aVar, document, elementCreateElementNS);
        f(gVar, aVar, document, elementCreateElementNS, cVar);
    }

    public void k(g gVar, un.a aVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Device$ELEMENT.specVersion);
        m.e(document, elementA, Descriptor$Device$ELEMENT.major, Integer.valueOf(aVar.v().a()));
        m.e(document, elementA, Descriptor$Device$ELEMENT.minor, Integer.valueOf(aVar.v().b()));
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f62949a.warning(sAXParseException.toString());
    }

    public <D extends un.a> D d(D d10, jn.d dVar) throws ValidationException {
        return (D) dVar.a(d10);
    }

    public void g(g gVar, un.a aVar, Document document, Element element, vn.c cVar) {
        if (!aVar.w()) {
            return;
        }
        Element elementA = m.a(document, element, Descriptor$Device$ELEMENT.deviceList);
        for (un.a aVar2 : aVar.p()) {
            f(gVar, aVar2, document, elementA, cVar);
        }
    }

    public void h(g gVar, un.a aVar, Document document, Element element) {
        if (!aVar.x()) {
            return;
        }
        Element elementA = m.a(document, element, Descriptor$Device$ELEMENT.iconList);
        for (un.d dVar : aVar.q()) {
            Element elementA2 = m.a(document, elementA, Descriptor$Device$ELEMENT.icon);
            m.e(document, elementA2, Descriptor$Device$ELEMENT.mimetype, dVar.f());
            m.e(document, elementA2, Descriptor$Device$ELEMENT.width, Integer.valueOf(dVar.h()));
            m.e(document, elementA2, Descriptor$Device$ELEMENT.height, Integer.valueOf(dVar.e()));
            m.e(document, elementA2, Descriptor$Device$ELEMENT.depth, Integer.valueOf(dVar.c()));
            if (aVar instanceof i) {
                m.e(document, elementA2, Descriptor$Device$ELEMENT.url, dVar.g());
            } else if (aVar instanceof un.e) {
                m.e(document, elementA2, Descriptor$Device$ELEMENT.url, gVar.k(dVar));
            }
        }
    }

    public void j(g gVar, un.a aVar, Document document, Element element) {
        if (!aVar.y()) {
            return;
        }
        Element elementA = m.a(document, element, Descriptor$Device$ELEMENT.serviceList);
        for (l lVar : aVar.u()) {
            Element elementA2 = m.a(document, elementA, Descriptor$Device$ELEMENT.service);
            m.e(document, elementA2, Descriptor$Device$ELEMENT.serviceType, lVar.g());
            m.e(document, elementA2, Descriptor$Device$ELEMENT.serviceId, lVar.f());
            if (lVar instanceof k) {
                k kVar = (k) lVar;
                m.e(document, elementA2, Descriptor$Device$ELEMENT.SCPDURL, kVar.o());
                m.e(document, elementA2, Descriptor$Device$ELEMENT.controlURL, kVar.n());
                m.e(document, elementA2, Descriptor$Device$ELEMENT.eventSubURL, kVar.p());
            } else if (lVar instanceof un.f) {
                un.f fVar = (un.f) lVar;
                m.e(document, elementA2, Descriptor$Device$ELEMENT.SCPDURL, gVar.e(fVar));
                m.e(document, elementA2, Descriptor$Device$ELEMENT.controlURL, gVar.c(fVar));
                m.e(document, elementA2, Descriptor$Device$ELEMENT.eventSubURL, gVar.j(fVar));
            }
        }
    }

    public void l(jn.d dVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Device$ELEMENT.deviceType.equals(nodeItem)) {
                    dVar.f61959d = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.friendlyName.equals(nodeItem)) {
                    dVar.f61960e = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.manufacturer.equals(nodeItem)) {
                    dVar.f61961f = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.manufacturerURL.equals(nodeItem)) {
                    dVar.f61962g = r(m.m(nodeItem));
                } else if (Descriptor$Device$ELEMENT.modelDescription.equals(nodeItem)) {
                    dVar.f61964i = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.modelName.equals(nodeItem)) {
                    dVar.f61963h = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.modelNumber.equals(nodeItem)) {
                    dVar.f61965j = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.modelURL.equals(nodeItem)) {
                    dVar.f61966k = r(m.m(nodeItem));
                } else if (Descriptor$Device$ELEMENT.presentationURL.equals(nodeItem)) {
                    dVar.f61969n = r(m.m(nodeItem));
                } else if (Descriptor$Device$ELEMENT.UPC.equals(nodeItem)) {
                    dVar.f61968m = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.serialNumber.equals(nodeItem)) {
                    dVar.f61967l = m.m(nodeItem);
                } else if (Descriptor$Device$ELEMENT.UDN.equals(nodeItem)) {
                    dVar.f61956a = z.b(m.m(nodeItem));
                } else if (Descriptor$Device$ELEMENT.iconList.equals(nodeItem)) {
                    n(dVar, nodeItem);
                } else if (Descriptor$Device$ELEMENT.serviceList.equals(nodeItem)) {
                    p(dVar, nodeItem);
                } else if (Descriptor$Device$ELEMENT.deviceList.equals(nodeItem)) {
                    m(dVar, nodeItem);
                } else if (Descriptor$Device$ELEMENT.X_DLNADOC.equals(nodeItem) && "dlna".equals(nodeItem.getPrefix())) {
                    String strM = m.m(nodeItem);
                    try {
                        dVar.f61970o.add(h.c(strM));
                    } catch (InvalidValueException unused) {
                        f62949a.info("Invalid X_DLNADOC value, ignoring value: " + strM);
                    }
                } else if (Descriptor$Device$ELEMENT.X_DLNACAP.equals(nodeItem) && "dlna".equals(nodeItem.getPrefix())) {
                    dVar.f61971p = yn.g.b(m.m(nodeItem));
                }
            }
        }
    }

    public void m(jn.d dVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Device$ELEMENT.device.equals(nodeItem)) {
                jn.d dVar2 = new jn.d();
                dVar2.f61975t = dVar;
                dVar.f61974s.add(dVar2);
                l(dVar2, nodeItem);
            }
        }
    }

    public void n(jn.d dVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Device$ELEMENT.icon.equals(nodeItem)) {
                jn.e eVar = new jn.e();
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                    Node nodeItem2 = childNodes2.item(i11);
                    if (nodeItem2.getNodeType() == 1) {
                        if (Descriptor$Device$ELEMENT.width.equals(nodeItem2)) {
                            eVar.f61977b = Integer.valueOf(m.m(nodeItem2)).intValue();
                        } else if (Descriptor$Device$ELEMENT.height.equals(nodeItem2)) {
                            eVar.f61978c = Integer.valueOf(m.m(nodeItem2)).intValue();
                        } else if (Descriptor$Device$ELEMENT.depth.equals(nodeItem2)) {
                            String strM = m.m(nodeItem2);
                            try {
                                eVar.f61979d = Integer.valueOf(strM).intValue();
                            } catch (NumberFormatException e10) {
                                f62949a.warning("Invalid icon depth '" + strM + "', using 16 as default: " + e10);
                                eVar.f61979d = 16;
                            }
                        } else if (Descriptor$Device$ELEMENT.url.equals(nodeItem2)) {
                            eVar.f61980e = r(m.m(nodeItem2));
                        } else if (Descriptor$Device$ELEMENT.mimetype.equals(nodeItem2)) {
                            try {
                                String strM2 = m.m(nodeItem2);
                                eVar.f61976a = strM2;
                                so.c.f(strM2);
                            } catch (IllegalArgumentException unused) {
                                f62949a.warning("Ignoring invalid icon mime type: " + eVar.f61976a);
                                eVar.f61976a = "";
                            }
                        }
                    }
                }
                dVar.f61972q.add(eVar);
            }
        }
    }

    public void o(jn.d dVar, Element element) throws DescriptorBindingException {
        if (element.getNamespaceURI() == null || !element.getNamespaceURI().equals("urn:schemas-upnp-org:device-1-0")) {
            f62949a.warning("Wrong XML namespace declared on root element: " + element.getNamespaceURI());
        }
        if (element.getNodeName().equals(Descriptor$Device$ELEMENT.root.name())) {
            NodeList childNodes = element.getChildNodes();
            Node node = null;
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (nodeItem.getNodeType() == 1) {
                    if (Descriptor$Device$ELEMENT.specVersion.equals(nodeItem)) {
                        q(dVar, nodeItem);
                    } else if (Descriptor$Device$ELEMENT.URLBase.equals(nodeItem)) {
                        try {
                            String strM = m.m(nodeItem);
                            if (strM != null && strM.length() > 0) {
                                dVar.f61958c = new URL(strM);
                            }
                        } catch (Exception e10) {
                            throw new DescriptorBindingException("Invalid URLBase: " + e10.getMessage());
                        }
                    } else if (Descriptor$Device$ELEMENT.device.equals(nodeItem)) {
                        if (node == null) {
                            node = nodeItem;
                        } else {
                            throw new DescriptorBindingException("Found multiple <device> elements in <root>");
                        }
                    } else {
                        f62949a.finer("Ignoring unknown element: " + nodeItem.getNodeName());
                    }
                }
            }
            if (node != null) {
                l(dVar, node);
                return;
            }
            throw new DescriptorBindingException("No <device> element in <root>");
        }
        throw new DescriptorBindingException("Root element name is not <root>: " + element.getNodeName());
    }

    public void p(jn.d dVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Device$ELEMENT.service.equals(nodeItem)) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                try {
                    jn.f fVar = new jn.f();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node nodeItem2 = childNodes2.item(i11);
                        if (nodeItem2.getNodeType() == 1) {
                            if (Descriptor$Device$ELEMENT.serviceType.equals(nodeItem2)) {
                                fVar.f61981a = s.d(m.m(nodeItem2));
                            } else if (Descriptor$Device$ELEMENT.serviceId.equals(nodeItem2)) {
                                fVar.f61982b = r.c(m.m(nodeItem2));
                            } else if (Descriptor$Device$ELEMENT.SCPDURL.equals(nodeItem2)) {
                                fVar.f61983c = r(m.m(nodeItem2));
                            } else if (Descriptor$Device$ELEMENT.controlURL.equals(nodeItem2)) {
                                fVar.f61984d = r(m.m(nodeItem2));
                            } else if (Descriptor$Device$ELEMENT.eventSubURL.equals(nodeItem2)) {
                                fVar.f61985e = r(m.m(nodeItem2));
                            }
                        }
                    }
                    dVar.f61973r.add(fVar);
                } catch (InvalidValueException e10) {
                    f62949a.warning("UPnP specification violation, skipping invalid service declaration. " + e10.getMessage());
                }
            }
        }
    }

    public void q(jn.d dVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Device$ELEMENT.major.equals(nodeItem)) {
                    String strTrim = m.m(nodeItem).trim();
                    if (!strTrim.equals("1")) {
                        f62949a.warning("Unsupported UDA major version, ignoring: " + strTrim);
                        strTrim = "1";
                    }
                    dVar.f61957b.f61994a = Integer.valueOf(strTrim).intValue();
                } else if (Descriptor$Device$ELEMENT.minor.equals(nodeItem)) {
                    String strTrim2 = m.m(nodeItem).trim();
                    if (!strTrim2.equals("0")) {
                        f62949a.warning("Unsupported UDA minor version, ignoring: " + strTrim2);
                        strTrim2 = "0";
                    }
                    dVar.f61957b.f61995b = Integer.valueOf(strTrim2).intValue();
                }
            }
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
