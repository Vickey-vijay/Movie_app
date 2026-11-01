package org.fourthline.cling.support.lastchange;

import ho.j;
import java.io.StringReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import mn.m;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;
import org.seamless.xml.SAXParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LastChangeParser extends SAXParser {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f65805e = Logger.getLogger(LastChangeParser.class.getName());

    public class a extends SAXParser.a<j> {
        public a(j jVar, SAXParser.a aVar) {
            super(jVar, aVar);
        }

        @Override // org.seamless.xml.SAXParser.a
        public boolean d(String str, String str2, String str3) {
            return CONSTANTS.InstanceID.equals(str2);
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            super.startElement(str, str2, str3, attributes);
            int length = attributes.getLength();
            Map.Entry<String, String>[] entryArr = new Map.Entry[length];
            for (int i10 = 0; i10 < length; i10++) {
                entryArr[i10] = new AbstractMap$SimpleEntry(attributes.getLocalName(i10), attributes.getValue(i10));
            }
            try {
                ho.b bVarI = LastChangeParser.this.i(str2, entryArr);
                if (bVarI != null) {
                    b().b().add(bVarI);
                }
            } catch (Exception e10) {
                LastChangeParser.f65805e.warning("Error reading event XML, ignoring value: " + so.a.a(e10));
            }
        }
    }

    public class b extends SAXParser.a<ho.a> {
        public b(ho.a aVar, SAXParser sAXParser) {
            super(aVar, sAXParser);
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            String value;
            super.startElement(str, str2, str3, attributes);
            if (CONSTANTS.InstanceID.equals(str2) && (value = attributes.getValue(CONSTANTS.val.name())) != null) {
                j jVar = new j(new org.fourthline.cling.model.types.b(value));
                b().a().add(jVar);
                LastChangeParser.this.new a(jVar, this);
            }
        }
    }

    public abstract String o();

    public enum CONSTANTS {
        Event,
        InstanceID,
        val;

        public boolean equals(String str) {
            return name().equals(str);
        }
    }

    public Set<Class<? extends ho.b>> n() {
        return Collections.EMPTY_SET;
    }

    public ho.a p(String str) throws Exception {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Null or empty XML");
        }
        ho.a aVar = new ho.a();
        new b(aVar, this);
        Logger logger = f65805e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Parsing 'LastChange' event XML content");
            logger.fine("===================================== 'LastChange' BEGIN ============================================");
            logger.fine(str);
            logger.fine("====================================== 'LastChange' END  ============================================");
        }
        f(new InputSource(new StringReader(str)));
        logger.fine("Parsed event with instances IDs: " + aVar.a().size());
        if (logger.isLoggable(Level.FINEST)) {
            for (j jVar : aVar.a()) {
                f65805e.finest("InstanceID '" + jVar.a() + "' has values: " + jVar.b().size());
                for (ho.b bVar : jVar.b()) {
                    f65805e.finest(bVar.c() + " => " + bVar.d());
                }
            }
        }
        return aVar;
    }

    public Document h(ho.a aVar) throws Exception {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
        m(aVar, documentNewDocument);
        return documentNewDocument;
    }

    public ho.b i(String str, Map.Entry<String, String>[] entryArr) throws Exception {
        for (Class<? extends ho.b> cls : n()) {
            if (cls.getSimpleName().equals(str)) {
                return cls.getConstructor(Map.Entry[].class).newInstance(entryArr);
            }
        }
        return null;
    }

    public String j(ho.a aVar) throws Exception {
        return m.h(h(aVar));
    }

    public void k(ho.b bVar, Document document, Element element) {
        String strC = bVar.c();
        Map.Entry<String, String>[] entryArrA = bVar.a();
        if (entryArrA != null && entryArrA.length > 0) {
            Element elementB = m.b(document, element, strC);
            for (Map.Entry<String, String> entry : entryArrA) {
                elementB.setAttribute(entry.getKey(), uo.b.a(entry.getValue()));
            }
        }
    }

    public void l(ho.a aVar, Document document, Element element) {
        for (j jVar : aVar.a()) {
            if (jVar.a() != null) {
                Element elementB = m.b(document, element, CONSTANTS.InstanceID.name());
                elementB.setAttribute(CONSTANTS.val.name(), jVar.a().toString());
                Iterator<ho.b> it = jVar.b().iterator();
                while (it.hasNext()) {
                    k(it.next(), document, elementB);
                }
            }
        }
    }

    public void m(ho.a aVar, Document document) {
        Element elementCreateElementNS = document.createElementNS(o(), CONSTANTS.Event.name());
        document.appendChild(elementCreateElementNS);
        l(aVar, document, elementCreateElementNS);
    }
}
