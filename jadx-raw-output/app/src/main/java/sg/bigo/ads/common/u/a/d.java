package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f69919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<List<String>> f69921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f69922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69924f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f69925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f69928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f69929e;

        private a(URL url, String str, int i10, String str2, int i11) {
            this.f69925a = url;
            this.f69926b = str;
            this.f69927c = i10;
            this.f69928d = str2;
            this.f69929e = i11;
        }

        public /* synthetic */ a(URL url, String str, int i10, String str2, int i11, byte b10) {
            this(url, str, i10, str2, i11);
        }
    }

    public d(@NonNull c cVar) throws IOException {
        this.f69922d = cVar;
        HttpURLConnection httpURLConnectionA = cVar.a();
        this.f69919a = httpURLConnectionA;
        this.f69920b = httpURLConnectionA.getResponseCode();
        this.f69923e = httpURLConnectionA.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.f69921c = hVar;
        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getContentEncoding());
        this.f69924f = zEqualsIgnoreCase;
        if (zEqualsIgnoreCase && cVar.f69913c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    @Nullable
    private String a(String str) {
        List<String> listA = this.f69921c.a(str);
        int size = listA != null ? listA.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = listA.get(0);
        }
        return str2;
    }

    public final InputStream a() throws IOException {
        InputStream inputStream = this.f69919a.getInputStream();
        return (this.f69924f && this.f69922d.f69913c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    public final a b() {
        int i10 = this.f69920b;
        if (i10 == 307 || i10 == 308) {
            String strA = a("Location");
            if (this.f69923e.equalsIgnoreCase("GET") || this.f69923e.equalsIgnoreCase("HEAD")) {
                return new a(null, strA, 0, "", this.f69920b, (byte) 0);
            }
            return new a(null, strA, 706, "redirect code(" + this.f69920b + ") is only available for GET or HEAD method, current request method is " + this.f69923e, this.f69920b, (byte) 0);
        }
        switch (i10) {
            case com.safedk.android.internal.d.f44769a /* 300 */:
            case 301:
            case 302:
            case 303:
                String strA2 = a("Location");
                if (TextUtils.isEmpty(strA2)) {
                    return new a(null, strA2, 707, "empty location.", this.f69920b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f69919a.getURL(), strA2);
                    String string = url.toString();
                    if (TextUtils.equals(string, this.f69919a.getURL().toString())) {
                        return new a(url, strA2, 705, "redirect to the same url, location is " + strA2 + ", redirectURL is " + string, this.f69920b, (byte) 0);
                    }
                    URL url2 = this.f69922d.f69912b;
                    if (url2 == null || !TextUtils.equals(string, url2.toString())) {
                        return new a(url, strA2, 0, "", this.f69920b, (byte) 0);
                    }
                    return new a(url, strA2, 704, "redirect to origin url, location is " + strA2 + ", redirectURL is " + string, this.f69920b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, strA2, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + strA2 + "\" is not a network url.", this.f69920b, (byte) 0);
                }
            default:
                return null;
        }
    }
}
