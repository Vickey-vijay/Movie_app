package com.safedk.android.internal;

import android.os.Bundle;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44844a = "master";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44845b = "collect_host_urls";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44846c = "SafeDKToggles";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44847d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44848e = "location";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44849f = "calllog";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44850g = "accounts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44851h = "contacts";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44852i = "calendar";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44853j = "browser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44854k = "sms";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44855l = "files";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44856m = "camera";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44857n = "microphone";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44858o = "accelerometer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44859p = "notifications";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44860q = "packagemanager";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44861r = "advertising_identifier";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44862s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44863t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f44864u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44865v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f44866w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f44867x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f44868y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f44869z = true;
    private boolean A = true;
    private boolean B = true;
    private boolean C = true;
    private boolean D = true;
    private boolean E = true;
    private boolean F = true;
    private boolean G = true;
    private boolean H = true;
    private boolean I = false;

    public h(boolean z10) {
        b(z10);
    }

    private void b(boolean z10) {
        this.H = z10;
        this.G = z10;
        this.F = z10;
        this.E = z10;
        this.D = z10;
        this.C = z10;
        this.B = z10;
        this.A = z10;
        this.f44869z = z10;
        this.f44868y = z10;
        this.f44867x = z10;
        this.f44866w = z10;
        this.f44865v = z10;
        this.f44864u = z10;
        this.f44863t = z10;
        this.f44862s = z10;
        this.I = false;
    }

    public h(String str) {
        a(str);
    }

    public h(JSONObject jSONObject) {
        a(jSONObject);
    }

    private Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f44844a, this.f44862s);
        bundle.putBoolean("network", this.f44863t);
        bundle.putBoolean(f44848e, this.f44864u);
        bundle.putBoolean(f44850g, this.f44866w);
        bundle.putBoolean(f44849f, this.f44865v);
        bundle.putBoolean(f44851h, this.f44867x);
        bundle.putBoolean("calendar", this.f44868y);
        bundle.putBoolean(f44853j, this.f44869z);
        bundle.putBoolean("sms", this.A);
        bundle.putBoolean(f44855l, this.B);
        bundle.putBoolean(f44856m, this.C);
        bundle.putBoolean(f44857n, this.D);
        bundle.putBoolean(f44858o, this.E);
        bundle.putBoolean("notifications", this.F);
        bundle.putBoolean(f44860q, this.G);
        bundle.putBoolean(f44861r, this.H);
        bundle.putBoolean(f44845b, this.I);
        return bundle;
    }

    private void a(String str) {
        try {
            a(new JSONObject(str));
        } catch (JSONException e10) {
            Logger.e(f44846c, "Failed to convert toggles to json", e10);
        }
    }

    public void a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(f44844a)) {
                this.f44862s = jSONObject.getBoolean(f44844a);
            }
            if (jSONObject.has("network")) {
                this.f44863t = jSONObject.getBoolean("network");
            }
            if (jSONObject.has(f44848e)) {
                this.f44864u = jSONObject.getBoolean(f44848e);
            }
            if (jSONObject.has(f44850g)) {
                this.f44866w = jSONObject.getBoolean(f44850g);
            }
            if (jSONObject.has(f44849f)) {
                this.f44865v = jSONObject.getBoolean(f44849f);
            }
            if (jSONObject.has(f44851h)) {
                this.f44867x = jSONObject.getBoolean(f44851h);
            }
            if (jSONObject.has("calendar")) {
                this.f44868y = jSONObject.getBoolean("calendar");
            }
            if (jSONObject.has(f44853j)) {
                this.f44869z = jSONObject.getBoolean(f44853j);
            }
            if (jSONObject.has("sms")) {
                this.A = jSONObject.getBoolean("sms");
            }
            if (jSONObject.has(f44855l)) {
                this.B = jSONObject.getBoolean(f44855l);
            }
            if (jSONObject.has(f44856m)) {
                this.C = jSONObject.getBoolean(f44856m);
            }
            if (jSONObject.has(f44857n)) {
                this.D = jSONObject.getBoolean(f44857n);
            }
            if (jSONObject.has(f44858o)) {
                this.E = jSONObject.getBoolean(f44858o);
            }
            if (jSONObject.has("notifications")) {
                this.F = jSONObject.getBoolean("notifications");
            }
            if (jSONObject.has(f44860q)) {
                this.G = jSONObject.getBoolean(f44860q);
            }
            if (jSONObject.has(f44861r)) {
                this.H = jSONObject.getBoolean(f44861r);
            }
            if (jSONObject.has(f44845b)) {
                this.I = jSONObject.getBoolean(f44845b);
            }
        } catch (Throwable th2) {
            Logger.e(f44846c, "Failed to parse toggles: " + (jSONObject == null ? "null" : jSONObject.toString()), th2);
            new CrashReporter().caughtException(th2);
            b(true);
        }
    }

    public ArrayList<String> a() {
        return a(true);
    }

    public ArrayList<String> a(boolean z10) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Bundle bundleS = s();
            for (String str : bundleS.keySet()) {
                if (!str.equals(f44845b) && !bundleS.getBoolean(str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f44846c, "caught exception", th2);
            if (z10) {
                new CrashReporter().caughtException(th2);
            }
        }
        return arrayList;
    }

    public boolean b() {
        return this.f44862s;
    }

    public boolean c() {
        return this.f44863t;
    }

    public boolean d() {
        return this.f44864u;
    }

    public boolean e() {
        return this.f44866w;
    }

    public boolean f() {
        return this.f44865v;
    }

    public boolean g() {
        return this.f44867x;
    }

    public boolean h() {
        return this.f44868y;
    }

    public boolean i() {
        return this.f44869z;
    }

    public boolean j() {
        return this.A;
    }

    public boolean k() {
        return this.B;
    }

    public boolean l() {
        return this.C;
    }

    public boolean m() {
        return this.D;
    }

    public boolean n() {
        return this.E;
    }

    public boolean o() {
        return this.F;
    }

    public boolean p() {
        return this.G;
    }

    public boolean q() {
        return this.H;
    }

    public boolean r() {
        return this.I;
    }

    public String toString() {
        return "SafeDKToggles: master=" + this.f44862s + "; network=" + this.f44863t + "; location=" + this.f44864u + "; ; accounts=" + this.f44866w + "; call_log=" + this.f44865v + "; contacts=" + this.f44867x + "; calendar=" + this.f44868y + "; browser=" + this.f44869z + "; sms_mms=" + this.A + "; files=" + this.B + "; camera=" + this.C + "; microphone=" + this.D + "; accelerometer=" + this.E + "; notifications=" + this.F + "; packageManager=" + this.G + "; advertisingId=" + this.H;
    }
}
