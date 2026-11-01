package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTimer implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f49814h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f49815i = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTimer> f49816j = new bk.p<ParsingEnvironment, JSONObject, DivTimer>() { // from class: com.yandex.div2.DivTimer$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTimer mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTimer.f49814h.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f49817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DivAction> f49818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f49820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Long> f49821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f49823g;

    /* JADX INFO: compiled from: DivTimer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTimer a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f49823g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTimer.class).hashCode() + this.f49817a.hashCode();
        List<DivAction> list = this.f49818b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f49819c.hashCode();
        List<DivAction> list2 = this.f49820d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i10 = iHashCode2 + iHash2;
        Expression<Long> expression = this.f49821e;
        int iHashCode3 = i10 + (expression != null ? expression.hashCode() : 0);
        String str = this.f49822f;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.f49823g = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    public DivTimer(Expression<Long> expression, List<DivAction> list, String str, List<DivAction> list2, Expression<Long> expression2, String str2) {
        this.f49817a = expression;
        this.f49818b = list;
        this.f49819c = str;
        this.f49820d = list2;
        this.f49821e = expression2;
        this.f49822f = str2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
