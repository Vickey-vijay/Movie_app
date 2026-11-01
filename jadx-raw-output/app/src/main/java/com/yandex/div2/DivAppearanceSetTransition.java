package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceSetTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivAppearanceSetTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46483d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransition> f46484e = new bk.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransition>() { // from class: com.yandex.div2.DivAppearanceSetTransition$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceSetTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAppearanceSetTransition.f46483d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAppearanceTransition> f46485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46487c;

    public final boolean a(DivAppearanceSetTransition divAppearanceSetTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAppearanceSetTransition == null) {
            return false;
        }
        List<DivAppearanceTransition> list = this.f46485a;
        List<DivAppearanceTransition> list2 = divAppearanceSetTransition.f46485a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            if (!((DivAppearanceTransition) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAppearanceSetTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46487c;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        int iHash = 0;
        Iterator<T> it = this.f46485a.iterator();
        while (it.hasNext()) {
            iHash += ((DivAppearanceTransition) it.next()).hash();
        }
        int i10 = iPropertiesHash + iHash;
        this.f46487c = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f46486b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAppearanceSetTransition.class).hashCode();
        this.f46486b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivAppearanceSetTransition(List<? extends DivAppearanceTransition> list) {
        this.f46485a = list;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
