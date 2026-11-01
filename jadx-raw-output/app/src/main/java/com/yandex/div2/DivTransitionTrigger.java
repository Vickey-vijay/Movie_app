package com.yandex.div2;

/* JADX INFO: compiled from: DivTransitionTrigger.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivTransitionTrigger, String> TO_STRING = new bk.l<DivTransitionTrigger, String>() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivTransitionTrigger divTransitionTrigger) {
            return DivTransitionTrigger.Converter.b(divTransitionTrigger);
        }
    };
    public static final bk.l<String, DivTransitionTrigger> FROM_STRING = new bk.l<String, DivTransitionTrigger>() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivTransitionTrigger invoke(String str) {
            return DivTransitionTrigger.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTransitionTrigger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTransitionTrigger a(String str) {
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (ck.p.e(str, divTransitionTrigger.value)) {
                return divTransitionTrigger;
            }
            DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
            if (ck.p.e(str, divTransitionTrigger2.value)) {
                return divTransitionTrigger2;
            }
            DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
            if (ck.p.e(str, divTransitionTrigger3.value)) {
                return divTransitionTrigger3;
            }
            return null;
        }

        public final String b(DivTransitionTrigger divTransitionTrigger) {
            return divTransitionTrigger.value;
        }
    }

    DivTransitionTrigger(String str) {
        this.value = str;
    }
}
