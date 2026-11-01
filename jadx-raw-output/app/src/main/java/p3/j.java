package p3;

import g5.k0;
import java.util.UUID;

/* JADX INFO: compiled from: FrameworkMediaCrypto.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f65878d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f65879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f65880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65881c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(k0.f53110c)) {
            String str = k0.f53111d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f65878d = z10;
    }
}
