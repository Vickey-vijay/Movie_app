package vm;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import xm.j;

/* JADX INFO: compiled from: HashedSession.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f73235s = zm.b.a(f.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f73236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient boolean f73237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient boolean f73238r;

    public f(e eVar, lj.a aVar) {
        super(eVar, aVar);
        this.f73237q = false;
        this.f73238r = false;
        this.f73236p = eVar;
    }

    public synchronized void C() {
        FileInputStream fileInputStream;
        Exception e10;
        if (E()) {
            c(System.currentTimeMillis());
            zm.c cVar = f73235s;
            if (cVar.f()) {
                cVar.i("De-idling " + super.getId(), new Object[0]);
            }
            try {
                File file = new File(this.f73236p.V, super.getId());
                if (!file.exists() || !file.canRead()) {
                    throw new FileNotFoundException(file.getName());
                }
                fileInputStream = new FileInputStream(file);
                try {
                    this.f73237q = false;
                    this.f73236p.F0(fileInputStream, this);
                    j.a(fileInputStream);
                    i();
                    if (this.f73236p.S == 0) {
                        file.delete();
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    f73235s.c("Problem de-idling session " + super.getId(), e10);
                    if (fileInputStream != null) {
                        j.a(fileInputStream);
                    }
                    invalidate();
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            }
        }
    }

    public synchronized void D() throws Exception {
        G(false);
        this.f73237q = true;
    }

    public synchronized boolean E() {
        return this.f73237q;
    }

    public synchronized void F(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(o());
        dataOutputStream.writeUTF(s());
        dataOutputStream.writeLong(q());
        dataOutputStream.writeLong(m());
        dataOutputStream.writeInt(t());
        dataOutputStream.writeInt(n());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(dataOutputStream);
        Enumeration<String> enumerationB = b();
        while (enumerationB.hasMoreElements()) {
            String strNextElement = enumerationB.nextElement();
            objectOutputStream.writeUTF(strNextElement);
            objectOutputStream.writeObject(j(strNextElement));
        }
        objectOutputStream.close();
    }

    public synchronized void G(boolean z10) throws Exception {
        File file;
        if (!E() && !this.f73238r) {
            zm.c cVar = f73235s;
            if (cVar.f()) {
                cVar.i("Saving {} {}", super.getId(), Boolean.valueOf(z10));
            }
            FileOutputStream fileOutputStream = null;
            try {
                file = new File(this.f73236p.V, super.getId());
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        B();
                        F(fileOutputStream2);
                        j.b(fileOutputStream2);
                        if (z10) {
                            i();
                        } else {
                            f();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        H();
                        if (fileOutputStream != null) {
                            j.b(fileOutputStream);
                        }
                        if (file != null) {
                            file.delete();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                file = null;
            }
        }
    }

    public synchronized void H() {
        this.f73238r = true;
    }

    @Override // vm.a
    public void e() {
        if (this.f73236p.T != 0) {
            C();
        }
        super.e();
    }

    @Override // vm.a
    public void k() throws IllegalStateException {
        super.k();
        if (this.f73236p.V != null && getId() != null) {
            new File(this.f73236p.V, getId()).delete();
        }
    }

    @Override // vm.a
    public void x(int i10) {
        super.x(i10);
        if (r() > 0) {
            long jR = (((long) r()) * 1000) / 10;
            e eVar = this.f73236p;
            if (jR < eVar.R) {
                eVar.L0((i10 + 9) / 10);
            }
        }
    }

    public f(e eVar, long j10, long j11, String str) {
        super(eVar, j10, j11, str);
        this.f73237q = false;
        this.f73238r = false;
        this.f73236p = eVar;
    }
}
