package com.bytedance.adsdk.vt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class le extends ImageView {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final String f11102lh = le.class.getSimpleName();
    private static final cf<Throwable> yu = new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.le.1
        @Override // com.bytedance.adsdk.vt.cf
        public final /* bridge */ /* synthetic */ void ouw(Throwable th2) {
            Throwable th3 = th2;
            if (com.bytedance.adsdk.vt.le.pno.ouw(th3)) {
                com.bytedance.adsdk.vt.le.yu.ouw("Unable to load composition.", th3);
            } else {
                com.bytedance.adsdk.vt.le.yu.ouw("Unable to parse composition:", th3);
            }
        }
    };
    private String bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private vt f11103cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f11104cf;
    private int ex;
    private final cf<ra> fkw;
    private JSONArray jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Set<Object> f11105jg;
    private int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private jg<ra> f11106ko;
    private String ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final cf<Throwable> f11107le;
    private boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private final Runnable f11108od;
    public final bly ouw;
    private int pno;
    private long qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private cf<Throwable> f11109ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private ra f11110rn;
    private boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f11111tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private Handler f11112th;
    private int tlj;
    private ouw uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private int f11113vm;
    private int vpp;
    public final Set<yu> vt;
    private final Handler zih;
    private com.bytedance.adsdk.vt.lh.lh.lh zin;

    public static class lh extends View.BaseSavedState {
        public static final Parcelable.Creator<lh> CREATOR = new Parcelable.Creator<lh>() { // from class: com.bytedance.adsdk.vt.le.lh.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ lh createFromParcel(Parcel parcel) {
                return new lh(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ lh[] newArray(int i10) {
                return new lh[i10];
            }
        };
        public String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f11116le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11117lh;
        public String ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f11118ra;
        public int vt;
        public boolean yu;

        public /* synthetic */ lh(Parcel parcel, byte b10) {
            this(parcel);
        }

        public lh(Parcelable parcelable) {
            super(parcelable);
        }

        private lh(Parcel parcel) {
            super(parcel);
            this.ouw = parcel.readString();
            this.f11117lh = parcel.readFloat();
            this.yu = parcel.readInt() == 1;
            this.fkw = parcel.readString();
            this.f11116le = parcel.readInt();
            this.f11118ra = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.ouw);
            parcel.writeFloat(this.f11117lh);
            parcel.writeInt(this.yu ? 1 : 0);
            parcel.writeString(this.fkw);
            parcel.writeInt(this.f11116le);
            parcel.writeInt(this.f11118ra);
        }
    }

    public interface ouw {
    }

    public interface vt {
    }

    public enum yu {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static /* synthetic */ int fkw(le leVar) {
        int i10 = leVar.f11113vm;
        leVar.f11113vm = i10 + 1;
        return i10;
    }

    private static void yu(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    public void setAnimation(final int i10) {
        jg<ra> jgVarOuw;
        this.tlj = i10;
        this.bly = null;
        if (isInEditMode()) {
            jgVarOuw = new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.le.13
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return le.this.mwh ? pno.vt(le.this.getContext(), i10) : pno.lh(le.this.getContext(), i10);
                }
            }, true);
        } else {
            jgVarOuw = this.mwh ? pno.ouw(getContext(), i10) : pno.ouw(getContext(), i10, (String) null);
        }
        setCompositionTask(jgVarOuw);
    }

    public void setMaxFrame(int i10) {
        this.ouw.vt(i10);
    }

    public void setMinFrame(int i10) {
        this.ouw.ouw(i10);
    }

    public void setProgress(float f10) {
        ouw(f10, true);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.le$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void fkw() {
        this.zih.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ra.ouw getGlobalConfig() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.zih;
    }

    private ra.vt getGlobalEvent() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.f11324vm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.f11322rn;
    }

    public static /* synthetic */ void ko(le leVar) {
        leVar.zih.postDelayed(leVar.f11108od, 1000L);
    }

    private static void lh(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void setCompositionTask(jg<ra> jgVar) {
        this.vt.add(yu.SET_ANIMATION);
        this.f11110rn = null;
        this.ouw.lh();
        yu();
        this.f11106ko = jgVar.ouw(this.fkw).lh(this.f11107le);
    }

    public static /* synthetic */ int vm(le leVar) {
        int i10 = leVar.vpp;
        leVar.vpp = i10 - 1;
        return i10;
    }

    private void vt(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.ouw.getBounds().width();
        float fHeight = this.ouw.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.ouw[getScaleType().ordinal()];
        if (i10 == 1) {
            ouw(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            vt(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            lh(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            yu(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    public boolean getClipToCompositionBounds() {
        return this.ouw.f11088th;
    }

    public ra getComposition() {
        return this.f11110rn;
    }

    public long getDuration() {
        ra raVar = this.f11110rn;
        if (raVar != null) {
            return (long) raVar.ouw();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.ouw.vt.f11124lh;
    }

    public String getImageAssetsFolder() {
        return this.ouw.tlj;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.ouw.f11089vm;
    }

    public float getMaxFrame() {
        return this.ouw.vt.mwh();
    }

    public float getMinFrame() {
        return this.ouw.vt.ryl();
    }

    public th getPerformanceTracker() {
        ra raVar = this.ouw.ouw;
        if (raVar != null) {
            return raVar.ouw;
        }
        return null;
    }

    public float getProgress() {
        return this.ouw.vt.le();
    }

    public qbp getRenderMode() {
        return this.ouw.ouw();
    }

    public int getRepeatCount() {
        return this.ouw.vt.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.ouw.vt.getRepeatMode();
    }

    public float getSpeed() {
        return this.ouw.vt.ouw;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof lh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lh lhVar = (lh) parcelable;
        super.onRestoreInstanceState(lhVar.getSuperState());
        this.bly = lhVar.ouw;
        Set<yu> set = this.vt;
        yu yuVar = yu.SET_ANIMATION;
        if (!set.contains(yuVar) && !TextUtils.isEmpty(this.bly)) {
            setAnimation(this.bly);
        }
        this.tlj = lhVar.vt;
        if (!this.vt.contains(yuVar) && (i10 = this.tlj) != 0) {
            setAnimation(i10);
        }
        if (!this.vt.contains(yu.SET_PROGRESS)) {
            ouw(lhVar.f11117lh, false);
        }
        if (!this.vt.contains(yu.PLAY_OPTION) && lhVar.yu) {
            ouw();
        }
        if (!this.vt.contains(yu.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lhVar.fkw);
        }
        if (!this.vt.contains(yu.SET_REPEAT_MODE)) {
            setRepeatMode(lhVar.f11116le);
        }
        if (this.vt.contains(yu.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lhVar.f11118ra);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.vt.lh.lh.vt vtVar;
        int[][] iArr;
        bly blyVar;
        ra raVar;
        Map<String, tlj> map;
        bly blyVar2 = this.ouw;
        tlj tljVar = null;
        com.bytedance.adsdk.vt.lh.lh.ouw ouwVarOuw = (blyVar2 == null || (vtVar = blyVar2.qbp) == null) ? null : ouw(vtVar, motionEvent);
        if (ouwVarOuw == null) {
            if (getGlobalConfig() == null || getGlobalConfig().ouw != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String str = ouwVarOuw.f11164lh.f11144lh;
        if (ouwVarOuw instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
            if (getGlobalConfig() == null || getGlobalConfig().ouw != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (str != null && str.startsWith("CSJCLOSE")) {
            fkw();
        }
        com.bytedance.adsdk.vt.lh.lh.fkw fkwVar = ouwVarOuw.f11164lh;
        String str2 = fkwVar != null ? fkwVar.f11145ra : null;
        if (!TextUtils.isEmpty(str2) && (blyVar = this.ouw) != null && (raVar = blyVar.ouw) != null && (map = raVar.f11320lh) != null) {
            tljVar = map.get(str2);
        }
        if (tljVar != null && motionEvent.getAction() == 1) {
            String str3 = tljVar.pno;
            JSONArray jSONArray = tljVar.tlj;
            ra.vt globalEvent = getGlobalEvent();
            if (globalEvent != null && str != null) {
                if (TextUtils.isEmpty(str3) && !str.contains("CSJNO")) {
                    str3 = globalEvent.ouw;
                }
                if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                    jSONArray = globalEvent.f11331lh;
                }
            }
            if (TextUtils.isEmpty(str3) && jSONArray != null) {
                jSONArray.length();
            }
            int[][] iArr2 = tljVar.bly;
            if (iArr2 != null) {
                ouw(iArr2);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().vt) != null) {
                ouw(iArr);
            }
        }
        if (str != null && str.startsWith("CSJNTP")) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimationFromJson(String str) {
        setCompositionTask(pno.ouw(new ByteArrayInputStream(str.getBytes()), (String) null));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.mwh ? pno.ouw(getContext(), str) : pno.ouw(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.ouw.jqy = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.mwh = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        bly blyVar = this.ouw;
        if (z10 != blyVar.f11088th) {
            blyVar.f11088th = z10;
            com.bytedance.adsdk.vt.lh.lh.vt vtVar = blyVar.qbp;
            if (vtVar != null) {
                vtVar.ryl = z10;
            }
            blyVar.invalidateSelf();
        }
    }

    public void setComposition(ra raVar) {
        if (fkw.ouw) {
            Log.v(f11102lh, "Set Composition \n".concat(String.valueOf(raVar)));
        }
        this.ouw.setCallback(this);
        this.f11110rn = raVar;
        boolean z10 = true;
        this.f11104cf = true;
        bly blyVar = this.ouw;
        Context applicationContext = getContext().getApplicationContext();
        if (blyVar.ouw == raVar) {
            z10 = false;
        } else {
            blyVar.f11083od = true;
            blyVar.lh();
            blyVar.ouw = raVar;
            blyVar.ouw(applicationContext);
            com.bytedance.adsdk.vt.le.fkw fkwVar = blyVar.vt;
            boolean z11 = fkwVar.f11123le == null;
            fkwVar.f11123le = raVar;
            if (z11) {
                fkwVar.ouw(Math.max(fkwVar.yu, raVar.tlj), Math.min(fkwVar.fkw, raVar.f11316cf));
            } else {
                fkwVar.ouw((int) raVar.tlj, (int) raVar.f11316cf);
            }
            float f10 = fkwVar.f11124lh;
            fkwVar.f11124lh = 0.0f;
            fkwVar.vt = 0.0f;
            fkwVar.ouw((int) f10);
            fkwVar.lh();
            blyVar.lh(blyVar.vt.getAnimatedFraction());
            Iterator it = new ArrayList(blyVar.f11085ra).iterator();
            while (it.hasNext()) {
                bly.ouw ouwVar = (bly.ouw) it.next();
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
                it.remove();
            }
            blyVar.f11085ra.clear();
            raVar.ouw(blyVar.zin);
            blyVar.vt();
            Drawable.Callback callback = blyVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(blyVar);
            }
        }
        this.f11104cf = false;
        Drawable drawable = getDrawable();
        bly blyVar2 = this.ouw;
        if (drawable != blyVar2 || z10) {
            if (!z10) {
                boolean zLe = blyVar2.le();
                setImageDrawable(null);
                setImageDrawable(this.ouw);
                if (zLe) {
                    this.ouw.fkw();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it2 = this.f11105jg.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        bly blyVar = this.ouw;
        blyVar.f11079jg = str;
        com.bytedance.adsdk.vt.vt.ouw ouwVarBly = blyVar.bly();
        if (ouwVarBly != null) {
            ouwVarBly.yu = str;
        }
    }

    public void setFailureListener(cf<Throwable> cfVar) {
        this.f11109ra = cfVar;
    }

    public void setFallbackResource(int i10) {
        this.pno = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.vt.lh lhVar) {
        bly blyVar = this.ouw;
        blyVar.f11080ko = lhVar;
        com.bytedance.adsdk.vt.vt.ouw ouwVar = blyVar.ryl;
        if (ouwVar != null) {
            ouwVar.f11350lh = lhVar;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        bly blyVar = this.ouw;
        if (map != blyVar.mwh) {
            blyVar.mwh = map;
            blyVar.invalidateSelf();
        }
    }

    public void setFrame(int i10) {
        this.ouw.lh(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.ouw.yu = z10;
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.vt.yu yuVar) {
        bly blyVar = this.ouw;
        blyVar.f11078cf = yuVar;
        com.bytedance.adsdk.vt.vt.vt vtVar = blyVar.bly;
        if (vtVar != null) {
            vtVar.ouw = yuVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.ouw.tlj = str;
    }

    public void setLottieAnimListener(ouw ouwVar) {
        this.uq = ouwVar;
    }

    public void setLottieClicklistener(vt vtVar) {
        this.f11103cd = vtVar;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.ouw.f11089vm = z10;
    }

    public void setMaxFrame(String str) {
        this.ouw.vt(str);
    }

    public void setMaxProgress(float f10) {
        this.ouw.vt(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.ouw.lh(str);
    }

    public void setMinFrame(String str) {
        this.ouw.ouw(str);
    }

    public void setMinProgress(float f10) {
        this.ouw.ouw(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        bly blyVar = this.ouw;
        if (blyVar.vpp != z10) {
            blyVar.vpp = z10;
            com.bytedance.adsdk.vt.lh.lh.vt vtVar = blyVar.qbp;
            if (vtVar != null) {
                vtVar.ouw(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        bly blyVar = this.ouw;
        blyVar.zin = z10;
        ra raVar = blyVar.ouw;
        if (raVar != null) {
            raVar.ouw(z10);
        }
    }

    public void setRenderMode(qbp qbpVar) {
        bly blyVar = this.ouw;
        blyVar.ex = qbpVar;
        blyVar.vt();
    }

    public void setRepeatCount(int i10) {
        this.vt.add(yu.SET_REPEAT_COUNT);
        this.ouw.yu(i10);
    }

    public void setRepeatMode(int i10) {
        this.vt.add(yu.SET_REPEAT_MODE);
        this.ouw.vt.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.ouw.fkw = z10;
    }

    public void setSpeed(float f10) {
        this.ouw.vt.ouw = f10;
    }

    public void setTextDelegate(zin zinVar) {
        this.ouw.f11086rn = zinVar;
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.ouw.vt.pno = z10;
    }

    public void setView(View view) {
        this.ouw.jae = view;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        bly blyVar;
        if (!this.f11104cf && drawable == (blyVar = this.ouw) && blyVar.le()) {
            vt();
        } else if (!this.f11104cf && (drawable instanceof bly)) {
            bly blyVar2 = (bly) drawable;
            if (blyVar2.le()) {
                blyVar2.ra();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public le(Context context) {
        super(context);
        this.fkw = new cf<ra>() { // from class: com.bytedance.adsdk.vt.le.6
            @Override // com.bytedance.adsdk.vt.cf
            public final /* synthetic */ void ouw(ra raVar) {
                le.this.setComposition(raVar);
            }
        };
        this.f11107le = new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.le.7
            @Override // com.bytedance.adsdk.vt.cf
            public final /* synthetic */ void ouw(Throwable th2) {
                Throwable th3 = th2;
                if (le.this.pno != 0) {
                    le leVar = le.this;
                    leVar.setImageResource(leVar.pno);
                }
                (le.this.f11109ra == null ? le.yu : le.this.f11109ra).ouw(th3);
            }
        };
        this.pno = 0;
        bly blyVar = new bly();
        this.ouw = blyVar;
        this.f11104cf = false;
        this.ryl = false;
        this.mwh = true;
        this.vt = new HashSet();
        this.f11105jg = new HashSet();
        this.zih = new Handler(Looper.getMainLooper());
        this.f11113vm = 0;
        this.qbp = 0L;
        this.f11108od = new Runnable() { // from class: com.bytedance.adsdk.vt.le.4
            @Override // java.lang.Runnable
            public final void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + le.this.vpp + ", " + le.this.jqy);
                if (le.this.vpp > le.this.jqy) {
                    le.vm(le.this);
                    com.bytedance.adsdk.vt.lh.lh.lh lhVar = le.this.zin;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(le.this.vpp);
                    lhVar.f11155cf = sb2.toString();
                    le.this.invalidate();
                    le.ko(le.this);
                    return;
                }
                if (le.this.ex < 0 || le.this.f11111tc < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + le.this.ex + StringUtils.COMMA + le.this.f11111tc);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + le.this.ex);
                    le.this.ouw();
                    le leVar = le.this;
                    leVar.setFrame(leVar.ex);
                    le.this.ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (le.this.getFrame() < le.this.f11111tc - 1 || le.this.getFrame() >= le.this.f11111tc + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + le.this.f11111tc);
                            le.this.vt(this);
                            le.this.vt();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(le.this.ksc) || (le.this.jae != null && le.this.jae.length() > 0)) && le.this.f11103cd != null) {
                    vt unused = le.this.f11103cd;
                    String unused2 = le.this.ksc;
                    JSONArray unused3 = le.this.jae;
                }
            }
        };
        setSaveEnabled(false);
        this.mwh = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        ouw(0.0f, false);
        Context applicationContext = getContext().getApplicationContext();
        if (blyVar.zih) {
            blyVar.zih = false;
            if (blyVar.ouw != null) {
                blyVar.ouw(applicationContext);
            }
        }
        setIgnoreDisabledSystemAnimations(false);
        blyVar.f11082lh = com.bytedance.adsdk.vt.le.pno.ouw(getContext()) != 0.0f;
        ouw(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.vt.le.8
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                le.this.vt(this);
                le.lh(le.this);
                le.yu(le.this);
            }
        });
        ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= 0.98f) {
                    le.fkw(le.this);
                    ra.ouw globalConfig = le.this.getGlobalConfig();
                    if (globalConfig != null && (i10 = globalConfig.yu) > 0 && i10 > le.this.f11113vm) {
                        le.lh(le.this);
                        le.this.ouw();
                        le.this.setProgress(0.0f);
                    } else {
                        le.this.vt(this);
                        if (le.this.uq != null) {
                            ouw unused = le.this.uq;
                        }
                    }
                }
            }
        });
        ouw(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.vt.le.11
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - le.this.qbp;
                le.this.vt(this);
                String playDelayedELExpressTimeS = le.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && le.this.ouw.f11086rn != null) {
                    try {
                        int i10 = Integer.parseInt(zin.ouw(playDelayedELExpressTimeS)) * 1000;
                        if (le.this.qbp > 0) {
                            long jElapsedRealtime2 = (le.this.qbp + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                le.this.vt();
                                le.this.setVisibility(8);
                                if (le.this.f11112th == null) {
                                    le.this.f11112th = new Handler(Looper.getMainLooper());
                                }
                                le.this.f11112th.removeCallbacksAndMessages(null);
                                le.this.f11112th.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.vt.le.11.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        le.this.setVisibility(0);
                                        le.this.ouw();
                                        le.ouw(le.this, jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                    }
                }
                le.ouw(le.this, jElapsedRealtime);
            }
        });
    }

    public static /* synthetic */ void lh(le leVar) {
        bly blyVar;
        int i10;
        int i11;
        final int i12;
        ra raVar = leVar.f11110rn;
        if (raVar == null || (blyVar = leVar.ouw) == null) {
            return;
        }
        zin zinVar = blyVar.f11086rn;
        ra.lh lhVar = raVar.f11318ko;
        if (lhVar == null || zinVar == null) {
            return;
        }
        final int i13 = lhVar.ouw;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = lhVar.fkw;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strOuw = zin.ouw(lhVar.f11326lh);
        String strOuw2 = zin.ouw(lhVar.yu);
        try {
            i12 = Integer.parseInt(strOuw);
            try {
                i14 = Integer.parseInt(strOuw2);
            } catch (NumberFormatException e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (NumberFormatException e11) {
            e = e11;
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (!TextUtils.isEmpty(lhVar.vt)) {
            Log.i("TMe", "--==--- timer, id:" + lhVar.vt);
            com.bytedance.adsdk.vt.lh.lh.lh lhVarOuw = leVar.ouw(lhVar.vt);
            if (lhVarOuw != null) {
                Log.i("TMe", "--==--- timer success");
                leVar.ksc = lhVar.f11325le;
                leVar.jae = lhVar.f11327ra;
                leVar.zin = lhVarOuw;
                leVar.vpp = i12;
                leVar.jqy = i12 - i14;
                leVar.ex = i11;
                leVar.f11111tc = i10;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(leVar.vpp);
                lhVarOuw.f11155cf = sb2.toString();
                leVar.ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (le.this.getFrame() < i13 - 1 || le.this.getFrame() >= i13 + 2) {
                            return;
                        }
                        Log.i("TMe", "--==--- enter timer point, frame: " + le.this.getFrame());
                        le.this.vt(this);
                        if (i12 < 0 || i14 < 0) {
                            Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                        } else {
                            Log.i("TMe", "--==--- enter timer callback, start timer");
                            le.ko(le.this);
                        }
                        le.this.vt();
                    }
                });
                return;
            }
            return;
        }
        Log.i("TMe", "--==--- timer fail, id is invalid: " + lhVar.vt);
    }

    private void ouw(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            fkw();
            ouw();
            setFrame(i10);
            ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (le.this.getFrame() < i11 - 1 || le.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + le.this.getFrame());
                    le.this.vt(this);
                    le.this.vt();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof bly) && ((bly) drawable).ouw() == qbp.SOFTWARE) {
            this.ouw.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bly blyVar = this.ouw;
        if (drawable2 == blyVar) {
            super.invalidateDrawable(blyVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.ryl) {
            this.ouw.yu();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fkw();
        Handler handler = this.f11112th;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.ouw.vt.removeAllListeners();
        bly blyVar = this.ouw;
        blyVar.vt.removeAllUpdateListeners();
        blyVar.vt.addUpdateListener(blyVar.pno);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean zIsRunning;
        lh lhVar = new lh(super.onSaveInstanceState());
        lhVar.ouw = this.bly;
        lhVar.vt = this.tlj;
        lhVar.f11117lh = this.ouw.vt.le();
        bly blyVar = this.ouw;
        if (blyVar.isVisible()) {
            zIsRunning = blyVar.vt.isRunning();
        } else {
            bly.vt vtVar = blyVar.f11081le;
            if (vtVar != bly.vt.PLAY && vtVar != bly.vt.RESUME) {
                zIsRunning = false;
            } else {
                zIsRunning = true;
            }
        }
        lhVar.yu = zIsRunning;
        bly blyVar2 = this.ouw;
        lhVar.fkw = blyVar2.tlj;
        lhVar.f11116le = blyVar2.vt.getRepeatMode();
        lhVar.f11118ra = this.ouw.vt.getRepeatCount();
        return lhVar;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        yu();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        yu();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        yu();
        super.setImageResource(i10);
    }

    public void setAnimation(final String str) {
        jg<ra> jgVarVt;
        this.bly = str;
        this.tlj = 0;
        if (isInEditMode()) {
            jgVarVt = new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.le.2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return le.this.mwh ? pno.lh(le.this.getContext(), str) : pno.lh(le.this.getContext(), str, null);
                }
            }, true);
        } else {
            jgVarVt = this.mwh ? pno.vt(getContext(), str) : pno.vt(getContext(), str, (String) null);
        }
        setCompositionTask(jgVarVt);
    }

    private void yu() {
        jg<ra> jgVar = this.f11106ko;
        if (jgVar != null) {
            jgVar.vt(this.fkw);
            this.f11106ko.yu(this.f11107le);
        }
    }

    private static boolean ouw(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom;
    }

    public static /* synthetic */ void yu(le leVar) {
        final ra.ouw globalConfig = leVar.getGlobalConfig();
        if (globalConfig == null || globalConfig.fkw <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.f11328le) && globalConfig.f11330ra == null) {
            return;
        }
        int maxFrame = globalConfig.fkw;
        if (maxFrame > leVar.getMaxFrame()) {
            maxFrame = (int) leVar.getMaxFrame();
        }
        final float maxFrame2 = maxFrame / leVar.getMaxFrame();
        leVar.ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= maxFrame2) {
                    le.this.vt(this);
                    if (le.this.f11103cd != null) {
                        vt unused = le.this.f11103cd;
                    }
                }
            }
        });
    }

    private static void vt(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void ouw(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.ouw[getScaleType().ordinal()];
        if (i10 == 1) {
            ouw(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            vt(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            lh(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            yu(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    public final void vt(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.vt.removeUpdateListener(animatorUpdateListener);
    }

    public final void vt(Animator.AnimatorListener animatorListener) {
        this.ouw.vt.removeListener(animatorListener);
    }

    public final void vt() {
        this.ryl = false;
        this.ouw.ra();
    }

    private static void ouw(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    private com.bytedance.adsdk.vt.lh.lh.lh ouw(String str) {
        com.bytedance.adsdk.vt.lh.lh.vt vtVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (vtVar = blyVar.qbp) == null) {
            return null;
        }
        return ouw(vtVar, str);
    }

    public final void ouw() {
        if (this.qbp == 0) {
            this.qbp = SystemClock.elapsedRealtime();
        }
        this.vt.add(yu.PLAY_OPTION);
        this.ouw.yu();
    }

    public final void ouw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.ouw(animatorUpdateListener);
    }

    public final void ouw(Animator.AnimatorListener animatorListener) {
        this.ouw.ouw(animatorListener);
    }

    public final void ouw(boolean z10) {
        this.ouw.yu(z10 ? -1 : 0);
    }

    public final Bitmap ouw(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        bly blyVar = this.ouw;
        com.bytedance.adsdk.vt.vt.vt vtVarPno = blyVar.pno();
        if (vtVarPno == null) {
            com.bytedance.adsdk.vt.le.yu.vt("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        if (bitmap == null) {
            tlj tljVar = vtVarPno.vt.get(str);
            bitmap2 = tljVar.f11341cf;
            tljVar.f11341cf = null;
        } else {
            Bitmap bitmap3 = vtVarPno.vt.get(str).f11341cf;
            vtVarPno.ouw(str, bitmap);
            bitmap2 = bitmap3;
        }
        blyVar.invalidateSelf();
        return bitmap2;
    }

    private void ouw(float f10, boolean z10) {
        if (z10) {
            this.vt.add(yu.SET_PROGRESS);
        }
        this.ouw.lh(f10);
    }

    private com.bytedance.adsdk.vt.lh.lh.ouw ouw(com.bytedance.adsdk.vt.lh.lh.vt vtVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.vt.lh.lh.ouw ouwVarOuw;
        for (com.bytedance.adsdk.vt.lh.lh.ouw ouwVar : vtVar.f11179cf) {
            if (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
                if (ouwVar.f11163le && ouwVar.tlj > 0.0f) {
                    RectF rectF = new RectF();
                    ouwVar.ouw(rectF, ouwVar.bly, true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (ouwVarOuw = ouw((com.bytedance.adsdk.vt.lh.lh.vt) ouwVar, motionEvent)) != null) {
                        return ouwVarOuw;
                    }
                }
            } else if (ouwVar.f11163le && ouwVar.tlj > 0.0f) {
                RectF rectF2 = new RectF();
                bly blyVar = this.ouw;
                if (blyVar != null && blyVar.f11087tc) {
                    ouwVar.ouw(rectF2, ouwVar.bly, true);
                    RectF rectF3 = this.ouw.ksc;
                    if (rectF3 != null) {
                        ouw(rectF2, rectF3);
                    }
                } else {
                    RectF rectF4 = new RectF();
                    ouwVar.ouw(rectF4, ouwVar.bly, true);
                    vt(rectF2, rectF4);
                }
                if (ouw(motionEvent, rectF2)) {
                    return ouwVar;
                }
            }
        }
        return null;
    }

    private com.bytedance.adsdk.vt.lh.lh.lh ouw(com.bytedance.adsdk.vt.lh.lh.vt vtVar, String str) {
        for (com.bytedance.adsdk.vt.lh.lh.ouw ouwVar : vtVar.f11179cf) {
            if (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
                com.bytedance.adsdk.vt.lh.lh.lh lhVarOuw = ouw((com.bytedance.adsdk.vt.lh.lh.vt) ouwVar, str);
                if (lhVarOuw != null) {
                    return lhVarOuw;
                }
            } else if (TextUtils.equals(str, ouwVar.f11164lh.f11144lh) && (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.lh)) {
                return (com.bytedance.adsdk.vt.lh.lh.lh) ouwVar;
            }
        }
        return null;
    }

    public static /* synthetic */ void ouw(le leVar, long j10) {
        Map<String, Object> map;
        ra.ouw globalConfig = leVar.getGlobalConfig();
        if (leVar.uq != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.vt) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.vt);
        }
    }
}
