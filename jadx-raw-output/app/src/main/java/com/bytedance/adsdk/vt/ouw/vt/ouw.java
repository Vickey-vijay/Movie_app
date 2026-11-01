package com.bytedance.adsdk.vt.ouw.vt;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ouw<K, A> {
    private final lh<K> fkw;
    public com.bytedance.adsdk.vt.ra.vt<A> yu;
    public final List<InterfaceC0078ouw> ouw = new ArrayList(1);
    public boolean vt = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11300lh = 0.0f;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private A f11299le = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f11301ra = -1.0f;
    private float pno = -1.0f;

    public static final class fkw<T> implements lh<T> {
        private final com.bytedance.adsdk.vt.ra.ouw<T> ouw;
        private float vt = -1.0f;

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            return this.ouw;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return this.ouw.vt();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            return !this.ouw.yu();
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            if (this.vt == f10) {
                return true;
            }
            this.vt = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            return this.ouw.lh();
        }

        public fkw(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
            this.ouw = list.get(0);
        }
    }

    public interface lh<T> {
        float lh();

        boolean ouw();

        boolean ouw(float f10);

        com.bytedance.adsdk.vt.ra.ouw<T> vt();

        boolean vt(float f10);

        float yu();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.ouw.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0078ouw {
        void ouw();
    }

    public static final class vt<T> implements lh<T> {
        private vt() {
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return true;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    public static final class yu<T> implements lh<T> {
        private final List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> ouw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private com.bytedance.adsdk.vt.ra.ouw<T> f11302lh = null;
        private float yu = -1.0f;
        private com.bytedance.adsdk.vt.ra.ouw<T> vt = lh(0.0f);

        private com.bytedance.adsdk.vt.ra.ouw<T> lh(float f10) {
            List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list = this.ouw;
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = list.get(list.size() - 1);
            if (f10 >= ouwVar.vt()) {
                return ouwVar;
            }
            for (int size = this.ouw.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = this.ouw.get(size);
                if (this.vt != ouwVar2 && ouwVar2.ouw(f10)) {
                    return ouwVar2;
                }
            }
            return this.ouw.get(0);
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw() {
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final com.bytedance.adsdk.vt.ra.ouw<T> vt() {
            return this.vt;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean ouw(float f10) {
            if (this.vt.ouw(f10)) {
                return !this.vt.yu();
            }
            this.vt = lh(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final boolean vt(float f10) {
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = this.f11302lh;
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = this.vt;
            if (ouwVar == ouwVar2 && this.yu == f10) {
                return true;
            }
            this.f11302lh = ouwVar2;
            this.yu = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float yu() {
            List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list = this.ouw;
            return list.get(list.size() - 1).lh();
        }

        public yu(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
            this.ouw = list;
        }

        @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.lh
        public final float lh() {
            return this.ouw.get(0).vt();
        }
    }

    public abstract A ouw(com.bytedance.adsdk.vt.ra.ouw<K> ouwVar, float f10);

    public final void ouw(InterfaceC0078ouw interfaceC0078ouw) {
        this.ouw.add(interfaceC0078ouw);
    }

    private float pno() {
        if (this.f11301ra == -1.0f) {
            this.f11301ra = this.fkw.lh();
        }
        return this.f11301ra;
    }

    public float fkw() {
        if (this.pno == -1.0f) {
            this.pno = this.fkw.yu();
        }
        return this.pno;
    }

    public final float lh() {
        if (this.vt) {
            return 0.0f;
        }
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        if (ouwVarVt.yu()) {
            return 0.0f;
        }
        return (this.f11300lh - ouwVarVt.vt()) / (ouwVarVt.lh() - ouwVarVt.vt());
    }

    public void ouw(float f10) {
        if (this.fkw.ouw()) {
            return;
        }
        if (f10 < pno()) {
            f10 = pno();
        } else if (f10 > fkw()) {
            f10 = fkw();
        }
        if (f10 == this.f11300lh) {
            return;
        }
        this.f11300lh = f10;
        if (this.fkw.ouw(f10)) {
            ouw();
        }
    }

    public final float ra() {
        return this.f11300lh;
    }

    public final com.bytedance.adsdk.vt.ra.ouw<K> vt() {
        com.bytedance.adsdk.vt.fkw.ouw("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = this.fkw.vt();
        com.bytedance.adsdk.vt.fkw.vt("BaseKeyframeAnimation#getCurrentKeyframe");
        return ouwVarVt;
    }

    public ouw(List<? extends com.bytedance.adsdk.vt.ra.ouw<K>> list) {
        lh<K> yuVar;
        lh<K> vtVar;
        byte b10 = 0;
        if (list.isEmpty()) {
            vtVar = new vt<>(b10);
        } else {
            if (list.size() == 1) {
                yuVar = new fkw<>(list);
            } else {
                yuVar = new yu<>(list);
            }
            vtVar = yuVar;
        }
        this.fkw = vtVar;
    }

    public A le() {
        A aOuw;
        float fLh = lh();
        if (this.yu == null && this.fkw.vt(fLh)) {
            return this.f11299le;
        }
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        Interpolator interpolator = ouwVarVt.fkw;
        if (interpolator != null && ouwVarVt.f11335le != null) {
            aOuw = ouw(ouwVarVt, interpolator.getInterpolation(fLh), ouwVarVt.f11335le.getInterpolation(fLh));
        } else {
            aOuw = ouw(ouwVarVt, yu());
        }
        this.f11299le = aOuw;
        return aOuw;
    }

    public final float yu() {
        com.bytedance.adsdk.vt.ra.ouw<K> ouwVarVt = vt();
        if (ouwVarVt != null && !ouwVarVt.yu()) {
            return ouwVarVt.yu.getInterpolation(lh());
        }
        return 0.0f;
    }

    public void ouw() {
        for (int i10 = 0; i10 < this.ouw.size(); i10++) {
            this.ouw.get(i10).ouw();
        }
    }

    public A ouw(com.bytedance.adsdk.vt.ra.ouw<K> ouwVar, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
