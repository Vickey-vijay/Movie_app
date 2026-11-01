package im;

import com.ironsource.G5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import xm.o;

/* JADX INFO: compiled from: ContentExchange.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends e {
    public int A;
    public String B;
    public ByteArrayOutputStream C;
    public File D;

    public f() {
        super(false);
        this.A = 4096;
        this.B = G5.N;
    }

    @Override // im.i
    public synchronized void E(mm.d dVar) throws IOException {
        super.E(dVar);
        if (this.C == null) {
            this.C = new ByteArrayOutputStream(this.A);
        }
        dVar.writeTo(this.C);
    }

    @Override // im.e, im.i
    public synchronized void F(mm.d dVar, mm.d dVar2) throws IOException {
        String strB;
        int iIndexOf;
        super.F(dVar, dVar2);
        int iF = lm.i.f63776d.f(dVar);
        if (iF == 12) {
            this.A = mm.g.h(dVar2);
        } else if (iF == 16 && (iIndexOf = (strB = o.b(dVar2.toString())).indexOf("charset=")) > 0) {
            String strSubstring = strB.substring(iIndexOf + 8);
            this.B = strSubstring;
            int iIndexOf2 = strSubstring.indexOf(59);
            if (iIndexOf2 > 0) {
                this.B = this.B.substring(0, iIndexOf2);
            }
        }
    }

    @Override // im.e, im.i
    public synchronized void H(mm.d dVar, int i10, mm.d dVar2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.C;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        super.H(dVar, i10, dVar2);
    }

    @Override // im.i
    public synchronized void I() throws IOException {
        if (this.D != null) {
            P(null);
            Q(g0());
        } else {
            super.I();
        }
    }

    public final synchronized InputStream g0() throws IOException {
        return new FileInputStream(this.D);
    }

    public synchronized byte[] h0() {
        ByteArrayOutputStream byteArrayOutputStream = this.C;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public f(boolean z10) {
        super(z10);
        this.A = 4096;
        this.B = G5.N;
    }
}
