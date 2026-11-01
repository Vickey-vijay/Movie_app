package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import ck.i;
import ck.p;
import com.ironsource.C3556k9;
import com.ironsource.EnumC3592m9;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0443a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0444a extends AbstractC0443a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f45264a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0444a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f45264a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0444a) && p.e(this.f45264a, ((C0444a) obj).f45264a);
            }

            public int hashCode() {
                return this.f45264a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f45264a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0444a(String str) {
                super(null);
                p.j(str, "errorMessage");
                this.f45264a = str;
            }

            public final C0444a a(String str) {
                p.j(str, "errorMessage");
                return new C0444a(str);
            }

            public final String b() {
                return this.f45264a;
            }

            public /* synthetic */ C0444a(String str, int i10, i iVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0444a a(C0444a c0444a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0444a.f45264a;
                }
                return c0444a.a(str);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0443a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f45265a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0443a(i iVar) {
            this();
        }

        private AbstractC0443a() {
        }
    }

    AbstractC0443a a(Context context, C3556k9 c3556k9);

    AbstractC0443a a(Context context, EnumC3592m9 enumC3592m9);

    static /* synthetic */ AbstractC0443a a(a aVar, Context context, EnumC3592m9 enumC3592m9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 2) != 0) {
            enumC3592m9 = EnumC3592m9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC3592m9);
    }
}
