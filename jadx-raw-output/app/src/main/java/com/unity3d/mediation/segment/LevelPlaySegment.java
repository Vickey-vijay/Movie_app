package com.unity3d.mediation.segment;

import android.text.TextUtils;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.Regex;
import nj.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlaySegment {
    public static final a Companion = new a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45352h = 999999;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f45353i = 999999.99d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45354j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45355k = "custom";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45359d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45362g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Pair<String, String>> f45356a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f45357b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45360e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f45361f = -1.0d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^[a-zA-Z0-9]*$").matches(str);
    }

    private final boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.f45356a;
    }

    public final double getIapTotal() {
        return this.f45361f;
    }

    public final int getLevel() {
        return this.f45360e;
    }

    public final ArrayList<Pair<String, String>> getSegmentData() {
        IronLog.API.info("");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        int i10 = this.f45360e;
        if (i10 != -1) {
            arrayList.add(new Pair<>("lvl", String.valueOf(i10)));
        }
        if (this.f45358c) {
            arrayList.add(new Pair<>("pay", String.valueOf(isPaying())));
        }
        double d10 = this.f45361f;
        if (d10 != -1.0d) {
            arrayList.add(new Pair<>("iapt", String.valueOf(d10)));
        }
        long j10 = this.f45362g;
        if (j10 != 0) {
            arrayList.add(new Pair<>("ucd", String.valueOf(j10)));
        }
        String str = this.f45359d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new Pair<>(SEGMENT_NAME, str));
        }
        ArrayList<Pair<String, String>> arrayList2 = this.f45356a;
        ArrayList arrayList3 = new ArrayList(t.v(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair("custom_" + pair.getFirst(), pair.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.f45359d;
    }

    public final long getUserCreationDate() {
        return this.f45362g;
    }

    public final boolean isPaying() {
        return this.f45357b.get();
    }

    public final void setCustom(String str, String str2) {
        p.j(str, C3426d4.i.W);
        p.j(str2, "value");
        IronLog.API.info("");
        try {
            if (a(str) && a(str, 1, 32) && a(str2) && a(str2, 1, 32)) {
                if (this.f45356a.size() >= 5) {
                    this.f45356a.remove(0);
                }
                this.f45356a.add(new Pair<>(str, str2));
                return;
            }
            IronLog.INTERNAL.warning(str + ", " + str2 + " must be alphanumeric and 1-32 in length");
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void setIapTotal(double d10) {
        IronLog.API.info("");
        if (0.0d <= d10 && d10 <= f45353i) {
            double d11 = 100;
            this.f45361f = Math.floor(d10 * d11) / d11;
            return;
        }
        IronLog.INTERNAL.warning(d10 + " must be between 0-999999.99");
    }

    public final void setLevel(int i10) {
        IronLog.API.info("");
        if (1 <= i10 && i10 < 1000000) {
            this.f45360e = i10;
            return;
        }
        IronLog.INTERNAL.warning(i10 + " must be between 1-999999");
    }

    public final void setPaying(boolean z10) {
        IronLog.API.info("");
        this.f45358c = true;
        this.f45357b.set(z10);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.f45359d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j10) {
        IronLog.API.info("");
        if (j10 > 0) {
            this.f45362g = j10;
            return;
        }
        IronLog.INTERNAL.warning(j10 + " is an invalid timestamp");
    }

    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : getSegmentData()) {
            try {
                jSONObject.put(pair.component1(), pair.component2());
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }
}
