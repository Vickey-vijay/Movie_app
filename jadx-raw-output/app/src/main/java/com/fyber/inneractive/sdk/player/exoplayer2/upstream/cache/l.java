package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f17711b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17713d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f17715f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17712c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f17714e = new HashMap();

    public final synchronized m a(String str, long j10) {
        m mVarA;
        m mVar;
        a aVar = this.f17715f;
        if (aVar != null) {
            throw aVar;
        }
        h hVar = (h) this.f17713d.f17699a.get(str);
        if (hVar == null) {
            mVar = new m(str, j10, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                mVarA = hVar.a(j10);
                if (!mVarA.f17692d || mVarA.f17693e.length() == mVarA.f17691c) {
                    break;
                }
                a();
            }
            mVar = mVarA;
        }
        if (!mVar.f17692d) {
            if (this.f17712c.containsKey(str)) {
                return null;
            }
            this.f17712c.put(str, mVar);
            return mVar;
        }
        h hVar2 = (h) this.f17713d.f17699a.get(str);
        if (!hVar2.f17697c.remove(mVar)) {
            throw new IllegalStateException();
        }
        int i10 = hVar2.f17695a;
        if (!mVar.f17692d) {
            throw new IllegalStateException();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File parentFile = mVar.f17693e.getParentFile();
        long j11 = mVar.f17690b;
        Pattern pattern = m.f17716g;
        File file = new File(parentFile, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
        m mVar2 = new m(mVar.f17689a, mVar.f17690b, mVar.f17691c, jCurrentTimeMillis, file);
        if (!mVar.f17693e.renameTo(file)) {
            throw new a("Renaming of " + mVar.f17693e + " to " + file + " failed.");
        }
        hVar2.f17697c.add(mVar2);
        ArrayList arrayList = (ArrayList) this.f17714e.get(mVar.f17689a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f17706a.remove(mVar);
                jVar.f17707b -= mVar.f17691c;
                jVar.f17706a.add(mVar2);
                jVar.f17707b += mVar2.f17691c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f17711b;
        jVar2.f17706a.remove(mVar);
        jVar2.f17707b -= mVar.f17691c;
        jVar2.f17706a.add(mVar2);
        jVar2.f17707b += mVar2.f17691c;
        jVar2.a(this, 0L);
        return mVar2;
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f17712c.remove(mVar.f17689a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    public l(File file, j jVar) {
        this.f17710a = file;
        this.f17711b = jVar;
        this.f17713d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[PHI: r5
  0x00d7: PHI (r5v6 java.io.DataInputStream) = (r5v3 java.io.DataInputStream), (r5v18 java.io.DataInputStream) binds: [B:53:0x00d5, B:35:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x00f9, please report this as an issue */
    public static void a(l lVar) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        File[] fileArrListFiles;
        m mVarA;
        if (!lVar.f17710a.exists()) {
            lVar.f17710a.mkdirs();
            return;
        }
        i iVar = lVar.f17713d;
        if (!iVar.f17704f) {
            DataInputStream dataInputStream3 = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(iVar.f17701c.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    try {
                        if (dataInputStream.readInt() == 1) {
                            try {
                                if ((dataInputStream.readInt() & 1) != 0) {
                                    if (iVar.f17702d != null) {
                                        byte[] bArr = new byte[16];
                                        dataInputStream.readFully(bArr);
                                        try {
                                            iVar.f17702d.init(2, iVar.f17703e, new IvParameterSpec(bArr));
                                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, iVar.f17702d));
                                        } catch (InvalidAlgorithmParameterException e10) {
                                            e = e10;
                                            throw new IllegalStateException(e);
                                        } catch (InvalidKeyException e11) {
                                            e = e11;
                                            throw new IllegalStateException(e);
                                        }
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.f17701c;
                                    cVar.f17813a.delete();
                                    cVar.f17814b.delete();
                                    iVar.f17699a.clear();
                                    iVar.f17700b.clear();
                                    fileArrListFiles = lVar.f17710a.listFiles();
                                    if (fileArrListFiles == null) {
                                        return;
                                    }
                                    for (File file : fileArrListFiles) {
                                        if (!file.getName().equals("cached_content_index.exi")) {
                                            if (file.length() > 0) {
                                                mVarA = m.a(file, lVar.f17713d);
                                            } else {
                                                mVarA = null;
                                            }
                                            if (mVarA != null) {
                                                lVar.a(mVarA);
                                            } else {
                                                file.delete();
                                            }
                                        }
                                    }
                                    lVar.f17713d.a();
                                    lVar.f17713d.b();
                                    return;
                                }
                                if (iVar.f17702d != null) {
                                    iVar.f17704f = true;
                                }
                                int i10 = dataInputStream.readInt();
                                int i11 = 0;
                                for (int i12 = 0; i12 < i10; i12++) {
                                    int i13 = dataInputStream.readInt();
                                    String utf = dataInputStream.readUTF();
                                    h hVar = new h(i13, utf, dataInputStream.readLong());
                                    iVar.f17699a.put(utf, hVar);
                                    iVar.f17700b.put(i13, utf);
                                    int iHashCode = utf.hashCode();
                                    long j10 = hVar.f17698d;
                                    i11 += ((iHashCode + (i13 * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)));
                                }
                                if (dataInputStream.readInt() == i11) {
                                    z.a(dataInputStream);
                                } else {
                                    z.a(dataInputStream);
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.f17701c;
                                    cVar2.f17813a.delete();
                                    cVar2.f17814b.delete();
                                    iVar.f17699a.clear();
                                    iVar.f17700b.clear();
                                }
                                fileArrListFiles = lVar.f17710a.listFiles();
                                if (fileArrListFiles == null) {
                                    return;
                                }
                                while (i < r2) {
                                    if (!file.getName().equals("cached_content_index.exi")) {
                                        if (file.length() > 0) {
                                            mVarA = m.a(file, lVar.f17713d);
                                        } else {
                                            mVarA = null;
                                        }
                                        if (mVarA != null) {
                                            lVar.a(mVarA);
                                        } else {
                                            file.delete();
                                        }
                                    }
                                }
                                lVar.f17713d.a();
                                lVar.f17713d.b();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                dataInputStream3 = dataInputStream;
                                dataInputStream2 = dataInputStream3;
                                if (dataInputStream2 != null) {
                                    z.a(dataInputStream2);
                                }
                                throw th;
                            }
                        }
                        z.a(dataInputStream);
                    } catch (FileNotFoundException unused) {
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    } catch (IOException e12) {
                        e = e12;
                        Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (dataInputStream2 != null) {
                        z.a(dataInputStream2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = null;
            } catch (IOException e13) {
                e = e13;
                dataInputStream = null;
            } catch (Throwable th4) {
                th = th4;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar3 = iVar.f17701c;
            cVar3.f17813a.delete();
            cVar3.f17814b.delete();
            iVar.f17699a.clear();
            iVar.f17700b.clear();
            fileArrListFiles = lVar.f17710a.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            while (i < r2) {
                if (!file.getName().equals("cached_content_index.exi")) {
                    if (file.length() > 0) {
                        mVarA = m.a(file, lVar.f17713d);
                    } else {
                        mVarA = null;
                    }
                    if (mVarA != null) {
                        lVar.a(mVarA);
                    } else {
                        file.delete();
                    }
                }
            }
            lVar.f17713d.a();
            lVar.f17713d.b();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(m mVar) {
        i iVar = this.f17713d;
        String str = mVar.f17689a;
        h hVarA = (h) iVar.f17699a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f17697c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f17714e.get(mVar.f17689a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f17706a.add(mVar);
                jVar.f17707b += mVar.f17691c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f17711b;
        jVar2.f17706a.add(mVar);
        jVar2.f17707b += mVar.f17691c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z10) throws Throwable {
        h hVar = (h) this.f17713d.f17699a.get(gVar.f17689a);
        if (hVar == null || !hVar.f17697c.remove(gVar)) {
            return;
        }
        gVar.f17693e.delete();
        if (z10 && hVar.f17697c.isEmpty()) {
            i iVar = this.f17713d;
            h hVar2 = (h) iVar.f17699a.remove(hVar.f17696b);
            if (hVar2 != null) {
                if (hVar2.f17697c.isEmpty()) {
                    iVar.f17700b.remove(hVar2.f17695a);
                    iVar.f17704f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f17713d.b();
        }
        ArrayList arrayList = (ArrayList) this.f17714e.get(gVar.f17689a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f17706a.remove(gVar);
                jVar.f17707b -= gVar.f17691c;
            }
        }
        j jVar2 = this.f17711b;
        jVar2.f17706a.remove(gVar);
        jVar2.f17707b -= gVar.f17691c;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f17713d.f17699a.values().iterator();
        while (it.hasNext()) {
            for (g gVar : ((h) it.next()).f17697c) {
                if (gVar.f17693e.length() != gVar.f17691c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f17713d.a();
        this.f17713d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f17713d.f17699a.get(str);
        return hVar == null ? -1L : hVar.f17698d;
    }
}
