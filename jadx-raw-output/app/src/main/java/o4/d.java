package o4;

import androidx.annotation.Nullable;
import g5.k0;

/* JADX INFO: compiled from: Descriptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f65018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f65019c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return k0.c(this.f65017a, dVar.f65017a) && k0.c(this.f65018b, dVar.f65018b) && k0.c(this.f65019c, dVar.f65019c);
    }

    public int hashCode() {
        int iHashCode = this.f65017a.hashCode() * 31;
        String str = this.f65018b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65019c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public d(String str, @Nullable String str2, @Nullable String str3) {
        this.f65017a = str;
        this.f65018b = str2;
        this.f65019c = str3;
    }
}
