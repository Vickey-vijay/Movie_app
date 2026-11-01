package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCount.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivCount implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46847b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCount> f46848c = new bk.p<ParsingEnvironment, JSONObject, DivCount>() { // from class: com.yandex.div2.DivCount$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCount mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCount.f46847b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46849a;

    /* JADX INFO: compiled from: DivCount.kt */
    public static final class b extends DivCount {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFixedCount f46850d;

        public b(DivFixedCount divFixedCount) {
            super(null);
            this.f46850d = divFixedCount;
        }

        public final DivFixedCount c() {
            return this.f46850d;
        }
    }

    /* JADX INFO: compiled from: DivCount.kt */
    public static final class c extends DivCount {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivInfinityCount f46851d;

        public c(DivInfinityCount divInfinityCount) {
            super(null);
            this.f46851d = divInfinityCount;
        }

        public final DivInfinityCount c() {
            return this.f46851d;
        }
    }

    public DivCount() {
    }

    public /* synthetic */ DivCount(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivCount.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCount a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().v2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivCount divCount, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCount == null) {
            return false;
        }
        if (this instanceof c) {
            DivInfinityCount divInfinityCountC = ((c) this).c();
            Object objB = divCount.b();
            return divInfinityCountC.a(objB instanceof DivInfinityCount ? (DivInfinityCount) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivFixedCount divFixedCountC = ((b) this).c();
        Object objB2 = divCount.b();
        return divFixedCountC.a(objB2 instanceof DivFixedCount ? (DivFixedCount) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46849a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46849a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
