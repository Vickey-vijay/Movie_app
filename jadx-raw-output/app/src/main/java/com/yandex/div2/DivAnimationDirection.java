package com.yandex.div2;

/* JADX INFO: compiled from: DivAnimationDirection.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivAnimationDirection {
    NORMAL("normal"),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivAnimationDirection, String> TO_STRING = new bk.l<DivAnimationDirection, String>() { // from class: com.yandex.div2.DivAnimationDirection$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivAnimationDirection divAnimationDirection) {
            return DivAnimationDirection.Converter.b(divAnimationDirection);
        }
    };
    public static final bk.l<String, DivAnimationDirection> FROM_STRING = new bk.l<String, DivAnimationDirection>() { // from class: com.yandex.div2.DivAnimationDirection$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivAnimationDirection invoke(String str) {
            return DivAnimationDirection.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAnimationDirection.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAnimationDirection a(String str) {
            DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
            if (ck.p.e(str, divAnimationDirection.value)) {
                return divAnimationDirection;
            }
            DivAnimationDirection divAnimationDirection2 = DivAnimationDirection.REVERSE;
            if (ck.p.e(str, divAnimationDirection2.value)) {
                return divAnimationDirection2;
            }
            DivAnimationDirection divAnimationDirection3 = DivAnimationDirection.ALTERNATE;
            if (ck.p.e(str, divAnimationDirection3.value)) {
                return divAnimationDirection3;
            }
            DivAnimationDirection divAnimationDirection4 = DivAnimationDirection.ALTERNATE_REVERSE;
            if (ck.p.e(str, divAnimationDirection4.value)) {
                return divAnimationDirection4;
            }
            return null;
        }

        public final String b(DivAnimationDirection divAnimationDirection) {
            return divAnimationDirection.value;
        }
    }

    DivAnimationDirection(String str) {
        this.value = str;
    }
}
