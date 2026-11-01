package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4078b3 implements InterfaceC4104c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56400a;

    public static int b(InterfaceC4104c3... interfaceC4104c3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC4104c3 interfaceC4104c3 : interfaceC4104c3Arr) {
            if (interfaceC4104c3 != null) {
                bytesTruncated = interfaceC4104c3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    public static InterfaceC4104c3 a(InterfaceC4104c3... interfaceC4104c3Arr) {
        return new C4078b3(b(interfaceC4104c3Arr));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4104c3
    public final int getBytesTruncated() {
        return this.f56400a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f56400a + '}';
    }

    public C4078b3(int i10) {
        this.f56400a = i10;
    }
}
