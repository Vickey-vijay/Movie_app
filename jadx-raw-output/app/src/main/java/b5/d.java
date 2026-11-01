package b5;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f4766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f4768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f4779p;

    public int a() {
        if (this.f4772i) {
            return this.f4771h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int b() {
        if (this.f4770g) {
            return this.f4769f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String c() {
        return this.f4768e;
    }

    public float d() {
        return this.f4778o;
    }

    public int e() {
        return this.f4777n;
    }

    public int f(@Nullable String str, @Nullable String str2, String[] strArr, @Nullable String str3) {
        if (this.f4764a.isEmpty() && this.f4765b.isEmpty() && this.f4766c.isEmpty() && this.f4767d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iX = x(x(x(0, this.f4764a, str, 1073741824), this.f4765b, str2, 2), this.f4767d, str3, 4);
        if (iX == -1 || !Arrays.asList(strArr).containsAll(this.f4766c)) {
            return 0;
        }
        return iX + (this.f4766c.size() * 4);
    }

    public int g() {
        int i10 = this.f4775l;
        if (i10 == -1 && this.f4776m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f4776m == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment h() {
        return this.f4779p;
    }

    public boolean i() {
        return this.f4772i;
    }

    public boolean j() {
        return this.f4770g;
    }

    public boolean k() {
        return this.f4773j == 1;
    }

    public boolean l() {
        return this.f4774k == 1;
    }

    public void m() {
        this.f4764a = "";
        this.f4765b = "";
        this.f4766c = Collections.emptyList();
        this.f4767d = "";
        this.f4768e = null;
        this.f4770g = false;
        this.f4772i = false;
        this.f4773j = -1;
        this.f4774k = -1;
        this.f4775l = -1;
        this.f4776m = -1;
        this.f4777n = -1;
        this.f4779p = null;
    }

    public d n(int i10) {
        this.f4771h = i10;
        this.f4772i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f4775l = z10 ? 1 : 0;
        return this;
    }

    public d p(int i10) {
        this.f4769f = i10;
        this.f4770g = true;
        return this;
    }

    public d r(boolean z10) {
        this.f4776m = z10 ? 1 : 0;
        return this;
    }

    public void t(String str) {
        this.f4764a = str;
    }

    public void u(String str) {
        this.f4765b = str;
    }

    public void v(String str) {
        this.f4767d = str;
    }

    public d w(boolean z10) {
        this.f4774k = z10 ? 1 : 0;
        return this;
    }

    public d() {
        m();
    }

    public static int x(int i10, String str, @Nullable String str2, int i11) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
    }

    public d q(@Nullable String str) {
        this.f4768e = k0.K0(str);
        return this;
    }

    public void s(String[] strArr) {
        this.f4766c = Arrays.asList(strArr);
    }
}
