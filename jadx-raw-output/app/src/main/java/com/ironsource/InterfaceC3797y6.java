package com.ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC3797y6 {

    /* JADX INFO: renamed from: com.ironsource.y6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f31621a;

        public final c a() {
            return this.f31621a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f31621a == ((a) obj).f31621a;
        }

        public a(c cVar) {
            ck.p.j(cVar, "strategyType");
            this.f31621a = cVar;
        }

        public final a a(c cVar) {
            ck.p.j(cVar, "strategyType");
            return new a(cVar);
        }

        public final c b() {
            return this.f31621a;
        }

        public int hashCode() {
            return this.f31621a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f31621a + ")";
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f31621a;
            }
            return aVar.a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$b */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.y6$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f31622a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f31622a = iArr;
            }
        }

        public final InterfaceC3797y6 a(C3621o0 c3621o0, a aVar, InterfaceC3729u6 interfaceC3729u6, InterfaceC3763w6 interfaceC3763w6, InterfaceC3780x6 interfaceC3780x6) {
            ck.p.j(c3621o0, "adTools");
            ck.p.j(aVar, "config");
            ck.p.j(interfaceC3729u6, "fullscreenAdUnitFactory");
            ck.p.j(interfaceC3763w6, "fullscreenAdUnitListener");
            ck.p.j(interfaceC3780x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            int i10 = a.f31622a[aVar.b().ordinal()];
            if (i10 == 1) {
                return new M6(c3621o0, aVar, interfaceC3729u6, interfaceC3763w6, interfaceC3780x6);
            }
            if (i10 == 2) {
                return new F6(c3621o0, interfaceC3729u6, interfaceC3763w6, interfaceC3780x6);
            }
            if (i10 == 3) {
                return new C3814z6(c3621o0, interfaceC3729u6, interfaceC3763w6, interfaceC3780x6);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31627a;

        public final String b() {
            return this.f31627a;
        }

        c(String str) {
            this.f31627a = str;
        }
    }

    void a(Activity activity);

    void loadAd();
}
