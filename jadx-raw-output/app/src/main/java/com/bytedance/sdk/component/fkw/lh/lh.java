package com.bytedance.sdk.component.fkw.lh;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.jg;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.ra;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.zin;
import com.squareup.picasso.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class lh implements bly {
    public pno bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public jg f11673cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public WeakReference<ImageView> f11674cf;
    public com.bytedance.sdk.component.fkw.lh.ouw ex;
    public ImageView.ScaleType fkw;
    public int jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f11675jg;
    public le jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public Future<?> f11676ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Bitmap.Config f11677le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f11678lh;
    public boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public boolean f11679od;
    public String ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private boolean f11680pd;
    public int pno;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11681ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public th f11682rn;
    public volatile boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public com.bytedance.sdk.component.fkw.vt f11683tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final Handler f11684th;
    public int tlj;
    private ExecutorService uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public Queue<com.bytedance.sdk.component.fkw.fkw.bly> f11685vm;
    public int vpp;
    public String vt;
    public rn yu;
    public int zih;
    public ra zin;

    public class ouw implements rn {
        public rn ouw;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final cf cfVar) {
            Bitmap bitmapOuw;
            final ImageView imageView = lh.this.f11674cf.get();
            if (imageView != null && lh.this.tlj != 3) {
                Object tag = imageView.getTag(1094453505);
                if ((tag != null && tag.equals(lh.this.vt)) && (cfVar.vt() instanceof Bitmap)) {
                    final Bitmap bitmap = (Bitmap) cfVar.vt();
                    lh.this.f11684th.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                }
            }
            try {
                if (lh.this.bly != null && (cfVar.vt() instanceof Bitmap) && (bitmapOuw = lh.this.bly.ouw((Bitmap) cfVar.vt())) != null) {
                    cfVar.ouw(bitmapOuw);
                }
            } catch (Throwable unused) {
            }
            lh lhVar = lh.this;
            if (lhVar.zih == 5) {
                lhVar.f11684th.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(cfVar);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(cfVar);
            }
        }

        public ouw(rn rnVar) {
            this.ouw = rnVar;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final int i10, final String str, final Throwable th2) {
            lh lhVar = lh.this;
            if (lhVar.zih == 5) {
                lhVar.f11684th.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.ouw.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        rn rnVar = ouw.this.ouw;
                        if (rnVar != null) {
                            rnVar.ouw(i10, str, th2);
                        }
                    }
                });
                return;
            }
            rn rnVar = this.ouw;
            if (rnVar != null) {
                rnVar.ouw(i10, str, th2);
            }
        }
    }

    public static class vt implements tlj {

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public th f11688cf;
        public ImageView.ScaleType fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public String f11689jg;
        public jg jqy;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.vt f11690ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public Bitmap.Config f11691le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11692lh;
        public boolean mwh;
        public rn ouw;
        public int pno;
        public boolean qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f11693ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public le f11694rn;
        public boolean ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public int f11695th;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f11696vm;
        public boolean vpp;
        public ImageView vt;
        public String yu;
        public pno zih;
        public ExecutorService zin;
        public int bly = 1;
        public int tlj = 5;

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(String str) {
            this.f11692lh = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(int i10) {
            this.pno = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj fkw(int i10) {
            this.f11695th = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj lh(int i10) {
            this.bly = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(ImageView.ScaleType scaleType) {
            this.fkw = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(String str) {
            this.f11689jg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj yu(int i10) {
            this.f11696vm = i10;
            return this;
        }

        public vt(le leVar) {
            this.f11694rn = leVar;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(Bitmap.Config config) {
            this.f11691le = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly vt(rn rnVar) {
            this.ouw = rnVar;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(int i10) {
            this.f11693ra = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(th thVar) {
            this.f11688cf = thVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(boolean z10) {
            this.mwh = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(rn rnVar) {
            this.tlj = 4;
            return vt(rnVar);
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly ouw(ImageView imageView) {
            this.vt = imageView;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(pno pnoVar) {
            this.zih = pnoVar;
            return this;
        }
    }

    public /* synthetic */ lh(vt vtVar, byte b10) {
        this(vtVar);
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final String ouw() {
        return this.ouw;
    }

    private lh(vt vtVar) {
        this.f11685vm = new LinkedBlockingQueue();
        this.f11684th = new Handler(Looper.getMainLooper());
        this.qbp = true;
        this.ouw = vtVar.yu;
        this.yu = new ouw(vtVar.ouw);
        this.f11674cf = new WeakReference<>(vtVar.vt);
        this.fkw = vtVar.fkw;
        this.f11677le = vtVar.f11691le;
        this.f11681ra = vtVar.f11693ra;
        this.pno = vtVar.pno;
        this.tlj = vtVar.bly;
        this.zih = vtVar.tlj;
        this.f11682rn = vtVar.f11688cf;
        com.bytedance.sdk.component.fkw.vt vtVar2 = vtVar.f11690ko;
        this.f11683tc = vtVar2 == null ? !TextUtils.isEmpty(vtVar.f11689jg) ? com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw(new File(vtVar.f11689jg)) : com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly() : vtVar2;
        if (!TextUtils.isEmpty(vtVar.f11692lh)) {
            ouw(vtVar.f11692lh);
            this.f11678lh = vtVar.f11692lh;
        }
        this.mwh = vtVar.ryl;
        this.f11675jg = vtVar.mwh;
        this.jqy = vtVar.f11694rn;
        this.bly = vtVar.zih;
        this.jae = vtVar.f11695th;
        this.ksc = vtVar.f11696vm;
        this.uq = vtVar.zin;
        this.f11679od = vtVar.qbp;
        this.f11680pd = vtVar.vpp;
        this.f11673cd = vtVar.jqy;
        this.f11685vm.add(new com.bytedance.sdk.component.fkw.fkw.lh());
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final Bitmap.Config fkw() {
        return this.f11677le;
    }

    public final bly le() {
        try {
            if (this.jqy == null) {
                rn rnVar = this.yu;
                if (rnVar != null) {
                    rnVar.ouw(1005, "not init !", null);
                }
                return this;
            }
            String str = this.ouw;
            if (TextUtils.isEmpty(str)) {
                rn rnVar2 = this.yu;
                if (rnVar2 != null) {
                    rnVar2.ouw(2000, "url is empty", null);
                }
                return this;
            }
            mwh mwhVar = this.jqy.vt;
            zin zinVarBly = mwhVar != null ? mwhVar.bly() : null;
            if (!str.startsWith("http://") && !str.startsWith("https://") && zinVarBly != null) {
                zinVarBly.ouw("url is not validate ".concat(str));
            }
            ExecutorService executorServiceVt = this.uq == null ? this.jqy.vt() : null;
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fkw.lh.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.fkw.fkw.bly blyVarPoll;
                    while (!lh.this.ryl && (blyVarPoll = lh.this.f11685vm.poll()) != null) {
                        try {
                            th thVar = lh.this.f11682rn;
                            if (thVar != null) {
                                thVar.ouw(blyVarPoll.ouw(), lh.this);
                            }
                            blyVarPoll.ouw(lh.this);
                            th thVar2 = lh.this.f11682rn;
                            if (thVar2 != null) {
                                thVar2.ouw(blyVarPoll.ouw());
                            }
                        } catch (Throwable th2) {
                            lh.ouw(lh.this, 2000, th2.getMessage(), th2);
                            th thVar3 = lh.this.f11682rn;
                            if (thVar3 != null) {
                                thVar3.ouw("exception");
                                return;
                            }
                            return;
                        }
                    }
                    if (lh.this.ryl) {
                        lh.ouw(lh.this, 1003, Utils.VERB_CANCELED, null);
                    }
                }
            };
            if (this.f11680pd) {
                runnable.run();
            } else {
                ExecutorService executorService = this.uq;
                if (executorService != null) {
                    this.f11676ko = executorService.submit(runnable);
                } else if (executorServiceVt != null) {
                    this.f11676ko = executorServiceVt.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int lh() {
        return this.pno;
    }

    public final void ouw(String str) {
        WeakReference<ImageView> weakReference = this.f11674cf;
        if (weakReference != null && weakReference.get() != null) {
            this.f11674cf.get().setTag(1094453505, str);
        }
        this.vt = str;
    }

    public final String ra() {
        return this.vt + this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int vt() {
        return this.f11681ra;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final ImageView.ScaleType yu() {
        return this.fkw;
    }

    public final boolean ouw(com.bytedance.sdk.component.fkw.fkw.bly blyVar) {
        if (this.ryl) {
            return false;
        }
        return this.f11685vm.add(blyVar);
    }

    public static /* synthetic */ void ouw(lh lhVar, int i10, String str, Throwable th2) {
        new com.bytedance.sdk.component.fkw.fkw.pno(i10, str, th2).ouw(lhVar);
        lhVar.f11685vm.clear();
    }
}
