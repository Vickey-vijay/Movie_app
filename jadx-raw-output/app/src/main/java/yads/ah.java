package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: loaded from: classes2.dex */
public final class ah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f75514c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.14.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f75515d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.14.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd3 f75516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f75517b;

    public /* synthetic */ ah(Context context) {
        this(new pd3(), pg.a(context));
    }

    public final void a() {
        String libraryVersion;
        this.f75517b.getClass();
        try {
            libraryVersion = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            libraryVersion = null;
        }
        if (libraryVersion == null) {
            String str = f75514c;
            throw new ub1(str, str);
        }
        this.f75516a.getClass();
        od3 od3VarA = pd3.a("7.14.0");
        if (od3VarA == null) {
            return;
        }
        this.f75516a.getClass();
        od3 od3VarA2 = pd3.a("8.0.0");
        if (od3VarA2 == null) {
            return;
        }
        this.f75516a.getClass();
        od3 od3VarA3 = pd3.a(libraryVersion);
        if (od3VarA3 == null || od3VarA3.compareTo(od3VarA) < 0 || od3VarA3.compareTo(od3VarA2) >= 0) {
            String strA = a(libraryVersion);
            throw new ub1(strA, strA);
        }
    }

    public ah(pd3 pd3Var, fh fhVar) {
        this.f75516a = pd3Var;
        this.f75517b = fhVar;
    }

    public static String a(String str) {
        return f75515d + str;
    }
}
