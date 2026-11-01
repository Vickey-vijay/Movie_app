package uo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: XmlPullParserUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f72998a = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static XmlPullParserFactory f72999b;

    static {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            f72999b = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            f72998a.severe("cannot create XmlPullParserFactory instance: " + e10);
        }
    }

    public static XmlPullParser a() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactory = f72999b;
        if (xmlPullParserFactory != null) {
            return xmlPullParserFactory.newPullParser();
        }
        throw new XmlPullParserException("no XML Pull parser factory");
    }

    public static XmlPullParser b(String str) throws XmlPullParserException {
        XmlPullParser xmlPullParserA = a();
        try {
            xmlPullParserA.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
            return xmlPullParserA;
        } catch (UnsupportedEncodingException unused) {
            throw new XmlPullParserException("UTF-8: unsupported encoding");
        }
    }

    public static String c(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '&') {
                String strSubstring = str.substring(i10, Math.min(i10 + 10, str.length()));
                if (strSubstring.startsWith("&#") || strSubstring.startsWith("&lt;") || strSubstring.startsWith("&gt;") || strSubstring.startsWith("&amp;") || strSubstring.startsWith("&apos;") || strSubstring.startsWith("&quot;")) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("&amp;");
                    z10 = true;
                }
            } else {
                sb2.append(cCharAt);
            }
        }
        if (z10) {
            f72998a.warning("fixed badly encoded entities in XML");
        }
        return sb2.toString();
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static void e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 2 && xmlPullParser.getName().equals(str)) {
                    return;
                }
            } else {
                throw new IOException(String.format("tag '%s' not found", str));
            }
        }
    }
}
