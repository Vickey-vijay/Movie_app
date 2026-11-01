package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class js implements ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79157a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f79158b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f79159c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f79160d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk f79161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public iq2 f79163g;

    @Override // yads.ks
    public final void a(long j10) {
    }

    @Override // yads.ks
    public final boolean a() {
        gk gkVar = this.f79161e;
        return gkVar.f77833a.exists() || gkVar.f77834b.exists();
    }

    @Override // yads.ks
    public final void b() {
        gk gkVar = this.f79161e;
        gkVar.f77833a.delete();
        gkVar.f77834b.delete();
    }

    public js(File file) {
        this.f79161e = new gk(file);
    }

    public static int a(hs hsVar, int i10) {
        int iHashCode = hsVar.f78340b.hashCode() + (hsVar.f78339a * 31);
        if (i10 < 2) {
            long jA = qz.a(hsVar.f78343e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return (iHashCode * 31) + hsVar.f78343e.hashCode();
    }

    @Override // yads.ks
    public final void b(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            fk fkVarB = this.f79161e.b();
            iq2 iq2Var = this.f79163g;
            if (iq2Var == null) {
                this.f79163g = new iq2(fkVarB);
            } else {
                iq2Var.a(fkVarB);
            }
            iq2 iq2Var2 = this.f79163g;
            DataOutputStream dataOutputStream2 = new DataOutputStream(iq2Var2);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(this.f79157a ? 1 : 0);
                if (this.f79157a) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.f79160d;
                    int i10 = ib3.f78556a;
                    secureRandom.nextBytes(bArr);
                    dataOutputStream2.write(bArr);
                    try {
                        this.f79158b.init(1, this.f79159c, new IvParameterSpec(bArr));
                        dataOutputStream2.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(iq2Var2, this.f79158b));
                    } catch (InvalidAlgorithmParameterException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    }
                }
                try {
                    dataOutputStream2.writeInt(map.size());
                    int iA = 0;
                    for (hs hsVar : map.values()) {
                        dataOutputStream2.writeInt(hsVar.f78339a);
                        dataOutputStream2.writeUTF(hsVar.f78340b);
                        Set<Map.Entry> setEntrySet = hsVar.f78343e.f78972b.entrySet();
                        dataOutputStream2.writeInt(setEntrySet.size());
                        for (Map.Entry entry : setEntrySet) {
                            dataOutputStream2.writeUTF((String) entry.getKey());
                            byte[] bArr2 = (byte[]) entry.getValue();
                            dataOutputStream2.writeInt(bArr2.length);
                            dataOutputStream2.write(bArr2);
                        }
                        iA += a(hsVar, 2);
                    }
                    dataOutputStream2.writeInt(iA);
                    gk gkVar = this.f79161e;
                    gkVar.getClass();
                    dataOutputStream2.close();
                    gkVar.f77834b.delete();
                    int i11 = ib3.f78556a;
                    this.f79162f = false;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    dataOutputStream2 = dataOutputStream;
                    ib3.a((Closeable) dataOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ib3.a((Closeable) dataOutputStream2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws Throwable {
        if (!this.f79162f) {
            gk gkVar = this.f79161e;
            if (gkVar.f77833a.exists() || gkVar.f77834b.exists()) {
                DataInputStream dataInputStream = null;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f79161e.a());
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i10 = dataInputStream2.readInt();
                        if (i10 >= 0 && i10 <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                if (this.f79158b != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        Cipher cipher = this.f79158b;
                                        SecretKeySpec secretKeySpec = this.f79159c;
                                        int i11 = ib3.f78556a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f79158b));
                                    } catch (InvalidAlgorithmParameterException e10) {
                                        e = e10;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e11) {
                                        e = e11;
                                        throw new IllegalStateException(e);
                                    }
                                } else {
                                    ib3.a((Closeable) dataInputStream2);
                                }
                            } else if (this.f79157a) {
                                this.f79162f = true;
                            }
                            int i12 = dataInputStream2.readInt();
                            int iA = 0;
                            for (int i13 = 0; i13 < i12; i13++) {
                                hs hsVarA = a(i10, dataInputStream2);
                                map.put(hsVarA.f78340b, hsVarA);
                                sparseArray.put(hsVarA.f78339a, hsVarA.f78340b);
                                iA += a(hsVarA, i10);
                            }
                            int i14 = dataInputStream2.readInt();
                            boolean z10 = dataInputStream2.read() == -1;
                            if (i14 == iA && z10) {
                                ib3.a((Closeable) dataInputStream2);
                                return;
                            }
                            ib3.a((Closeable) dataInputStream2);
                        } else {
                            ib3.a((Closeable) dataInputStream2);
                        }
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            ib3.a((Closeable) dataInputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            ib3.a((Closeable) dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
                map.clear();
                sparseArray.clear();
                gk gkVar2 = this.f79161e;
                gkVar2.f77833a.delete();
                gkVar2.f77834b.delete();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z10) {
        this.f79162f = true;
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f79162f = true;
    }

    public static hs a(int i10, DataInputStream dataInputStream) throws IOException {
        jc0 jc0VarA;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            rz rzVar = new rz();
            rzVar.f82469a.put("exo_len", Long.valueOf(j10));
            rzVar.f82470b.remove("exo_len");
            jc0VarA = jc0.f78970c.a(rzVar);
        } else {
            jc0VarA = ls.a(dataInputStream);
        }
        return new hs(i11, utf, jc0VarA);
    }

    @Override // yads.ks
    public final void a(HashMap map) throws Throwable {
        if (this.f79162f) {
            b(map);
        }
    }
}
