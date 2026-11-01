package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC3429d7 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28655b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28659a;

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final EnumC3429d7 a(int i10) {
            for (EnumC3429d7 enumC3429d7 : EnumC3429d7.values()) {
                if (enumC3429d7.b() == i10) {
                    if (enumC3429d7 == null) {
                        return EnumC3429d7.SendEvent;
                    }
                    return enumC3429d7;
                }
            }
            enumC3429d7 = null;
            if (enumC3429d7 == null) {
                return EnumC3429d7.SendEvent;
            }
            return enumC3429d7;
        }
    }

    public final int b() {
        return this.f28659a;
    }

    EnumC3429d7(int i10) {
        this.f28659a = i10;
    }
}
