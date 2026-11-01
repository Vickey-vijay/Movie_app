package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f8896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpannedString f8898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpannedString f8899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8908m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SpannedString f8911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SpannedString f8912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8915g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8916h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8917i = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8918j = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8919k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8920l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f8921m;

        public b a(boolean z10) {
            this.f8910b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f8911c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f8912d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f8913e = str;
            return this;
        }

        public b(c cVar) {
            this.f8909a = cVar;
        }

        public b a(String str) {
            this.f8914f = str;
            return this;
        }

        public b b(int i10) {
            this.f8920l = i10;
            return this;
        }

        public b c(int i10) {
            this.f8918j = i10;
            return this;
        }

        public b d(int i10) {
            this.f8917i = i10;
            return this;
        }

        public b a(int i10) {
            this.f8916h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f8921m = z10;
            return this;
        }

        public b a(Context context) {
            this.f8916h = R.drawable.applovin_ic_disclosure_arrow;
            this.f8920l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8929a;

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f8929a;
        }

        c(int i10) {
            this.f8929a = i10;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public r2(c cVar) {
        this.f8902g = 0;
        this.f8903h = 0;
        this.f8904i = ViewCompat.MEASURED_STATE_MASK;
        this.f8905j = ViewCompat.MEASURED_STATE_MASK;
        this.f8906k = 0;
        this.f8907l = 0;
        this.f8896a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f8901f;
    }

    public String c() {
        return this.f8900e;
    }

    public int d() {
        return this.f8903h;
    }

    public int e() {
        return this.f8907l;
    }

    public SpannedString f() {
        return this.f8899d;
    }

    public int g() {
        return this.f8905j;
    }

    public int h() {
        return this.f8902g;
    }

    public int i() {
        return this.f8906k;
    }

    public int j() {
        return this.f8896a.b();
    }

    public SpannedString k() {
        return this.f8898c;
    }

    public int l() {
        return this.f8904i;
    }

    public int m() {
        return this.f8896a.c();
    }

    public boolean o() {
        return this.f8897b;
    }

    public boolean p() {
        return this.f8908m;
    }

    private r2(b bVar) {
        this.f8902g = 0;
        this.f8903h = 0;
        this.f8904i = ViewCompat.MEASURED_STATE_MASK;
        this.f8905j = ViewCompat.MEASURED_STATE_MASK;
        this.f8906k = 0;
        this.f8907l = 0;
        this.f8896a = bVar.f8909a;
        this.f8897b = bVar.f8910b;
        this.f8898c = bVar.f8911c;
        this.f8899d = bVar.f8912d;
        this.f8900e = bVar.f8913e;
        this.f8901f = bVar.f8914f;
        this.f8902g = bVar.f8915g;
        this.f8903h = bVar.f8916h;
        this.f8904i = bVar.f8917i;
        this.f8905j = bVar.f8918j;
        this.f8906k = bVar.f8919k;
        this.f8907l = bVar.f8920l;
        this.f8908m = bVar.f8921m;
    }
}
