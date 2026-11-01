package uo;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/* JADX INFO: compiled from: CatalogResourceResolver.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements LSResourceResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f72992b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<URI, URL> f72993a;

    /* JADX INFO: renamed from: uo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CatalogResourceResolver.java */
    public static final class C0762a implements LSInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InputStream f72994a;

        @Override // org.w3c.dom.ls.LSInput
        public String getBaseURI() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public boolean getCertifiedText() {
            return false;
        }

        @Override // org.w3c.dom.ls.LSInput
        public Reader getCharacterStream() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public String getEncoding() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public String getPublicId() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public String getStringData() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public String getSystemId() {
            return null;
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setBaseURI(String str) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setByteStream(InputStream inputStream) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setCertifiedText(boolean z10) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setCharacterStream(Reader reader) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setEncoding(String str) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setPublicId(String str) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setStringData(String str) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public void setSystemId(String str) {
        }

        @Override // org.w3c.dom.ls.LSInput
        public InputStream getByteStream() {
            return this.f72994a;
        }

        public C0762a(InputStream inputStream) {
            this.f72994a = inputStream;
        }
    }

    @Override // org.w3c.dom.ls.LSResourceResolver
    public LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
        f72992b.finest("Trying to resolve system identifier URI in catalog: " + str4);
        URL url = this.f72993a.get(URI.create(str4));
        if (url == null) {
            f72992b.info("System identifier not found in catalog, continuing with default resolution (this most likely means remote HTTP request!): " + str4);
            return null;
        }
        f72992b.finest("Loading catalog resource: " + url);
        try {
            C0762a c0762a = new C0762a(url.openStream());
            c0762a.setBaseURI(str5);
            c0762a.setSystemId(str4);
            c0762a.setPublicId(str3);
            return c0762a;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public a(Map<URI, URL> map) {
        this.f72993a = map;
    }
}
