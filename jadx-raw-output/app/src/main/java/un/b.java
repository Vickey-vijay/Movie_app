package un;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: DeviceDetails.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f72928k = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f72929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f72931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f72932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f72933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f72934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final URI f72935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yn.h[] f72936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yn.g f72937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yn.g f72938j;

    public b(String str, g gVar, h hVar) {
        this(null, str, gVar, hVar, null, null, null);
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri) {
        this(url, str, gVar, hVar, str2, str3, uri, null, null);
    }

    public URL a() {
        return this.f72929a;
    }

    public yn.g b() {
        return this.f72937i;
    }

    public yn.h[] c() {
        return this.f72936h;
    }

    public String d() {
        return this.f72930b;
    }

    public g e() {
        return this.f72931c;
    }

    public h f() {
        return this.f72932d;
    }

    public URI g() {
        return this.f72935g;
    }

    public yn.g h() {
        return this.f72938j;
    }

    public String i() {
        return this.f72933e;
    }

    public String j() {
        return this.f72934f;
    }

    public List<mn.k> k() {
        ArrayList arrayList = new ArrayList();
        if (j() != null) {
            if (j().length() != 12) {
                f72928k.fine("UPnP specification violation, UPC must be 12 digits: " + j());
            } else {
                try {
                    Long.parseLong(j());
                } catch (NumberFormatException unused) {
                    f72928k.fine("UPnP specification violation, UPC must be 12 digits all-numeric: " + j());
                }
            }
        }
        return arrayList;
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri, yn.h[] hVarArr, yn.g gVar2) {
        this(url, str, gVar, hVar, str2, str3, uri, hVarArr, gVar2, null);
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri, yn.h[] hVarArr, yn.g gVar2, yn.g gVar3) {
        this.f72929a = url;
        this.f72930b = str;
        this.f72931c = gVar == null ? new g() : gVar;
        this.f72932d = hVar == null ? new h() : hVar;
        this.f72933e = str2;
        this.f72934f = str3;
        this.f72935g = uri;
        this.f72936h = hVarArr == null ? new yn.h[0] : hVarArr;
        this.f72937i = gVar2;
        this.f72938j = gVar3;
    }
}
