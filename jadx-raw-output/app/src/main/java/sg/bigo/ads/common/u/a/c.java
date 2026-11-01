package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f69911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public URL f69912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f69914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f69915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final URL f69916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpURLConnection f69918h;

    private c(@NonNull sg.bigo.ads.common.u.b.c cVar, @Nullable URL url, @Nullable URL url2, @NonNull b bVar, @Nullable g gVar) {
        this.f69913c = false;
        this.f69911a = cVar;
        this.f69912b = url;
        this.f69916f = url2;
        this.f69914d = bVar;
        this.f69915e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public c(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull b bVar, @Nullable g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f69915e == null || !this.f69911a.f69954o) {
            return new URL(uri.toString());
        }
        Uri.Builder builderBuildUpon = Uri.parse(uri.toString()).buildUpon();
        a(builderBuildUpon, "sdk_ver", this.f69915e.y());
        a(builderBuildUpon, "sdk_vc", "50602");
        a(builderBuildUpon, "country", this.f69915e.U());
        a(builderBuildUpon, MBridgeConstans.APP_KEY, this.f69915e.a());
        a(builderBuildUpon, "pkg_ver", this.f69915e.c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f69915e.d());
        a(builderBuildUpon, "pkg_vc", sb2.toString());
        a(builderBuildUpon, Q6.F, this.f69915e.i());
        a(builderBuildUpon, "os_ver", this.f69915e.j());
        a(builderBuildUpon, "os_lang", this.f69915e.k());
        a(builderBuildUpon, "vendor", this.f69915e.l());
        a(builderBuildUpon, "model", this.f69915e.m());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f69915e.p());
        a(builderBuildUpon, "dpi", sb3.toString());
        a(builderBuildUpon, "dpi_f", this.f69915e.q());
        a(builderBuildUpon, "resolution", this.f69915e.o());
        a(builderBuildUpon, "net", this.f69915e.r());
        a(builderBuildUpon, "tz", this.f69915e.s());
        if (this.f69911a.f()) {
            a(builderBuildUpon, "enc", "1");
        }
        return new URL(builderBuildUpon.build().toString());
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final HttpURLConnection a() throws IOException {
        BufferedOutputStream bufferedOutputStream;
        g gVar;
        URL urlA = this.f69916f;
        if (urlA == null) {
            this.f69911a.a("PreHost");
            T t10 = this.f69911a.f69950k;
            String strA = t10.a();
            String strF = t10.f();
            String strD = t10.d();
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strD) && !TextUtils.equals(strF, strD)) {
                this.f69911a.a("PreHost", strF);
            }
            if (t10.e()) {
                this.f69911a.a("Host", strD);
            }
            this.f69911a.h();
            urlA = a(Uri.parse(strA));
            this.f69912b = urlA;
        } else if (urlA != null && this.f69915e != null && this.f69911a.f69954o) {
            urlA = a(Uri.parse(urlA.toString()));
        }
        boolean zEqualsIgnoreCase = "HTTPS".equalsIgnoreCase(urlA.getProtocol());
        URLConnection uRLConnectionOpenConnection = urlA.openConnection();
        this.f69918h = zEqualsIgnoreCase ? (HttpsURLConnection) uRLConnectionOpenConnection : (HttpURLConnection) uRLConnectionOpenConnection;
        this.f69918h.setInstanceFollowRedirects(false);
        this.f69918h.setDoInput(true);
        this.f69918h.setUseCaches(false);
        this.f69918h.setConnectTimeout((int) this.f69911a.f69952m);
        this.f69918h.setReadTimeout((int) this.f69911a.f69952m);
        this.f69918h.setRequestMethod(this.f69911a.a());
        Map<String, Set<String>> map = this.f69911a.f69953n;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList("Keep-Alive")));
        }
        Set<String> set = map.get(Command.HTTP_HEADER_RANGE);
        Set<String> set2 = map.get("Accept-Encoding");
        if (k.a(set) && k.a(set2)) {
            this.f69913c = true;
            map.put("Accept-Encoding", new HashSet(Collections.singletonList("gzip")));
        }
        if (!map.containsKey("Host")) {
            String str = null;
            try {
                b bVar = this.f69914d;
                String host = this.f69918h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f69910a.get(host);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("Host", new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f69918h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] bArrC = this.f69911a.c();
        if (bArrC != null && bArrC.length > 0) {
            f fVarB = this.f69911a.b();
            if (fVarB != null) {
                this.f69918h.setRequestProperty("Content-Type", fVarB.toString());
            }
            this.f69918h.setDoOutput(true);
            if (!(this.f69911a instanceof sg.bigo.ads.common.u.b.b) || (gVar = this.f69915e) == null || !gVar.ax() || sg.bigo.ads.common.x.a.F()) {
                this.f69918h.setRequestProperty("Content-Length", Long.toString(this.f69911a.e()));
                bufferedOutputStream = new BufferedOutputStream(this.f69918h.getOutputStream());
                bufferedOutputStream.write(bArrC);
            } else {
                this.f69918h.setRequestProperty("Content-Encoding", "gzip");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrC);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                this.f69918h.setRequestProperty("Content-Length", String.valueOf(length));
                ((sg.bigo.ads.common.u.b.b) this.f69911a).f69947i = length;
                bufferedOutputStream = new BufferedOutputStream(this.f69918h.getOutputStream());
                bufferedOutputStream.write(byteArray);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f69918h;
    }

    @NonNull
    public final c a(@NonNull URL url) {
        c cVar = new c(this.f69911a, this.f69912b, url, this.f69914d, this.f69915e);
        cVar.f69917g = this.f69917g + 1;
        return cVar;
    }

    public final boolean b() {
        return this.f69916f != null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f69916f != null) {
            sb2.append("originUrl=");
            sb2.append(this.f69911a.g());
            sb2.append(", redirectURL=");
            sb2.append(this.f69916f);
            sb2.append(", redirectCount=");
            sb2.append(this.f69917g);
        } else {
            sb2.append("requestUrl=");
            sb2.append(this.f69911a.g());
        }
        return sb2.toString();
    }
}
