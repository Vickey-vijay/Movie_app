package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class l73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f79726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79728d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l73.class != obj.getClass()) {
            return false;
        }
        l73 l73Var = (l73) obj;
        return this.f79725a == l73Var.f79725a && this.f79727c == l73Var.f79727c && this.f79728d == l73Var.f79728d && Arrays.equals(this.f79726b, l73Var.f79726b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f79726b) + (this.f79725a * 31)) * 31) + this.f79727c) * 31) + this.f79728d;
    }

    public l73(int i10, int i11, int i12, byte[] bArr) {
        this.f79725a = i10;
        this.f79726b = bArr;
        this.f79727c = i11;
        this.f79728d = i12;
    }
}
