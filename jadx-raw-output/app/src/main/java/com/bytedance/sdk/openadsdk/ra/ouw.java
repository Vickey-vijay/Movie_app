package com.bytedance.sdk.openadsdk.ra;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.vt.ouw.bly;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.fkw;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.lh;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw implements INetWork {
    public cf ouw;
    public cf vt;

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        fkw.ouw ouwVar = new fkw.ouw();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                ouwVar.ouw.add(str2);
                ouwVar.vt.add(str3);
            }
        }
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw(str).ouw("POST", new fkw(ouwVar.ouw, ouwVar.vt));
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e10;
        BufferedInputStream bufferedInputStream2 = null;
        int i10 = 0;
        try {
            try {
                ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null);
                ouwVarOuw.pno = "gecko";
                jg jgVarVt = this.vt.ouw(ouwVarOuw.ouw(str).ouw()).vt();
                int iOuw = jgVarVt.ouw();
                try {
                    bufferedInputStream = new BufferedInputStream(jgVarVt.yu().lh());
                    try {
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i11 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i11 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i11);
                                th = th;
                                bufferedInputStream2 = bufferedInputStream;
                                CloseableUtils.close(bufferedInputStream2);
                                throw th;
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            i10 = iOuw;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream;
                    }
                } catch (Exception e12) {
                    bufferedInputStream = null;
                    e10 = e12;
                }
            } catch (Exception e13) {
                bufferedInputStream = null;
                e10 = e13;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static Map<String, String> ouw(le leVar) {
        if (leVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < leVar.ouw.length / 2; i10++) {
            map.put(leVar.ouw(i10), leVar.vt(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doGet(String str) throws Exception {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null).ouw(str);
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final void syncDoGet(final String str) {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null).ouw(str);
        ouwVarOuw.pno = "gecko";
        this.ouw.ouw(ouwVarOuw.ouw()).ouw(new lh() { // from class: com.bytedance.sdk.openadsdk.ra.ouw.1
            @Override // com.bytedance.sdk.component.vt.ouw.lh
            public final void ouw(jg jgVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.vt.ouw.lh
            public final void ouw(IOException iOException) {
            }
        });
    }

    public ouw() {
        cf.ouw ouwVar = new cf.ouw();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.ouw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVar.ouw(10L, timeUnit).vt(10L, timeUnit).lh(10L, timeUnit));
        this.vt = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(new cf.ouw().ouw(10L, timeUnit).vt(30L, timeUnit).lh(30L, timeUnit));
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doPost(String str, String str2) throws Exception {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw(str).ouw("POST", mwh.ouw(bly.ouw("application/json; charset=utf-8"), str2));
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }
}
