package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC3812z4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31690b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31696a;

    /* JADX INFO: renamed from: com.ironsource.z4$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final EnumC3812z4 a(String str) {
            for (EnumC3812z4 enumC3812z4 : EnumC3812z4.values()) {
                if (ck.p.e(enumC3812z4.b(), str)) {
                    if (enumC3812z4 == null) {
                        return EnumC3812z4.NONE;
                    }
                    return enumC3812z4;
                }
            }
            enumC3812z4 = null;
            if (enumC3812z4 == null) {
                return EnumC3812z4.NONE;
            }
            return enumC3812z4;
        }
    }

    public static final EnumC3812z4 a(String str) {
        return f31690b.a(str);
    }

    public final String b() {
        return this.f31696a;
    }

    EnumC3812z4(String str) {
        this.f31696a = str;
    }
}
