package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c f17701c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f17705g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f17702d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f17703e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17699a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17700b = new SparseArray();

    public final void a() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f17699a.values()) {
            if (hVar.f17697c.isEmpty()) {
                linkedList.add(hVar.f17696b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) this.f17699a.remove((String) it.next());
            if (hVar2 != null) {
                if (!hVar2.f17697c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f17700b.remove(hVar2.f17695a);
                this.f17704f = true;
            }
        }
    }

    public final void b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e10;
        Throwable th2;
        if (!this.f17704f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVarB = this.f17701c.b();
            p pVar = this.f17705g;
            if (pVar == null) {
                this.f17705g = new p(bVarB);
            } else {
                pVar.a(bVarB);
            }
            dataOutputStream = new DataOutputStream(this.f17705g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f17702d != null ? 1 : 0);
                if (this.f17702d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f17702d.init(1, this.f17703e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f17705g, this.f17702d));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f17699a.size());
                int i10 = 0;
                for (h hVar : this.f17699a.values()) {
                    dataOutputStream2.writeInt(hVar.f17695a);
                    dataOutputStream2.writeUTF(hVar.f17696b);
                    dataOutputStream2.writeLong(hVar.f17698d);
                    int iHashCode = (hVar.f17696b.hashCode() + (hVar.f17695a * 31)) * 31;
                    long j10 = hVar.f17698d;
                    i10 += iHashCode + ((int) (j10 ^ (j10 >>> 32)));
                }
                dataOutputStream2.writeInt(i10);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.f17701c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.f17814b.delete();
                int i11 = z.f17873a;
                this.f17704f = false;
            } catch (IOException e13) {
                e10 = e13;
                try {
                    throw new a(e10);
                } catch (Throwable th3) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th3;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th4 = th;
                    dataOutputStream = dataOutputStream2;
                    th2 = th4;
                    z.a(dataOutputStream);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                z.a(dataOutputStream);
                throw th2;
            }
        } catch (IOException e14) {
            dataOutputStream = dataOutputStream2;
            e10 = e14;
        } catch (Throwable th6) {
            th = th6;
            Throwable th7 = th;
            dataOutputStream = dataOutputStream2;
            th2 = th7;
            z.a(dataOutputStream);
            throw th2;
        }
    }

    public i(File file) {
        this.f17701c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new File(file, "cached_content_index.exi"));
    }

    public final h a(String str, long j10) {
        SparseArray sparseArray = this.f17700b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        h hVar = new h(iKeyAt, str, j10);
        this.f17699a.put(str, hVar);
        this.f17700b.put(iKeyAt, str);
        this.f17704f = true;
        return hVar;
    }
}
