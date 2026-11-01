package com.bytedance.sdk.component.fkw.yu.lh;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ra;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.fkw.zin;
import com.squareup.picasso.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public final class lh implements bly {
    public pno bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f11736cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public WeakReference<ImageView> f11737cf;
    public jg ex;
    public ImageView.ScaleType fkw;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public th f11738jg;
    public int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f11739ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Bitmap.Config f11740le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f11741lh;
    public Future<?> mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private ExecutorService f11742od;
    public String ouw;
    public int pno;
    public le qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11743ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final Handler f11744rn;
    public volatile boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public byte[] f11745tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f11746th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public ra f11747vm;
    public int vpp;
    public String vt;
    public rn yu;
    public boolean zih;
    public com.bytedance.sdk.component.fkw.vt zin;

    public class ouw implements rn {
        public rn ouw;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(final cf cfVar) {
            Bitmap bitmapOuw;
            final ImageView imageView = lh.this.f11737cf.get();
            if (imageView != null && lh.this.tlj != 3) {
                Object tag = imageView.getTag(1094453505);
                if (tag != null && tag.equals(lh.this.vt)) {
                    Object objVt = cfVar.vt();
                    if (objVt instanceof Bitmap) {
                        final Bitmap bitmap = (Bitmap) cfVar.vt();
                        lh.this.f11744rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(bitmap);
                            }
                        });
                    } else if (objVt instanceof Drawable) {
                        final Drawable drawable = (Drawable) cfVar.vt();
                        lh.this.f11744rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    Drawable drawable2 = drawable;
                                    if (drawable2 instanceof AnimatedImageDrawable) {
                                        ((AnimatedImageDrawable) drawable2).start();
                                    }
                                }
                                imageView.setImageDrawable(drawable);
                            }
                        });
                    }
                }
            }
            try {
                if (lh.this.bly != null && (cfVar.vt() instanceof Bitmap) && (bitmapOuw = lh.this.bly.ouw((Bitmap) cfVar.vt())) != null) {
                    cfVar.ouw(bitmapOuw);
                }
            } catch (Throwable unused) {
            }
            lh lhVar = lh.this;
            if (lhVar.f11739ko == 5) {
                lhVar.f11744rn.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.3
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
            if (lhVar.f11739ko == 5) {
                lhVar.f11744rn.post(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.ouw.4
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
        public th f11751cf;
        public ImageView.ScaleType fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public String f11752jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.vt f11753ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public Bitmap.Config f11754le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11755lh;
        public boolean mwh;
        public rn ouw;
        public int pno;
        public ExecutorService qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f11756ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public le f11757rn;
        public boolean ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public int f11758th;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f11759vm;
        public jg vpp;
        public ImageView vt;
        public String yu;
        public pno zih;
        public boolean zin;
        public int bly = 1;
        public int tlj = 5;

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(String str) {
            this.f11755lh = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj vt(int i10) {
            this.pno = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj fkw(int i10) {
            this.f11758th = i10;
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
            this.f11752jg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj yu(int i10) {
            this.f11759vm = i10;
            return this;
        }

        public vt(le leVar) {
            this.f11757rn = leVar;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(Bitmap.Config config) {
            this.f11754le = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final bly vt(rn rnVar) {
            this.ouw = rnVar;
            return new lh(this, (byte) 0).le();
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(int i10) {
            this.f11756ra = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.fkw.tlj
        public final tlj ouw(th thVar) {
            this.f11751cf = thVar;
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
        this.f11744rn = new Handler(Looper.getMainLooper());
        this.zih = true;
        this.f11745tc = null;
        this.ouw = vtVar.yu;
        this.yu = new ouw(vtVar.ouw);
        this.f11737cf = new WeakReference<>(vtVar.vt);
        this.fkw = vtVar.fkw;
        this.f11740le = vtVar.f11754le;
        this.f11743ra = vtVar.f11756ra;
        this.pno = vtVar.pno;
        this.tlj = vtVar.bly;
        this.f11739ko = vtVar.tlj;
        this.f11738jg = vtVar.f11751cf;
        com.bytedance.sdk.component.fkw.vt vtVar2 = vtVar.f11753ko;
        this.zin = vtVar2 == null ? !TextUtils.isEmpty(vtVar.f11752jg) ? com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.ouw(new File(vtVar.f11752jg)) : com.bytedance.sdk.component.fkw.yu.lh.ouw.vt.bly() : vtVar2;
        if (!TextUtils.isEmpty(vtVar.f11755lh)) {
            ouw(vtVar.f11755lh);
            this.f11741lh = vtVar.f11755lh;
        }
        this.ksc = vtVar.ryl;
        this.jae = vtVar.mwh;
        this.qbp = vtVar.f11757rn;
        this.bly = vtVar.zih;
        this.jqy = vtVar.f11758th;
        this.vpp = vtVar.f11759vm;
        this.f11742od = vtVar.qbp;
        this.f11736cd = vtVar.zin;
        this.ex = vtVar.vpp;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final Bitmap.Config fkw() {
        return this.f11740le;
    }

    public final bly le() {
        try {
            ExecutorService executorServiceOuw = null;
            if (this.qbp == null) {
                rn rnVar = this.yu;
                if (rnVar != null) {
                    rnVar.ouw(1005, "not init !", null);
                }
                return this;
            }
            String str = this.ouw;
            if (TextUtils.isEmpty(str)) {
                this.yu.ouw(2000, "url is empty", null);
                return this;
            }
            mwh mwhVar = this.qbp.vt;
            zin zinVarBly = mwhVar != null ? mwhVar.bly() : null;
            if (!str.startsWith("http://") && !str.startsWith("https://") && zinVarBly != null) {
                zinVarBly.ouw("url is not validate ".concat(str));
            }
            if (this.f11742od == null) {
                le leVar = this.qbp;
                qbp qbpVarLh = leVar.vt.lh();
                if (qbpVarLh == null || (executorServiceOuw = qbpVarLh.ouw()) == null) {
                    if (leVar.fkw == null) {
                        ExecutorService executorServiceVt = leVar.vt.vt();
                        if (executorServiceVt == null) {
                            executorServiceVt = com.bytedance.sdk.component.fkw.yu.ouw.vt.ouw();
                        }
                        leVar.fkw = executorServiceVt;
                    }
                    executorServiceOuw = leVar.fkw;
                }
            }
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar = lh.this;
                    com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar = new com.bytedance.sdk.component.fkw.yu.lh.ouw(lhVar, lhVar.f11738jg);
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.vt());
                        arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.fkw());
                        arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.ouw());
                        arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.lh());
                        arrayList.add(new com.bytedance.sdk.component.fkw.yu.vt.yu());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (lh.this.ryl) {
                                ouwVar.ouw(1003, Utils.VERB_CANCELED, null);
                                return;
                            }
                            com.bytedance.sdk.component.fkw.yu.vt.le leVar2 = (com.bytedance.sdk.component.fkw.yu.vt.le) arrayList.get(i10);
                            if (lh.this.f11738jg != null && leVar2 != null && !"data_intercept".equals(leVar2.ouw())) {
                                lh.this.f11738jg.ouw(leVar2.ouw(), lh.this);
                            }
                            lh lhVar2 = lh.this;
                            boolean zOuw = leVar2.ouw(lhVar2, lhVar2.f11738jg, ouwVar);
                            if (lh.this.f11738jg != null && !"data_intercept".equals(leVar2.ouw())) {
                                lh.this.f11738jg.ouw(leVar2.ouw());
                            }
                            if (!zOuw) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        ouwVar.ouw(2000, th2.getMessage(), th2);
                    }
                }
            };
            if (this.f11736cd) {
                runnable.run();
            } else {
                ExecutorService executorService = this.f11742od;
                if (executorService != null) {
                    this.mwh = executorService.submit(runnable);
                } else if (executorServiceOuw != null) {
                    this.mwh = executorServiceOuw.submit(runnable);
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
        WeakReference<ImageView> weakReference = this.f11737cf;
        if (weakReference != null && weakReference.get() != null) {
            this.f11737cf.get().setTag(1094453505, str);
        }
        this.vt = str;
    }

    public final String ra() {
        return this.vt + this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final int vt() {
        return this.f11743ra;
    }

    @Override // com.bytedance.sdk.component.fkw.bly
    public final ImageView.ScaleType yu() {
        return this.fkw;
    }
}
