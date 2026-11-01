package o6;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI013x0xDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class f extends i {
    public f(c6.a aVar) {
        super(aVar);
    }

    @Override // o6.j
    public String d() throws NotFoundException {
        if (c().l() == 60) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 5);
            j(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
