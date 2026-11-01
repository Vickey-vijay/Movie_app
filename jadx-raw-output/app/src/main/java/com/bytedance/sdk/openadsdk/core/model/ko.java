package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ko implements com.bytedance.sdk.component.adexpress.lh {
    public JSONObject bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final boolean f12762cf;
    public final long fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f12763jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f12764ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final long f12765le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final float f12766lh;
    public JSONObject mwh;
    public final float ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f12767ra;
    public int ryl;
    public SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> tlj;
    public final float vt;
    public final float yu;

    public static class ouw {
        public int bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f12768cf;
        public float fkw;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public boolean f12770ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f12771le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f12772lh;
        public long ouw;
        public String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f12773ra;
        public JSONObject ryl;
        public JSONObject tlj;
        public long vt;
        public float yu;
        public boolean mwh = false;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> f12769jg = new SparseArray<>();

        public final ouw ouw(SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray) {
            this.f12769jg = sparseArray;
            return this;
        }

        public final ko ouw() {
            return new ko(this, (byte) 0);
        }
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private ko(@NonNull ouw ouwVar) {
        this.f12763jg = false;
        this.ouw = ouwVar.f12771le;
        this.vt = ouwVar.fkw;
        this.f12766lh = ouwVar.yu;
        this.yu = ouwVar.f12772lh;
        this.fkw = ouwVar.vt;
        this.f12765le = ouwVar.ouw;
        this.f12767ra = ouwVar.pno;
        this.tlj = ouwVar.f12769jg;
        this.f12762cf = ouwVar.f12770ko;
        this.pno = ouwVar.bly;
        this.bly = ouwVar.tlj;
        this.ryl = ouwVar.f12768cf;
        this.mwh = ouwVar.ryl;
        this.f12763jg = ouwVar.mwh;
        this.f12764ko = ouwVar.f12773ra;
    }
}
