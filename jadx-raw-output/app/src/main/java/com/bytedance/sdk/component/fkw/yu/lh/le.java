package com.bytedance.sdk.component.fkw.yu.lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class le {
    private ExecutorService bly;
    public ExecutorService fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Context f11733le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile vm f11734lh;
    public Map<String, List<lh>> ouw = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.fkw.lh> pno = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private volatile zih f11735ra;
    public final mwh vt;
    public com.bytedance.sdk.component.fkw.yu yu;

    public final Collection<com.bytedance.sdk.component.fkw.lh> ouw() {
        return this.pno.values();
    }

    public final vm vt(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        if (this.f11734lh == null) {
            synchronized (com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.vt.class) {
                if (this.f11734lh == null) {
                    this.f11734lh = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.vt(vtVar.vt(), vtVar.yu());
                }
            }
        }
        return this.f11734lh;
    }

    private com.bytedance.sdk.component.fkw.lh yu(com.bytedance.sdk.component.fkw.vt vtVar) {
        com.bytedance.sdk.component.fkw.lh lhVarRa = this.vt.ra();
        return lhVarRa != null ? lhVarRa : new com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw.vt(vtVar.pno(), vtVar.ouw());
    }

    public final com.bytedance.sdk.component.fkw.lh lh(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        String string = vtVar.pno().toString();
        com.bytedance.sdk.component.fkw.lh lhVar = this.pno.get(string);
        if (lhVar != null) {
            return lhVar;
        }
        com.bytedance.sdk.component.fkw.lh lhVarYu = yu(vtVar);
        this.pno.put(string, lhVarYu);
        return lhVarYu;
    }

    public final zih ouw(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly();
        }
        if (this.f11735ra == null) {
            synchronized (com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.lh.class) {
                if (this.f11735ra == null) {
                    this.f11735ra = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.lh(new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(vtVar.vt(), vtVar.lh()));
                }
            }
        }
        return this.f11735ra;
    }

    public le(Context context, mwh mwhVar) {
        this.vt = mwhVar;
        this.f11733le = context;
        com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(context, mwhVar.pno());
    }

    public final ExecutorService vt() {
        ExecutorService executorServiceVt;
        qbp qbpVarLh = this.vt.lh();
        if (qbpVarLh != null && (executorServiceVt = qbpVarLh.vt()) != null) {
            return executorServiceVt;
        }
        if (this.bly == null) {
            this.bly = com.bytedance.sdk.component.fkw.yu.ouw.vt.ouw();
        }
        return this.bly;
    }

    public static com.bytedance.sdk.component.fkw.yu.lh.vt.vt ouw(lh lhVar) {
        ImageView.ScaleType scaleType = lhVar.fkw;
        if (scaleType == null) {
            scaleType = com.bytedance.sdk.component.fkw.yu.lh.vt.vt.ouw;
        }
        ImageView.ScaleType scaleType2 = scaleType;
        Bitmap.Config config = lhVar.f11740le;
        if (config == null) {
            config = com.bytedance.sdk.component.fkw.yu.lh.vt.vt.vt;
        }
        return new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(lhVar.f11743ra, lhVar.pno, scaleType2, config, lhVar.vpp, lhVar.jqy);
    }
}
