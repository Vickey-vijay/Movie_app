package com.ironsource.mediationsdk.adquality;

import ck.i;
import ck.p;
import com.ironsource.C3467f9;
import com.ironsource.EnumC3703se;
import com.ironsource.Q6;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f29537a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static EnumC0277a f29538b = EnumC0277a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0277a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0278a f29539b = new C0278a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29545a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0278a {
            public /* synthetic */ C0278a(i iVar) {
                this();
            }

            private C0278a() {
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            public final EnumC0277a a(int i10) {
                for (EnumC0277a enumC0277a : EnumC0277a.values()) {
                    if (enumC0277a.b() == i10) {
                        if (enumC0277a == null) {
                            return EnumC0277a.DONT_INITIALIZE;
                        }
                        return enumC0277a;
                    }
                }
                enumC0277a = null;
                if (enumC0277a == null) {
                    return EnumC0277a.DONT_INITIALIZE;
                }
                return enumC0277a;
            }
        }

        public final int b() {
            return this.f29545a;
        }

        EnumC0277a(int i10) {
            this.f29545a = i10;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final EnumC0277a a() {
            return a.f29538b;
        }

        private b() {
        }

        public final void a(EnumC0277a enumC0277a) {
            p.j(enumC0277a, "<set-?>");
            a.f29538b = enumC0277a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29546a;

        static {
            int[] iArr = new int[EnumC0277a.values().length];
            try {
                iArr[EnumC0277a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0277a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0277a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29546a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC3703se enumC3703se;
        JSONArray jSONArrayOptJSONArray = new C3467f9().a().optJSONArray(Q6.f27431g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC3703se[] enumC3703seArrValues = EnumC3703se.values();
            int length2 = enumC3703seArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC3703se = null;
                    break;
                }
                enumC3703se = enumC3703seArrValues[i12];
                if (enumC3703se.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC3703se != null) {
                linkedHashSet.add(enumC3703se);
            }
        }
        int i13 = c.f29546a[f29538b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC3703se.LEVEL_PLAY_INIT);
        }
        if (i13 == 2) {
            return linkedHashSet.contains(EnumC3703se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC3703se.EXTERNAL_MEDIATION_INIT);
        }
        if (i13 != 3) {
            return false;
        }
        return linkedHashSet.contains(EnumC3703se.EXTERNAL_MEDIATION_INIT);
    }

    public final void a(int i10) {
        f29538b = EnumC0277a.f29539b.a(i10);
    }
}
