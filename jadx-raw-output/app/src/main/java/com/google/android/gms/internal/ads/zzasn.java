package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzasn implements zzarr {
    public final zzasp zza;
    private final zzasm zzb;

    public zzasn(zzasm zzasmVar) {
        zzasp zzaspVar = new zzasp(4096);
        this.zzb = zzasmVar;
        this.zza = zzaspVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:144:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf  */
    @Override // com.google.android.gms.internal.ads.zzarr
    public zzaru zza(zzary zzaryVar) throws Throwable {
        zzasw zzaswVar;
        byte[] bArr;
        int iZza;
        zzash zzartVar;
        String str;
        zzaru zzaruVar;
        int iZzo;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzarh zzarhVarZzk = zzaryVar.zzk();
                if (zzarhVarZzk == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str2 = zzarhVarZzk.zzb;
                    if (str2 != null) {
                        map.put("If-None-Match", str2);
                    }
                    long j10 = zzarhVarZzk.zzd;
                    if (j10 > 0) {
                        map.put("If-Modified-Since", zzasv.zzc(j10));
                    }
                    mapEmptyMap = map;
                }
                zzasw zzaswVarZza = this.zzb.zza(zzaryVar, mapEmptyMap);
                try {
                    int iZza2 = zzaswVarZza.zza();
                    List listZzb = zzaswVarZza.zzb();
                    if (iZza2 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzarh zzarhVarZzk2 = zzaryVar.zzk();
                        if (zzarhVarZzk2 == null) {
                            return new zzaru(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzarq) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzarhVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzarq zzarqVar : zzarhVarZzk2.zzh) {
                                    if (!treeSet.contains(zzarqVar.zza())) {
                                        arrayList.add(zzarqVar);
                                    }
                                }
                            }
                        } else if (!zzarhVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzarhVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzaru(304, zzarhVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzaswVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzaswVarZza.zzc();
                        zzasp zzaspVar = this.zza;
                        zzata zzataVar = new zzata(zzaspVar, iZzc);
                        try {
                            bArrZza = zzaspVar.zza(1024);
                            while (true) {
                                try {
                                    int i10 = inputStreamZzd.read(bArrZza);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    zzataVar.write(bArrZza, 0, i10);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused) {
                                        zzask.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaspVar.zzb(bArrZza);
                                    zzataVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzataVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzask.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaspVar.zzb(bArrZza);
                            zzataVar.close();
                        } catch (Throwable th3) {
                            th = th3;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzask.zzb || jElapsedRealtime3 > 3000) {
                            Object[] objArr = new Object[5];
                            objArr[0] = zzaryVar;
                            objArr[1] = Long.valueOf(jElapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(iZza2);
                            objArr[4] = Integer.valueOf(zzaryVar.zzy().zzb());
                            zzask.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (iZza2 < 200 || iZza2 > 299) {
                            throw new IOException();
                        }
                        return new zzaru(iZza2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e10) {
                        e = e10;
                        bArr = bArr2;
                        zzaswVar = zzaswVarZza;
                        if (e instanceof SocketTimeoutException) {
                            zzartVar = new zzasg();
                            str = "socket";
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaryVar.zzh())), e);
                            }
                            if (zzaswVar != null) {
                                throw new zzarv(e);
                            }
                            iZza = zzaswVar.zza();
                            zzask.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzaryVar.zzh());
                            if (bArr != null) {
                                zzaruVar = new zzaru(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaswVar.zzb());
                                if (iZza == 401 && iZza != 403) {
                                    if (iZza < 400 || iZza > 499) {
                                        throw new zzasf(zzaruVar);
                                    }
                                    throw new zzarl(zzaruVar);
                                }
                                zzartVar = new zzarg(zzaruVar);
                                str = "auth";
                            } else {
                                zzartVar = new zzart();
                                str = "network";
                            }
                        }
                        zzarm zzarmVarZzy = zzaryVar.zzy();
                        iZzo = zzaryVar.zzo();
                        try {
                            zzarmVarZzy.zzc(zzartVar);
                            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                        } catch (zzash e11) {
                            zzaryVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iZzo)));
                            throw e11;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    zzaswVar = zzaswVarZza;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                        zzartVar = new zzasg();
                        str = "socket";
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaryVar.zzh())), e);
                        }
                        if (zzaswVar != null) {
                            throw new zzarv(e);
                        }
                        iZza = zzaswVar.zza();
                        zzask.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzaryVar.zzh());
                        if (bArr != null) {
                            zzaruVar = new zzaru(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaswVar.zzb());
                            if (iZza == 401) {
                            }
                            zzartVar = new zzarg(zzaruVar);
                            str = "auth";
                        } else {
                            zzartVar = new zzart();
                            str = "network";
                        }
                    }
                    zzarm zzarmVarZzy2 = zzaryVar.zzy();
                    iZzo = zzaryVar.zzo();
                    zzarmVarZzy2.zzc(zzartVar);
                    zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                }
            } catch (IOException e13) {
                e = e13;
                zzaswVar = null;
            }
            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
        }
    }
}
