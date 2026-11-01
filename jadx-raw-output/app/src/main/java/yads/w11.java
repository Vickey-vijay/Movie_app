package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.G5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f84073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f84076d;

    public final byte[] a(UUID uuid, kn0 kn0Var) throws hl1 {
        String str;
        String str2 = kn0Var.f79483b;
        if (this.f84075c || TextUtils.isEmpty(str2)) {
            str2 = this.f84074b;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            ni.a(uri, "The uri must be set.");
            throw new hl1(new u30(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), uri, xm2.f84636h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = jr.f79153e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = jr.f79151c.equals(uuid) ? G5.L : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f84076d) {
            map.putAll(this.f84076d);
        }
        return a(this.f84073a, str2, kn0Var.f79482a, map);
    }

    public w11(String str, boolean z10, pd0 pd0Var) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        ni.a(z11);
        this.f84073a = pd0Var;
        this.f84074b = str;
        this.f84075c = z10;
        this.f84076d = new HashMap();
    }

    public static byte[] a(o30 o30Var, String str, byte[] bArr, Map map) throws hl1 {
        Map map2;
        List list;
        r33 r33Var = new r33(o30Var.createDataSource());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        ni.a(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        u30 u30Var = new u30(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        int i11 = 0;
        u30 u30Var2 = u30Var;
        while (true) {
            try {
                r30 r30Var = new r30(r33Var, u30Var2);
                try {
                    int i12 = ib3.f78556a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i13 = r30Var.read(bArr2);
                        if (i13 != -1) {
                            byteArrayOutputStream.write(bArr2, i10, i13);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ib3.a((Closeable) r30Var);
                            return byteArray;
                        }
                        Uri uri2 = r33Var.f82098c;
                        uri2.getClass();
                        throw new hl1(u30Var, uri2, r33Var.f82096a.getResponseHeaders(), r33Var.f82097b, e);
                    }
                } catch (s11 e10) {
                    try {
                        int i14 = e10.f82491e;
                        String str3 = ((i14 != 307 && i14 != 308) || i11 >= 5 || (map2 = e10.f82492f) == null || (list = (List) map2.get("Location")) == null || list.isEmpty()) ? null : (String) list.get(i10);
                        if (str3 != null) {
                            int i15 = i11 + 1;
                            long j10 = u30Var2.f83342b;
                            int i16 = u30Var2.f83343c;
                            byte[] bArr3 = u30Var2.f83344d;
                            Map map3 = u30Var2.f83345e;
                            long j11 = u30Var2.f83346f;
                            long j12 = u30Var2.f83347g;
                            String str4 = u30Var2.f83348h;
                            int i17 = u30Var2.f83349i;
                            Object obj = u30Var2.f83350j;
                            Uri uri3 = Uri.parse(str3);
                            String str5 = str2;
                            ni.a(uri3, str5);
                            u30 u30Var3 = new u30(uri3, j10, i16, bArr3, map3, j11, j12, str4, i17, obj);
                            ib3.a((Closeable) r30Var);
                            u30Var2 = u30Var3;
                            i10 = 0;
                            str2 = str5;
                            i11 = i15;
                        } else {
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        ib3.a((Closeable) r30Var);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                Uri uri4 = r33Var.f82098c;
                uri4.getClass();
                throw new hl1(u30Var, uri4, r33Var.f82096a.getResponseHeaders(), r33Var.f82097b, e11);
            }
        }
    }

    public final byte[] a(nn0 nn0Var) {
        return a(this.f84073a, nn0Var.f80714b + "&signedRequest=" + ib3.a(nn0Var.f80713a), null, Collections.emptyMap());
    }
}
