package com.bytedance.sdk.openadsdk.zih;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw implements Comparable<ouw> {
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private long f13591jg;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13594lh;
    public final String ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13595ra;
    private final ArrayList<Long> vt = new ArrayList<>();
    private final ArrayList<Long> yu = new ArrayList<>();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ArrayList<Long> f13593le = new ArrayList<>();
    private final ArrayList<Long> pno = new ArrayList<>();
    private final HashMap<String, vt> bly = new HashMap<>();
    private int tlj = 0;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f13590cf = 0;
    private final HashMap<String, vt> ryl = new HashMap<>();
    private int mwh = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final ArrayList<String> f13592ko = new ArrayList<>();

    public final void ouw(@NonNull String str, @Nullable String str2) {
        vt vtVar;
        vt vtVar2;
        vt vtVar3;
        vt vtVar4;
        vt vtVar5;
        vt vtVar6;
        str.hashCode();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (vtVar = this.ryl.get(str2)) != null) {
                    vtVar.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (vtVar2 = this.ryl.get(str2)) != null) {
                    vtVar2.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.ryl.get(str2) == null) {
                    vt vtVar7 = new vt();
                    this.ryl.put(str2, vtVar7);
                    vtVar7.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (vtVar3 = this.bly.get(str2)) != null && vtVar3.f13597le != vt.fkw) {
                    vtVar3.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().tlj) {
                        this.tlj = (int) (((long) this.tlj) + vtVar3.ouw(this.f13591jg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.f13593le.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f13224lh) {
                    this.f13595ra++;
                }
                if (!TextUtils.isEmpty(str2) && this.bly.get(str2) == null) {
                    vt vtVar8 = new vt();
                    this.bly.put(str2, vtVar8);
                    vtVar8.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.vt.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw) {
                    this.f13594lh++;
                    break;
                }
                break;
            case "click":
                if (!this.f13592ko.contains(str2)) {
                    if (this.f13592ko.size() > 50) {
                        this.f13592ko.subList(0, 25).clear();
                    }
                    this.f13592ko.add(str2);
                    this.yu.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt) {
                        this.fkw++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (vtVar4 = this.bly.get(str2)) != null) {
                    vtVar4.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (vtVar5 = this.bly.get(str2)) != null) {
                    vtVar5.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (vtVar6 = this.ryl.get(str2)) != null && vtVar6.f13597le != vt.fkw) {
                    vtVar6.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().bly) {
                        this.mwh = (int) (((long) this.mwh) + vtVar6.ouw(this.f13591jg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ryl) {
                    this.f13590cf++;
                    break;
                }
                break;
            case "dislike":
                this.pno.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ouw ouwVar) {
        return ouwVar.f13594lh - this.f13594lh;
    }

    public ouw(String str) {
        this.ouw = str;
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject2 = new JSONObject();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ouw("show_c_", jSONObject2, this.vt, com.bytedance.sdk.openadsdk.le.ouw.ouw().yu, jElapsedRealtime, jSONObject);
            ouw("click_c_", jSONObject2, this.yu, com.bytedance.sdk.openadsdk.le.ouw.ouw().fkw, jElapsedRealtime, jSONObject);
            ouw("v_play_c_", jSONObject2, this.f13593le, com.bytedance.sdk.openadsdk.le.ouw.ouw().f13223le, jElapsedRealtime, jSONObject);
            ouw("dislike_c_", jSONObject2, this.pno, com.bytedance.sdk.openadsdk.le.ouw.ouw().f13220cf, jElapsedRealtime, jSONObject);
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw && (i12 = this.f13594lh) != 0) {
                jSONObject2.put("show_c_s", i12);
                int iOptInt = jSONObject.optInt("show_c_s") + this.f13594lh;
                if (iOptInt != 0) {
                    jSONObject.put("show_c_s", iOptInt);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt && (i11 = this.fkw) != 0) {
                jSONObject2.put("click_c_s", i11);
                int iOptInt2 = jSONObject.optInt("click_c_s") + this.fkw;
                if (iOptInt2 != 0) {
                    jSONObject.put("click_c_s", iOptInt2);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f13224lh && (i10 = this.f13595ra) != 0) {
                jSONObject2.put("v_play_c_s", i10);
                int iOptInt3 = jSONObject.optInt("v_play_c_s") + this.f13595ra;
                if (iOptInt3 != 0) {
                    jSONObject.put("v_play_c_s", iOptInt3);
                }
            }
            ouw(jSONObject2, jSONObject);
        } catch (Throwable th2) {
            qbp.yu(th2.getMessage(), new Object[0]);
        }
        return jSONObject2;
    }

    private static void ouw(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[PHI: r10 r14
  0x0103: PHI (r10v3 int) = (r10v2 int), (r10v5 int), (r10v5 int) binds: [B:34:0x00e2, B:39:0x00f6, B:41:0x00fb] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r14v2 long) = (r14v1 long), (r14v4 long), (r14v4 long) binds: [B:34:0x00e2, B:39:0x00f6, B:41:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    private void ouw(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long j10;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        int[] iArr = com.bytedance.sdk.openadsdk.le.ouw.ouw().f13225ra;
        long j11 = 60000;
        if (iArr != null) {
            int i13 = 0;
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                long j12 = jElapsedRealtime - (((long) i14) * j11);
                Iterator<String> it = this.ryl.keySet().iterator();
                long j13 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<String> it2 = it;
                    vt vtVar = this.ryl.get(next);
                    if (vtVar != null) {
                        long jOuw = vtVar.ouw(j12, jElapsedRealtime);
                        j13 += jOuw;
                        if (jOuw <= 0 && i13 == iArr.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j13 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j13);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j13;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i13++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j11 = 60000;
            }
        }
        HashSet hashSet6 = hashSet4;
        HashSet hashSet7 = hashSet5;
        int[] iArr2 = com.bytedance.sdk.openadsdk.le.ouw.ouw().pno;
        if (iArr2 != null) {
            int i15 = 0;
            while (i15 < iArr2.length) {
                int i16 = iArr2[i15];
                long j14 = jElapsedRealtime - (((long) i16) * 60000);
                Iterator<String> it3 = this.bly.keySet().iterator();
                int i17 = 0;
                long j15 = 0;
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    Iterator<String> it4 = it3;
                    vt vtVar2 = this.bly.get(next2);
                    if (vtVar2 != null) {
                        long jOuw2 = vtVar2.ouw(j14, jElapsedRealtime);
                        j15 += jOuw2;
                        if (jOuw2 > 20000) {
                            i17++;
                        }
                        if (jOuw2 > 0 || i15 != iArr2.length - 1) {
                            hashSet = hashSet7;
                        } else {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                        }
                    } else {
                        hashSet = hashSet7;
                    }
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                HashSet hashSet8 = hashSet7;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i16)), j15);
                    j10 = jElapsedRealtime;
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i16)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i16)), jOptInt2);
                    }
                } else {
                    j10 = jElapsedRealtime;
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i16)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i16))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i16)), iOptInt);
                    }
                }
                i15++;
                hashSet7 = hashSet8;
                jElapsedRealtime = j10;
            }
        }
        HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.ryl.remove((String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.bly.remove((String) it6.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.le.ouw.ouw().tlj && (i12 = this.tlj) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.tlj;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.le.ouw.ouw().bly && (i11 = this.mwh) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.mwh;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.le.ouw.ouw().ryl || (i10 = this.f13590cf) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.f13590cf;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public final void ouw() {
        this.f13591jg = SystemClock.elapsedRealtime();
        this.f13590cf = 0;
        this.fkw = 0;
        this.f13594lh = 0;
        this.mwh = 0;
        this.tlj = 0;
        this.f13595ra = 0;
    }
}
