package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawable.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivDrawable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47040b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDrawable> f47041c = new bk.p<ParsingEnvironment, JSONObject, DivDrawable>() { // from class: com.yandex.div2.DivDrawable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDrawable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivDrawable.f47040b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47042a;

    /* JADX INFO: compiled from: DivDrawable.kt */
    public static final class b extends DivDrawable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivShapeDrawable f47043d;

        public b(DivShapeDrawable divShapeDrawable) {
            super(null);
            this.f47043d = divShapeDrawable;
        }

        public final DivShapeDrawable c() {
            return this.f47043d;
        }
    }

    public DivDrawable() {
    }

    public /* synthetic */ DivDrawable(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivDrawable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivDrawable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivDrawable divDrawable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDrawable == null) {
            return false;
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivShapeDrawable divShapeDrawableC = ((b) this).c();
        Object objB = divDrawable.b();
        return divShapeDrawableC.a(objB instanceof DivShapeDrawable ? (DivShapeDrawable) objB : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47042a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        int iHash = iHashCode + ((b) this).c().hash();
        this.f47042a = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
