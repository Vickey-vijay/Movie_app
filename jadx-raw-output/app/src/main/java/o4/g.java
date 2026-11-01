package o4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.k0;

/* JADX INFO: compiled from: ProgramInformation.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f65030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f65031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f65032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f65033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f65034e;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return k0.c(this.f65030a, gVar.f65030a) && k0.c(this.f65031b, gVar.f65031b) && k0.c(this.f65032c, gVar.f65032c) && k0.c(this.f65033d, gVar.f65033d) && k0.c(this.f65034e, gVar.f65034e);
    }

    public int hashCode() {
        String str = this.f65030a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65031b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65032c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f65033d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f65034e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public g(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f65030a = str;
        this.f65031b = str2;
        this.f65032c = str3;
        this.f65033d = str4;
        this.f65034e = str5;
    }
}
