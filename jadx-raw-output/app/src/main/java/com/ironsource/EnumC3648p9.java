package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC3648p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30447b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30452a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final EnumC3648p9 a(int i10) {
            for (EnumC3648p9 enumC3648p9 : EnumC3648p9.values()) {
                if (enumC3648p9.f30452a == i10) {
                    if (enumC3648p9 == null) {
                        return EnumC3648p9.NotSupported;
                    }
                    return enumC3648p9;
                }
            }
            enumC3648p9 = null;
            if (enumC3648p9 == null) {
                return EnumC3648p9.NotSupported;
            }
            return enumC3648p9;
        }
    }

    public final int b() {
        return this.f30452a;
    }

    public final boolean b(EnumC3648p9 enumC3648p9) {
        ck.p.j(enumC3648p9, "instanceType");
        return enumC3648p9.b() == this.f30452a;
    }

    EnumC3648p9(int i10) {
        this.f30452a = i10;
    }
}
