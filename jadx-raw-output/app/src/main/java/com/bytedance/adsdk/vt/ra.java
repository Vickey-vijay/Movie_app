package com.bytedance.adsdk.vt;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class ra {
    public Rect bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public float f11316cf;
    public List<com.bytedance.adsdk.vt.lh.le> fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public lh f11318ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public SparseArray<com.bytedance.adsdk.vt.lh.yu> f11319le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Map<String, tlj> f11320lh;
    public boolean mwh;
    public List<com.bytedance.adsdk.vt.lh.lh.fkw> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> f11321ra;
    public float ryl;
    public float tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public vt f11324vm;
    public Map<String, List<com.bytedance.adsdk.vt.lh.lh.fkw>> vt;
    public Map<String, com.bytedance.adsdk.vt.lh.lh> yu;
    public ouw zih;
    public final th ouw = new th();

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final HashSet<String> f11323th = new HashSet<>();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f11317jg = 0;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f11322rn = "";

    public static class lh {
        public int[] fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f11325le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11326lh;
        public int ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public JSONArray f11327ra;
        public String vt;
        public String yu;
    }

    public static class ouw {
        public int fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f11328le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public Map<String, Object> f11329lh;
        public int ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public JSONArray f11330ra;
        public Map<String, Object> vt;
        public int yu;
    }

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public JSONArray f11331lh;
        public String ouw;
        public int[][] vt;
    }

    public final void ouw(String str) {
        com.bytedance.adsdk.vt.le.yu.vt(str);
        this.f11323th.add(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public final com.bytedance.adsdk.vt.lh.le vt(String str) {
        int size = this.fkw.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.vt.lh.le leVar = this.fkw.get(i10);
            boolean z10 = true;
            if (!leVar.ouw.equalsIgnoreCase(str)) {
                if (leVar.ouw.endsWith("\r")) {
                    String str2 = leVar.ouw;
                    if (!str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return leVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.vt.lh.lh.fkw> it = this.pno.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().ouw("\t"));
        }
        return sb2.toString();
    }

    public final void ouw(int i10) {
        this.f11317jg += i10;
    }

    public final void ouw(boolean z10) {
        this.ouw.ouw = z10;
    }

    public final float vt() {
        return this.f11316cf - this.tlj;
    }

    public final com.bytedance.adsdk.vt.lh.lh.fkw ouw(long j10) {
        return this.f11321ra.get(j10);
    }

    public final float ouw() {
        return (long) ((vt() / this.ryl) * 1000.0f);
    }

    public final float ouw(float f10) {
        return com.bytedance.adsdk.vt.le.ra.ouw(this.tlj, this.f11316cf, f10);
    }
}
