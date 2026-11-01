package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3450ea {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28769m = "age";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28770n = "gen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28771o = "lvl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28772p = "pay";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f28773q = "iapt";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28774r = "ucd";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f28775s = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28776a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28782g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28777b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f28778c = 999999.99d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28779d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28780e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28781f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28783h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f28784i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f28785j = -1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28786k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f28787l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f28781f;
    }

    @Deprecated
    public String b() {
        return this.f28782g;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f28777b) {
            this.f28783h = i10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i10 + " ) level must be between 1-" + this.f28777b, 2);
    }

    public double c() {
        return this.f28785j;
    }

    public AtomicBoolean d() {
        return this.f28784i;
    }

    public int e() {
        return this.f28783h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f28781f != -1) {
            arrayList.add(new Pair<>("age", this.f28781f + ""));
        }
        if (!TextUtils.isEmpty(this.f28782g)) {
            arrayList.add(new Pair<>(f28770n, this.f28782g));
        }
        if (this.f28783h != -1) {
            arrayList.add(new Pair<>("lvl", this.f28783h + ""));
        }
        if (this.f28784i != null) {
            arrayList.add(new Pair<>("pay", this.f28784i + ""));
        }
        if (this.f28785j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f28785j + ""));
        }
        if (this.f28786k != 0) {
            arrayList.add(new Pair<>("ucd", this.f28786k + ""));
        }
        if (!TextUtils.isEmpty(this.f28776a)) {
            arrayList.add(new Pair<>("segName", this.f28776a));
        }
        arrayList.addAll(this.f28787l);
        return arrayList;
    }

    public String g() {
        return this.f28776a;
    }

    public long h() {
        return this.f28786k;
    }

    public void a(boolean z10) {
        if (this.f28784i == null) {
            this.f28784i = new AtomicBoolean();
        }
        this.f28784i.set(z10);
    }

    public JSONObject i() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Pair<String, String> pair : f()) {
            try {
                jSONObjectJsonObjectInit.put((String) pair.first, pair.second);
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f28778c) {
            this.f28785j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f28778c, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f28786k = j10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f28776a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f28787l.size() >= 5) {
                    this.f28787l.remove(0);
                }
                this.f28787l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
