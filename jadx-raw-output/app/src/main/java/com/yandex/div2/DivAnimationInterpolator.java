package com.yandex.div2;

/* JADX INFO: compiled from: DivAnimationInterpolator.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivAnimationInterpolator, String> TO_STRING = new bk.l<DivAnimationInterpolator, String>() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivAnimationInterpolator divAnimationInterpolator) {
            return DivAnimationInterpolator.Converter.b(divAnimationInterpolator);
        }
    };
    public static final bk.l<String, DivAnimationInterpolator> FROM_STRING = new bk.l<String, DivAnimationInterpolator>() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivAnimationInterpolator invoke(String str) {
            return DivAnimationInterpolator.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAnimationInterpolator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAnimationInterpolator a(String str) {
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (ck.p.e(str, divAnimationInterpolator.value)) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (ck.p.e(str, divAnimationInterpolator2.value)) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (ck.p.e(str, divAnimationInterpolator3.value)) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (ck.p.e(str, divAnimationInterpolator4.value)) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (ck.p.e(str, divAnimationInterpolator5.value)) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (ck.p.e(str, divAnimationInterpolator6.value)) {
                return divAnimationInterpolator6;
            }
            return null;
        }

        public final String b(DivAnimationInterpolator divAnimationInterpolator) {
            return divAnimationInterpolator.value;
        }
    }

    DivAnimationInterpolator(String str) {
        this.value = str;
    }
}
