package kn;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jn.g;
import mn.m;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import un.k;
import un.l;
import un.o;

/* JADX INFO: compiled from: UDA10ServiceDescriptorBinderImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements c, ErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f62950a = Logger.getLogger(c.class.getName());

    @Override // kn.c
    public String a(l lVar) throws DescriptorBindingException {
        try {
            f62950a.fine("Generating XML descriptor from service model: " + lVar);
            return m.i(c(lVar));
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not build DOM: " + e10.getMessage(), e10);
        }
    }

    @Override // kn.c
    public <S extends l> S b(S s10, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f62950a.fine("Populating service from XML descriptor: " + s10);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            return (S) e(s10, documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e11.toString(), e11);
        }
    }

    public Document c(l lVar) throws DescriptorBindingException {
        try {
            f62950a.fine("Generating XML descriptor from service model: " + lVar);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            i(lVar, documentNewDocument);
            return documentNewDocument;
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not generate service descriptor: " + e10.getMessage(), e10);
        }
    }

    public <S extends l> S e(S s10, Document document) throws ValidationException, DescriptorBindingException {
        try {
            f62950a.fine("Populating service from DOM: " + s10);
            jn.f fVar = new jn.f();
            p(fVar, s10);
            q(fVar, document.getDocumentElement());
            return (S) d(s10, fVar);
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service DOM: " + e11.toString(), e11);
        }
    }

    public final void f(org.fourthline.cling.model.meta.a aVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.action);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, aVar.d());
        if (aVar.h()) {
            Element elementA2 = m.a(document, elementA, Descriptor$Service$ELEMENT.argumentList);
            for (ActionArgument actionArgument : aVar.a()) {
                g(actionArgument, document, elementA2);
            }
        }
    }

    public final void g(ActionArgument actionArgument, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.argument);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, actionArgument.e());
        m.e(document, elementA, Descriptor$Service$ELEMENT.direction, actionArgument.d().toString().toLowerCase(Locale.ROOT));
        if (actionArgument.h()) {
            f62950a.warning("UPnP specification violation: Not producing <retval> element to be compatible with WMP12: " + actionArgument);
        }
        m.e(document, elementA, Descriptor$Service$ELEMENT.relatedStateVariable, actionArgument.f());
    }

    public final void h(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.actionList);
        for (org.fourthline.cling.model.meta.a aVar : lVar.b()) {
            if (!aVar.d().equals("QueryStateVariable")) {
                f(aVar, document, elementA);
            }
        }
    }

    public final void i(l lVar, Document document) {
        Element elementCreateElementNS = document.createElementNS("urn:schemas-upnp-org:service-1-0", Descriptor$Service$ELEMENT.scpd.toString());
        document.appendChild(elementCreateElementNS);
        k(lVar, document, elementCreateElementNS);
        if (lVar.j()) {
            h(lVar, document, elementCreateElementNS);
        }
        j(lVar, document, elementCreateElementNS);
    }

    public final void j(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.serviceStateTable);
        for (un.m mVar : lVar.i()) {
            l(mVar, document, elementA);
        }
    }

    public final void k(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.specVersion);
        m.e(document, elementA, Descriptor$Service$ELEMENT.major, Integer.valueOf(lVar.d().v().a()));
        m.e(document, elementA, Descriptor$Service$ELEMENT.minor, Integer.valueOf(lVar.d().v().b()));
    }

    public final void l(un.m mVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.stateVariable);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, mVar.b());
        if (mVar.d().d() instanceof yn.f) {
            m.e(document, elementA, Descriptor$Service$ELEMENT.dataType, ((yn.f) mVar.d().d()).h());
        } else {
            m.e(document, elementA, Descriptor$Service$ELEMENT.dataType, mVar.d().d().b().getDescriptorName());
        }
        m.e(document, elementA, Descriptor$Service$ELEMENT.defaultValue, mVar.d().e());
        if (mVar.a().c()) {
            elementA.setAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString(), "yes");
        } else {
            elementA.setAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString(), "no");
        }
        if (mVar.d().c() != null) {
            Element elementA2 = m.a(document, elementA, Descriptor$Service$ELEMENT.allowedValueList);
            for (String str : mVar.d().c()) {
                m.e(document, elementA2, Descriptor$Service$ELEMENT.allowedValue, str);
            }
        }
        if (mVar.d().b() != null) {
            Element elementA3 = m.a(document, elementA, Descriptor$Service$ELEMENT.allowedValueRange);
            m.e(document, elementA3, Descriptor$Service$ELEMENT.minimum, Long.valueOf(mVar.d().b().b()));
            m.e(document, elementA3, Descriptor$Service$ELEMENT.maximum, Long.valueOf(mVar.d().b().a()));
            if (mVar.d().b().c() >= 1) {
                m.e(document, elementA3, Descriptor$Service$ELEMENT.step, Long.valueOf(mVar.d().b().c()));
            }
        }
    }

    public void q(jn.f fVar, Element element) throws DescriptorBindingException {
        if (!Descriptor$Service$ELEMENT.scpd.equals((Node) element)) {
            throw new DescriptorBindingException("Root element name is not <scpd>: " + element.getNodeName());
        }
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && !Descriptor$Service$ELEMENT.specVersion.equals(nodeItem)) {
                if (Descriptor$Service$ELEMENT.actionList.equals(nodeItem)) {
                    o(fVar, nodeItem);
                } else if (Descriptor$Service$ELEMENT.serviceStateTable.equals(nodeItem)) {
                    r(fVar, nodeItem);
                } else {
                    f62950a.finer("Ignoring unknown element: " + nodeItem.getNodeName());
                }
            }
        }
    }

    public void s(g gVar, Element element) {
        gVar.f61993f = new o(element.getAttribute("sendEvents") != null && element.getAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString()).toUpperCase(Locale.ROOT).equals("YES"));
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    gVar.f61988a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.dataType.equals(nodeItem)) {
                    String strM = m.m(nodeItem);
                    Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strM);
                    gVar.f61989b = byDescriptorName != null ? byDescriptorName.getDatatype() : new yn.f(strM);
                } else if (Descriptor$Service$ELEMENT.defaultValue.equals(nodeItem)) {
                    gVar.f61990c = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.allowedValueList.equals(nodeItem)) {
                    ArrayList arrayList = new ArrayList();
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node nodeItem2 = childNodes2.item(i11);
                        if (nodeItem2.getNodeType() == 1 && Descriptor$Service$ELEMENT.allowedValue.equals(nodeItem2)) {
                            arrayList.add(m.m(nodeItem2));
                        }
                    }
                    gVar.f61991d = arrayList;
                } else if (Descriptor$Service$ELEMENT.allowedValueRange.equals(nodeItem)) {
                    jn.c cVar = new jn.c();
                    NodeList childNodes3 = nodeItem.getChildNodes();
                    for (int i12 = 0; i12 < childNodes3.getLength(); i12++) {
                        Node nodeItem3 = childNodes3.item(i12);
                        if (nodeItem3.getNodeType() == 1) {
                            if (Descriptor$Service$ELEMENT.minimum.equals(nodeItem3)) {
                                try {
                                    cVar.f61953a = Long.valueOf(m.m(nodeItem3));
                                } catch (Exception unused) {
                                }
                            } else if (Descriptor$Service$ELEMENT.maximum.equals(nodeItem3)) {
                                cVar.f61954b = Long.valueOf(m.m(nodeItem3));
                            } else if (Descriptor$Service$ELEMENT.step.equals(nodeItem3)) {
                                cVar.f61955c = Long.valueOf(m.m(nodeItem3));
                            }
                        }
                    }
                    gVar.f61992e = cVar;
                }
            }
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f62950a.warning(sAXParseException.toString());
    }

    public <S extends l> S d(S s10, jn.f fVar) throws ValidationException {
        return (S) fVar.a(s10.d());
    }

    public void m(jn.a aVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    aVar.f61947a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.argumentList.equals(nodeItem)) {
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node nodeItem2 = childNodes2.item(i11);
                        if (nodeItem2.getNodeType() == 1) {
                            jn.b bVar = new jn.b();
                            n(bVar, nodeItem2);
                            aVar.f61948b.add(bVar);
                        }
                    }
                }
            }
        }
    }

    public void n(jn.b bVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    bVar.f61949a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.direction.equals(nodeItem)) {
                    String strM = m.m(nodeItem);
                    try {
                        bVar.f61951c = ActionArgument.Direction.valueOf(strM.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                        f62950a.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + strM);
                        bVar.f61951c = ActionArgument.Direction.IN;
                    }
                } else if (Descriptor$Service$ELEMENT.relatedStateVariable.equals(nodeItem)) {
                    bVar.f61950b = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.retval.equals(nodeItem)) {
                    bVar.f61952d = true;
                }
            }
        }
    }

    public void o(jn.f fVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Service$ELEMENT.action.equals(nodeItem)) {
                jn.a aVar = new jn.a();
                m(aVar, nodeItem);
                fVar.f61986f.add(aVar);
            }
        }
    }

    public void p(jn.f fVar, l lVar) {
        fVar.f61982b = lVar.f();
        fVar.f61981a = lVar.g();
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            fVar.f61984d = kVar.n();
            fVar.f61985e = kVar.p();
            fVar.f61983c = kVar.o();
        }
    }

    public void r(jn.f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Service$ELEMENT.stateVariable.equals(nodeItem)) {
                g gVar = new g();
                s(gVar, (Element) nodeItem);
                fVar.f61987g.add(gVar);
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
