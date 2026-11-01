package uo;

import com.vungle.ads.internal.model.AdPayload;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Source;
import org.seamless.xml.ParserException;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* JADX INFO: compiled from: DOMParser.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b<D> implements ErrorHandler, EntityResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f72995b = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final URL f72996c = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Source[] f72997a;

    public b() {
        this(null);
    }

    public static String a(String str) {
        return b(str, false, false);
    }

    public static String b(String str, boolean z10, boolean z11) {
        String str2;
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                str2 = "&#34;";
            } else if (cCharAt == '&') {
                str2 = "&#38;";
            } else if (cCharAt != '<') {
                str2 = cCharAt != '>' ? null : "&#62;";
            } else {
                str2 = "&#60;";
            }
            if (str2 != null) {
                sb2.append(str2);
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (z11) {
            Matcher matcher = Pattern.compile("(\\n+)(\\s*)(.*)").matcher(string);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(2);
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < strGroup.length(); i11++) {
                    sb3.append("&#160;");
                }
                matcher.appendReplacement(stringBuffer, "$1" + sb3.toString() + "$3");
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        return z10 ? string.replaceAll("\n", "<br/>") : string;
    }

    public b(Source[] sourceArr) {
        this.f72997a = sourceArr;
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(new ParserException(sAXParseException));
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(new ParserException(sAXParseException));
    }

    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
        InputSource inputSource = str2.startsWith(AdPayload.FILE_SCHEME) ? new InputSource(new FileInputStream(new File(URI.create(str2)))) : new InputSource(new ByteArrayInputStream(new byte[0]));
        inputSource.setPublicId(str);
        inputSource.setSystemId(str2);
        return inputSource;
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f72995b.warning(sAXParseException.toString());
    }
}
