package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivot.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivPivot implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48383b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPivot> f48384c = new bk.p<ParsingEnvironment, JSONObject, DivPivot>() { // from class: com.yandex.div2.DivPivot$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivot mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPivot.f48383b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48385a;

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class b extends DivPivot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPivotFixed f48386d;

        public b(DivPivotFixed divPivotFixed) {
            super(null);
            this.f48386d = divPivotFixed;
        }

        public final DivPivotFixed c() {
            return this.f48386d;
        }
    }

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class c extends DivPivot {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPivotPercentage f48387d;

        public c(DivPivotPercentage divPivotPercentage) {
            super(null);
            this.f48387d = divPivotPercentage;
        }

        public final DivPivotPercentage c() {
            return this.f48387d;
        }
    }

    public DivPivot() {
    }

    public /* synthetic */ DivPivot(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivPivot.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPivot a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().T5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivPivot divPivot, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPivot == null) {
            return false;
        }
        if (this instanceof b) {
            DivPivotFixed divPivotFixedC = ((b) this).c();
            Object objB = divPivot.b();
            return divPivotFixedC.a(objB instanceof DivPivotFixed ? (DivPivotFixed) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPivotPercentage divPivotPercentageC = ((c) this).c();
        Object objB2 = divPivot.b();
        return divPivotPercentageC.a(objB2 instanceof DivPivotPercentage ? (DivPivotPercentage) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48385a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f48385a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
