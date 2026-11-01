package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivData implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46932j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<DivTransitionSelector> f46933k = Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivData> f46934l = new bk.p<ParsingEnvironment, JSONObject, DivData>() { // from class: com.yandex.div2.DivData$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivData mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivData.f46932j.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivFunction> f46935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<State> f46937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivTimer> f46938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivTransitionSelector> f46939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivTrigger> f46940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<DivVariable> f46941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Exception> f46942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f46943i;

    /* JADX INFO: compiled from: DivData.kt */
    public static final class State implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46944d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, State> f46945e = new bk.p<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivData$State$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivData.State mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivData.State.f46944d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Div f46946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f46948c;

        /* JADX INFO: compiled from: DivData.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final State a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().G2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f46948c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(State.class).hashCode() + this.f46946a.hash() + Long.hashCode(this.f46947b);
            this.f46948c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public State(Div div, long j10) {
            this.f46946a = div;
            this.f46947b = j10;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivData(List<DivFunction> list, String str, List<State> list2, List<DivTimer> list3, Expression<DivTransitionSelector> expression, List<DivTrigger> list4, List<? extends DivVariable> list5, List<? extends Exception> list6) {
        this.f46935a = list;
        this.f46936b = str;
        this.f46937c = list2;
        this.f46938d = list3;
        this.f46939e = expression;
        this.f46940f = list4;
        this.f46941g = list5;
        this.f46942h = list6;
    }

    /* JADX INFO: compiled from: DivData.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivData a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().a(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        Integer num = this.f46943i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivData.class).hashCode();
        List<DivFunction> list = this.f46935a;
        int iHash4 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivFunction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f46936b.hashCode();
        Iterator<T> it2 = this.f46937c.iterator();
        int iHash5 = 0;
        while (it2.hasNext()) {
            iHash5 += ((State) it2.next()).hash();
        }
        int i10 = iHashCode2 + iHash5;
        List<DivTimer> list2 = this.f46938d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            iHash2 = 0;
            while (it3.hasNext()) {
                iHash2 += ((DivTimer) it3.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = i10 + iHash2 + this.f46939e.hashCode();
        List<DivTrigger> list3 = this.f46940f;
        if (list3 != null) {
            Iterator<T> it4 = list3.iterator();
            iHash3 = 0;
            while (it4.hasNext()) {
                iHash3 += ((DivTrigger) it4.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode3 + iHash3;
        List<DivVariable> list4 = this.f46941g;
        if (list4 != null) {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                iHash4 += ((DivVariable) it5.next()).hash();
            }
        }
        int i12 = i11 + iHash4;
        this.f46943i = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().b(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivData(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : list, str, list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? f46933k : expression, (i10 & 32) != 0 ? null : list4, (i10 & 64) != 0 ? null : list5, (i10 & 128) != 0 ? null : list6);
    }
}
