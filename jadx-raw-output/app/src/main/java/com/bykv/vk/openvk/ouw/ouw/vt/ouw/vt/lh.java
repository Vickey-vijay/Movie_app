package com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt;

import android.content.Context;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class lh {
    public static final ConcurrentHashMap<String, vt> ouw = new ConcurrentHashMap<>();

    public static synchronized void ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw) {
        if (lhVar == null) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt(" url、dir and hash is must property   in VideoInfoModel");
            return;
        }
        ConcurrentHashMap<String, vt> concurrentHashMap = ouw;
        final vt vtVar = concurrentHashMap.get(lhVar.bly());
        if (vtVar == null) {
            vtVar = new vt(context, lhVar);
            concurrentHashMap.put(lhVar.bly(), vtVar);
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
        }
        if (vtVar.f10494le) {
            synchronized (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw.class) {
                vtVar.fkw.add(interfaceC0059ouw);
            }
        } else {
            vtVar.fkw.add(interfaceC0059ouw);
            if (vtVar.yu.exists() || (!vtVar.ouw.fkw() && (vtVar.f10495lh.length() >= ((long) vtVar.ouw.lh()) || (vtVar.ouw.vt() > 0 && vtVar.f10495lh.length() >= ((long) vtVar.ouw.vt()))))) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Cache file is exist");
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2 = vtVar.ouw;
                lhVar2.zin = 1;
                vtVar.ouw(lhVar2, 200);
                ouw(vtVar.ouw);
            } else {
                vtVar.f10494le = true;
                vtVar.ouw.zin = 0;
                cf.ouw ouwVarVt = com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu() != null ? com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu().vt() : new cf.ouw((byte) 0);
                long j10 = vtVar.ouw.f10452vm;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ouwVarVt.ouw(j10, timeUnit).vt(vtVar.ouw.f10451th, timeUnit).lh(vtVar.ouw.qbp, timeUnit);
                cf cfVarOuw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVarVt);
                ryl.ouw ouwVar = new ryl.ouw();
                final long length = vtVar.f10495lh.length();
                int iLh = vtVar.ouw.lh();
                boolean zFkw = vtVar.ouw.fkw();
                int iVt = vtVar.ouw.vt();
                if (iVt > 0) {
                    if (iVt >= vtVar.ouw.yu()) {
                        zFkw = true;
                    } else {
                        iLh = iVt;
                    }
                }
                ouwVar.pno = "videoPreload";
                ouwVar.f11958ra = 6;
                if (zFkw) {
                    ouwVar.ouw("RANGE", "bytes=" + length + "-").ouw(vtVar.ouw.pno()).ouw("GET", (mwh) null).ouw();
                } else {
                    ouwVar.ouw("RANGE", "bytes=" + length + "-" + iLh).ouw(vtVar.ouw.pno()).ouw("GET", (mwh) null).ouw();
                }
                cfVarOuw.ouw(ouwVar.ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.1
                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(IOException iOException) {
                        vt vtVar2 = vt.this;
                        vt.ouw(vtVar2, vtVar2.ouw, 601, iOException.getMessage());
                        lh.ouw(vt.this.ouw);
                    }

                    /* JADX WARN: Code duplicated, block: B:99:0x0264 A[Catch: all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:92:0x024a, B:97:0x025e, B:99:0x0264, B:100:0x0268, B:96:0x025b, B:93:0x024f), top: B:113:0x024a, inners: #9 }] */
                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(jg jgVar) throws IOException {
                        Object obj;
                        Throwable th2;
                        int iOuw;
                        InputStream inputStreamLh;
                        RandomAccessFile randomAccessFile;
                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar3;
                        long jOuw;
                        ko koVar;
                        InputStream inputStream;
                        RandomAccessFile randomAccessFile2;
                        long j11 = length;
                        ko koVar2 = null;
                        char c10 = 0;
                        if (jgVar != null) {
                            try {
                                boolean zVt = jgVar.vt();
                                if (!zVt) {
                                    try {
                                        vt vtVar2 = vt.this;
                                        vt.ouw(vtVar2, vtVar2.ouw, jgVar.ouw(), jgVar.lh());
                                        vt.ouw(null);
                                        vt.ouw(null);
                                        vt.ouw(null);
                                        vt.ouw(jgVar);
                                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), " Preload size=", Integer.valueOf(vt.this.ouw.lh()));
                                        lhVar3 = vt.this.ouw;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        inputStreamLh = null;
                                        obj = " Preload size=";
                                        iOuw = 601;
                                        randomAccessFile = null;
                                        try {
                                            th2.printStackTrace();
                                            vt vtVar3 = vt.this;
                                            try {
                                                vtVar3.yu.delete();
                                                vtVar3.f10495lh.delete();
                                            } catch (Throwable th4) {
                                                th4.printStackTrace();
                                            }
                                            vt vtVar4 = vt.this;
                                            com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar4 = vtVar4.ouw;
                                            if (jgVar != null) {
                                                iOuw = jgVar.ouw();
                                            }
                                            vt.ouw(vtVar4, lhVar4, iOuw, th2.getMessage());
                                            vt.ouw(randomAccessFile);
                                            vt.ouw(inputStreamLh);
                                            vt.ouw(koVar2);
                                            vt.ouw(jgVar);
                                            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                            lhVar3 = vt.this.ouw;
                                        } catch (Throwable th5) {
                                            vt.ouw(randomAccessFile);
                                            vt.ouw(inputStreamLh);
                                            vt.ouw(koVar2);
                                            vt.ouw(jgVar);
                                            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                            lh.ouw(vt.this.ouw);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    ko koVarYu = jgVar.yu();
                                    try {
                                        ko koVarYu2 = jgVar.yu();
                                        if (!zVt || koVarYu2 == null) {
                                            obj = " Preload size=";
                                            inputStreamLh = null;
                                            jOuw = 0;
                                        } else {
                                            obj = " Preload size=";
                                            try {
                                                jOuw = length + koVarYu2.ouw();
                                                inputStreamLh = koVarYu2.lh();
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                inputStreamLh = null;
                                                randomAccessFile = null;
                                                koVar2 = koVarYu2;
                                                iOuw = 601;
                                                th2.printStackTrace();
                                                vt vtVar5 = vt.this;
                                                vtVar5.yu.delete();
                                                vtVar5.f10495lh.delete();
                                                vt vtVar6 = vt.this;
                                                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar5 = vtVar6.ouw;
                                                if (jgVar != null) {
                                                    iOuw = jgVar.ouw();
                                                }
                                                vt.ouw(vtVar6, lhVar5, iOuw, th2.getMessage());
                                                vt.ouw(randomAccessFile);
                                                vt.ouw(inputStreamLh);
                                                vt.ouw(koVar2);
                                                vt.ouw(jgVar);
                                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                lhVar3 = vt.this.ouw;
                                                lh.ouw(lhVar3);
                                            }
                                        }
                                        if (inputStreamLh == null) {
                                            try {
                                                vt vtVar7 = vt.this;
                                                vt.ouw(vtVar7, vtVar7.ouw, jgVar.ouw(), jgVar.lh());
                                                vt.ouw(null);
                                                vt.ouw(inputStreamLh);
                                                vt.ouw(koVarYu2);
                                                vt.ouw(jgVar);
                                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                lhVar3 = vt.this.ouw;
                                            } catch (Throwable th7) {
                                                th2 = th7;
                                                randomAccessFile = null;
                                                koVar2 = koVarYu2;
                                                iOuw = 601;
                                                th2.printStackTrace();
                                                vt vtVar8 = vt.this;
                                                vtVar8.yu.delete();
                                                vtVar8.f10495lh.delete();
                                                vt vtVar9 = vt.this;
                                                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar6 = vtVar9.ouw;
                                                if (jgVar != null) {
                                                    iOuw = jgVar.ouw();
                                                }
                                                vt.ouw(vtVar9, lhVar6, iOuw, th2.getMessage());
                                                vt.ouw(randomAccessFile);
                                                vt.ouw(inputStreamLh);
                                                vt.ouw(koVar2);
                                                vt.ouw(jgVar);
                                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                lhVar3 = vt.this.ouw;
                                            }
                                        } else {
                                            try {
                                                randomAccessFile = new RandomAccessFile(vt.this.f10495lh, "rw");
                                                try {
                                                    int iRa = com.bykv.vk.openvk.ouw.ouw.vt.ouw.ra();
                                                    byte[] bArr = new byte[iRa];
                                                    int i10 = 0;
                                                    long j12 = 0;
                                                    while (true) {
                                                        int i11 = inputStreamLh.read(bArr, i10, iRa - i10);
                                                        if (i11 != -1) {
                                                            if (vt.this.vt) {
                                                                try {
                                                                    vt vtVar10 = vt.this;
                                                                    vt.ouw(vtVar10, vtVar10.ouw, jgVar.ouw());
                                                                    vt.ouw(randomAccessFile);
                                                                    vt.ouw(inputStreamLh);
                                                                    vt.ouw(koVarYu2);
                                                                    vt.ouw(jgVar);
                                                                    Object[] objArr = new Object[4];
                                                                    objArr[c10] = "Pre finally ";
                                                                    objArr[1] = vt.this.ouw.pno();
                                                                    objArr[2] = obj;
                                                                    objArr[3] = Integer.valueOf(vt.this.ouw.lh());
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", objArr);
                                                                    lhVar3 = vt.this.ouw;
                                                                } catch (Throwable th8) {
                                                                    th2 = th8;
                                                                    koVar2 = koVarYu2;
                                                                    iOuw = 601;
                                                                    th2.printStackTrace();
                                                                    vt vtVar11 = vt.this;
                                                                    vtVar11.yu.delete();
                                                                    vtVar11.f10495lh.delete();
                                                                    vt vtVar12 = vt.this;
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar7 = vtVar12.ouw;
                                                                    if (jgVar != null) {
                                                                        iOuw = jgVar.ouw();
                                                                    }
                                                                    vt.ouw(vtVar12, lhVar7, iOuw, th2.getMessage());
                                                                    vt.ouw(randomAccessFile);
                                                                    vt.ouw(inputStreamLh);
                                                                    vt.ouw(koVar2);
                                                                    vt.ouw(jgVar);
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                                    lhVar3 = vt.this.ouw;
                                                                }
                                                            } else {
                                                                i10 += i11;
                                                                koVar = koVarYu2;
                                                                j12 += (long) i11;
                                                                try {
                                                                    if (j12 % ((long) iRa) == 0 || j12 == jOuw - length) {
                                                                        int iIntValue = Long.valueOf(j11).intValue();
                                                                        vt.this.ouw.bly();
                                                                        com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(randomAccessFile, bArr, iIntValue, i10);
                                                                        j11 += (long) i10;
                                                                        i10 = 0;
                                                                    }
                                                                    koVarYu2 = koVar;
                                                                    c10 = 0;
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    th2 = th;
                                                                    koVar2 = koVar;
                                                                    iOuw = 601;
                                                                    th2.printStackTrace();
                                                                    vt vtVar13 = vt.this;
                                                                    vtVar13.yu.delete();
                                                                    vtVar13.f10495lh.delete();
                                                                    vt vtVar14 = vt.this;
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar8 = vtVar14.ouw;
                                                                    if (jgVar != null) {
                                                                        iOuw = jgVar.ouw();
                                                                    }
                                                                    vt.ouw(vtVar14, lhVar8, iOuw, th2.getMessage());
                                                                    vt.ouw(randomAccessFile);
                                                                    vt.ouw(inputStreamLh);
                                                                    vt.ouw(koVar2);
                                                                    vt.ouw(jgVar);
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                                    lhVar3 = vt.this.ouw;
                                                                }
                                                            }
                                                        } else {
                                                            koVar = koVarYu2;
                                                            if (vt.this.ouw.fkw() && jOuw == vt.this.f10495lh.length()) {
                                                                vt vtVar15 = vt.this;
                                                                try {
                                                                    if (!vtVar15.f10495lh.renameTo(vtVar15.yu)) {
                                                                        throw new IOException("Error renaming file " + vtVar15.f10495lh + " to " + vtVar15.yu + " for completion!");
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th10.printStackTrace();
                                                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", th10.getMessage());
                                                                }
                                                            }
                                                            vt vtVar16 = vt.this;
                                                            vtVar16.ouw(vtVar16.ouw, jgVar.ouw());
                                                            inputStream = inputStreamLh;
                                                            randomAccessFile2 = randomAccessFile;
                                                            break;
                                                        }
                                                        th = th9;
                                                        th2 = th;
                                                        koVar2 = koVar;
                                                        iOuw = 601;
                                                        th2.printStackTrace();
                                                        vt vtVar17 = vt.this;
                                                        vtVar17.yu.delete();
                                                        vtVar17.f10495lh.delete();
                                                        vt vtVar18 = vt.this;
                                                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar9 = vtVar18.ouw;
                                                        if (jgVar != null) {
                                                            iOuw = jgVar.ouw();
                                                        }
                                                        vt.ouw(vtVar18, lhVar9, iOuw, th2.getMessage());
                                                        vt.ouw(randomAccessFile);
                                                        vt.ouw(inputStreamLh);
                                                        vt.ouw(koVar2);
                                                        vt.ouw(jgVar);
                                                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                        lhVar3 = vt.this.ouw;
                                                    }
                                                    vt.ouw(randomAccessFile2);
                                                    vt.ouw(inputStream);
                                                    vt.ouw(koVar);
                                                    vt.ouw(jgVar);
                                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                    lhVar3 = vt.this.ouw;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    koVar = koVarYu2;
                                                }
                                            } catch (Throwable th12) {
                                                th2 = th12;
                                                koVar2 = koVarYu2;
                                                iOuw = 601;
                                                randomAccessFile = null;
                                                th2.printStackTrace();
                                                vt vtVar19 = vt.this;
                                                vtVar19.yu.delete();
                                                vtVar19.f10495lh.delete();
                                                vt vtVar110 = vt.this;
                                                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar10 = vtVar110.ouw;
                                                if (jgVar != null) {
                                                    iOuw = jgVar.ouw();
                                                }
                                                vt.ouw(vtVar110, lhVar10, iOuw, th2.getMessage());
                                                vt.ouw(randomAccessFile);
                                                vt.ouw(inputStreamLh);
                                                vt.ouw(koVar2);
                                                vt.ouw(jgVar);
                                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                                lhVar3 = vt.this.ouw;
                                            }
                                        }
                                    } catch (Throwable th13) {
                                        obj = " Preload size=";
                                        th2 = th13;
                                        koVar2 = koVarYu;
                                        iOuw = 601;
                                        inputStreamLh = null;
                                        randomAccessFile = null;
                                        th2.printStackTrace();
                                        vt vtVar111 = vt.this;
                                        vtVar111.yu.delete();
                                        vtVar111.f10495lh.delete();
                                        vt vtVar112 = vt.this;
                                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar11 = vtVar112.ouw;
                                        if (jgVar != null) {
                                            iOuw = jgVar.ouw();
                                        }
                                        vt.ouw(vtVar112, lhVar11, iOuw, th2.getMessage());
                                        vt.ouw(randomAccessFile);
                                        vt.ouw(inputStreamLh);
                                        vt.ouw(koVar2);
                                        vt.ouw(jgVar);
                                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                        lhVar3 = vt.this.ouw;
                                        lh.ouw(lhVar3);
                                    }
                                }
                            } catch (Throwable th14) {
                                obj = " Preload size=";
                                th2 = th14;
                                iOuw = 601;
                                koVar2 = null;
                                inputStreamLh = null;
                                randomAccessFile = null;
                                th2.printStackTrace();
                                vt vtVar113 = vt.this;
                                vtVar113.yu.delete();
                                vtVar113.f10495lh.delete();
                                vt vtVar114 = vt.this;
                                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar12 = vtVar114.ouw;
                                if (jgVar != null) {
                                    iOuw = jgVar.ouw();
                                }
                                vt.ouw(vtVar114, lhVar12, iOuw, th2.getMessage());
                                vt.ouw(randomAccessFile);
                                vt.ouw(inputStreamLh);
                                vt.ouw(koVar2);
                                vt.ouw(jgVar);
                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                lhVar3 = vt.this.ouw;
                                lh.ouw(lhVar3);
                            }
                        } else {
                            obj = " Preload size=";
                            try {
                                vt vtVar20 = vt.this;
                                iOuw = 601;
                                try {
                                    vt.ouw(vtVar20, vtVar20.ouw, 601, "Network link failed.");
                                    randomAccessFile2 = null;
                                    koVar = null;
                                    inputStream = null;
                                    vt.ouw(randomAccessFile2);
                                    vt.ouw(inputStream);
                                    vt.ouw(koVar);
                                    vt.ouw(jgVar);
                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                    lhVar3 = vt.this.ouw;
                                } catch (Throwable th15) {
                                    th = th15;
                                    th2 = th;
                                    koVar2 = null;
                                    inputStreamLh = null;
                                    randomAccessFile = null;
                                    th2.printStackTrace();
                                    vt vtVar115 = vt.this;
                                    vtVar115.yu.delete();
                                    vtVar115.f10495lh.delete();
                                    vt vtVar116 = vt.this;
                                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar13 = vtVar116.ouw;
                                    if (jgVar != null) {
                                        iOuw = jgVar.ouw();
                                    }
                                    vt.ouw(vtVar116, lhVar13, iOuw, th2.getMessage());
                                    vt.ouw(randomAccessFile);
                                    vt.ouw(inputStreamLh);
                                    vt.ouw(koVar2);
                                    vt.ouw(jgVar);
                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Pre finally ", vt.this.ouw.pno(), obj, Integer.valueOf(vt.this.ouw.lh()));
                                    lhVar3 = vt.this.ouw;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                iOuw = 601;
                            }
                        }
                        lh.ouw(lhVar3);
                    }
                });
            }
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
    }

    public static synchronized void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        vt vtVarRemove = ouw.remove(lhVar.bly());
        if (vtVarRemove != null) {
            vtVarRemove.vt = true;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
    }
}
