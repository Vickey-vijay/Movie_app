package o6;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AbstractExpandedDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.a f65094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f65095b;

    public static j a(c6.a aVar) {
        if (aVar.g(1)) {
            return new g(aVar);
        }
        if (!aVar.g(2)) {
            return new k(aVar);
        }
        int iG = r.g(aVar, 1, 4);
        if (iG == 4) {
            return new a(aVar);
        }
        if (iG == 5) {
            return new b(aVar);
        }
        int iG2 = r.g(aVar, 1, 5);
        if (iG2 == 12) {
            return new c(aVar);
        }
        if (iG2 == 13) {
            return new d(aVar);
        }
        switch (r.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case 62:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    public abstract String d() throws NotFoundException, FormatException;

    public final r b() {
        return this.f65095b;
    }

    public final c6.a c() {
        return this.f65094a;
    }

    public j(c6.a aVar) {
        this.f65094a = aVar;
        this.f65095b = new r(aVar);
    }
}
