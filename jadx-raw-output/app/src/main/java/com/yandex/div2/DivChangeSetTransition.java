package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeSetTransition.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivChangeSetTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46578d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeSetTransition> f46579e = new bk.p<ParsingEnvironment, JSONObject, DivChangeSetTransition>() { // from class: com.yandex.div2.DivChangeSetTransition$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeSetTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivChangeSetTransition.f46578d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivChangeTransition> f46580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46582c;

    public final boolean a(DivChangeSetTransition divChangeSetTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divChangeSetTransition == null) {
            return false;
        }
        List<DivChangeTransition> list = this.f46580a;
        List<DivChangeTransition> list2 = divChangeSetTransition.f46580a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            if (!((DivChangeTransition) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    /* JADX INFO: compiled from: DivChangeSetTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivChangeSetTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().R1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46582c;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        int iHash = 0;
        Iterator<T> it = this.f46580a.iterator();
        while (it.hasNext()) {
            iHash += ((DivChangeTransition) it.next()).hash();
        }
        int i10 = iPropertiesHash + iHash;
        this.f46582c = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f46581b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivChangeSetTransition.class).hashCode();
        this.f46581b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivChangeSetTransition(List<? extends DivChangeTransition> list) {
        this.f46580a = list;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
