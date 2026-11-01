package sa;

import android.util.Log;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: UserUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f67181a = new o0();

    public static final void K0(int i10) {
        Log.e("loginType", i10 + "");
        em.k.i(em.r.a()).l("KEY_PREF_LOGIN_TYPE", i10);
    }

    public static final void u0(String str) {
        if (str == null || HttpUrl.Companion.parse(str) == null) {
            return;
        }
        em.k.i(em.r.a()).o("KEY_PREF_BASE_URL40000", str);
    }

    public static final String A() {
        return em.k.i(em.r.a()).h("KEY_PREF_HOME_CACHE_TIME", "");
    }

    public static final void A0(long j10) {
        em.k.i(em.r.a()).m("KEY_PREF_DAY_NO_LOGIN", j10);
    }

    public static final int B() {
        return em.k.i(em.r.a()).d("KEY_PREF_LOGIN_TYPE", 0);
    }

    public static final void B0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_DAY_TIME", str);
    }

    public static final int C() {
        return em.k.i(em.r.a()).d("KEY_PREF_MAXVIEWNUM", 20);
    }

    public static final void C0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_FEEDBACK_TAGS", str);
    }

    public static final int D() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_MY_DOWNLOAD_NUM", 0);
    }

    public static final void D0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_FIRST_ENNER_DAY", i10);
    }

    public static final int E() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_MY_DOWNLOAD_NUM_FAIL", 0);
    }

    public static final void E0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_FIRST_SPLASH_ENNER", i10);
    }

    public static final String F() {
        return em.k.i(em.r.a()).h("KEY_PREF_MYGAME_URL", "");
    }

    public static final void F0(boolean z10) {
        em.k.i(em.r.a()).j("KEY_PREF_FREE_AD", z10);
    }

    public static final String G() {
        return em.k.i(em.r.a()).h("KEY_PAYLIST_URL", "");
    }

    public static final void G0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_HOME_CACHE_TIME", str);
    }

    public static final int H() {
        return em.k.i(em.r.a()).d("KEY_PREF_PLAYVIEWNUM", 0);
    }

    public static final void H0(boolean z10) {
        em.k.i(em.r.a()).j("KEY_PREF_IS_LOAD_RANK_CACHE", z10);
    }

    public static final float I() {
        return em.k.i(em.r.a()).c("PlayerSeep", 1.0f);
    }

    public static final void I0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_ISPROJECTION", i10);
    }

    public static final String J() {
        return em.k.i(em.r.a()).h("KEY_PREF_PUBLICSYSCONF_STRING", "");
    }

    public static final void J0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_IS_UPDATE_USER", i10);
    }

    public static final String K() {
        return em.k.i(em.r.a()).h("KEY_PREF_SHARE_DAY_TIME", "");
    }

    public static final int L() {
        return em.k.i(em.r.a()).d("KEY_PREF_SHARE_STATE", 0);
    }

    public static final void L0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_MAXVIEWNUM", i10);
    }

    public static final int M() {
        return em.k.i(em.r.a()).d("KEY_SHOW_18", 0);
    }

    public static final void M0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_MY_DOWNLOAD_NUM", i10);
    }

    public static final int N() {
        return em.k.i(em.r.a()).d("KEY_PREF_SHOW_SHARE_ONCE", 0);
    }

    public static final void N0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_MY_DOWNLOAD_NUM_FAIL", i10);
    }

    public static final int O() {
        return em.k.i(em.r.a()).d("KEY_SHOW_LANGUAGE", 0);
    }

    public static final void O0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_MYGAME_URL", str);
    }

    public static final String P() {
        return em.k.i(em.r.a()).h("KEY_PREF_SPIEL_URL", "");
    }

    public static final void P0(String str) {
        em.k.i(em.r.a()).o("KEY_PAYLIST_URL", str);
    }

    public static final int Q() {
        return em.k.i(em.r.a()).d("KEY_PREF_TODAY_VIEW_AD", 1);
    }

    public static final void Q0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_PLAYVIEWNUM", i10);
    }

    public static final String R() {
        return em.k.i(em.r.a()).h("KEY_PREF_USER_TOKEN", "");
    }

    public static final void R0(float f10) {
        em.k.i(em.r.a()).k("PlayerSeep", f10);
    }

    public static final String S() {
        return em.k.i(em.r.a()).h("KEY_PREF_USER_HEAD_URL", "");
    }

    public static final void S0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_PUBLICSYSCONF_STRING", str);
    }

    public static final int T() {
        return em.k.i(em.r.a()).d("KEY_PREF_USER_ID", 0);
    }

    public static final void T0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_SAVE_SHARE_CONTENT", str);
    }

    public static final int U() {
        return em.k.i(em.r.a()).d("KEY_PREF_USER_IS_SVIP", 0);
    }

    public static final void U0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_IS_USER_SEX", str);
    }

    public static final String V() {
        return em.k.i(em.r.a()).h("KEY_PREF_USER_NICK_NAME", "");
    }

    public static final void V0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_SHARE_STATE", i10);
    }

    public static final long W() {
        return em.k.i(em.r.a()).f("KEY_PREF_USER_VIP", 0L);
    }

    public static final void W0(int i10) {
        em.k.i(em.r.a()).l("KEY_SHOW_18", i10);
    }

    public static final long X() {
        return em.k.i(em.r.a()).f("KEY_PREF_AD_LOOK_TIME", 0L);
    }

    public static final void X0(int i10) {
        em.k.i(em.r.a()).l("KEY_SHOW_LANGUAGE", i10);
    }

    public static final String Y() {
        return em.k.i(em.r.a()).h("KEY_PREF_VOD_FEEDBACK_TAGS", "");
    }

    public static final void Y0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_SPIEL_URL", str);
    }

    public static final String Z() {
        return em.k.i(em.r.a()).h("KEY_PREF_WEBSITE", "");
    }

    public static final void Z0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_TODAY_VIEW_AD", i10);
    }

    public static final String a() {
        return em.k.i(em.r.a()).h("KEY_PREF_AD_APP2_KEY", "");
    }

    public static final int a0() {
        return em.k.i(em.r.a()).d("KEY_PREF_BACKGROUND_AD_TIME", 0);
    }

    public static final void a1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_USER_TOKEN", str);
    }

    public static final String b() {
        return em.k.i(em.r.a()).h("KEY_PREF_AD_APPID1", "");
    }

    public static final String b0() {
        String strH = em.k.i(em.r.a()).h("KEY_PREF_PRIVACY_URL", "https://7pyp.e97z.com/privacy.html");
        ck.p.i(strH, "getString(...)");
        return strH;
    }

    public static final void b1(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_IS_UPDATE_USER", i10);
    }

    public static final String c() {
        return em.k.i(em.r.a()).h("KEY_PREF_AD_APPID2", "");
    }

    public static final boolean c0() {
        return em.k.i(em.r.a()).a("KEY_PREF_IS_LOAD_RANK_CACHE", true);
    }

    public static final void c1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_USER_HEAD_URL", str);
    }

    public static final long d() {
        return em.k.i(em.r.a()).f("KEY_PREF_AD_VIEW_TIME_CENTER", 0L);
    }

    public static final void d0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_AD_APP2_KEY", str);
    }

    public static final void d1(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_USER_ID", i10);
    }

    public static final int e() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_DOWNLOAD_NUM", 0);
    }

    public static final void e0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_AD_APPID1", str);
    }

    public static final void e1(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_USER_IS_SVIP", i10);
    }

    public static final int f() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_DOWNLOAD_SECOND_VIEW", 0);
    }

    public static final void f0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_AD_APPID2", str);
    }

    public static final void f1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_USER_NAME", str);
    }

    public static final int g() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_PERMISSION", 0);
    }

    public static final void g0(long j10) {
        em.k.i(em.r.a()).m("KEY_PREF_AD_VIEW_TIME_CENTER", j10);
    }

    public static final void g1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_USER_NICK_NAME", str);
    }

    public static final int h() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_REWARD", 0);
    }

    public static final void h0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_DOWNLOAD_NUM", i10);
    }

    public static final void h1(long j10) {
        em.k.i(em.r.a()).m("KEY_PREF_USER_VIP", j10);
    }

    public static final int i() {
        return em.k.i(em.r.a()).d("NETCINEVAR_KEY_PREF_AD_SHOW_NUM", 0);
    }

    public static final void i0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_DOWNLOAD_SECOND_VIEW", i10);
    }

    public static final void i1(long j10) {
        em.k.i(em.r.a()).m("KEY_PREF_AD_LOOK_TIME", j10);
    }

    public static final int j() {
        return em.k.i(em.r.a()).d("KEY_PREF_AD_TOP", 0);
    }

    public static final void j0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_ERROR_CODE", i10);
    }

    public static final void j1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_VOD_FEEDBACK_TAGS", str);
    }

    public static final long k() {
        return em.k.i(em.r.a()).f("KEY_PREF_AD_VIEW_TIME", 0L);
    }

    public static final void k0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_PERMISSION", i10);
    }

    public static final void k1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_WEBSITE", str);
    }

    public static final int l() {
        return em.k.i(em.r.a()).d("KEY_PREF_ALL_URL_SET", 0);
    }

    public static final void l0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_REWARD", i10);
    }

    public static final void l1(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_BACKGROUND_AD_TIME", i10);
    }

    public static final String m() {
        return em.k.i(em.r.a()).h("KEY_PREF_APP_LANGUAGE", "en");
    }

    public static final void m0(int i10) {
        em.k.i(em.r.a()).l("NETCINEVAR_KEY_PREF_AD_SHOW_NUM", i10);
    }

    public static final void m1(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_PRIVACY_URL", str);
    }

    public static final int n() {
        return em.k.i(em.r.a()).d("KEY_PREF_APP_NOTICE", 0);
    }

    public static final void n0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_AD_TOP", i10);
    }

    public static final int o() {
        return em.k.i(em.r.a()).d("KEY_PREF_APP_NOTICE_ID", 0);
    }

    public static final void o0(long j10) {
        em.k.i(em.r.a()).m("KEY_PREF_AD_VIEW_TIME", j10);
    }

    public static final String p() {
        return em.k.i(em.r.a()).h("KEY_PREF_BASE_URL40000", "");
    }

    public static final void p0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_IS_USER_AGE", str);
    }

    public static final String q() {
        return em.k.i(em.r.a()).h("KEY_PREF_CACHE_TIME", "");
    }

    public static final void q0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_ALL_URL_SET", i10);
    }

    public static final String r() {
        return em.k.i(em.r.a()).h("KEY_CALLSERVICE", "");
    }

    public static final void r0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_APP_LANGUAGE", str);
    }

    public static final String s() {
        return em.k.i(em.r.a()).h("cmLanuage", "0");
    }

    public static final void s0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_APP_NOTICE", i10);
    }

    public static final String t() {
        return em.k.i(em.r.a()).h("KEY_PREF_CREATE_TIME", "");
    }

    public static final void t0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_APP_NOTICE_ID", i10);
    }

    public static final long u() {
        return em.k.i(em.r.a()).f("KEY_PREF_DAY_NO_LOGIN", 0L);
    }

    public static final String v() {
        return em.k.i(em.r.a()).h("KEY_PREF_DAY_TIME", "");
    }

    public static final void v0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_CACHE_TIME", str);
    }

    public static final String w() {
        return em.k.i(em.r.a()).h("KEY_PREF_FEEDBACK_TAGS", "");
    }

    public static final void w0(String str) {
        em.k.i(em.r.a()).o("KEY_CALLSERVICE", str);
    }

    public static final int x() {
        return em.k.i(em.r.a()).d("KEY_PREF_FIRST_ENNER_DAY", 0);
    }

    public static final void x0(String str) {
        em.k.i(em.r.a()).o("cmLanuage", str);
    }

    public static final int y() {
        return em.k.i(em.r.a()).d("KEY_PREF_FIRST_SPLASH_ENNER", 0);
    }

    public static final void y0(int i10) {
        em.k.i(em.r.a()).l("KEY_PREF_COPY_CODE", i10);
    }

    public static final boolean z() {
        return em.k.i(em.r.a()).a("KEY_PREF_FREE_AD", false);
    }

    public static final void z0(String str) {
        em.k.i(em.r.a()).o("KEY_PREF_CREATE_TIME", str);
    }
}
