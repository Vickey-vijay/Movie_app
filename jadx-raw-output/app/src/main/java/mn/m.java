package mn;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: XMLUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static Element c(Document document, Element element, String str, Object obj) {
        return d(document, element, str, obj, null);
    }

    public static Element e(Document document, Element element, Enum r10, Object obj) {
        return f(document, element, r10, obj, null);
    }

    public static String i(Document document) throws Exception {
        return j(document, true);
    }

    public static String k(String str) {
        return l(str, true);
    }

    public static Element d(Document document, Element element, String str, Object obj, String str2) {
        Element elementCreateElementNS = str2 != null ? document.createElementNS(str2, str) : document.createElement(str);
        if (obj != null) {
            elementCreateElementNS.appendChild(document.createTextNode(obj.toString()));
        }
        element.appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    public static Element g(Document document, Element element, String str, Object obj, String str2) {
        return obj == null ? element : d(document, element, str, obj, str2);
    }

    public static String j(Document document, boolean z10) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"");
        sb2.append(z10 ? "yes" : "no");
        sb2.append("\"?>");
        return sb2.toString() + n(document.getDocumentElement(), new HashSet(), document.getDocumentElement().getNamespaceURI());
    }

    public static String l(String str, boolean z10) {
        String strReplaceAll = str.replaceAll(C3426d4.j.f28584c, "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        return z10 ? strReplaceAll.replaceAll("'", "&apos;").replaceAll("\"", "&quot;") : strReplaceAll;
    }

    public static String m(Node node) {
        StringBuffer stringBuffer = new StringBuffer();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 3) {
                stringBuffer.append(nodeItem.getNodeValue());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String n(Node node, Set<String> set, String str) throws Exception {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        if (node == null) {
            return "";
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            sb2.append("<");
            sb2.append(element.getNodeName());
            HashMap map = new HashMap();
            if (element.getPrefix() != null && !set.contains(element.getPrefix())) {
                map.put(element.getPrefix(), element.getNamespaceURI());
            }
            if (element.hasAttributes()) {
                NamedNodeMap attributes = element.getAttributes();
                for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                    Node nodeItem = attributes.item(i10);
                    if (!nodeItem.getNodeName().startsWith("xmlns")) {
                        if (nodeItem.getPrefix() != null && !set.contains(nodeItem.getPrefix())) {
                            map.put(nodeItem.getPrefix(), element.getNamespaceURI());
                        }
                        sb2.append(Z7.f27998r);
                        sb2.append(nodeItem.getNodeName());
                        sb2.append("=\"");
                        sb2.append(nodeItem.getNodeValue());
                        sb2.append("\"");
                    }
                }
            }
            if (str != null && !map.containsValue(str) && !str.equals(element.getParentNode().getNamespaceURI())) {
                sb2.append(" xmlns=\"");
                sb2.append(str);
                sb2.append("\"");
            }
            for (Map.Entry entry : map.entrySet()) {
                sb2.append(" xmlns:");
                sb2.append((String) entry.getKey());
                sb2.append("=\"");
                sb2.append((String) entry.getValue());
                sb2.append("\"");
                set.add(entry.getKey());
            }
            NodeList childNodes = element.getChildNodes();
            int i11 = 0;
            while (true) {
                if (i11 >= childNodes.getLength()) {
                    z10 = true;
                    break;
                }
                if (childNodes.item(i11).getNodeType() != 2) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                sb2.append("/>");
            } else {
                sb2.append(">");
                for (int i12 = 0; i12 < childNodes.getLength(); i12++) {
                    sb2.append(n(childNodes.item(i12), set, childNodes.item(i12).getNamespaceURI()));
                }
                sb2.append("</");
                sb2.append(element.getNodeName());
                sb2.append(">");
            }
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                set.remove((String) it.next());
            }
        } else if (node.getNodeValue() != null) {
            sb2.append(l(node.getNodeValue(), node instanceof Attr));
        }
        return sb2.toString();
    }

    public static Element a(Document document, Element element, Enum r10) {
        return b(document, element, r10.toString());
    }

    public static Element b(Document document, Element element, String str) {
        Element elementCreateElement = document.createElement(str);
        element.appendChild(elementCreateElement);
        return elementCreateElement;
    }

    public static Element f(Document document, Element element, Enum r10, Object obj, String str) {
        return g(document, element, r10.toString(), obj, str);
    }

    public static String h(Document document) throws Exception {
        return n(document.getDocumentElement(), new HashSet(), document.getDocumentElement().getNamespaceURI());
    }
}
