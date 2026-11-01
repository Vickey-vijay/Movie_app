package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC3592m9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29496b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29500a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final EnumC3592m9 a(int i10) {
            for (EnumC3592m9 enumC3592m9 : EnumC3592m9.values()) {
                if (enumC3592m9.b() == i10) {
                    if (enumC3592m9 == null) {
                        return EnumC3592m9.APP_ACTIVITY;
                    }
                    return enumC3592m9;
                }
            }
            enumC3592m9 = null;
            if (enumC3592m9 == null) {
                return EnumC3592m9.APP_ACTIVITY;
            }
            return enumC3592m9;
        }
    }

    public final int b() {
        return this.f29500a;
    }

    EnumC3592m9(int i10) {
        this.f29500a = i10;
    }
}
