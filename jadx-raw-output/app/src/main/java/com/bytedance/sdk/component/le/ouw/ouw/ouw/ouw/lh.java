package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f11803lh = 20;
    private boolean fkw;
    private final Context ouw;
    private boolean pno;
    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> vt = new ArrayList();
    private final List<com.bytedance.sdk.component.le.ouw.yu.ouw> yu = new ArrayList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f11804le = false;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private volatile boolean f11805ra = false;
    private final Runnable bly = new Runnable() { // from class: com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh.1
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            synchronized (lh.this) {
                lh.ouw(lh.this);
                if (lh.this.vt.isEmpty()) {
                    lh.vt(lh.this);
                    return;
                }
                if (lh.this.fkw) {
                    int size = lh.this.vt.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        lh.this.yu.add(lh.this.vt.get(i10));
                    }
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(lh.this.vt);
                }
                lh.this.vt.clear();
                lh.vt(lh.this);
                if (arrayList != null) {
                    lh.this.lh(arrayList);
                    return;
                }
                lh lhVar = lh.this;
                lhVar.lh(lhVar.yu);
                lh.this.yu.clear();
            }
        }
    };

    public static /* synthetic */ boolean ouw(lh lhVar) {
        lhVar.f11805ra = false;
        return false;
    }

    public static /* synthetic */ boolean vt(lh lhVar) {
        lhVar.f11804le = false;
        return false;
    }

    public long fkw() {
        return 10000L;
    }

    public abstract String ouw();

    public final void lh(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        Context context = this.ouw;
        String strOuw = ouw();
        if (list == null || TextUtils.isEmpty(strOuw)) {
            return;
        }
        try {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw(context).ouw().ouw(strOuw, (String) null, list);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }

    public final synchronized void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar.ra() != null && !TextUtils.isEmpty(ouwVar.lh())) {
            this.vt.add(ouwVar);
            if (!this.f11804le) {
                com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().postDelayed(this.bly, this.fkw ? fkw() : com.bytedance.sdk.component.le.ouw.ra.ouw.vt());
                this.f11804le = true;
            }
            if (this.pno && this.vt.size() >= f11803lh && !this.f11805ra) {
                com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().removeCallbacks(this.bly);
                com.bytedance.sdk.component.le.ouw.ra.ouw.ouw().post(this.bly);
                this.f11804le = true;
                this.f11805ra = true;
            }
        }
    }

    public final synchronized void vt(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = this.vt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.le.ouw.yu.ouw next = it.next();
                        if (next != null) {
                            String strLh = next.lh();
                            if (!TextUtils.isEmpty(strLh) && list.contains(strLh)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ouw();
                    th2.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                }
            }
        }
    }

    public final Context yu() {
        return this.ouw;
    }

    public lh(Context context) {
        this.pno = true;
        this.ouw = context;
        try {
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            if (fkwVar != null) {
                this.pno = fkwVar.bly();
                this.fkw = fkwVar.tlj();
                f11803lh = fkwVar.cf();
            }
            qbp.ouw("DBInsertMemRepo", "enableOpt:" + this.pno + ",BATCH_SIZE:" + f11803lh, Boolean.valueOf(this.fkw));
        } catch (Throwable unused) {
        }
    }
}
