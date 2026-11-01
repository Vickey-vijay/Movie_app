package y5;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f75289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j[] f75291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BarcodeFormat f75292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<ResultMetadataType, Object> f75293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f75294g;

    public i(String str, byte[] bArr, j[] jVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, jVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public i(String str, byte[] bArr, j[] jVarArr, BarcodeFormat barcodeFormat, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, jVarArr, barcodeFormat, j10);
    }

    public void a(j[] jVarArr) {
        j[] jVarArr2 = this.f75291d;
        if (jVarArr2 == null) {
            this.f75291d = jVarArr;
            return;
        }
        if (jVarArr == null || jVarArr.length <= 0) {
            return;
        }
        j[] jVarArr3 = new j[jVarArr2.length + jVarArr.length];
        System.arraycopy(jVarArr2, 0, jVarArr3, 0, jVarArr2.length);
        System.arraycopy(jVarArr, 0, jVarArr3, jVarArr2.length, jVarArr.length);
        this.f75291d = jVarArr3;
    }

    public BarcodeFormat b() {
        return this.f75292e;
    }

    public byte[] c() {
        return this.f75289b;
    }

    public Map<ResultMetadataType, Object> d() {
        return this.f75293f;
    }

    public j[] e() {
        return this.f75291d;
    }

    public String f() {
        return this.f75288a;
    }

    public void g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f75293f;
            if (map2 == null) {
                this.f75293f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f75293f == null) {
            this.f75293f = new EnumMap(ResultMetadataType.class);
        }
        this.f75293f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f75288a;
    }

    public i(String str, byte[] bArr, int i10, j[] jVarArr, BarcodeFormat barcodeFormat, long j10) {
        this.f75288a = str;
        this.f75289b = bArr;
        this.f75290c = i10;
        this.f75291d = jVarArr;
        this.f75292e = barcodeFormat;
        this.f75293f = null;
        this.f75294g = j10;
    }
}
