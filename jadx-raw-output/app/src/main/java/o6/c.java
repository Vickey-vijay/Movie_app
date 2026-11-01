package o6;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI01392xDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c extends h {
    public c(c6.a aVar) {
        super(aVar);
    }

    @Override // o6.j
    public String d() throws NotFoundException, FormatException {
        if (c().l() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int iF = b().f(48, 2);
            sb2.append("(392");
            sb2.append(iF);
            sb2.append(')');
            sb2.append(b().c(50, null).b());
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
