package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.zin;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class yu extends lh {
    private static volatile yu fkw;
    private static File yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private AtomicBoolean f11581le = new AtomicBoolean(true);
    public AtomicBoolean ouw = new AtomicBoolean(false);
    public boolean vt = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public AtomicBoolean f11582lh = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private AtomicInteger f11583ra = new AtomicInteger(0);
    private AtomicLong pno = new AtomicLong();

    public static File le() {
        if (yu == null) {
            try {
                File file = new File(new File(com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt().getCacheDir(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                yu = file;
            } catch (Throwable th2) {
                ko.lh("TemplateManager", "getTemplateDir error", th2);
            }
        }
        return yu;
    }

    public static yu vt() {
        if (fkw == null) {
            synchronized (yu.class) {
                if (fkw == null) {
                    fkw = new yu();
                }
            }
        }
        return fkw;
    }

    public final void lh() {
        com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno(C3426d4.a.f28413f) { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                Throwable th2;
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        File file = new File(yu.le(), "temp_pkg_info.json");
                        Long lValueOf = Long.valueOf(file.length());
                        if (lValueOf.longValue() > 0 && file.exists() && file.isFile()) {
                            byte[] bArr = new byte[lValueOf.intValue()];
                            fileInputStream = new FileInputStream(file);
                            try {
                                fileInputStream.read(bArr);
                                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(PangleVideoBridge.jsonObjectInit(new String(bArr, G5.N)));
                                if (ouwVarOuw != null) {
                                    ra.ouw = ouwVarOuw;
                                    ko.vt("Version", "old version read success: " + ra.ouw.ouw);
                                }
                                fileInputStream2 = fileInputStream;
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    ko.lh("Version", "version init error", th2);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    yu.this.f11581le.set(false);
                                    yu.this.yu();
                                    yu.this.ouw(false);
                                    if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh == null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th4;
                                }
                            }
                        } else {
                            ko.vt("Version", "version pkg json file does not exist");
                        }
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (Throwable th5) {
                        fileInputStream = null;
                        th2 = th5;
                    }
                } catch (IOException unused2) {
                }
                yu.this.f11581le.set(false);
                yu.this.yu();
                yu.this.ouw(false);
                if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh == null && zin.ouw(com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt()) && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                    com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.yu();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.ouw.vt.lh
    public final File ouw() {
        return le();
    }

    private yu() {
        lh();
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.ouw fkw() {
        return ra.ouw();
    }

    public final void ouw(boolean z10) {
        boolean z11;
        if (this.f11581le.get()) {
            ko.vt("TemplateManager", "loadTemplate error1");
            return;
        }
        try {
            if (this.ouw.get()) {
                if (z10) {
                    this.f11583ra.getAndIncrement();
                }
                ko.vt("TemplateManager", "loadTemplate error2: ".concat(String.valueOf(z10)));
                return;
            }
            boolean z12 = true;
            this.ouw.set(true);
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.fkw();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = ra.ouw();
            if (ouwVarFkw != null && ouwVarFkw.vt()) {
                if (!lh.lh(ra.ouw(), ouwVarFkw)) {
                    this.ouw.set(false);
                    this.pno.set(System.currentTimeMillis());
                    ko.vt("TemplateManager", "loadTemplate error4");
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                    com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.lh().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.yu.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt();
                        }
                    });
                }
                ra.ouw(ouwVarFkw);
                com.bytedance.sdk.component.adexpress.ouw.lh.ouw.vt vtVar = ouwVarFkw.f11564lh;
                boolean zOuw = (vtVar == null || TextUtils.isEmpty(vtVar.ouw)) ? false : ouw(ouwVarFkw.f11564lh.ouw);
                List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> listOuw = null;
                if (ouwVarFkw.fkw.size() != 0) {
                    listOuw = ouw(ouwVarFkw, ouwVarOuw);
                    z11 = listOuw != null;
                } else {
                    z11 = zOuw;
                }
                if (!zOuw) {
                    List<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> listVt = vt(ouwVarFkw, ouwVarOuw);
                    if (listOuw == null || listVt == null) {
                        listOuw = listVt;
                    } else {
                        listOuw.addAll(listVt);
                    }
                    if (listVt == null) {
                        z12 = false;
                    }
                    if (listVt == null) {
                        this.ouw.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && ouw(ouwVarFkw)) {
                    ra.ouw(ouwVarFkw);
                    lh.ouw(le(), ra.ouw(), "temp_pkg_info.json");
                    if (listOuw != null && !listOuw.isEmpty()) {
                        Iterator<com.bytedance.sdk.component.adexpress.ouw.lh.ouw.C0086ouw> it = listOuw.iterator();
                        while (it.hasNext()) {
                            File file = new File(ouw(), com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw));
                            File file2 = new File(file + ".tmp");
                            if (file.exists()) {
                                try {
                                    file.delete();
                                } catch (Throwable unused) {
                                }
                            }
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    }
                }
                yu();
                this.ouw.set(false);
                this.pno.set(System.currentTimeMillis());
                if (this.f11583ra.getAndSet(0) <= 0 || System.currentTimeMillis() - this.pno.get() <= 600000) {
                    return;
                }
                ouw(false);
                return;
            }
            this.ouw.set(false);
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().vt != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().vt.ouw();
            }
        } catch (Throwable th2) {
            ko.ouw("TemplateManager", "loadTemplate error: ", th2);
        }
    }

    public final void yu() {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = ra.ouw();
        if (ouwVarOuw != null && ouwVarOuw.vt()) {
            boolean zOuw = ouw(ouwVarOuw);
            if (!zOuw) {
                ra.vt();
            }
            this.vt = zOuw;
        }
    }

    private boolean ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar) {
        if (ouwVar == null) {
            return false;
        }
        return ouw(ouwVar.fkw) || ouw(ouwVar.f11564lh) || ouw(ouwVar.ouw());
    }
}
