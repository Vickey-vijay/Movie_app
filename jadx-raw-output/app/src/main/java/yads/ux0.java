package yads;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ux0 implements k20 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f83681d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f83682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f83683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83684c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(ib3.f78558c)) {
            String str = ib3.f78559d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f83681d = z10;
    }

    public ux0(UUID uuid, byte[] bArr, boolean z10) {
        this.f83682a = uuid;
        this.f83683b = bArr;
        this.f83684c = z10;
    }
}
